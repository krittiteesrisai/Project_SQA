package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.util.HashMap;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
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
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
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
        java.lang.Object[] objectArray = {};
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        objectIdValueProperty.set(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.set(objectArray, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
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
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        InnerClassProperty _backProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", idProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[2] = object;
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _backProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        int[] intArray = {};
        
        objectIdValueProperty.set(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _backProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        objectIdValueProperty.set(objectArray, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.set(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException_8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.set(null, null);
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
        
        ObjectIdValueProperty actual = objectIdValueProperty.withName(((PropertyName) null));
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn
    
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
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:106) */
        objectIdValueProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: idProp == null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
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
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_4() throws Exception  {
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
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null};
        
        objectIdValueProperty.setAndReturn(objectArray, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _backProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (idProp == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return idProp.setAndReturn(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowUnsupportedOperationException_7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        InnerClassProperty _backProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _managedProperty);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        java.lang.Object[] objectArray = {null, null};
        
        objectIdValueProperty.setAndReturn(null, objectArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _managedProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty2 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", idProperty2);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty2 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _managedProperty2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _managedProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdValueProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty2 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn13() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty3 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader4 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty4 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader4, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty4);
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader4);
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn14() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty2 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty3 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader4 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty4 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader4, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty4);
        setField(idProperty3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader4);
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        objectIdValueProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn15() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdValueProperty idProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader2 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty2 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader3 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader3, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty3);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader3);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(idProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        setField(_objectIdReader2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty2);
        setField(idProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader2);
        setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        
        objectIdValueProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
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
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeAndSet(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:316)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:71) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test
    public void testDeserializeAndSet_ThrowNullPointerException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:249)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:163)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeAndSet(ObjectIdValueProperty.java:71) */
        objectIdValueProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) failingDeserializer));
        
        ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        Class _valueClass = Object.class;
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        
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
        String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
        assertNull(actual_valueDeserializer_message);
        
        Class expected_valueDeserializer_valueClass = ((Class) getFieldValue(expected_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueDeserializer_valueClass.getClass());
        
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
        
        JsonFormat.Value actual_format = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
        assertNull(actual_format);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new ObjectIdValueProperty(this, deser);}
 *  */
    @Test
    public void testWithValueDeserializer_Return_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            ObjectIdValueProperty actual = objectIdValueProperty.withValueDeserializer(((JsonDeserializer) null));
            
            ObjectIdValueProperty expected = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations", _contextAnnotations);
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            PropertyName expected_propName = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            PropertyName actual_propName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName"));
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(expected_propName, actual_propName);
            
            JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_type, actual_type);
            
            PropertyName actual_wrapperName = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_wrapperName"));
            assertNull(actual_wrapperName);
            
            Annotations expected_contextAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            Annotations actual_contextAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_contextAnnotations"));
            HashMap actual_contextAnnotations_annotations = ((HashMap) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
            assertNull(actual_contextAnnotations_annotations);
            
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
            
            String actual_managedReferenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName"));
            assertNull(actual_managedReferenceName);
            
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
            
            JsonFormat.Value actual_format = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format"));
            assertNull(actual_format);
            
        } finally {
            setStaticField(com.fasterxml.jackson.databind.deser.SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
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
    public void testDeserializeSetAndReturn_ReturnNull_4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
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
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeSetAndReturn_ReturnNull_3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializer#_deserializeOther(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object id = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException_1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:835)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1146)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:146)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object id = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeSetAndReturn_ThrowNullPointerException() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
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
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeSetAndReturn(null, null, null);
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
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeSetAndReturn(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdValueProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _valueDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _valueDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        
        objectIdValueProperty.deserializeSetAndReturn(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testDeserializeSetAndReturn1() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeSetAndReturn2() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate2 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(delegate2, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeSetAndReturn3() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsArrayTypeDeserializer _typeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate3 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        setField(delegate3, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, impl, object);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeSetAndReturn4() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        Object actual = objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeSetAndReturn5() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _valueDeserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeSetAndReturn6() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn7() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:835)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble(BeanDeserializerBase.java:1210)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn8() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.requiresCustomCodec(JsonParserDelegate.java:93)
            com.fasterxml.jackson.core.util.JsonParserDelegate.requiresCustomCodec(JsonParserDelegate.java:93)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:487)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:156)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn9() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 3);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.setCurrentValue(JsonParserDelegate.java:35)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:251)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:163)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn10() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 2);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.setCurrentValue(JsonParserDelegate.java:35)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:251)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:163)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn11() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 1);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.setCurrentValue(JsonParserDelegate.java:35)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:251)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:163)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.maySerializeAsObject(ObjectIdReader.java:111)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:285)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1094)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:166)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn13() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:249)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:163)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn14() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:795)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1200)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1103)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1185)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn15() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1307)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1103)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1302)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn16() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:316)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn17() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserSequence, impl, null);
    }
    
    @Test
    public void testDeserializeSetAndReturn18() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:811)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:171)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserSequence, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn19() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] booleanDeserArray = createArray("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser", 0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:811)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1293)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:159)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, booleanDeserArray);
    }
    
    @Test
    public void testDeserializeSetAndReturn20() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.wrapAsJsonMappingException(StdValueInstantiator.java:445)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.rewrapCtorProblem(StdValueInstantiator.java:464)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:357)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1246)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn21() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:795)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1200)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1193)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn22() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1246)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1238)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn23() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _defaultCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.wrapAsJsonMappingException(StdValueInstantiator.java:445)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.rewrapCtorProblem(StdValueInstantiator.java:464)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDefault(StdValueInstantiator.java:245)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:316)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn24() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn25() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        NumberDeserializers.ByteDeserializer _delegateDeserializer = ((NumberDeserializers.ByteDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:795)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseByte(StdDeserializer.java:252)
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer.deserialize(NumberDeserializers.java:215)
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer.deserialize(NumberDeserializers.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1193)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn26() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:72)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:70)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1094)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:166)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn27() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer3 = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer3);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:854)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn28() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation", true);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler", _unwrappedPropertyHandler);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:45)
            com.fasterxml.jackson.databind.util.TokenBuffer.<init>(TokenBuffer.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithUnwrapped(BeanDeserializer.java:556)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:293)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn29() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate6 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserSequence, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn30() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate6 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:142)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserSequence, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn31() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        SimpleType _beanType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:76)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn32() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate5, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:210)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn33() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation", true);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:72)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1120)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:298)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn34() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _fromStringCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:89)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn35() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:46)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn36() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        BeanDeserializer _valueDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler", _externalTypeIdHandler);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:72)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeWithExternalTypeId(BeanDeserializer.java:755)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:296)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn37() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:189)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:216)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:80)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:168)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:135)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn38() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:206)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:46)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn39() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:854)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:197)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate4, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn40() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:795)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:31)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate5, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn41() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1624)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getText(TokenBuffer.java:1393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:138)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:31)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate5, null, object);
    }
    
    @Test
    public void testDeserializeSetAndReturn42() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:61)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserializeWithType(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.deserializeSetAndReturn(ObjectIdValueProperty.java:78) */
        objectIdValueProperty.deserializeSetAndReturn(jsonParserDelegate5, null, object);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeSetAndReturn43() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator", _propertyBasedCreator);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        objectIdValueProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1074331744861600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1074331744861600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1074331744866800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1074331744861600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1074331744866800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1074331745416600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1074331745416600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1074331745417899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1074331745416600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1074331745417899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1074331746463400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1074331746463400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1074331746464900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1074331746463400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1074331746464900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1074331747318800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1074331747318800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1074331747320100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1074331747318800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1074331747320100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

