package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
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
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.BeanProperty;
import java.util.Map;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
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

public final class com_fasterxml_jackson_databind_deser_impl_ObjectIdReferencePropertyTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_6() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_9() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdReferenceProperty delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_10() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ObjectIdValueProperty delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        SetterlessProperty _forward = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_8() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        SetterlessProperty _forward = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        AnnotatedParameter _annotated = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(_forward, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_annotated", _annotated);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_7() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _forward.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_forwardGetAnnotation_5() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        SetterlessProperty _forward1 = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(_forward1, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Annotation actual = objectIdReferenceProperty.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getAnnotation(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _forward.getAnnotation(acls);
 *  */
    @Test
    public void testGetAnnotation_ThrowNullPointerException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getAnnotation(ObjectIdReferenceProperty.java:71) */
        objectIdReferenceProperty.getAnnotation(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        objectIdReferenceProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        objectIdReferenceProperty.set(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#set(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSet_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        objectIdReferenceProperty.set(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _forward.set(instance, value);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set(ObjectIdReferenceProperty.java:106) */
        objectIdReferenceProperty.set(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _forward.set(instance, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSet_ThrowUnsupportedOperationException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        int[] intArray = {};
        
        objectIdReferenceProperty.set(null, intArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testSet1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _forward);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.set(object, object1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet5() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet6() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _forward);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.set(object, object1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet7() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _forward);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet8() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", idProperty);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSet9() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test
    public void testSet10() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set(ObjectIdReferenceProperty.java:106) */
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test
    public void testSet11() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set(ObjectIdReferenceProperty.java:106) */
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test
    public void testSet12() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate1);
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set(ObjectIdReferenceProperty.java:106) */
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test
    public void testSet13() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set(ObjectIdReferenceProperty.java:106) */
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test
    public void testSet14() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.set(ObjectIdReferenceProperty.java:106) */
        objectIdReferenceProperty.set(null, object);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSet15() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _forward);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet16() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet17() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet18() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", idProperty);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet19() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _forward);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _forward);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet20() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet21() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet22() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        MergingSettableBeanProperty idProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(idProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.set(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSet23() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.set(object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(this, newName);}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) objectIdReferenceProperty.withName(null));
        
        ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
        
        SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
        assertNull(actual_forward);
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ObjectIdValueProperty delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        SetterlessProperty _forward = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_7() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ObjectIdReferenceProperty delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_8() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        InnerClassProperty delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_5() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.returnsFrom {@code return _forward.getMember();}
 *  */
    @Test
    public void testGetMember_Return_forwardGetMember_6() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        AnnotatedMember actual = objectIdReferenceProperty.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMember()
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getMember()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _forward.getMember();
 *  */
    @Test
    public void testGetMember_ThrowNullPointerException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getMember] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getMember(ObjectIdReferenceProperty.java:76) */
        objectIdReferenceProperty.getMember();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return _forward.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_Return_forwardSetAndReturn() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Object actual = objectIdReferenceProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return _forward.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_Return_forwardSetAndReturn_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Object actual = objectIdReferenceProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return _forward.setAndReturn(instance, value);}
 *  */
    @Test
    public void testSetAndReturn_Return_forwardSetAndReturn_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        Object actual = objectIdReferenceProperty.setAndReturn(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#setAndReturn(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _forward.setAndReturn(instance, value);
 *  */
    @Test
    public void testSetAndReturn_ThrowNullPointerException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test
    public void testSetAndReturn1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[3] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, intArray);
    }
    
    @Test
    public void testSetAndReturn4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn5() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = {null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn6() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = {null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn7() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _forward);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn8() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn9() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, null);
    }
    
    @Test
    public void testSetAndReturn10() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn11() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        ManagedReferenceProperty _backProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn12() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _forward);
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:86)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn13() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate);
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn14() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn15() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate1);
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn16() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn17() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test
    public void testSetAndReturn18() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn19() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, objectArray);
    }
    
    @Test
    public void testSetAndReturn20() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:105)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(null, object);
    }
    
    @Test
    public void testSetAndReturn21() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _backProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        CreatorProperty idProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.setAndReturn(CreatorProperty.java:252)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:122)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:111)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test
    public void testSetAndReturn22() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.set(ManagedReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test
    public void testSetAndReturn23() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test
    public void testSetAndReturn24() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
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
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test
    public void testSetAndReturn25() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate2 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate3 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate2, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate3);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.CreatorProperty._reportMissingSetter(CreatorProperty.java:274)
            com.fasterxml.jackson.databind.deser.CreatorProperty._verifySetter(CreatorProperty.java:267)
            com.fasterxml.jackson.databind.deser.CreatorProperty.set(CreatorProperty.java:245)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.set(MergingSettableBeanProperty.java:120)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.setAndReturn(ManagedReferenceProperty.java:101)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.setAndReturn(MergingSettableBeanProperty.java:129)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111) */
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAndReturn(java.lang.Object, java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn26() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _forward);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn27() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _forward);
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.setAndReturn(null, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn28() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn29() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", delegate1);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn30() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn31() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn32() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn33() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        MergingSettableBeanProperty delegate = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn34() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty _backProperty1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn35() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        MergingSettableBeanProperty _backProperty1 = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ManagedReferenceProperty delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer", true);
        CreatorProperty delegate2 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate2);
        setField(_backProperty1, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_backProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty1);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetAndReturn36() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
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
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        Object object = new Object();
        Object object1 = new Object();
        
        objectIdReferenceProperty.setAndReturn(object, object1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatorIndex()
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.returnsFrom {@code return _forward.getCreatorIndex();}
 *  */
    @Test
    public void testGetCreatorIndex_Return_forwardGetCreatorIndex() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        int actual = objectIdReferenceProperty.getCreatorIndex();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.returnsFrom {@code return _forward.getCreatorIndex();}
 *  */
    @Test
    public void testGetCreatorIndex_Return_forwardGetCreatorIndex_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        int actual = objectIdReferenceProperty.getCreatorIndex();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.returnsFrom {@code return _forward.getCreatorIndex();}
 *  */
    @Test
    public void testGetCreatorIndex_Return_forwardGetCreatorIndex_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        CreatorProperty delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        int actual = objectIdReferenceProperty.getCreatorIndex();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.returnsFrom {@code return _forward.getCreatorIndex();}
 *  */
    @Test
    public void testGetCreatorIndex_Return_forwardGetCreatorIndex_3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ObjectIdReferenceProperty delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        int actual = objectIdReferenceProperty.getCreatorIndex();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.returnsFrom {@code return _forward.getCreatorIndex();}
 *  */
    @Test
    public void testGetCreatorIndex_Return_forwardGetCreatorIndex_4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        InnerClassProperty delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        int actual = objectIdReferenceProperty.getCreatorIndex();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCreatorIndex()
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getCreatorIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _forward.getCreatorIndex();
 *  */
    @Test
    public void testGetCreatorIndex_ThrowNullPointerException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:81) */
        objectIdReferenceProperty.getCreatorIndex();
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _forward.getCreatorIndex();
 *  */
    @Test
    public void testGetCreatorIndex_ThrowNullPointerException_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        MergingSettableBeanProperty _forward = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        ObjectIdValueProperty delegate = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:451)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating.getCreatorIndex(SettableBeanProperty.java:728)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:81) */
        objectIdReferenceProperty.getCreatorIndex();
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#getCreatorIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _forward.getCreatorIndex();
 *  */
    @Test
    public void testGetCreatorIndex_ThrowNullPointerException_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward1 = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward2 = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdValueProperty _forward3 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_forward2, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward3);
        setField(_forward1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward2);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:451)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:81)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:81)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:81)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:81) */
        objectIdReferenceProperty.getCreatorIndex();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.withNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) objectIdReferenceProperty.withNullProvider(null));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            assertNull(actual_forward);
            
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
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return_2() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class objectIdReferencePropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = objectIdReferencePropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) withNullProviderMethod.invoke(objectIdReferenceProperty, withNullProviderMethodArguments));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            assertNull(actual_forward);
            
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
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withNullProvider(com.fasterxml.jackson.databind.deser.NullValueProvider)}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(this, _valueDeserializer, nva);}
 *  */
    @Test
    public void testWithNullProvider_Return() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            String _managedReferenceName = "";
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
            
            Class initialMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            Class objectIdReferencePropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
            Class missingValueDeserializerType = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
            Method withNullProviderMethod = objectIdReferencePropertyClazz.getDeclaredMethod("withNullProvider", missingValueDeserializerType);
            withNullProviderMethod.setAccessible(true);
            java.lang.Object[] withNullProviderMethodArguments = new java.lang.Object[1];
            withNullProviderMethodArguments[0] = missingValueDeserializer;
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) withNullProviderMethod.invoke(objectIdReferenceProperty, withNullProviderMethodArguments));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_managedReferenceName", _managedReferenceName);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -255);
            setField(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
            
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            assertNull(actual_forward);
            
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
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
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
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
            assertTrue(deepEquals(expected_nullProvider, actual_nullProvider));
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
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value expected_propertyFormat = ((JsonFormat.Value) getFieldValue(expected, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
            assertEquals(expected_propertyFormat, actual_propertyFormat);
            
            List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
            assertNull(actual_aliases);
            
            Class finalMissingValueDeserializer_valueClass = ((Class) getFieldValue(missingValueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialMissingValueDeserializer_valueClass == finalMissingValueDeserializer_valueClass);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.executesCondition {@code (_forward != null): False}
 *  */
    @Test
    public void testFixAccess__forwardEqualsNull() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        objectIdReferenceProperty.fixAccess(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fixAccess(com.fasterxml.jackson.databind.DeserializationConfig)
    
    @Test(expected = StackOverflowError.class)
    public void testFixAccess1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", _forward);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        
        objectIdReferenceProperty.fixAccess(null);
    }
    
    @Test
    public void testFixAccess2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        InnerClassProperty _forward = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating.fixAccess(SettableBeanProperty.java:688)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess(ObjectIdReferenceProperty.java:65) */
        objectIdReferenceProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        SetterlessProperty _forward = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.fixAccess(SetterlessProperty.java:78)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess(ObjectIdReferenceProperty.java:65) */
        objectIdReferenceProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        SetterlessProperty _forward = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.fixAccess(SetterlessProperty.java:78)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess(ObjectIdReferenceProperty.java:65) */
        objectIdReferenceProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess5() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(_annotated, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8192);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:921)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:139)
            com.fasterxml.jackson.databind.deser.impl.SetterlessProperty.fixAccess(SetterlessProperty.java:78)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.fixAccess(ManagedReferenceProperty.java:49)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess(ObjectIdReferenceProperty.java:65) */
        objectIdReferenceProperty.fixAccess(deserializationConfig);
    }
    
    @Test
    public void testFixAccess6() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _backProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty", _backProperty);
        SetterlessProperty delegate = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        AnnotatedMethod _annotated = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(delegate, "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_annotated", _annotated);
        setField(_forward, "com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating", "delegate", delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.fixAccess(ManagedReferenceProperty.java:49)
            com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty.fixAccess(ManagedReferenceProperty.java:50)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.fixAccess(ObjectIdReferenceProperty.java:65) */
        objectIdReferenceProperty.fixAccess(deserializationConfig);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        objectIdReferenceProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _valueDeserializer);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdReferenceProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdReferenceProperty.deserializeAndSet(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        objectIdReferenceProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserializeSetAndReturn(p, ctxt, instance);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeAndSet_ThrowIllegalStateException_4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        objectIdReferenceProperty.deserializeAndSet(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeAndSet
    
    public void testDeserializeAndSet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.deserializeSetAndReturn
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        objectIdReferenceProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_5() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        objectIdReferenceProperty.deserializeSetAndReturn(uTF8StreamJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdReferenceProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_3() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        objectIdReferenceProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_4() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        objectIdReferenceProperty.deserializeSetAndReturn(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return setAndReturn(instance, deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeSetAndReturn_ThrowIllegalStateException_1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer1 = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        objectIdReferenceProperty.deserializeSetAndReturn(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserializeSetAndReturn1() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        objectIdReferenceProperty.deserializeSetAndReturn(filteringParserDelegate, impl, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testDeserializeSetAndReturn2() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.deserializeSetAndReturn] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.setAndReturn(ObjectIdReferenceProperty.java:111)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.deserializeSetAndReturn(ObjectIdReferenceProperty.java:93) */
        objectIdReferenceProperty.deserializeSetAndReturn(jsonParserDelegate, impl, object);
    }
    ///endregion
    
    ///region Errors report for deserializeSetAndReturn
    
    public void testDeserializeSetAndReturn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.withValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerEqualsDeser() throws Exception  {
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        
        ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) objectIdReferenceProperty.withValueDeserializer(null));
        
        SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
        assertNull(actual_forward);
        
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
        
        int objectIdReferenceProperty_propertyIndex = ((Integer) getFieldValue(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        int actual_propertyIndex = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex"));
        assertEquals(objectIdReferenceProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
        List actual_aliases = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_aliases"));
        assertNull(actual_aliases);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) objectIdReferenceProperty.withValueDeserializer(null));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            FailingDeserializer _valueDeserializer1 = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer1, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer1);
            
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            assertNull(actual_forward);
            
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
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdReferenceProperty}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty#withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (_valueDeserializer == deser): False}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(this, deser, _nullProvider);}
 *  */
    @Test
    public void testWithValueDeserializer__valueDeserializerNotEqualsDeser_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -252);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((Converter) null));
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) objectIdReferenceProperty.withValueDeserializer(stdDelegatingDeserializer));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propertyIndex", -252);
            
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            assertNull(actual_forward);
            
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
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1095365171700600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1095365171700600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1095365171704400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095365171700600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095365171704400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095365172158500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095365172158500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095365172159900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095365172158500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095365172159900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1095365172656399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095365172656399.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095365172657799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095365172656399.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095365172657799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095365173318200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095365173318200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095365173319600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095365173318200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095365173319600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

