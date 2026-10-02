package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import java.io.IOException;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.NoAnnotations;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.reflect.Method;
import java.util.HashMap;
import com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.TwoAnnotations;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_impl_FieldPropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_annotated == null)): True}
 * @utbot.returnsFrom {@code return (_annotated == null) ? null : _annotated.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__annotatedEqualsNull() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        
        Annotation actual = fieldProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_annotated == null)): False}
 * @utbot.returnsFrom {@code return (_annotated == null) ? null : _annotated.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__annotatedNotEqualsNull() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AnnotatedField _annotated = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
        
        Annotation actual = fieldProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_annotated == null)): False}
 * @utbot.returnsFrom {@code return (_annotated == null) ? null : _annotated.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__annotatedNotEqualsNull_1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AnnotatedField _annotated = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
        
        Annotation actual = fieldProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.set
    
    ///region Errors report for set
    
    public void testSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#readResolve()}
 * @utbot.returnsFrom {@code return new FieldProperty(this);}
 *  */
    @Test
    public void testReadResolve_Return() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AnnotatedField _annotated = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Field _field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_field", _field);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        FieldProperty actual = ((FieldProperty) fieldProperty.readResolve());
        
        FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_field", _field);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        AnnotatedField expected_annotated = expected._annotated;
        AnnotatedField actual_annotated = actual._annotated;
        // com.fasterxml.jackson.databind.introspect.AnnotatedField has overridden equals method
        assertEquals(expected_annotated, actual_annotated);
        
        Field expected_field = expected._field;
        Field actual_field = actual._field;
        // java.lang.reflect.Field has overridden equals method
        assertEquals(expected_field, actual_field);
        
        boolean actual_skipNulls = actual._skipNulls;
        assertFalse(actual_skipNulls);
        
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_propName);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#readResolve()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new FieldProperty(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AnnotatedField _annotated = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        fieldProperty.readResolve();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new FieldProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        FieldProperty actual = ((FieldProperty) fieldProperty.withName(null));
        
        FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        AnnotatedField actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        boolean actual_skipNulls = actual._skipNulls;
        assertFalse(actual_skipNulls);
        
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_propName);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerEqualsDeser() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        
        FieldProperty actual = ((FieldProperty) fieldProperty.withValueDeserializer(null));
        
        AnnotatedField actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        boolean actual_skipNulls = actual._skipNulls;
        assertFalse(actual_skipNulls);
        
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_propName);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
        assertNull(actual_nullProvider);
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int fieldProperty_propertyIndex = ((Integer) getFieldValue(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(fieldProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new FieldProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser_2() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            FailingDeserializer _nullProvider = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            NullValueProvider fieldProperty_nullProvider = ((NullValueProvider) getFieldValue(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Class initialFieldProperty_nullProvider_valueClass = ((Class) getFieldValue(fieldProperty_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            FieldProperty actual = ((FieldProperty) fieldProperty.withValueDeserializer(null));
            
            FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            AnnotatedField actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            boolean actual_skipNulls = actual._skipNulls;
            assertFalse(actual_skipNulls);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider expected_nullProvider = ((NullValueProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            NullValueProvider fieldProperty_nullProvider1 = ((NullValueProvider) getFieldValue(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Class finalFieldProperty_nullProvider_valueClass = ((Class) getFieldValue(fieldProperty_nullProvider1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialFieldProperty_nullProvider_valueClass == finalFieldProperty_nullProvider_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new FieldProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((Converter) null));
            
            FieldProperty actual = ((FieldProperty) fieldProperty.withValueDeserializer(stdDelegatingDeserializer));
            
            FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            AnnotatedField actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            boolean actual_skipNulls = actual._skipNulls;
            assertFalse(actual_skipNulls);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            Converter actual_valueDeserializer_converter = ((Converter) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
            assertNull(actual_valueDeserializer_converter);
            
            JavaType actual_valueDeserializer_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
            assertNull(actual_valueDeserializer_delegateType);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            assertNull(actual_nullProvider);
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new FieldProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", skipper);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 8);
            JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
            TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
            
            FieldProperty actual = ((FieldProperty) fieldProperty.withValueDeserializer(typeWrappedDeserializer));
            
            FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_skipNulls", true);
            TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", skipper);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 8);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
            
            AnnotatedField actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            boolean actual_skipNulls = actual._skipNulls;
            assertTrue(actual_skipNulls);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            TypeDeserializer actual_valueDeserializer_typeDeserializer = ((TypeDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
            assertNull(actual_valueDeserializer_typeDeserializer);
            
            JsonDeserializer actual_valueDeserializer_deserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
            assertNull(actual_valueDeserializer_deserializer);
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider expected_nullProvider = ((NullValueProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Object actual_nullProvider_nullValue = getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_nullValue");
            assertNull(actual_nullProvider_nullValue);
            
            AccessPattern expected_nullProvider_access = ((AccessPattern) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access"));
            AccessPattern actual_nullProvider_access = ((AccessPattern) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access"));
            assertEquals(expected_nullProvider_access, actual_nullProvider_access);
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value expected_propertyFormat = ((JsonFormat.Value) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
            assertEquals(expected_propertyFormat, actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_skipNulls): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void testDeserializeSetAndReturn__skipNulls() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_skipNulls", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        Object actual = fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_skipNulls): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.NullValueProvider#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn(FieldProperty.java:164) */
        fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_2() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn(FieldProperty.java:166) */
        fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_3() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn(FieldProperty.java:175) */
        fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NULL)
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException() throws IOException  {
        FieldProperty fieldProperty = new FieldProperty(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException] */
        fieldProperty.deserializeSetAndReturn(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_4() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn(FieldProperty.java:175) */
        fieldProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_5() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeSetAndReturn(FieldProperty.java:166) */
        fieldProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_2() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        fieldProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_skipNulls): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.NullValueProvider#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.NullValueProvider#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.lang.reflect.Field#set(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#_throwAsIOE(com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _throwAsIOE(p, e, value);
 *  */
    @Test(expected = NullPointerException.class)
    public void testDeserializeSetAndReturn_ThrowNullPointerException_6() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            
            fieldProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region Errors report for deserializeSetAndReturn
    
    public void testDeserializeSetAndReturn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#getMember()}
 * @utbot.returnsFrom {@code return _annotated;}
 *  */
    @Test
    public void testGetMember_Return_annotated() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        
        AnnotatedMember actual = fieldProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.withNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new FieldProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_2() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            AnnotationCollector.NoAnnotations _contextAnnotations = ((AnnotationCollector.NoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 4);
            
            FieldProperty actual = ((FieldProperty) fieldProperty.withNullProvider(skipper));
            
            FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_skipNulls", true);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", skipper);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 4);
            
            AnnotatedField actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            boolean actual_skipNulls = actual._skipNulls;
            assertTrue(actual_skipNulls);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations expected_contextAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider expected_nullProvider = ((NullValueProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Object actual_nullProvider_nullValue = getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_nullValue");
            assertNull(actual_nullProvider_nullValue);
            
            AccessPattern expected_nullProvider_access = ((AccessPattern) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access"));
            AccessPattern actual_nullProvider_access = ((AccessPattern) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access"));
            assertEquals(expected_nullProvider_access, actual_nullProvider_access);
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new FieldProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class fieldPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = fieldPropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            FieldProperty actual = ((FieldProperty) withNullProviderMethod.invoke(fieldProperty, withNullProviderMethodArguments));
            
            FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            AnnotatedField actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            boolean actual_skipNulls = actual._skipNulls;
            assertFalse(actual_skipNulls);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations expected_contextAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            HashMap actual_contextAnnotations_annotations = ((HashMap) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
            assertNull(actual_contextAnnotations_annotations);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertNull(actual_valueDeserializer_message);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider expected_nullProvider = ((NullValueProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String expected_managedReferenceName = ((String) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertEquals(expected_managedReferenceName, actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata expected_metadata = ((PropertyMetadata) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            Boolean actual_metadata_required = ((Boolean) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required"));
            assertNull(actual_metadata_required);
            
            String actual_metadata_description = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_description"));
            assertNull(actual_metadata_description);
            
            Integer actual_metadata_index = ((Integer) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_index"));
            assertNull(actual_metadata_index);
            
            String actual_metadata_defaultValue = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_defaultValue"));
            assertNull(actual_metadata_defaultValue);
            
            PropertyMetadata.MergeInfo actual_metadata_mergeInfo = ((PropertyMetadata.MergeInfo) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_mergeInfo"));
            assertNull(actual_metadata_mergeInfo);
            
            Nulls actual_metadata_valueNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls"));
            assertNull(actual_metadata_valueNulls);
            
            Nulls actual_metadata_contentNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_contentNulls"));
            assertNull(actual_metadata_contentNulls);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new FieldProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            AnnotatedField _annotated = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
            AnnotationCollector.TwoAnnotations _contextAnnotations = ((AnnotationCollector.TwoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            String _managedReferenceName = "";
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class fieldPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = fieldPropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            FieldProperty actual = ((FieldProperty) withNullProviderMethod.invoke(fieldProperty, withNullProviderMethodArguments));
            
            FieldProperty expected = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_annotated", _annotated);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            AnnotatedField expected_annotated = expected._annotated;
            AnnotatedField actual_annotated = actual._annotated;
            // com.fasterxml.jackson.databind.introspect.AnnotatedField has overridden equals method
            assertEquals(expected_annotated, actual_annotated);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            boolean actual_skipNulls = actual._skipNulls;
            assertFalse(actual_skipNulls);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations expected_contextAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            Class actual_contextAnnotations_type1 = ((Class) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type1"));
            assertNull(actual_contextAnnotations_type1);
            
            Class actual_contextAnnotations_type2 = ((Class) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_type2"));
            assertNull(actual_contextAnnotations_type2);
            
            Annotation actual_contextAnnotations_value1 = ((Annotation) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_value1"));
            assertNull(actual_contextAnnotations_value1);
            
            Annotation actual_contextAnnotations_value2 = ((Annotation) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations", "_value2"));
            assertNull(actual_contextAnnotations_value2);
            
            JsonDeserializer expected_valueDeserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            String expected_valueDeserializer_message = ((String) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_valueDeserializer_message, actual_valueDeserializer_message);
            
            Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_valueTypeDeserializer);
            
            NullValueProvider expected_nullProvider = ((NullValueProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String expected_managedReferenceName = ((String) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertEquals(expected_managedReferenceName, actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_viewMatcher);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata expected_metadata = ((PropertyMetadata) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            Boolean actual_metadata_required = ((Boolean) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required"));
            assertNull(actual_metadata_required);
            
            String actual_metadata_description = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_description"));
            assertNull(actual_metadata_description);
            
            Integer actual_metadata_index = ((Integer) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_index"));
            assertNull(actual_metadata_index);
            
            String actual_metadata_defaultValue = ((String) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_defaultValue"));
            assertNull(actual_metadata_defaultValue);
            
            PropertyMetadata.MergeInfo actual_metadata_mergeInfo = ((PropertyMetadata.MergeInfo) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_mergeInfo"));
            assertNull(actual_metadata_mergeInfo);
            
            Nulls actual_metadata_valueNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls"));
            assertNull(actual_metadata_valueNulls);
            
            Nulls actual_metadata_contentNulls = ((Nulls) getFieldValue(actual_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_contentNulls"));
            assertNull(actual_metadata_contentNulls);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.setAndReturn
    
    ///region Errors report for setAndReturn
    
    public void testSetAndReturn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.fixAccess
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)
 *  */
    @Test
    public void testFixAccess_ThrowNullPointerException() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.fixAccess(FieldProperty.java:104) */
        fieldProperty.fixAccess(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    @Test
    public void testFixAccess1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Field _field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_field", _field);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.fixAccess] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Field.toString(Field.java:330)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:921)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.fixAccess(FieldProperty.java:103) */
        fieldProperty.fixAccess(deserializationConfig);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_skipNulls): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDeserializeAndSet__skipNulls() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_skipNulls", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_skipNulls): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.NullValueProvider#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:135) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_2() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_3() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NULL)
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException() throws IOException  {
        FieldProperty fieldProperty = new FieldProperty(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException] */
        fieldProperty.deserializeAndSet(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_4() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_5() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FieldProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.FieldProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserializeWithType(p, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_2() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        fieldProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet1() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _nullProvider);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet2() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _nullProvider);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(jsonParserDelegate, impl, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet3() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet4() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _nullProvider);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(jsonParserDelegate1, null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet5() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(jsonParserDelegate1, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet6() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer[] throwableDeserializerArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, throwableDeserializerArray);
    }
    
    @Test
    public void testDeserializeAndSet7() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        java.lang.Object[] charDeserArray = createArray("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser", 0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, null, charDeserArray);
    }
    
    @Test
    public void testDeserializeAndSet8() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.core.json.async.NonBlockingJsonParser[] nonBlockingJsonParserArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1426)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(jsonParserDelegate, impl, nonBlockingJsonParserArray);
    }
    
    @Test
    public void testDeserializeAndSet9() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.core.json.async.NonBlockingJsonParser[] nonBlockingJsonParserArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1426)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, impl, nonBlockingJsonParserArray);
    }
    
    @Test
    public void testDeserializeAndSet10() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] shortDeserArray = createArray("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(jsonParserDelegate, impl, shortDeserArray);
    }
    
    @Test
    public void testDeserializeAndSet11() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(jsonParserSequence, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet12() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(jsonParserSequence, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet13() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet14() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet15() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:146) */
        fieldProperty.deserializeAndSet(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeAndSet16() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(jsonParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet17() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.FieldProperty.deserializeAndSet(FieldProperty.java:137) */
        fieldProperty.deserializeAndSet(jsonParserSequence, impl, object);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet18() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            fieldProperty.deserializeAndSet(filteringParserDelegate, impl, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet19() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer1 = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            fieldProperty.deserializeAndSet(filteringParserDelegate, impl, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet20() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer1 = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(jsonParserSequence, impl, object);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet21() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Object object = new Object();
        
        fieldProperty.deserializeAndSet(jsonParserDelegate1, null, object);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet22() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            JsonNodeDeserializer _deserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            fieldProperty.deserializeAndSet(jsonParserSequence, impl, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet23() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NULL;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            fieldProperty.deserializeAndSet(jsonParserDelegate, impl, object);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet24() throws Exception  {
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        TypeWrappedDeserializer _nullProvider = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        JsonNodeDeserializer _deserializer1 = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        fieldProperty.deserializeAndSet(jsonParserDelegate1, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1095022558279500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1095022558279500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1095022558286099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095022558279500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095022558286099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095022558761400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095022558761400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095022558764500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095022558761400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095022558764500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1095022559192900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095022559192900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095022559195400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095022559192900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095022559195400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095022560140800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095022560140800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095022560143600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095022560140800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095022560143600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

