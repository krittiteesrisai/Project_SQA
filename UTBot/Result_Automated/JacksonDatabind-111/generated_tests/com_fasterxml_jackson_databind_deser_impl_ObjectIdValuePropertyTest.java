package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
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
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import java.io.IOException;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.BeanProperty;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
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

public final class com_fasterxml_jackson_databind_deser_impl_ObjectIdValuePropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAnnotation_ReturnNull() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        
        Annotation actual = objectIdValueProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSet1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.set(object, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    @Test
    public void testSet7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, null);
    }
    
    @Test
    public void testSet8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, null);
    }
    
    @Test
    public void testSet9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, intArray);
    }
    
    @Test
    public void testSet10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, object);
    }
    
    @Test
    public void testSet11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, object);
    }
    
    @Test
    public void testSet12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[2] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet13() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, object);
    }
    
    @Test
    public void testSet14() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, intArray);
    }
    
    @Test
    public void testSet15() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet16() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[2] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet17() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet18() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, object);
    }
    
    @Test
    public void testSet19() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty2);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, object);
    }
    
    @Test
    public void testSet20() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet21() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, intArray);
    }
    
    @Test
    public void testSet22() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet23() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet24() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, object);
    }
    
    @Test
    public void testSet25() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet26() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet27() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object1 = new Object();
        objectArray[1] = object1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, objectArray);
    }
    
    @Test
    public void testSet28() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, object);
    }
    
    @Test
    public void testSet29() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate1);
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    
    @Test
    public void testSet30() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, null);
    }
    
    @Test
    public void testSet31() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty2);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, object);
    }
    
    @Test
    public void testSet32() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, object);
    }
    
    @Test
    public void testSet33() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(object, object);
    }
    
    @Test
    public void testSet34() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111) */
        objectIdValueProperty.set(null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withName(null));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testDeserializeAndSet() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testDeserializeAndSet_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeAndSet5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeAndSet8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BuilderBasedDeserializer _valueDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException] */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BuilderBasedDeserializer _valueDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException] */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet13() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet14() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet15() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeAndSet16() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BuilderBasedDeserializer _valueDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet17() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException] */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet18() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet19() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        EnumSetDeserializer _deserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:183)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet20() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringArrayDeserializer _deserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:236)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet21() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringDeserializer _deserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:71)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:10)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet22() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BuilderBasedDeserializer _delegateDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet23() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet24() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        EnumSetDeserializer _deserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:183)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet25() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringArrayDeserializer _deserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:236)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet26() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BuilderBasedDeserializer _valueDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet27() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException] */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet28() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet29() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BuilderBasedDeserializer _valueDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet30() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserialize(StdDelegatingDeserializer.java:169)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet31() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet32() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BuilderBasedDeserializer _delegateDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet33() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet34() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BuilderBasedDeserializer _delegateDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet35() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet36() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        EnumSetDeserializer _deserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:183)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet37() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringArrayDeserializer _deserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:236)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet38() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringDeserializer _deserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:71)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:10)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet39() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        EnumSetDeserializer _deserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:183)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet40() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringArrayDeserializer _deserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:236)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet41() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringDeserializer _deserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:71)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:10)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet42() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BuilderBasedDeserializer _delegateDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet43() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:29)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet44() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringDeserializer _deserializer1 = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:71)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:10)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeAndSet45() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        EnumSetDeserializer _deserializer1 = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserializeWithType(EnumSetDeserializer.java:183)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet46() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringArrayDeserializer _deserializer1 = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:236)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    @Test
    public void testDeserializeAndSet47() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StringDeserializer _deserializer1 = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:71)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:10)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:82) */
        objectIdValueProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return idProp.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_ReturnIdPropSetAndReturn() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        Object actual = objectIdValueProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return idProp.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_ReturnIdPropSetAndReturn_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        Object actual = objectIdValueProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty idProp = _objectIdReader.idProperty;
 *  */
    @Test
    public void testSetAndReturn_ThrowNullPointerException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:117) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: idProp == null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test
    public void testSetAndReturn1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        SetterlessProperty idProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.setAndReturn(SetterlessProperty.java:153)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, intArray);
    }
    
    @Test
    public void testSetAndReturn5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.setAndReturn(SetterlessProperty.java:153)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.setAndReturn(SetterlessProperty.java:153)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[2] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, intArray);
    }
    
    @Test
    public void testSetAndReturn12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn13() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn14() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", idProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, intArray);
    }
    
    @Test
    public void testSetAndReturn15() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty _backProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn16() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn17() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn18() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn19() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate1);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn20() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        SetterlessProperty delegate2 = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.setAndReturn(SetterlessProperty.java:153)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn21() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn22() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty delegate2 = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.setAndReturn(SetterlessProperty.java:153)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn23() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn24() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        SetterlessProperty delegate1 = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.setAndReturn(SetterlessProperty.java:153)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn25() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn26() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        SetterlessProperty delegate1 = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn27() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn28() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn29() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn30() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty _backProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn31() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty _backProperty1 = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.set(SetterlessProperty.java:147)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn32() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn33() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn34() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn35() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122) */
        objectIdValueProperty.setAndReturn(object, object);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn36() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn37() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn38() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn39() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn40() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn41() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn42() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn43() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn44() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.withNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            Object _viewMatcher = createInstance("com.fasterxml.jackson.databind.util.ViewMatcher$Single");
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class objectIdValuePropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = objectIdValuePropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            ObjectIdValueProperty actual = ((ObjectIdValueProperty) withNullProviderMethod.invoke(objectIdValueProperty, withNullProviderMethodArguments));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
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
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher expected_viewMatcher = ((ViewMatcher) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            Class actual_viewMatcher_view = ((Class) getFieldValue(actual_viewMatcher, "com.fasterxml.jackson.databind.util.ViewMatcher$Single", "_view"));
            assertNull(actual_viewMatcher_view);
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class objectIdValuePropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = objectIdValuePropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            ObjectIdValueProperty actual = ((ObjectIdValueProperty) withNullProviderMethod.invoke(objectIdValueProperty, withNullProviderMethodArguments));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            PropertyName expected_propName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(expected_propName, actual_propName);
            
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
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_2() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withNullProvider(null));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
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
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
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
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#getMember()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetMember_ReturnNull() {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        
        AnnotatedMember actual = objectIdValueProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object id = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:98) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NULL)
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException() throws IOException  {
        ObjectIdValueProperty objectIdValueProperty = new ObjectIdValueProperty(((ObjectIdValueProperty) null), ((PropertyName) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException] */
        objectIdValueProperty.deserializeSetAndReturn(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer1 = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} 
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testDeserializeSetAndReturn_ThrowMismatchedInputException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerEqualsDeser() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withValueDeserializer(null));
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
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
        
        int objectIdValueProperty_propertyIndex = ((Integer) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(objectIdValueProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            DateDeserializers.CalendarDeserializer _valueDeserializer = ((DateDeserializers.CalendarDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            FailingDeserializer _nullProvider = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            NullValueProvider objectIdValueProperty_nullProvider = ((NullValueProvider) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Class initialObjectIdValueProperty_nullProvider_valueClass = ((Class) getFieldValue(objectIdValueProperty_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withValueDeserializer(null));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
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
            
            NullValueProvider objectIdValueProperty_nullProvider1 = ((NullValueProvider) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Class finalObjectIdValueProperty_nullProvider_valueClass = ((Class) getFieldValue(objectIdValueProperty_nullProvider1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialObjectIdValueProperty_nullProvider_valueClass == finalObjectIdValueProperty_nullProvider_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            FailingDeserializer _nullProvider = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            ViewMatcher _viewMatcher = ((ViewMatcher) createInstance("com.fasterxml.jackson.databind.util.ViewMatcher"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((Converter) null));
            
            NullValueProvider objectIdValueProperty_nullProvider = ((NullValueProvider) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Class initialObjectIdValueProperty_nullProvider_valueClass = ((Class) getFieldValue(objectIdValueProperty_nullProvider, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            ObjectIdValueProperty actual = ((ObjectIdValueProperty) objectIdValueProperty.withValueDeserializer(stdDelegatingDeserializer));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher", _viewMatcher);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            assertNull(actual_propName);
            
            JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_type, actual_type);
            
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
            
            NullValueProvider expected_nullProvider = ((NullValueProvider) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            NullValueProvider actual_nullProvider = ((NullValueProvider) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            String expected_nullProvider_message = ((String) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            String actual_nullProvider_message = ((String) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertEquals(expected_nullProvider_message, actual_nullProvider_message);
            
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_objectIdInfo"));
            assertNull(actual_objectIdInfo);
            
            ViewMatcher expected_viewMatcher = ((ViewMatcher) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            ViewMatcher actual_viewMatcher = ((ViewMatcher) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_viewMatcher"));
            
            int expected_propertyIndex = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
            assertEquals(expected_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            NullValueProvider objectIdValueProperty_nullProvider1 = ((NullValueProvider) getFieldValue(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider"));
            Class finalObjectIdValueProperty_nullProvider_valueClass = ((Class) getFieldValue(objectIdValueProperty_nullProvider1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialObjectIdValueProperty_nullProvider_valueClass == finalObjectIdValueProperty_nullProvider_valueClass);
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1095564626423599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1095564626423599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1095564626427999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095564626423599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095564626427999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095564626938900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095564626938900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095564626940000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095564626938900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095564626940000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1095564627322600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095564627322600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095564627324200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095564627322600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095564627324200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095564628063600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095564628063600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095564628065000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095564628063600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095564628065000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

