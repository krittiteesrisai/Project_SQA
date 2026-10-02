package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.type.MapType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.HashMap;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Set;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.List;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_deser_BeanDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#setCurrentValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:202) */
        beanDeserializer.deserialize(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injectValues(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_ThrowIllegalArgumentException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        short[] _valueId = {};
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer.deserialize(uTF8StreamJsonParser, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injectValues(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_ThrowIllegalArgumentException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer.deserialize(uTF8StreamJsonParser, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: injectValues(ctxt, bean);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer.deserialize(uTF8StreamJsonParser, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#isExpectedStartObjectToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.isExpectedStartObjectToken()
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:137) */
        beanDeserializer.deserialize(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#ordinal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(t)
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156) */
        beanDeserializer._deserializeOther(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_vanillaProcessing): True}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)
 * @utbot.activatesSwitch {@code switch(t) case: END_OBJECT}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return vanillaDeserialize(p, ctxt, t);
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._vanillaProcessing = true;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:264)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:177) */
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handledType()}
 * @utbot.activatesSwitch {@code switch(t)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonToken jsonToken = JsonToken.END_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:185) */
        beanDeserializer._deserializeOther(null, null, jsonToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method vanillaDeserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:264) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = beanDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(beanDeserializer, vanillaDeserializeMethodArguments);
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
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.withBeanProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, props);}
 *  */
    @Test
    public void testWithBeanProperties_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        MapLikeType _beanType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.withBeanProperties(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, props);}
 *  */
    @Test
    public void testWithBeanProperties_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.withBeanProperties(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
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
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _missingToken(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_missingToken(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.endOfInputException(handledType());
 *  */
    @Test
    public void test_missingToken_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken(BeanDeserializer.java:190) */
        beanDeserializer._missingToken(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializer actual = beanDeserializer.withObjectIdReader(((ObjectIdReader) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        BeanDeserializer actual = beanDeserializer.withObjectIdReader(((ObjectIdReader) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BeanDeserializer(this, oir);
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
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
            ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
            java.lang.Object[] _hashArea = {null};
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:213)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:353)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.<init>(BeanDeserializer.java:76)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader(BeanDeserializer.java:105) */
            beanDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new BeanDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowClassCastException() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            java.lang.Object[] _hashArea = new java.lang.Object[2];
            Object object = createInstance("java.lang.Object");
            _hashArea[1] = object;
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1d28a4a4)]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:177)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:353)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.<init>(BeanDeserializer.java:76)
                com.fasterxml.jackson.databind.deser.BeanDeserializer.withObjectIdReader(BeanDeserializer.java:105) */
            beanDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:676) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:676) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:839) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#start()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:837) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        HashMap _nameToPropertyIndex = new HashMap();
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex", _nameToPropertyIndex);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:839) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.withIgnorableProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnorableProperties(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withIgnorableProperties(java.util.Set)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        AbstractDeserializer _delegateDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((Set) linkedHashSet));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        JavaType actual_delegateDeserializer_baseType = ((JavaType) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
        assertNull(actual_delegateDeserializer_baseType);
        
        ObjectIdReader actual_delegateDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
        assertNull(actual_delegateDeserializer_objectIdReader);
        
        Map actual_delegateDeserializer_backRefProperties = ((Map) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
        assertNull(actual_delegateDeserializer_backRefProperties);
        
        boolean actual_delegateDeserializer_acceptString = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
        assertFalse(actual_delegateDeserializer_acceptString);
        
        boolean actual_delegateDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
        assertFalse(actual_delegateDeserializer_acceptBoolean);
        
        boolean actual_delegateDeserializer_acceptInt = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
        assertFalse(actual_delegateDeserializer_acceptInt);
        
        boolean actual_delegateDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
        assertFalse(actual_delegateDeserializer_acceptDouble);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withIgnorableProperties(java.util.Set)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((Set) linkedHashSet));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        int expected_valueInstantiator_type = ((Integer) getFieldValue(expected_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type"));
        int actual_valueInstantiator_type = ((Integer) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type"));
        assertEquals(expected_valueInstantiator_type, actual_valueInstantiator_type);
        
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        ValueInstantiator actual_delegateDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
        assertNull(actual_delegateDeserializer_valueInstantiator);
        
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
        
        BeanPropertyMap actual_delegateDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
        assertNull(actual_delegateDeserializer_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegateDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
        assertNull(actual_delegateDeserializer_injectables);
        
        SettableAnyProperty actual_delegateDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
        assertNull(actual_delegateDeserializer_anySetter);
        
        Set actual_delegateDeserializer_ignorableProps = ((Set) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
        assertNull(actual_delegateDeserializer_ignorableProps);
        
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
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
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
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
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
        
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnorableProperties(java.util.Set)
    
    @Test
    public void testWithIgnorableProperties1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null, null, null, null, null, null, null, null, null};
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((Set) linkedHashSet));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
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
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        int expected_valueInstantiator_type = ((Integer) getFieldValue(expected_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type"));
        int actual_valueInstantiator_type = ((Integer) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type"));
        assertEquals(expected_valueInstantiator_type, actual_valueInstantiator_type);
        
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        ObjectIdReader expected_objectIdReader = expected._objectIdReader;
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        JavaType actual_objectIdReader_idType = ((JavaType) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
        assertNull(actual_objectIdReader_idType);
        
        PropertyName actual_objectIdReaderPropertyName = actual_objectIdReader.propertyName;
        assertNull(actual_objectIdReaderPropertyName);
        
        ObjectIdGenerator actual_objectIdReaderGenerator = actual_objectIdReader.generator;
        assertNull(actual_objectIdReaderGenerator);
        
        ObjectIdResolver actual_objectIdReaderResolver = actual_objectIdReader.resolver;
        assertNull(actual_objectIdReaderResolver);
        
        JsonDeserializer actual_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
        assertNull(actual_objectIdReader_deserializer);
        
        SettableBeanProperty actual_objectIdReaderIdProperty = actual_objectIdReader.idProperty;
        assertNull(actual_objectIdReaderIdProperty);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        ValueInjector finalBeanDeserializer_injectables0 = beanDeserializer._injectables[0];
        ValueInjector finalBeanDeserializer_injectables1 = beanDeserializer._injectables[1];
        ValueInjector finalBeanDeserializer_injectables2 = beanDeserializer._injectables[2];
        ValueInjector finalBeanDeserializer_injectables3 = beanDeserializer._injectables[3];
        ValueInjector finalBeanDeserializer_injectables4 = beanDeserializer._injectables[4];
        ValueInjector finalBeanDeserializer_injectables5 = beanDeserializer._injectables[5];
        ValueInjector finalBeanDeserializer_injectables6 = beanDeserializer._injectables[6];
        ValueInjector finalBeanDeserializer_injectables7 = beanDeserializer._injectables[7];
        ValueInjector finalBeanDeserializer_injectables8 = beanDeserializer._injectables[8];
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_injectables0);
        
        assertNull(finalBeanDeserializer_injectables1);
        
        assertNull(finalBeanDeserializer_injectables2);
        
        assertNull(finalBeanDeserializer_injectables3);
        
        assertNull(finalBeanDeserializer_injectables4);
        
        assertNull(finalBeanDeserializer_injectables5);
        
        assertNull(finalBeanDeserializer_injectables6);
        
        assertNull(finalBeanDeserializer_injectables7);
        
        assertNull(finalBeanDeserializer_injectables8);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((Set) linkedHashSet));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
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
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
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
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        JsonFormat.Shape actual_delegateDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
        assertNull(actual_delegateDeserializer_serializationShape);
        
        ValueInstantiator actual_delegateDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
        assertNull(actual_delegateDeserializer_valueInstantiator);
        
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
        
        BeanPropertyMap actual_delegateDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
        assertNull(actual_delegateDeserializer_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegateDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
        assertNull(actual_delegateDeserializer_injectables);
        
        SettableAnyProperty actual_delegateDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
        assertNull(actual_delegateDeserializer_anySetter);
        
        Set actual_delegateDeserializer_ignorableProps = ((Set) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
        assertNull(actual_delegateDeserializer_ignorableProps);
        
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
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
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
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        assertTrue(deepEquals(expected, actual));
        ObjectIdReader expected_objectIdReader = expected._objectIdReader;
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        JavaType actual_objectIdReader_idType = ((JavaType) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
        assertNull(actual_objectIdReader_idType);
        
        PropertyName actual_objectIdReaderPropertyName = actual_objectIdReader.propertyName;
        assertNull(actual_objectIdReaderPropertyName);
        
        ObjectIdGenerator actual_objectIdReaderGenerator = actual_objectIdReader.generator;
        assertNull(actual_objectIdReaderGenerator);
        
        ObjectIdResolver actual_objectIdReaderResolver = actual_objectIdReader.resolver;
        assertNull(actual_objectIdReaderResolver);
        
        JsonDeserializer actual_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
        assertNull(actual_objectIdReader_deserializer);
        
        SettableBeanProperty actual_objectIdReaderIdProperty = actual_objectIdReader.idProperty;
        assertNull(actual_objectIdReaderIdProperty);
        
        assertTrue(deepEquals(expected, actual));
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:382) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:386) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:382) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#build(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: wrapInstantiationProblem(e, ctxt);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeUsingPropertyBased1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeUsingPropertyBased2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:388) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserSequence, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1636)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:462) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate1, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1636)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:462) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserSequence, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1407)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1054)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1636)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:462) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null, null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_deserializeUsingPropertyBased9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _allProperties);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = IllegalStateException.class)
    public void test_deserializeUsingPropertyBased10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 8);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) objectIdValueProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeUsingPropertyBased17() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testDeserializeWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:631) */
        beanDeserializer.deserializeWithUnwrapped(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:633) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:667) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:667) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:667) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate1, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:667) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:635) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate5, null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueInstantiator.createUsingDelegate(ctxt, _delegateDeserializer.deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueInstantiator.createUsingDelegate(ctxt, _delegateDeserializer.deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped_ThrowIllegalStateException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
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
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeUsingPropertyBasedWithUnwrapped(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithUnwrapped_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:676)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:574) */
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer2 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:578) */
        beanDeserializer.deserializeWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:143)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped17() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1636)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:749)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:574) */
        beanDeserializer.deserializeWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped18() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped21() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer2 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped22() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:143)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped23() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1636)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:749)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:574) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate3, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        Object actual = beanDeserializer.deserializeWithView(filteringParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserSequence, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate1, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserSequence, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasTokenId(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasTokenId(JsonTokenId.ID_FIELD_NAME)
 *  */
    @Test
    public void testDeserializeWithView_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView(BeanDeserializer.java:532) */
        beanDeserializer.deserializeWithView(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    @Test
    public void testDeserializeWithView1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        Object actual = beanDeserializer.deserializeWithView(filteringParserDelegate, null, object, null);
        
    }
    
    @Test
    public void testDeserializeWithView2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Object object = new Object();
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate1, null, object, null);
        
    }
    
    @Test
    public void testDeserializeWithView3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate11 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate11, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
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
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate, null, object, class1);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testDeserializeWithView4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate10 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
        BeanDeserializer beanDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Class class1 = Object.class;
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.deserializeWithView(jsonParserDelegate, null, beanDeserializer1, class1));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithView5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        beanDeserializer.deserializeWithView(jsonParserDelegate2, null, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:333) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:333) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:331) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:331) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#maySerializeAsObject()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeFromObject1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:676)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:574)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:308) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:382)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1185)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:313) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObject3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:333) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 31);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:678)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:574)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:308) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 143);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:678)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:574)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:308) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:995)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDefault(ValueInstantiator.java:184)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDefault(StdValueInstantiator.java:257)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:331) */
        beanDeserializer.deserializeFromObject(null, impl);
    }
    
    @Test
    public void testDeserializeFromObject8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObject10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.<init>(ExternalTypeHandler.java:41)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start(ExternalTypeHandler.java:47)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:786)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:778)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObject11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:571)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:308) */
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _defaultCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getDeclaringClass(AnnotatedMethod.java:171)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDefault(StdValueInstantiator.java:262)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:778)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObject13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:143)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:775)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        _delegateDeserializer._vanillaProcessing = true;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:139)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:775)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _defaultCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getDeclaringClass(AnnotatedMethod.java:171)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDefault(StdValueInstantiator.java:262)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:778)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        beanDeserializer._nonStandardCreation = true;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1192)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:313) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test
    public void testDeserializeFromObject17() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:775)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObject18() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1422)
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1011)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDefault(ValueInstantiator.java:184)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDefault(StdValueInstantiator.java:257)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:778)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:311) */
        beanDeserializer.deserializeFromObject(jsonParserSequence, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject21() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        beanDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.IntSequenceGenerator generator = ((ObjectIdGenerators.IntSequenceGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        beanDeserializer.deserializeFromObject(uTF8DataInputJsonParser, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromObject22() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        beanDeserializer.deserializeFromObject(jsonParserSequence, impl);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromObject23() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        beanDeserializer._nonStandardCreation = true;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        beanDeserializer.deserializeFromObject(null, impl);
    }
    ///endregion
    
    ///region Errors report for deserializeFromObject
    
    public void testDeserializeFromObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.unwrappingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (getClass()): False}
    /// return from: {@code return new BeanDeserializer(this, unwrapper);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapLikeType _beanType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
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
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
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
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
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
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
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
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (getClass()): False}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_NotGetClass() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            beanDeserializer._anySetter = _anySetter;
            
            JavaType javaType = beanDeserializer._beanType;
            Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
            Method unwrappingDeserializerMethod = beanDeserializerClazz.getDeclaredMethod("unwrappingDeserializer", nameTransformerClazz);
            unwrappingDeserializerMethod.setAccessible(true);
            java.lang.Object[] unwrappingDeserializerMethodArguments = new java.lang.Object[1];
            unwrappingDeserializerMethodArguments[0] = nop;
            BeanDeserializer actual = ((BeanDeserializer) unwrappingDeserializerMethod.invoke(beanDeserializer, unwrappingDeserializerMethodArguments));
            
            BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            expected._propertyBasedCreator = _propertyBasedCreator;
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            expected._anySetter = _anySetter;
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
            setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
            
            Exception actual_nullFromCreator = actual._nullFromCreator;
            assertNull(actual_nullFromCreator);
            
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
            
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            assertNull(actual_valueInstantiator);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
            assertNull(actual_arrayDelegateDeserializer);
            
            PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
            PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
            ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
            assertNull(actual_propertyBasedCreator_valueInstantiator);
            
            HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
            assertNull(actual_propertyBasedCreator_propertyLookup);
            
            int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
            int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
            assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
            
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
            
            JavaType javaType1 = beanDeserializer._beanType;
            Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
            Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
            
            assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
            
            assertNull(finalBeanDeserializer_ignorableProps);
            
            assertNull(finalBeanDeserializer_backRefs);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._creatorReturnedNullException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _creatorReturnedNullException()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_creatorReturnedNullException()}
 * @utbot.executesCondition {@code (_nullFromCreator == null): True}
 * @utbot.returnsFrom {@code return _nullFromCreator;}
 *  */
    @Test
    public void test_creatorReturnedNullException__nullFromCreatorEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        Exception initialBeanDeserializer_nullFromCreator = beanDeserializer._nullFromCreator;
        
        NullPointerException actual = ((NullPointerException) beanDeserializer._creatorReturnedNullException());
        
        NullPointerException expected = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        
        Exception finalBeanDeserializer_nullFromCreator = beanDeserializer._nullFromCreator;
        
        assertFalse(initialBeanDeserializer_nullFromCreator == finalBeanDeserializer_nullFromCreator);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_creatorReturnedNullException()}
 * @utbot.executesCondition {@code (_nullFromCreator == null): False}
 * @utbot.returnsFrom {@code return _nullFromCreator;}
 *  */
    @Test
    public void test_creatorReturnedNullException__nullFromCreatorNotEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CloneNotSupportedException _nullFromCreator = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nullFromCreator", _nullFromCreator);
        
        CloneNotSupportedException actual = ((CloneNotSupportedException) beanDeserializer._creatorReturnedNullException());
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int _nullFromCreatorDepth = ((Integer) getFieldValue(_nullFromCreator, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(_nullFromCreatorDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asArrayDeserializer()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#asArrayDeserializer()}
 * @utbot.returnsFrom {@code return new BeanAsArrayDeserializer(this, props);}
 *  */
    @Test
    public void testAsArrayDeserializer_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanDeserializer.asArrayDeserializer());
        
        BeanAsArrayDeserializer expected = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate", beanDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties", _propsInOrder);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        Exception actual_delegate_nullFromCreator = ((Exception) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nullFromCreator"));
        assertNull(actual_delegate_nullFromCreator);
        
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
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] expected_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        int expected_orderedPropertiesSize = expected_orderedProperties.length;
        assertEquals(expected_orderedPropertiesSize, actual_orderedProperties.length);
        assertTrue(deepEquals(expected_orderedProperties, actual_orderedProperties));
        
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
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#asArrayDeserializer()}
 * @utbot.returnsFrom {@code return new BeanAsArrayDeserializer(this, props);}
 *  */
    @Test
    public void testAsArrayDeserializer_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std _delegateDeserializer = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanDeserializer.asArrayDeserializer());
        
        BeanAsArrayDeserializer expected = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate", beanDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        Exception actual_delegate_nullFromCreator = ((Exception) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nullFromCreator"));
        assertNull(actual_delegate_nullFromCreator);
        
        Annotations expected_delegate_classAnnotations = ((Annotations) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_delegate_classAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_delegate_classAnnotations_annotations = ((HashMap) getFieldValue(actual_delegate_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_delegate_classAnnotations_annotations);
        
        JavaType actual_delegate_beanType = actual_delegate._beanType;
        assertNull(actual_delegate_beanType);
        
        JsonFormat.Shape expected_delegate_serializationShape = expected_delegate._serializationShape;
        JsonFormat.Shape actual_delegate_serializationShape = actual_delegate._serializationShape;
        assertEquals(expected_delegate_serializationShape, actual_delegate_serializationShape);
        
        ValueInstantiator expected_delegate_valueInstantiator = expected_delegate._valueInstantiator;
        ValueInstantiator actual_delegate_valueInstantiator = actual_delegate._valueInstantiator;
        String actual_delegate_valueInstantiator_valueTypeDesc = ((String) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
        assertNull(actual_delegate_valueInstantiator_valueTypeDesc);
        
        Class actual_delegate_valueInstantiator_valueClass = ((Class) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass"));
        assertNull(actual_delegate_valueInstantiator_valueClass);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
        assertNull(actual_delegate_valueInstantiator_defaultCreator);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_withArgsCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator"));
        assertNull(actual_delegate_valueInstantiator_withArgsCreator);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegate_valueInstantiator_constructorArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_constructorArguments"));
        assertNull(actual_delegate_valueInstantiator_constructorArguments);
        
        JavaType actual_delegate_valueInstantiator_delegateType = ((JavaType) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType"));
        assertNull(actual_delegate_valueInstantiator_delegateType);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_delegateCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator"));
        assertNull(actual_delegate_valueInstantiator_delegateCreator);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegate_valueInstantiator_delegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateArguments"));
        assertNull(actual_delegate_valueInstantiator_delegateArguments);
        
        JavaType actual_delegate_valueInstantiator_arrayDelegateType = ((JavaType) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType"));
        assertNull(actual_delegate_valueInstantiator_arrayDelegateType);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_arrayDelegateCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateCreator"));
        assertNull(actual_delegate_valueInstantiator_arrayDelegateCreator);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegate_valueInstantiator_arrayDelegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateArguments"));
        assertNull(actual_delegate_valueInstantiator_arrayDelegateArguments);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_fromStringCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator"));
        assertNull(actual_delegate_valueInstantiator_fromStringCreator);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_fromIntCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator"));
        assertNull(actual_delegate_valueInstantiator_fromIntCreator);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_fromLongCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator"));
        assertNull(actual_delegate_valueInstantiator_fromLongCreator);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_fromDoubleCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator"));
        assertNull(actual_delegate_valueInstantiator_fromDoubleCreator);
        
        AnnotatedWithParams actual_delegate_valueInstantiator_fromBooleanCreator = ((AnnotatedWithParams) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator"));
        assertNull(actual_delegate_valueInstantiator_fromBooleanCreator);
        
        AnnotatedParameter actual_delegate_valueInstantiator_incompleteParameter = ((AnnotatedParameter) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_incompleteParameter"));
        assertNull(actual_delegate_valueInstantiator_incompleteParameter);
        
        JsonDeserializer expected_delegate_delegateDeserializer = expected_delegate._delegateDeserializer;
        JsonDeserializer actual_delegate_delegateDeserializer = actual_delegate._delegateDeserializer;
        int expected_delegate_delegateDeserializer_kind = ((Integer) getFieldValue(expected_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind"));
        int actual_delegate_delegateDeserializer_kind = ((Integer) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind"));
        assertEquals(expected_delegate_delegateDeserializer_kind, actual_delegate_delegateDeserializer_kind);
        
        Class actual_delegate_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegate_delegateDeserializer_valueClass);
        
        JsonDeserializer actual_delegate_arrayDelegateDeserializer = actual_delegate._arrayDelegateDeserializer;
        assertNull(actual_delegate_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_delegate_propertyBasedCreator = expected_delegate._propertyBasedCreator;
        PropertyBasedCreator actual_delegate_propertyBasedCreator = actual_delegate._propertyBasedCreator;
        ValueInstantiator actual_delegate_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_delegate_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_delegate_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_delegate_propertyBasedCreator_propertyLookup);
        
        int expected_delegate_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_delegate_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_delegate_propertyBasedCreator_propertyCount, actual_delegate_propertyBasedCreator_propertyCount);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegate_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegate_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_delegate_propertyBasedCreator_allProperties);
        
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
        
        UnwrappedPropertyHandler actual_delegate_unwrappedPropertyHandler = actual_delegate._unwrappedPropertyHandler;
        assertNull(actual_delegate_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_delegate_externalTypeIdHandler = actual_delegate._externalTypeIdHandler;
        assertNull(actual_delegate_externalTypeIdHandler);
        
        ObjectIdReader actual_delegate_objectIdReader = actual_delegate._objectIdReader;
        assertNull(actual_delegate_objectIdReader);
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties"));
        assertNull(actual_orderedProperties);
        
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
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asArrayDeserializer()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#asArrayDeserializer()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#getPropertiesInInsertionOrder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty[] props = _beanProperties.getPropertiesInInsertionOrder();
 *  */
    @Test
    public void testAsArrayDeserializer_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer(BeanDeserializer.java:120) */
        beanDeserializer.asArrayDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromNull(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromNull(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.requiresCustomCodec()
 *  */
    @Test
    public void testDeserializeFromNull_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:507) */
        beanDeserializer.deserializeFromNull(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromNull(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserializeFromNull_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:519) */
        beanDeserializer.deserializeFromNull(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromNull(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserializeFromNull_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:519) */
        beanDeserializer.deserializeFromNull(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromNull(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromNull1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        beanDeserializer.deserializeFromNull(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNull2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate4 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:873)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:519) */
        beanDeserializer.deserializeFromNull(filteringParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeFromNull(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromNull3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        beanDeserializer.deserializeFromNull(filteringParserDelegate, impl);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromNull4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        beanDeserializer.deserializeFromNull(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserSequence, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getActiveView()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.getActiveView()
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:785) */
        beanDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:786) */
        beanDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:786) */
        beanDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#start()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JsonToken t = p.getCurrentToken(); t == JsonToken.FIELD_NAME; t = p.nextToken())
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:788) */
        beanDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeUsingPropertyBasedWithExternalTypeId(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 2);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:839)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:766) */
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:778) */
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithExternalTypeId_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithExternalTypeId_ThrowIllegalStateException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeWithExternalTypeId
    
    public void testDeserializeWithExternalTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return prop.deserialize(p, ctxt);}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ReturnPropDeserialize() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        AtomicReference actual = ((AtomicReference) beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, innerClassProperty));
        
        AtomicReference expected = new AtomicReference();
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return prop.deserialize(p, ctxt);}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ReturnPropDeserialize_1() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            JsonNodeDeserializer _valueDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            NullNode actual = ((NullNode) beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, innerClassProperty));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_CatchException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        Object actual = beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, null, objectIdValueProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_CatchException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        Object actual = beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, innerClassProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:487) */
        beanDeserializer._deserializeWithErrorWrapping(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:487) */
        beanDeserializer._deserializeWithErrorWrapping(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:487) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:487) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate1, null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:487) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserDelegate, null, innerClassProperty);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithErrorWrapping_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, impl, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, null, innerClassProperty);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1076068272405300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1076068272405300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1076068272410300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076068272405300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076068272410300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076068273533599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076068273533599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076068273535199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076068273533599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076068273535199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076068274284600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076068274284600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076068274286000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076068274284600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076068274286000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

