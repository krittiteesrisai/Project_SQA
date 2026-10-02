package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.BeanProperty;
import java.util.Map;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.util.HashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Parameter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_impl_InnerClassPropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        InnerClassProperty actual = innerClassProperty.withName(((PropertyName) null));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        ObjectIdReader actual_delegate_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_delegate_objectIdReader);
        
        PropertyName actual_delegate_propName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_delegate_propName);
        
        JavaType actual_delegate_type = ((JavaType) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_delegate_type);
        
        PropertyName actual_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_delegate_wrapperName);
        
        Annotations actual_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_delegate_contextAnnotations);
        
        JsonDeserializer actual_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_delegate_valueDeserializer);
        
        TypeDeserializer actual_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_delegate_valueTypeDeserializer);
        
        String actual_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_delegate_managedReferenceName);
        
        ObjectIdInfo actual_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_delegate_objectIdInfo);
        
        ViewMatcher actual_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_delegate_viewMatcher);
        
        int expected_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_delegate_propertyIndex, actual_delegate_propertyIndex);
        
        PropertyMetadata actual_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_delegate_metadata);
        
        JsonFormat.Value actual_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_delegate_format);
        
        Constructor actual_creator = actual._creator;
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        InnerClassProperty actual = innerClassProperty.withName(((PropertyName) null));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        String actual_delegate_referenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
        assertNull(actual_delegate_referenceName);
        
        boolean actual_delegate_isContainer = ((Boolean) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
        assertFalse(actual_delegate_isContainer);
        
        SettableBeanProperty actual_delegate_managedProperty = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
        assertNull(actual_delegate_managedProperty);
        
        SettableBeanProperty actual_delegate_backProperty = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
        assertNull(actual_delegate_backProperty);
        
        PropertyName actual_delegate_propName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_delegate_propName);
        
        JavaType actual_delegate_type = ((JavaType) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_delegate_type);
        
        PropertyName actual_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_delegate_wrapperName);
        
        Annotations actual_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_delegate_contextAnnotations);
        
        JsonDeserializer actual_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_delegate_valueDeserializer);
        
        TypeDeserializer actual_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_delegate_valueTypeDeserializer);
        
        String actual_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_delegate_managedReferenceName);
        
        ObjectIdInfo actual_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_delegate_objectIdInfo);
        
        ViewMatcher actual_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_delegate_viewMatcher);
        
        int expected_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_delegate_propertyIndex, actual_delegate_propertyIndex);
        
        PropertyMetadata actual_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_delegate_metadata);
        
        JsonFormat.Value actual_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_delegate_format);
        
        Constructor actual_creator = actual._creator;
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return_2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        ViewMatcher _viewMatcher = ((ViewMatcher) createInstance("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        InnerClassProperty actual = innerClassProperty.withName(((PropertyName) null));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate2 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate3 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate2, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate3);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate2);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        SettableBeanProperty expected_delegate_delegate = ((SettableBeanProperty) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty actual_delegate_delegate = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        ObjectIdReader actual_delegate_delegate_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_delegate_delegate_objectIdReader);
        
        PropertyName actual_delegate_delegate_propName = ((PropertyName) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_delegate_delegate_propName);
        
        JavaType actual_delegate_delegate_type = ((JavaType) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_delegate_delegate_type);
        
        PropertyName actual_delegate_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_delegate_delegate_wrapperName);
        
        Annotations actual_delegate_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_delegate_delegate_contextAnnotations);
        
        JsonDeserializer actual_delegate_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        assertNull(actual_delegate_delegate_valueDeserializer);
        
        TypeDeserializer actual_delegate_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_delegate_delegate_valueTypeDeserializer);
        
        String actual_delegate_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_delegate_delegate_managedReferenceName);
        
        ObjectIdInfo actual_delegate_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_delegate_delegate_objectIdInfo);
        
        ViewMatcher actual_delegate_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_delegate_delegate_viewMatcher);
        
        int expected_delegate_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_delegate_delegate_propertyIndex, actual_delegate_delegate_propertyIndex);
        
        PropertyMetadata actual_delegate_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_delegate_delegate_metadata);
        
        JsonFormat.Value actual_delegate_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_delegate_delegate_format);
        
        Constructor actual_delegate_creator = ((Constructor) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_delegate_creator);
        
        AnnotatedConstructor actual_delegate_annotated = ((AnnotatedConstructor) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_delegate_annotated);
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        
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
        ViewMatcher expected_viewMatcher = ((ViewMatcher) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    @Test
    public void testWithName1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate2 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate3 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate4 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate3, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate4);
        setField(_delegate2, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate3);
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate2);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        
        InnerClassProperty actual = innerClassProperty.withName(((PropertyName) null));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate5 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate6 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate7 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate8 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate9 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate8, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate9);
        setField(_delegate7, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate8);
        setField(_delegate6, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate7);
        setField(_delegate5, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate6);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate5);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        SettableBeanProperty expected_delegate_delegate = ((SettableBeanProperty) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty actual_delegate_delegate = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty expected_delegate_delegate_delegate = ((SettableBeanProperty) getFieldValue(expected_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty actual_delegate_delegate_delegate = ((SettableBeanProperty) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty expected_delegate_delegate_delegate_delegate = ((SettableBeanProperty) getFieldValue(expected_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty actual_delegate_delegate_delegate_delegate = ((SettableBeanProperty) getFieldValue(actual_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty expected_delegate_delegate_delegate_delegate_delegate = ((SettableBeanProperty) getFieldValue(expected_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty actual_delegate_delegate_delegate_delegate_delegate = ((SettableBeanProperty) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expected_delegate_delegate_delegate_delegate_delegate, actual_delegate_delegate_delegate_delegate_delegate));
        
        Constructor actual_delegate_delegate_delegate_delegate_creator = ((Constructor) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_creator, actual_delegate_delegate_delegate_delegate_creator));
        
        AnnotatedConstructor actual_delegate_delegate_delegate_delegate_annotated = ((AnnotatedConstructor) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_annotated, actual_delegate_delegate_delegate_delegate_annotated));
        
        PropertyName actual_delegate_delegate_delegate_delegate_propName = ((PropertyName) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_propName, actual_delegate_delegate_delegate_delegate_propName));
        
        JavaType actual_delegate_delegate_delegate_delegate_type = ((JavaType) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_type, actual_delegate_delegate_delegate_delegate_type));
        
        PropertyName actual_delegate_delegate_delegate_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_wrapperName, actual_delegate_delegate_delegate_delegate_wrapperName));
        
        Annotations actual_delegate_delegate_delegate_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_contextAnnotations, actual_delegate_delegate_delegate_delegate_contextAnnotations));
        
        JsonDeserializer actual_delegate_delegate_delegate_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_valueDeserializer, actual_delegate_delegate_delegate_delegate_valueDeserializer));
        
        TypeDeserializer actual_delegate_delegate_delegate_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_valueTypeDeserializer, actual_delegate_delegate_delegate_delegate_valueTypeDeserializer));
        
        String actual_delegate_delegate_delegate_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_managedReferenceName, actual_delegate_delegate_delegate_delegate_managedReferenceName));
        
        ObjectIdInfo actual_delegate_delegate_delegate_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_objectIdInfo, actual_delegate_delegate_delegate_delegate_objectIdInfo));
        
        ViewMatcher actual_delegate_delegate_delegate_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_viewMatcher, actual_delegate_delegate_delegate_delegate_viewMatcher));
        
        int expected_delegate_delegate_delegate_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_delegate_delegate_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expected_delegate_delegate_delegate_delegate_propertyIndex, actual_delegate_delegate_delegate_delegate_propertyIndex));
        
        PropertyMetadata actual_delegate_delegate_delegate_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_metadata, actual_delegate_delegate_delegate_delegate_metadata));
        
        JsonFormat.Value actual_delegate_delegate_delegate_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate_delegate_delegate_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_delegate_delegate_delegate_delegate_format, actual_delegate_delegate_delegate_delegate_format));
        
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate_delegate, actual_delegate_delegate_delegate));
        
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        assertTrue(deepEquals(expected_delegate_delegate, actual_delegate_delegate));
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        
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
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    @Test(expected = StackOverflowError.class)
    public void testWithName2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        
        innerClassProperty.withName(((PropertyName) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_3() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:116) */
        innerClassProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.getNullValue(ctxt);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:116) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException() throws IOException  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException] */
        innerClassProperty.deserializeAndSet(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _valueDeserializer.deserializeWithType(jp, ctxt, _valueTypeDeserializer);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:118) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): False}
 * @utbot.invokes {@link java.lang.reflect.Constructor#newInstance(java.lang.Object[])}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Constructor#getDeclaringClass()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ClassUtil.unwrapAndThrowAsIAE(e, "Failed to instantiate class " + _creator.getDeclaringClass().getName() + ", problem: " + e.getMessage());
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_4() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:123) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (_valueTypeDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = _valueDeserializer.deserializeWithType(jp, ctxt, _valueTypeDeserializer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: set(bean, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeAndSet_ThrowUnsupportedOperationException() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        innerClassProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: set(bean, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeAndSet_ThrowUnsupportedOperationException_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        innerClassProperty.deserializeAndSet(jsonParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:129)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:118) */
        innerClassProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet3() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:125)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:118) */
        innerClassProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet4() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getNullValue(TypeWrappedDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:116) */
        innerClassProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet5() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:118) */
        innerClassProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet6() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer1 = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:128) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet7() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdReferenceProperty idProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:93)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:128) */
        innerClassProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet8() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:139)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:128) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, uTF8StreamJsonParser);
    }
    
    @Test
    public void testDeserializeAndSet9() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:107)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:128) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet10() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:107)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:139)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:111)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:128) */
        innerClassProperty.deserializeAndSet(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet11() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        InnerClassProperty idProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.setAndReturn(InnerClassProperty.java:146)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeAndSet(InnerClassProperty.java:128) */
        innerClassProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeAndSet12() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        innerClassProperty.deserializeAndSet(jsonParserDelegate, impl, object);
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.setAndReturn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test
    public void testSetAndReturn_ThrowNullPointerException() throws IOException  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.setAndReturn] produces [java.lang.NullPointerException] */
        innerClassProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        innerClassProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        innerClassProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", managedReferenceProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        innerClassProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_7() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", managedReferenceProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        int[] intArray = {};
        
        innerClassProperty.setAndReturn(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_4() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        java.lang.Object[] objectArray = {null, null};
        
        innerClassProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_6() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        innerClassProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        innerClassProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return _delegate.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_5() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", managedReferenceProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        byte[] byteArray = {};
        
        innerClassProperty.setAndReturn(null, byteArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testSetAndReturn1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", _backProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.setAndReturn(object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSetAndReturn2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", _managedProperty);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.setAndReturn(null, object);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", managedReferenceProperty);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", managedReferenceProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn4() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn6() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.setAndReturn(object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getMember()}
 * @utbot.returnsFrom {@code return _delegate.getMember();}
 *  */
    @Test
    public void testGetMember_Return_delegateGetMember_1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        AnnotatedMember actual = innerClassProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getMember()}
 * @utbot.returnsFrom {@code return _delegate.getMember();}
 *  */
    @Test
    public void testGetMember_Return_delegateGetMember_2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        AnnotatedMember actual = innerClassProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getMember()}
 * @utbot.returnsFrom {@code return _delegate.getMember();}
 *  */
    @Test
    public void testGetMember_Return_delegateGetMember() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        AnnotatedMember actual = innerClassProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getMember()}
 * @utbot.returnsFrom {@code return _delegate.getMember();}
 *  */
    @Test
    public void testGetMember_Return_delegateGetMember_3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        AnnotatedMember actual = innerClassProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMember()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getMember()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public AnnotatedMember getMember() {
 *     return _delegate.getMember();
 * }
 *  */
    @Test
    public void testGetMember_ThrowNullPointerException() {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getMember] produces [java.lang.NullPointerException] */
        innerClassProperty.getMember();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMember()
    
    @Test
    public void testGetMember1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty7 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty8 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty9 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty10 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty11 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty12 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty13 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty14 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty15 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty16 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty17 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty17, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate2);
        setField(_managedProperty16, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty17);
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty16);
        setField(_managedProperty15, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty14, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty15);
        setField(_managedProperty13, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty14);
        setField(_managedProperty12, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty13);
        setField(_managedProperty11, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty12);
        setField(_managedProperty10, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty11);
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty10);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        AnnotatedMember actual = innerClassProperty.getMember();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetMember2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty7 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty8 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty9 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty10 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty11 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty12 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty13 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty14 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty15 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty16 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty17 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty18 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty19 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty18, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty19);
        setField(_managedProperty17, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty18);
        setField(_managedProperty16, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty17);
        setField(_managedProperty15, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty16);
        setField(_managedProperty14, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty15);
        setField(_managedProperty13, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty14);
        setField(_managedProperty12, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty13);
        setField(_managedProperty11, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty12);
        setField(_managedProperty10, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty11);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty10);
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        AnnotatedMember actual = innerClassProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMember()
    
    @Test
    public void testGetMember3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty7 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty8 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty9 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty10 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty11 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty12 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty13 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty14 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty15 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty16 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty17 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty18 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdReferenceProperty _managedProperty19 = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(_managedProperty18, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty19);
        setField(_managedProperty17, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty18);
        setField(_managedProperty16, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty17);
        setField(_managedProperty15, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty16);
        setField(_managedProperty14, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty15);
        setField(_managedProperty13, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty14);
        setField(_managedProperty12, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty13);
        setField(_managedProperty11, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty12);
        setField(_managedProperty10, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty11);
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty10);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getMember] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getMember(ObjectIdReferenceProperty.java:58)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getMember(InnerClassProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.getMember(ManagedReferenceProperty.java:89)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getMember(InnerClassProperty.java:101) */
        innerClassProperty.getMember();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.assignIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignIndex(int)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#assignIndex(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#assignIndex(int)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testAssignIndex_SettableBeanPropertyAssignIndex() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -1);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        innerClassProperty1.assignIndex(-255);
        
        SettableBeanProperty settableBeanProperty = innerClassProperty1._delegate;
        SettableBeanProperty settableBeanProperty_delegate_delegate = ((SettableBeanProperty) getFieldValue(settableBeanProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        int finalInnerClassProperty1_delegate_delegate_propertyIndex = ((Integer) getFieldValue(settableBeanProperty_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        
        assertEquals(-255, finalInnerClassProperty1_delegate_delegate_propertyIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assignIndex(int)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#assignIndex(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#assignIndex(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testAssignIndex_ThrowNullPointerException() {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.assignIndex] produces [java.lang.NullPointerException] */
        innerClassProperty.assignIndex(-255);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#assignIndex(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#assignIndex(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testAssignIndex_ThrowNullPointerException_1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.assignIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:321)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.assignIndex(SettableBeanProperty.java:308)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.assignIndex(InnerClassProperty.java:88)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.assignIndex(InnerClassProperty.java:88) */
        innerClassProperty1.assignIndex(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getPropertyIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyIndex()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getPropertyIndex()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getPropertyIndex()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetPropertyIndex_SettableBeanPropertyGetPropertyIndex() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        int actual = innerClassProperty1.getPropertyIndex();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyIndex()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getPropertyIndex()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getPropertyIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetPropertyIndex_ThrowNullPointerException() {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getPropertyIndex] produces [java.lang.NullPointerException] */
        innerClassProperty.getPropertyIndex();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.deserializeSetAndReturn
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        innerClassProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        innerClassProperty.deserializeSetAndReturn(jsonParserDelegate1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        innerClassProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_3() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        innerClassProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeSetAndReturn_ThrowUnsupportedOperationException_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _delegate);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        innerClassProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeSetAndReturn_ThrowUnsupportedOperationException_3() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        java.lang.Object[] objectArray = {};
        
        innerClassProperty.deserializeSetAndReturn(filteringParserDelegate, null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeSetAndReturn_ThrowUnsupportedOperationException() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        innerClassProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeSetAndReturn_ThrowUnsupportedOperationException_2() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        innerClassProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return setAndReturn(instance, deserialize(jp, ctxt));
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeserializeSetAndReturn_ThrowUnsupportedOperationException_4() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AtomicReferenceDeserializer _deserializer2 = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        innerClassProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeSetAndReturn
    
    public void testDeserializeSetAndReturn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 2);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        
        InnerClassProperty actual = innerClassProperty.withValueDeserializer(((JsonDeserializer) typeWrappedDeserializer));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 2);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        String actual_delegate_referenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
        assertNull(actual_delegate_referenceName);
        
        boolean actual_delegate_isContainer = ((Boolean) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
        assertFalse(actual_delegate_isContainer);
        
        SettableBeanProperty actual_delegate_managedProperty = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
        assertNull(actual_delegate_managedProperty);
        
        SettableBeanProperty actual_delegate_backProperty = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
        assertNull(actual_delegate_backProperty);
        
        PropertyName actual_delegate_propName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_delegate_propName);
        
        JavaType actual_delegate_type = ((JavaType) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_delegate_type);
        
        PropertyName actual_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_delegate_wrapperName);
        
        Annotations actual_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_delegate_contextAnnotations);
        
        JsonDeserializer expected_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JsonDeserializer actual_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        TypeDeserializer actual_delegate_valueDeserializer_typeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
        assertNull(actual_delegate_valueDeserializer_typeDeserializer);
        
        JsonDeserializer actual_delegate_valueDeserializer_deserializer = ((JsonDeserializer) getFieldValue(actual_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
        assertNull(actual_delegate_valueDeserializer_deserializer);
        
        TypeDeserializer actual_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_delegate_valueTypeDeserializer);
        
        String actual_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_delegate_managedReferenceName);
        
        ObjectIdInfo actual_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_delegate_objectIdInfo);
        
        ViewMatcher actual_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_delegate_viewMatcher);
        
        int expected_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_delegate_propertyIndex, actual_delegate_propertyIndex);
        
        PropertyMetadata actual_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_delegate_metadata);
        
        JsonFormat.Value actual_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_delegate_format);
        
        Constructor actual_creator = actual._creator;
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -128);
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format", _format);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        
        InnerClassProperty actual = innerClassProperty.withValueDeserializer(((JsonDeserializer) typeWrappedDeserializer));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -128);
        setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format", _format);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        ObjectIdReader actual_delegate_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_delegate_objectIdReader);
        
        PropertyName actual_delegate_propName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_delegate_propName);
        
        JavaType actual_delegate_type = ((JavaType) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_delegate_type);
        
        PropertyName actual_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_delegate_wrapperName);
        
        Annotations actual_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_delegate_contextAnnotations);
        
        JsonDeserializer expected_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JsonDeserializer actual_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        TypeDeserializer actual_delegate_valueDeserializer_typeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
        assertNull(actual_delegate_valueDeserializer_typeDeserializer);
        
        JsonDeserializer actual_delegate_valueDeserializer_deserializer = ((JsonDeserializer) getFieldValue(actual_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
        assertNull(actual_delegate_valueDeserializer_deserializer);
        
        TypeDeserializer actual_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_delegate_valueTypeDeserializer);
        
        String actual_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_delegate_managedReferenceName);
        
        ObjectIdInfo actual_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_delegate_objectIdInfo);
        
        ViewMatcher actual_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_delegate_viewMatcher);
        
        int expected_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_delegate_propertyIndex, actual_delegate_propertyIndex);
        
        PropertyMetadata actual_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_delegate_metadata);
        
        JsonFormat.Value actual_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_delegate_format);
        
        Constructor actual_creator = actual._creator;
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = actual._annotated;
        assertNull(actual_annotated);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_propertyIndex, actual_propertyIndex);
        
        assertTrue(deepEquals(expected, actual));
        JsonFormat.Value expected_format = ((JsonFormat.Value) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        JsonFormat.Value actual_format = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(expected_format, actual_format);
        
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_2() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
            PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            String _managedReferenceName = "";
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
            
            InnerClassProperty actual = innerClassProperty.withValueDeserializer(((JsonDeserializer) null));
            
            InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(_delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", 1);
            
            SettableBeanProperty expected_delegate = expected._delegate;
            SettableBeanProperty actual_delegate = actual._delegate;
            ObjectIdReader actual_delegate_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
            assertNull(actual_delegate_objectIdReader);
            
            PropertyName actual_delegate_propName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_delegate_propName);
            
            JavaType actual_delegate_type = ((JavaType) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            assertNull(actual_delegate_type);
            
            PropertyName actual_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_delegate_wrapperName);
            
            Annotations actual_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            assertNull(actual_delegate_contextAnnotations);
            
            JsonDeserializer expected_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            JsonDeserializer actual_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            String expected_delegate_valueDeserializer_message = ((String) getFieldValue(expected_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_delegate_valueDeserializer_message = ((String) getFieldValue(actual_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_delegate_valueDeserializer_message, actual_delegate_valueDeserializer_message);
            
            Class expected_delegate_valueDeserializer_valueClass = ((Class) getFieldValue(expected_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_delegate_valueDeserializer_valueClass = ((Class) getFieldValue(actual_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_delegate_valueDeserializer_valueClass.getClass());
            
            TypeDeserializer actual_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            assertNull(actual_delegate_valueTypeDeserializer);
            
            String actual_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_delegate_managedReferenceName);
            
            ObjectIdInfo actual_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_delegate_objectIdInfo);
            
            ViewMatcher actual_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            assertNull(actual_delegate_viewMatcher);
            
            int expected_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_delegate_propertyIndex, actual_delegate_propertyIndex);
            
            PropertyMetadata actual_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_delegate_metadata);
            
            JsonFormat.Value actual_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
            assertNull(actual_delegate_format);
            
            Constructor actual_creator = actual._creator;
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = actual._annotated;
            assertNull(actual_annotated);
            
            PropertyName expected_propName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(expected_propName, actual_propName);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            TypeDeserializer expected_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
            TypeIdResolver actual_valueTypeDeserializer_idResolver = ((TypeIdResolver) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver"));
            assertNull(actual_valueTypeDeserializer_idResolver);
            
            JavaType actual_valueTypeDeserializer_baseType = ((JavaType) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType"));
            assertNull(actual_valueTypeDeserializer_baseType);
            
            BeanProperty actual_valueTypeDeserializer_property = ((BeanProperty) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property"));
            assertNull(actual_valueTypeDeserializer_property);
            
            JavaType actual_valueTypeDeserializer_defaultImpl = ((JavaType) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl"));
            assertNull(actual_valueTypeDeserializer_defaultImpl);
            
            String actual_valueTypeDeserializer_typePropertyName = ((String) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_typePropertyName"));
            assertNull(actual_valueTypeDeserializer_typePropertyName);
            
            boolean actual_valueTypeDeserializer_typeIdVisible = ((Boolean) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_typeIdVisible"));
            assertFalse(actual_valueTypeDeserializer_typeIdVisible);
            
            Map actual_valueTypeDeserializer_deserializers = ((Map) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers"));
            assertNull(actual_valueTypeDeserializer_deserializers);
            
            JsonDeserializer actual_valueTypeDeserializer_defaultImplDeserializer = ((JsonDeserializer) getFieldValue(actual_valueTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer"));
            assertNull(actual_valueTypeDeserializer_defaultImplDeserializer);
            
            String expected_managedReferenceName = ((String) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertEquals(expected_managedReferenceName, actual_managedReferenceName);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_3() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName", _wrapperName);
        AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        
        InnerClassProperty actual = innerClassProperty.withValueDeserializer(((JsonDeserializer) typeWrappedDeserializer));
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate2 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate3 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegate3, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(_delegate2, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate3);
        setField(_delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate2);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName", _wrapperName);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        
        SettableBeanProperty expected_delegate = expected._delegate;
        SettableBeanProperty actual_delegate = actual._delegate;
        SettableBeanProperty expected_delegate_delegate = ((SettableBeanProperty) getFieldValue(expected_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        SettableBeanProperty actual_delegate_delegate = ((SettableBeanProperty) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        ObjectIdReader actual_delegate_delegate_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_delegate_delegate_objectIdReader);
        
        PropertyName actual_delegate_delegate_propName = ((PropertyName) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        assertNull(actual_delegate_delegate_propName);
        
        JavaType actual_delegate_delegate_type = ((JavaType) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        assertNull(actual_delegate_delegate_type);
        
        PropertyName actual_delegate_delegate_wrapperName = ((PropertyName) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        assertNull(actual_delegate_delegate_wrapperName);
        
        Annotations actual_delegate_delegate_contextAnnotations = ((Annotations) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        assertNull(actual_delegate_delegate_contextAnnotations);
        
        JsonDeserializer expected_delegate_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(expected_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        JsonDeserializer actual_delegate_delegate_valueDeserializer = ((JsonDeserializer) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
        TypeDeserializer actual_delegate_delegate_valueDeserializer_typeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
        assertNull(actual_delegate_delegate_valueDeserializer_typeDeserializer);
        
        JsonDeserializer actual_delegate_delegate_valueDeserializer_deserializer = ((JsonDeserializer) getFieldValue(actual_delegate_delegate_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
        assertNull(actual_delegate_delegate_valueDeserializer_deserializer);
        
        TypeDeserializer actual_delegate_delegate_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer"));
        assertNull(actual_delegate_delegate_valueTypeDeserializer);
        
        String actual_delegate_delegate_managedReferenceName = ((String) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_delegate_delegate_managedReferenceName);
        
        ObjectIdInfo actual_delegate_delegate_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_delegate_delegate_objectIdInfo);
        
        ViewMatcher actual_delegate_delegate_viewMatcher = ((ViewMatcher) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_delegate_delegate_viewMatcher);
        
        int expected_delegate_delegate_propertyIndex = ((Integer) getFieldValue(expected_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_delegate_delegate_propertyIndex = ((Integer) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(expected_delegate_delegate_propertyIndex, actual_delegate_delegate_propertyIndex);
        
        PropertyMetadata actual_delegate_delegate_metadata = ((PropertyMetadata) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_delegate_delegate_metadata);
        
        JsonFormat.Value actual_delegate_delegate_format = ((JsonFormat.Value) getFieldValue(actual_delegate_delegate, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_delegate_delegate_format);
        
        Constructor actual_delegate_creator = ((Constructor) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_delegate_creator);
        
        AnnotatedConstructor actual_delegate_annotated = ((AnnotatedConstructor) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_delegate_annotated);
        
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        assertTrue(deepEquals(expected_delegate, actual_delegate));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        PropertyName expected_propName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_propName, actual_propName);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
        PropertyName expected_wrapperName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_wrapperName, actual_wrapperName);
        
        Annotations expected_contextAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
        HashMap actual_contextAnnotations_annotations = ((HashMap) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_contextAnnotations_annotations);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
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
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _delegate.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_delegateGetAnnotation_2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _delegate.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_delegateGetAnnotation_3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _delegate.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_delegateGetAnnotation() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _delegate.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_delegateGetAnnotation_4() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty3 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _delegate.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_delegateGetAnnotation_1() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#getAnnotation(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _delegate.getAnnotation(acls);
 *  */
    @Test
    public void testGetAnnotation_ThrowNullPointerException() {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getAnnotation] produces [java.lang.NullPointerException] */
        innerClassProperty.getAnnotation(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    @Test
    public void testGetAnnotation1() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(creatorProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation4() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation5() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation6() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation7() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation8() throws Exception  {
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(creatorProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation9() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation10() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation11() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation12() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation13() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation14() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation15() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation16() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation17() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty5 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation18() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty7 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty8 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty9 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation19() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty7 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty8 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty9 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty10 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty11 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty12 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty13 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty13, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty12, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty13);
        setField(_managedProperty11, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty12);
        setField(_managedProperty10, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty11);
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty10);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation20() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty5 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty7 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty8 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty9 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty10 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty11 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty12 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty13 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty13);
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate2);
        setField(_managedProperty12, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty11, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty12);
        setField(_managedProperty10, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty11);
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty10);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        Annotation actual = innerClassProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetAnnotation21() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty4 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty5 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty6 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty7 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty8 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty9 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty10 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty11 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty10, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty11);
        setField(_managedProperty9, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty10);
        setField(_managedProperty8, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty9);
        setField(_managedProperty7, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty8);
        setField(_managedProperty6, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty7);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty6);
        setField(_managedProperty5, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        InnerClassProperty innerClassProperty1 = new InnerClassProperty(((SettableBeanProperty) innerClassProperty), ((Constructor) null));
        
        Annotation actual = innerClassProperty1.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _delegate.set(instance, value);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws IOException  {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set] produces [java.lang.NullPointerException] */
        innerClassProperty.set(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        innerClassProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_7() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        innerClassProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_9() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        byte[] byteArray = {};
        
        innerClassProperty.set(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_6() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        
        innerClassProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_8() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        java.lang.Object[] objectArray = {null};
        
        innerClassProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        innerClassProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        java.lang.Object[] objectArray = {null};
        
        innerClassProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        innerClassProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        InnerClassProperty _managedProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        java.lang.Object[] objectArray = {};
        java.lang.Object[] objectArray1 = new java.lang.Object[1];
        Object object = new Object();
        objectArray1[0] = object;
        
        innerClassProperty.set(objectArray, objectArray1);
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _delegate.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        innerClassProperty.set(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testSet1() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", managedReferenceProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet2() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet3() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", _backProperty);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty1);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        Object object = new Object();
        Object object1 = new Object();
        
        innerClassProperty.set(object, object1);
    }
    
    @Test
    public void testSet5() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:143)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:143)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:143)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:111)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.set(InnerClassProperty.java:141) */
        innerClassProperty.set(object, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSet6() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet7() throws Exception  {
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        InnerClassProperty innerClassProperty = new InnerClassProperty(managedReferenceProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", objectIdValueProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        InnerClassProperty _backProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", objectIdValueProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSet10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        Object object = new Object();
        
        innerClassProperty.set(object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#readResolve()}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, _annotated);}
 *  */
    @Test
    public void testReadResolve_Return() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        AnnotatedConstructor _annotated = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Constructor _constructor = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _constructor);
        innerClassProperty._annotated = _annotated;
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        InnerClassProperty actual = ((InnerClassProperty) innerClassProperty.readResolve());
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator", _constructor);
        expected._annotated = _annotated;
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        SettableBeanProperty actual_delegate = actual._delegate;
        assertNull(actual_delegate);
        
        Constructor expected_creator = expected._creator;
        Constructor actual_creator = actual._creator;
        boolean actual_creatorHasRealParameterData = ((Boolean) getFieldValue(actual_creator, "java.lang.reflect.Executable", "hasRealParameterData"));
        assertFalse(actual_creatorHasRealParameterData);
        
        java.lang.reflect.Parameter[] actual_creatorParameters = actual_creator.getParameters();
        assertNull(actual_creatorParameters);
        
        Map actual_creatorDeclaredAnnotations = ((Map) getFieldValue(actual_creator, "java.lang.reflect.Executable", "declaredAnnotations"));
        assertNull(actual_creatorDeclaredAnnotations);
        
        AnnotatedConstructor expected_annotated = expected._annotated;
        AnnotatedConstructor actual_annotated = actual._annotated;
        // com.fasterxml.jackson.databind.introspect.AnnotatedConstructor has overridden equals method
        assertEquals(expected_annotated, actual_annotated);
        
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
        
        JsonFormat.Value actual_format = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_format);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#readResolve()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new InnerClassProperty(this, _annotated);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException_1() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        innerClassProperty.readResolve();
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#readResolve()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new InnerClassProperty(this, _annotated);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_ThrowIllegalArgumentException() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        AnnotatedConstructor _annotated = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        innerClassProperty._annotated = _annotated;
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        innerClassProperty.readResolve();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.writeReplace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeReplace()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#writeReplace()}
 * @utbot.executesCondition {@code (_annotated != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWriteReplace__annotatedNotEqualsNull() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        AnnotatedConstructor _annotated = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        innerClassProperty._annotated = _annotated;
        
        InnerClassProperty actual = ((InnerClassProperty) innerClassProperty.writeReplace());
        
        SettableBeanProperty actual_delegate = actual._delegate;
        assertNull(actual_delegate);
        
        Constructor actual_creator = actual._creator;
        assertNull(actual_creator);
        
        AnnotatedConstructor innerClassProperty_annotated = innerClassProperty._annotated;
        AnnotatedConstructor actual_annotated = actual._annotated;
        // com.fasterxml.jackson.databind.introspect.AnnotatedConstructor has overridden equals method
        assertEquals(innerClassProperty_annotated, actual_annotated);
        
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
        
        String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = ((Integer) getFieldValue(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_format);
        
    }
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#writeReplace()}
 * @utbot.executesCondition {@code (_annotated != null): False}
 * @utbot.returnsFrom {@code return new InnerClassProperty(this, new AnnotatedConstructor(null, _creator, null, null));}
 *  */
    @Test
    public void testWriteReplace__annotatedEqualsNull() throws Exception  {
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        Constructor _creator = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator", _creator);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        InnerClassProperty actual = ((InnerClassProperty) innerClassProperty.writeReplace());
        
        InnerClassProperty expected = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator", _creator);
        AnnotatedConstructor _annotated = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "_constructor", _creator);
        expected._annotated = _annotated;
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        SettableBeanProperty actual_delegate = actual._delegate;
        assertNull(actual_delegate);
        
        Constructor expected_creator = expected._creator;
        Constructor actual_creator = actual._creator;
        boolean actual_creatorHasRealParameterData = ((Boolean) getFieldValue(actual_creator, "java.lang.reflect.Executable", "hasRealParameterData"));
        assertFalse(actual_creatorHasRealParameterData);
        
        java.lang.reflect.Parameter[] actual_creatorParameters = actual_creator.getParameters();
        assertNull(actual_creatorParameters);
        
        Map actual_creatorDeclaredAnnotations = ((Map) getFieldValue(actual_creator, "java.lang.reflect.Executable", "declaredAnnotations"));
        assertNull(actual_creatorDeclaredAnnotations);
        
        AnnotatedConstructor expected_annotated = expected._annotated;
        AnnotatedConstructor actual_annotated = actual._annotated;
        // com.fasterxml.jackson.databind.introspect.AnnotatedConstructor has overridden equals method
        assertEquals(expected_annotated, actual_annotated);
        
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
        
        JsonFormat.Value actual_format = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_format);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeReplace()
    
    /**
    @utbot.classUnderTest {@link InnerClassProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.InnerClassProperty#writeReplace()}
 * @utbot.executesCondition {@code (_annotated != null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new InnerClassProperty(this, new AnnotatedConstructor(null, _creator, null, null));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWriteReplace_ThrowIllegalArgumentException() {
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        innerClassProperty.writeReplace();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1081927246162500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1081927246162500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1081927246166999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1081927246162500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1081927246166999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1081927246520000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1081927246520000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1081927246521600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1081927246520000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1081927246521600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1081927250925800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1081927250925800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1081927250927700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1081927250925800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1081927250927700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1081927251402900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1081927251402900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1081927251404500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1081927251402900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1081927251404500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

