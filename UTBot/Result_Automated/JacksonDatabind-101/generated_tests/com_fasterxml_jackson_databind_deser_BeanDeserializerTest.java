package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.HashMap;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import java.text.DateFormat;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.BeanDeserializer.BeanReferring;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.LinkedList;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.core.filter.TokenFilterContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:215) */
        beanDeserializer.deserialize(null, null, null);
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149) */
        beanDeserializer.deserialize(null, null);
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
    public void testWithIgnorableProperties_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((Set) linkedHashSet));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Object actual_valueInstantiator_value = getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.util.ConstantValueInstantiator", "_value");
        assertNull(actual_valueInstantiator_value);
        
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
        
        KeyDeserializer actual_anySetter_keyDeserializer = actual_anySetter._keyDeserializer;
        assertNull(actual_anySetter_keyDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map expected_backRefs = expected._backRefs;
        Map actual_backRefs = actual._backRefs;
        assertTrue(deepEquals(expected_backRefs, actual_backRefs));
        
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
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withIgnorableProperties(java.util.Set)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanAsArrayBuilderDeserializer _delegateDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
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
        
        BeanDeserializer actual = beanDeserializer.withIgnorableProperties(((Set) linkedHashSet));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Object actual_valueInstantiator_value = getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.util.ConstantValueInstantiator", "_value");
        assertNull(actual_valueInstantiator_value);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        BeanDeserializerBase actual_delegateDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
        assertNull(actual_delegateDeserializer_delegate);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegateDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
        assertNull(actual_delegateDeserializer_orderedProperties);
        
        AnnotatedMethod actual_delegateDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
        assertNull(actual_delegateDeserializer_buildMethod);
        
        JavaType actual_delegateDeserializer_targetType = ((JavaType) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_targetType"));
        assertNull(actual_delegateDeserializer_targetType);
        
        JavaType actual_delegateDeserializer_beanType = ((JavaType) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
        assertNull(actual_delegateDeserializer_beanType);
        
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
        
        KeyDeserializer actual_anySetter_keyDeserializer = actual_anySetter._keyDeserializer;
        assertNull(actual_anySetter_keyDeserializer);
        
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:550) */
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
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:562) */
        beanDeserializer.deserializeFromNull(uTF8DataInputJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromNull(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserializeFromNull_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:562) */
        beanDeserializer.deserializeFromNull(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromNull(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserializeFromNull_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:562) */
        beanDeserializer.deserializeFromNull(jsonParserDelegate, null);
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
    public void testAsArrayDeserializer_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanDeserializer.asArrayDeserializer());
        
        BeanAsArrayDeserializer expected = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate", beanDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties", _propsInOrder);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        Exception actual_delegate_nullFromCreator = ((Exception) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nullFromCreator"));
        assertNull(actual_delegate_nullFromCreator);
        
        NameTransformer actual_delegate_currentlyTransforming = ((NameTransformer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_delegate_currentlyTransforming);
        
        JavaType actual_delegate_beanType = actual_delegate._beanType;
        assertNull(actual_delegate_beanType);
        
        JsonFormat.Shape expected_delegate_serializationShape = expected_delegate._serializationShape;
        JsonFormat.Shape actual_delegate_serializationShape = actual_delegate._serializationShape;
        assertEquals(expected_delegate_serializationShape, actual_delegate_serializationShape);
        
        ValueInstantiator actual_delegate_valueInstantiator = actual_delegate._valueInstantiator;
        assertNull(actual_delegate_valueInstantiator);
        
        JsonDeserializer expected_delegate_delegateDeserializer = expected_delegate._delegateDeserializer;
        JsonDeserializer actual_delegate_delegateDeserializer = actual_delegate._delegateDeserializer;
        Boolean actual_delegate_delegateDeserializer_supportsUpdates = ((Boolean) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer", "_supportsUpdates"));
        assertNull(actual_delegate_delegateDeserializer_supportsUpdates);
        
        Class actual_delegate_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegate_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegate_delegateDeserializer_valueClass);
        
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
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        
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
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
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
    public void testAsArrayDeserializer_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        BeanAsArrayDeserializer actual = ((BeanAsArrayDeserializer) beanDeserializer.asArrayDeserializer());
        
        BeanAsArrayDeserializer expected = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate", beanDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_orderedProperties", _propsInOrder);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer", "_delegate"));
        Exception actual_delegate_nullFromCreator = ((Exception) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nullFromCreator"));
        assertNull(actual_delegate_nullFromCreator);
        
        NameTransformer actual_delegate_currentlyTransforming = ((NameTransformer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_delegate_currentlyTransforming);
        
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
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        BeanPropertyMap beanPropertyMap1 = beanDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap1_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBeanDeserializer_beanProperties_propsInOrder1 = ((SettableBeanProperty) get(beanPropertyMap1_beanProperties_propsInOrder, 1));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBeanDeserializer_beanProperties_propsInOrder1);
        
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.asArrayDeserializer(BeanDeserializer.java:132) */
        beanDeserializer.asArrayDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:344) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (_objectIdReader.maySerializeAsObject()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#maySerializeAsObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:344) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:346) */
        beanDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeFromObject
    
    public void testDeserializeFromObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return prop.deserialize(p, ctxt);}
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_SettableBeanPropertyDeserialize() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            
            NullNode actual = ((NullNode) beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, null, managedReferenceProperty));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:530) */
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
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:530) */
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
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:530) */
        beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, null, managedReferenceProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test
    public void test_deserializeWithErrorWrapping_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:530) */
        beanDeserializer._deserializeWithErrorWrapping(jsonParserSequence, null, managedReferenceProperty);
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
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeWithErrorWrapping(BeanDeserializer.java:530) */
        beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, null, mergingSettableBeanProperty);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeWithErrorWrapping(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: wrapAndThrow(e, _beanType.getRawClass(), prop.getName(), ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithErrorWrapping_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        beanDeserializer._deserializeWithErrorWrapping(filteringParserDelegate, impl, managedReferenceProperty);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnDeserializeWithExternalTypeId_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = beanDeserializer._externalTypeIdHandler;
        Map finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnDeserializeWithExternalTypeId() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = beanDeserializer._externalTypeIdHandler;
        Map finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnDeserializeWithExternalTypeId_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Map finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex);
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    ///endregion
    
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
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:190)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:922)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:849) */
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
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:861) */
        beanDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithExternalTypeId_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        // 9 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        /* Wrong number of type storages is provided, expected 1 arguments,
        but only 2 found */
        
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
    public void testDeserializeWithExternalTypeId_ReturnExtComplete_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Map finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex);
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
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = beanDeserializer._externalTypeIdHandler;
        Map finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex);
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    
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
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = beanDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBeanDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = beanDeserializer._externalTypeIdHandler;
        Map finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBeanDeserializer_externalTypeIdHandler_nameToPropertyIndex);
        
        assertFalse(initialImpl_view == finalImpl_view);
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:868) */
        beanDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:869) */
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:869) */
        beanDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:871) */
        beanDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ext.complete(p, ctxt, bean);
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:343)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:872) */
        beanDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.unwrappingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (_currentlyTransforming == transformer): True}
 *  */
    @Test
    public void testUnwrappingDeserializer__currentlyTransformingEqualsTransformer() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (_currentlyTransforming == transformer): False}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, transformer);}
 *  */
    @Test
    public void testUnwrappingDeserializer__currentlyTransformingNotEqualsTransformer() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            LinkedHashMap _backRefs = new LinkedHashMap();
            setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
            
            Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
            Method unwrappingDeserializerMethod = beanDeserializerClazz.getDeclaredMethod("unwrappingDeserializer", nameTransformerClazz);
            unwrappingDeserializerMethod.setAccessible(true);
            java.lang.Object[] unwrappingDeserializerMethodArguments = new java.lang.Object[1];
            unwrappingDeserializerMethodArguments[0] = nop;
            BeanDeserializer actual = ((BeanDeserializer) unwrappingDeserializerMethod.invoke(beanDeserializer, unwrappingDeserializerMethodArguments));
            
            BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            expected._propertyBasedCreator = _propertyBasedCreator;
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
            Class _valueClass = Object.class;
            setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            
            Exception actual_nullFromCreator = actual._nullFromCreator;
            assertNull(actual_nullFromCreator);
            
            NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
            assertNull(actual_currentlyTransforming);
            
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
            
            Set actual_ignorableProps = actual._ignorableProps;
            assertNull(actual_ignorableProps);
            
            boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
            assertTrue(actual_ignoreAllUnknown);
            
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
            
            Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueClass.getClass());
            
            Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
            
            assertNull(finalBeanDeserializer_ignorableProps);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_currentlyTransforming == transformer): False}
    /// return from: {@code return new BeanDeserializer(this, transformer);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, transformer);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        NameTransformer _currentlyTransforming = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming", _currentlyTransforming);
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        NameTransformer finalBeanDeserializer_currentlyTransforming = ((NameTransformer) getFieldValue(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_currentlyTransforming);
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, transformer);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        NameTransformer _currentlyTransforming = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming", _currentlyTransforming);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
        
        NameTransformer finalBeanDeserializer_currentlyTransforming = ((NameTransformer) getFieldValue(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_currentlyTransforming);
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, transformer);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        NameTransformer _currentlyTransforming = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming", _currentlyTransforming);
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        DateDeserializers.SqlDateDeserializer _delegateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        beanDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.unwrappingDeserializer(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
        DateFormat actual_delegateDeserializer_customFormat = ((DateFormat) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer", "_customFormat"));
        assertNull(actual_delegateDeserializer_customFormat);
        
        String actual_delegateDeserializer_formatString = ((String) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer", "_formatString"));
        assertNull(actual_delegateDeserializer_formatString);
        
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
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
        
        KeyDeserializer actual_anySetter_keyDeserializer = actual_anySetter._keyDeserializer;
        assertNull(actual_anySetter_keyDeserializer);
        
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
        
        NameTransformer finalBeanDeserializer_currentlyTransforming = ((NameTransformer) getFieldValue(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_currentlyTransforming);
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
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
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserDelegate, null, null, null);
        
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithView(BeanDeserializer.java:575) */
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        Object actual = beanDeserializer.deserializeWithView(jsonParserSequence, null, object, null);
        
    }
    
    @Test
    public void testDeserializeWithView3() throws Exception  {
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
    public void testDeserializeWithView4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate11 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate12 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate13 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate14 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate14, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate13, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate14);
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser[] readerBasedJsonParserArray = {};
        Class class1 = Object.class;
        
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser[] actual = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser[]) beanDeserializer.deserializeWithView(jsonParserSequence, null, readerBasedJsonParserArray, class1));
        
        int readerBasedJsonParserArraySize = readerBasedJsonParserArray.length;
        assertEquals(readerBasedJsonParserArraySize, actual.length);
        assertTrue(deepEquals(readerBasedJsonParserArray, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testDeserializeWithView5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate11 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate12 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate13 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate14 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate13, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate14);
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser[] readerBasedJsonParserArray = {};
        Class class1 = Object.class;
        
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser[] actual = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser[]) beanDeserializer.deserializeWithView(jsonParserSequence, null, readerBasedJsonParserArray, class1));
        
        int readerBasedJsonParserArraySize = readerBasedJsonParserArray.length;
        assertEquals(readerBasedJsonParserArraySize, actual.length);
        assertTrue(deepEquals(readerBasedJsonParserArray, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithView6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        beanDeserializer.deserializeWithView(jsonParserDelegate, null, object, null);
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:682) */
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
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        int[] intArray = {};
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, intArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate2, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:684) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:175)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:686) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate4 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate5 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate5 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate7 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeWithUnwrapped12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:731) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate2, null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
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
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:190)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:744)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        beanDeserializer.deserializeWithUnwrapped(readerBasedJsonParser, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        beanDeserializer.deserializeWithUnwrapped(readerBasedJsonParser, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithUnwrapped17() throws Exception  {
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
    public void testDeserializeWithUnwrapped18() throws Exception  {
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:621) */
        beanDeserializer.deserializeWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped21() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped22() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:621) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped23() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:621) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped24() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped25() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:621) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped26() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped27() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped28() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped29() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:621) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped30() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 32);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:617) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped31() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:614) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped32() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:614) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped33() throws Throwable  {
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
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:614) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method deserializeWithUnwrappedMethod = beanDeserializerClazz.getDeclaredMethod("deserializeWithUnwrapped", parserType, deserializationContextType);
        deserializeWithUnwrappedMethod.setAccessible(true);
        java.lang.Object[] deserializeWithUnwrappedMethodArguments = new java.lang.Object[2];
        deserializeWithUnwrappedMethodArguments[0] = parser;
        deserializeWithUnwrappedMethodArguments[1] = ((Object) null);
        try {
            deserializeWithUnwrappedMethod.invoke(beanDeserializer, deserializeWithUnwrappedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithUnwrapped34() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:614) */
        beanDeserializer.deserializeWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithUnwrapped35() throws Exception  {
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
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:614) */
        beanDeserializer.deserializeWithUnwrapped(filteringParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.returnsFrom {@code return referring;}
 *  */
    @Test
    public void testHandleUnresolvedReference_ReturnReferring_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        ReadableObjectId _roid = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(unresolvedForwardReference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid", _roid);
        
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = beanDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", deserializationContextType, managedReferencePropertyType, propertyValueBufferType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = managedReferenceProperty;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = unresolvedForwardReference;
        BeanDeserializer.BeanReferring actual = ((BeanDeserializer.BeanReferring) handleUnresolvedReferenceMethod.invoke(beanDeserializer, handleUnresolvedReferenceMethodArguments));
        
        BeanDeserializer.BeanReferring expected = ((BeanDeserializer.BeanReferring) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_prop", managedReferenceProperty);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_reference", unresolvedForwardReference);
        
        DeserializationContext actual_context = ((DeserializationContext) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_context"));
        assertNull(actual_context);
        
        SettableBeanProperty expected_prop = ((SettableBeanProperty) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_prop"));
        SettableBeanProperty actual_prop = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_prop"));
        String actual_prop_referenceName = ((String) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
        assertNull(actual_prop_referenceName);
        
        boolean actual_prop_isContainer = ((Boolean) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
        assertFalse(actual_prop_isContainer);
        
        SettableBeanProperty actual_prop_backProperty = ((SettableBeanProperty) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
        assertNull(actual_prop_backProperty);
        
        SettableBeanProperty actual_propDelegate = (((SettableBeanProperty.Delegating) actual_prop)).getDelegate();
        assertNull(actual_propDelegate);
        
        PropertyName actual_prop_propName = actual_prop._propName;
        assertNull(actual_prop_propName);
        
        JavaType expected_prop_type = expected_prop._type;
        JavaType actual_prop_type = actual_prop._type;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_prop_type, actual_prop_type);
        
        PropertyName actual_prop_wrapperName = actual_prop._wrapperName;
        assertNull(actual_prop_wrapperName);
        
        Annotations actual_prop_contextAnnotations = actual_prop._contextAnnotations;
        assertNull(actual_prop_contextAnnotations);
        
        JsonDeserializer actual_prop_valueDeserializer = actual_prop._valueDeserializer;
        assertNull(actual_prop_valueDeserializer);
        
        TypeDeserializer actual_prop_valueTypeDeserializer = actual_prop._valueTypeDeserializer;
        assertNull(actual_prop_valueTypeDeserializer);
        
        NullValueProvider actual_prop_nullProvider = actual_prop._nullProvider;
        assertNull(actual_prop_nullProvider);
        
        String actual_prop_managedReferenceName = actual_prop._managedReferenceName;
        assertNull(actual_prop_managedReferenceName);
        
        ObjectIdInfo actual_prop_objectIdInfo = actual_prop._objectIdInfo;
        assertNull(actual_prop_objectIdInfo);
        
        ViewMatcher actual_prop_viewMatcher = actual_prop._viewMatcher;
        assertNull(actual_prop_viewMatcher);
        
        int expected_prop_propertyIndex = expected_prop._propertyIndex;
        int actual_prop_propertyIndex = actual_prop._propertyIndex;
        assertEquals(expected_prop_propertyIndex, actual_prop_propertyIndex);
        
        PropertyMetadata actual_prop_metadata = ((PropertyMetadata) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_prop_metadata);
        
        JsonFormat.Value actual_prop_propertyFormat = ((JsonFormat.Value) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_prop_propertyFormat);
        
        List actual_prop_aliases = ((List) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_prop_aliases);
        
        Object actual_bean = getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_bean");
        assertNull(actual_bean);
        
        UnresolvedForwardReference expected_reference = ((UnresolvedForwardReference) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_reference"));
        UnresolvedForwardReference actual_reference = ((UnresolvedForwardReference) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_reference"));
        ReadableObjectId expected_reference_roid = ((ReadableObjectId) getFieldValue(expected_reference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid"));
        ReadableObjectId actual_reference_roid = ((ReadableObjectId) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid"));
        Object actual_reference_roid_item = getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_item");
        assertNull(actual_reference_roid_item);
        
        ObjectIdGenerator.IdKey actual_reference_roid_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        assertNull(actual_reference_roid_key);
        
        LinkedList expected_reference_roid_referringProperties = ((LinkedList) getFieldValue(expected_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        LinkedList actual_reference_roid_referringProperties = ((LinkedList) getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertTrue(deepEquals(expected_reference_roid_referringProperties, actual_reference_roid_referringProperties));
        
        ObjectIdResolver actual_reference_roid_resolver = ((ObjectIdResolver) getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        assertNull(actual_reference_roid_resolver);
        
        List actual_reference_unresolvedIds = ((List) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_unresolvedIds"));
        assertNull(actual_reference_unresolvedIds);
        
        LinkedList actual_reference_path = ((LinkedList) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_reference_path);
        
        Closeable actual_reference_processor = ((Closeable) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_reference_processor);
        
        JsonLocation actual_reference_location = ((JsonLocation) getFieldValue(actual_reference, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_reference_location);
        
        Object actual_referenceBacktrace = getFieldValue(actual_reference, "java.lang.Throwable", "backtrace");
        assertNull(actual_referenceBacktrace);
        
        String actual_referenceDetailMessage = ((String) getFieldValue(actual_reference, "java.lang.Throwable", "detailMessage"));
        assertNull(actual_referenceDetailMessage);
        
        Throwable actual_referenceCause = actual_reference.getCause();
        assertNull(actual_referenceCause);
        
        java.lang.StackTraceElement[] actual_referenceStackTrace = actual_reference.getStackTrace();
        assertNull(actual_referenceStackTrace);
        
        int expected_referenceDepth = ((Integer) getFieldValue(expected_reference, "java.lang.Throwable", "depth"));
        int actual_referenceDepth = ((Integer) getFieldValue(actual_reference, "java.lang.Throwable", "depth"));
        assertEquals(expected_referenceDepth, actual_referenceDepth);
        
        List actual_referenceSuppressedExceptions = ((List) getFieldValue(actual_reference, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actual_referenceSuppressedExceptions);
        
        Class actual_beanType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_beanType"));
        assertNull(actual_beanType);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.returnsFrom {@code return referring;}
 *  */
    @Test
    public void testHandleUnresolvedReference_ReturnReferring() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        ReadableObjectId _roid = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        LinkedList _referringProperties = new LinkedList();
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        setField(_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties", _referringProperties);
        setField(unresolvedForwardReference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid", _roid);
        
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mergingSettableBeanPropertyType = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = beanDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", deserializationContextType, mergingSettableBeanPropertyType, propertyValueBufferType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = mergingSettableBeanProperty;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = unresolvedForwardReference;
        BeanDeserializer.BeanReferring actual = ((BeanDeserializer.BeanReferring) handleUnresolvedReferenceMethod.invoke(beanDeserializer, handleUnresolvedReferenceMethodArguments));
        
        BeanDeserializer.BeanReferring expected = ((BeanDeserializer.BeanReferring) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_prop", mergingSettableBeanProperty);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_reference", unresolvedForwardReference);
        
        DeserializationContext actual_context = ((DeserializationContext) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_context"));
        assertNull(actual_context);
        
        SettableBeanProperty expected_prop = ((SettableBeanProperty) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_prop"));
        SettableBeanProperty actual_prop = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_prop"));
        AnnotatedMember actual_prop_accessor = ((AnnotatedMember) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty", "_accessor"));
        assertNull(actual_prop_accessor);
        
        SettableBeanProperty actual_propDelegate = (((SettableBeanProperty.Delegating) actual_prop)).getDelegate();
        assertNull(actual_propDelegate);
        
        PropertyName actual_prop_propName = actual_prop._propName;
        assertNull(actual_prop_propName);
        
        JavaType expected_prop_type = expected_prop._type;
        JavaType actual_prop_type = actual_prop._type;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_prop_type, actual_prop_type);
        
        PropertyName actual_prop_wrapperName = actual_prop._wrapperName;
        assertNull(actual_prop_wrapperName);
        
        Annotations actual_prop_contextAnnotations = actual_prop._contextAnnotations;
        assertNull(actual_prop_contextAnnotations);
        
        JsonDeserializer actual_prop_valueDeserializer = actual_prop._valueDeserializer;
        assertNull(actual_prop_valueDeserializer);
        
        TypeDeserializer actual_prop_valueTypeDeserializer = actual_prop._valueTypeDeserializer;
        assertNull(actual_prop_valueTypeDeserializer);
        
        NullValueProvider actual_prop_nullProvider = actual_prop._nullProvider;
        assertNull(actual_prop_nullProvider);
        
        String actual_prop_managedReferenceName = actual_prop._managedReferenceName;
        assertNull(actual_prop_managedReferenceName);
        
        ObjectIdInfo actual_prop_objectIdInfo = actual_prop._objectIdInfo;
        assertNull(actual_prop_objectIdInfo);
        
        ViewMatcher actual_prop_viewMatcher = actual_prop._viewMatcher;
        assertNull(actual_prop_viewMatcher);
        
        int expected_prop_propertyIndex = expected_prop._propertyIndex;
        int actual_prop_propertyIndex = actual_prop._propertyIndex;
        assertEquals(expected_prop_propertyIndex, actual_prop_propertyIndex);
        
        PropertyMetadata actual_prop_metadata = ((PropertyMetadata) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_prop_metadata);
        
        JsonFormat.Value actual_prop_propertyFormat = ((JsonFormat.Value) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_prop_propertyFormat);
        
        List actual_prop_aliases = ((List) getFieldValue(actual_prop, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_prop_aliases);
        
        Object actual_bean = getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring", "_bean");
        assertNull(actual_bean);
        
        UnresolvedForwardReference expected_reference = ((UnresolvedForwardReference) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_reference"));
        UnresolvedForwardReference actual_reference = ((UnresolvedForwardReference) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_reference"));
        ReadableObjectId expected_reference_roid = ((ReadableObjectId) getFieldValue(expected_reference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid"));
        ReadableObjectId actual_reference_roid = ((ReadableObjectId) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid"));
        Object actual_reference_roid_item = getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_item");
        assertNull(actual_reference_roid_item);
        
        ObjectIdGenerator.IdKey actual_reference_roid_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        assertNull(actual_reference_roid_key);
        
        LinkedList expected_reference_roid_referringProperties = ((LinkedList) getFieldValue(expected_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        LinkedList actual_reference_roid_referringProperties = ((LinkedList) getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertTrue(deepEquals(expected_reference_roid_referringProperties, actual_reference_roid_referringProperties));
        
        ObjectIdResolver actual_reference_roid_resolver = ((ObjectIdResolver) getFieldValue(actual_reference_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        assertNull(actual_reference_roid_resolver);
        
        List actual_reference_unresolvedIds = ((List) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_unresolvedIds"));
        assertNull(actual_reference_unresolvedIds);
        
        LinkedList actual_reference_path = ((LinkedList) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_reference_path);
        
        Closeable actual_reference_processor = ((Closeable) getFieldValue(actual_reference, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_reference_processor);
        
        JsonLocation actual_reference_location = ((JsonLocation) getFieldValue(actual_reference, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_reference_location);
        
        Object actual_referenceBacktrace = getFieldValue(actual_reference, "java.lang.Throwable", "backtrace");
        assertNull(actual_referenceBacktrace);
        
        String actual_referenceDetailMessage = ((String) getFieldValue(actual_reference, "java.lang.Throwable", "detailMessage"));
        assertNull(actual_referenceDetailMessage);
        
        Throwable actual_referenceCause = actual_reference.getCause();
        assertNull(actual_referenceCause);
        
        java.lang.StackTraceElement[] actual_referenceStackTrace = actual_reference.getStackTrace();
        assertNull(actual_referenceStackTrace);
        
        int expected_referenceDepth = ((Integer) getFieldValue(expected_reference, "java.lang.Throwable", "depth"));
        int actual_referenceDepth = ((Integer) getFieldValue(actual_reference, "java.lang.Throwable", "depth"));
        assertEquals(expected_referenceDepth, actual_referenceDepth);
        
        List actual_referenceSuppressedExceptions = ((List) getFieldValue(actual_reference, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actual_referenceSuppressedExceptions);
        
        Class actual_beanType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "_beanType"));
        assertNull(actual_beanType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.getType()
 *  */
    @Test
    public void testHandleUnresolvedReference_ThrowNullPointerException() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference(BeanDeserializer.java:518) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class settableBeanPropertyType = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = beanDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", deserializationContextType, settableBeanPropertyType, propertyValueBufferType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = ((Object) null);
        try {
            handleUnresolvedReferenceMethod.invoke(beanDeserializer, handleUnresolvedReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reference.getRoid().appendReferring(referring);
 *  */
    @Test
    public void testHandleUnresolvedReference_ThrowNullPointerException_1() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference(BeanDeserializer.java:519) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = beanDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", deserializationContextType, managedReferencePropertyType, propertyValueBufferType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = managedReferenceProperty;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = ((Object) null);
        try {
            handleUnresolvedReferenceMethod.invoke(beanDeserializer, handleUnresolvedReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handleUnresolvedReference(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.UnresolvedForwardReference#getRoid()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reference.getRoid().appendReferring(referring);
 *  */
    @Test
    public void testHandleUnresolvedReference_ThrowNullPointerException_2() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.handleUnresolvedReference(BeanDeserializer.java:519) */
        Class beanDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = beanDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", deserializationContextType, managedReferencePropertyType, propertyValueBufferType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = managedReferenceProperty;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = unresolvedForwardReference;
        try {
            handleUnresolvedReferenceMethod.invoke(beanDeserializer, handleUnresolvedReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:190)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:395) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.getActiveView()
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:397) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getActiveView()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:399) */
        beanDeserializer._deserializeUsingPropertyBased(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:399) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:395) */
        beanDeserializer._deserializeUsingPropertyBased(null, null);
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
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate2, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:402) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:402) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:402) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _allProperties);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:490) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserSequence, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:402) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:402) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:114)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:399) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:490) */
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:490) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingPropertyBased12() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:490) */
        beanDeserializer._deserializeUsingPropertyBased(jsonParserSequence, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[32];
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased14() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased15() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null, null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null, null, null, null, null, null, null, null, null, null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased17() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased18() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[17];
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, impl);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserSequence, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased21() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased22() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased23() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased24() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 10);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased25() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(methodProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) methodProperty);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        _allProperties[1] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[2] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[3] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[4] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[5] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[6] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[7] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[8] = ((SettableBeanProperty) managedReferenceProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased26() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased27() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased28() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _withArgsCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased29() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate1, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased30() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(jsonParserDelegate1, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeUsingPropertyBased31() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeUsingPropertyBased32() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 17);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        _allProperties[1] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[2] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[3] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[4] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[5] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[6] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[7] = ((SettableBeanProperty) managedReferenceProperty);
        _allProperties[8] = ((SettableBeanProperty) managedReferenceProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region Errors report for _deserializeUsingPropertyBased
    
    public void test_deserializeUsingPropertyBased_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:190)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:744) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:744) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeUsingPropertyBasedWithUnwrapped1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeUsingPropertyBasedWithUnwrapped2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped5() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped7() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 34);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped8() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate7 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped10() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate5 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BeanDeserializer.java:832) */
        beanDeserializer.deserializeUsingPropertyBasedWithUnwrapped(jsonParserDelegate, null);
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
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:190)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:922) */
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:920) */
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
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:922) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 33);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_beanType", _beanType);
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate4 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(delegate4, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:999) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        MapLikeType _beanType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_beanType", _beanType);
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeUsingPropertyBasedWithExternalTypeId3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 34);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 12);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        beanDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate10 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1754)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(BeanDeserializer.java:999) */
        beanDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(jsonParserSequence, null);
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
    public void testWithObjectIdReader_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        
        JavaType javaType = beanDeserializer._beanType;
        Class initialBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BeanDeserializer actual = beanDeserializer.withObjectIdReader(((ObjectIdReader) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = beanDeserializer._beanType;
        Class finalBeanDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        
        assertFalse(initialBeanDeserializer_beanType_class == finalBeanDeserializer_beanType_class);
        
        assertNull(finalBeanDeserializer_ignorableProps);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        NioPathDeserializer _delegateDeserializer = ((NioPathDeserializer) createInstance("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        beanDeserializer._anySetter = _anySetter;
        
        BeanDeserializer actual = beanDeserializer.withObjectIdReader(((ObjectIdReader) null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
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
        
        KeyDeserializer actual_anySetter_keyDeserializer = actual_anySetter._keyDeserializer;
        assertNull(actual_anySetter_keyDeserializer);
        
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
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        Map finalBeanDeserializer_backRefs = beanDeserializer._backRefs;
        
        assertNull(finalBeanDeserializer_ignorableProps);
        
        assertNull(finalBeanDeserializer_backRefs);
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
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:277) */
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
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.setCurrentValue(bean);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException_1() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:279) */
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
        // 8 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._missingToken(BeanDeserializer.java:203) */
        beanDeserializer._missingToken(null, null);
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
    public void testWithBeanProperties_Return() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.withBeanProperties(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        Set finalBeanDeserializer_ignorableProps = beanDeserializer._ignorableProps;
        
        assertNull(finalBeanDeserializer_ignorableProps);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.returnsFrom {@code return new BeanDeserializer(this, props);}
 *  */
    @Test
    public void testWithBeanProperties_Return_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        BeanDeserializer actual = ((BeanDeserializer) beanDeserializer.withBeanProperties(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        NameTransformer actual_currentlyTransforming = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_currentlyTransforming"));
        assertNull(actual_currentlyTransforming);
        
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeOther(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void test_deserializeOther_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198) */
        beanDeserializer._deserializeOther(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1089710087616700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1089710087616700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1089710087626300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1089710087616700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1089710087626300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1089710088026100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1089710088026100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1089710088028200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1089710088026100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1089710088028200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1089710092111000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1089710092111000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1089710092112900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1089710092111000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1089710092112900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

