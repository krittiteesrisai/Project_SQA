package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.sun.org.apache.xpath.internal.XPathException;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_ser_PropertyBuilderTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultValue(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return BeanUtil.getDefaultValue(type);}
 *  */
    @Test
    public void testGetDefaultValue_ReturnBeanUtilGetDefaultValue() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(referenceType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return BeanUtil.getDefaultValue(type);}
 *  */
    @Test
    public void testGetDefaultValue_ReturnBeanUtilGetDefaultValue_2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(collectionLikeType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return BeanUtil.getDefaultValue(type);}
 *  */
    @Test
    public void testGetDefaultValue_ReturnBeanUtilGetDefaultValue_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Object actual = propertyBuilder.getDefaultValue(resolvedRecursiveType);
        
        assertNull(actual);
        
        Class finalResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialResolvedRecursiveType_class == finalResolvedRecursiveType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return BeanUtil.getDefaultValue(type);}
 *  */
    @Test
    public void testGetDefaultValue_ReturnBeanUtilGetDefaultValue_3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Object actual = propertyBuilder.getDefaultValue(simpleType);
        
        assertNull(actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultBean()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): False}
 *  */
    @Test
    public void testGetDefaultBean_DefNotEqualsNull_1() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", null);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            byte[] _defaultBean = {};
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultBean", _defaultBean);
            
            byte[] actual = ((byte[]) propertyBuilder.getDefaultBean());
            
            assertArrayEquals(_defaultBean, actual);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): False}
 *  */
    @Test
    public void testGetDefaultBean_DefNotEqualsNull() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            Boolean noDefaultMarker = false;
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", noDefaultMarker);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultBean", noDefaultMarker);
            
            Object actual = propertyBuilder.getDefaultBean();
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): True}
 * @utbot.executesCondition {@code (def == null): True}
 *  */
    @Test
    public void testGetDefaultBean_DefEqualsNull() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", null);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
            BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
            setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creators", _creators);
            setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
            
            Object actual = propertyBuilder.getDefaultBean();
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): True}
 * @utbot.executesCondition {@code (def == null): True}
 *  */
    @Test
    public void testGetDefaultBean_DefEqualsNull_1() throws Exception  {
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        AnnotatedClass.Creators prevNO_CREATORS = ((AnnotatedClass.Creators) getStaticFieldValue(annotatedClassClazz, "NO_CREATORS"));
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            AnnotatedClass.Creators noCreators = new AnnotatedClass.Creators(null, null, null);
            setStaticField(annotatedClassClazz, "NO_CREATORS", noCreators);
            Boolean noDefaultMarker = false;
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", noDefaultMarker);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
            BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
            
            BeanDescription beanDescription = propertyBuilder._beanDesc;
            AnnotatedClass beanDescription_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(beanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
            AnnotatedClass.Creators initialPropertyBuilder_beanDesc_classInfo_creators = ((AnnotatedClass.Creators) getFieldValue(beanDescription_beanDesc_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creators"));
            
            Object actual = propertyBuilder.getDefaultBean();
            
            assertNull(actual);
            
            BeanDescription beanDescription1 = propertyBuilder._beanDesc;
            AnnotatedClass beanDescription1_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(beanDescription1, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
            AnnotatedClass.Creators finalPropertyBuilder_beanDesc_classInfo_creators = ((AnnotatedClass.Creators) getFieldValue(beanDescription1_beanDesc_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creators"));
            
            assertFalse(initialPropertyBuilder_beanDesc_classInfo_creators == finalPropertyBuilder_beanDesc_classInfo_creators);
        } finally {
            setStaticField(AnnotatedClass.class, "NO_CREATORS", prevNO_CREATORS);
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultBean()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:315) */
        propertyBuilder.getDefaultBean();
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException_2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:315) */
        propertyBuilder.getDefaultBean();
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:315) */
        propertyBuilder.getDefaultBean();
    }
    ///endregion
    
    ///region Errors report for getDefaultBean
    
    public void testGetDefaultBean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(t.getCause() != null)
 *  */
    @Test
    public void test_throwWrapped_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(PropertyBuilder.java:378) */
        propertyBuilder._throwWrapped(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Failed to get property '" + propName + "' of default " + defaultBean.getClass().getName() + " instance");
 *  */
    @Test
    public void test_throwWrapped_ThrowNullPointerException_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(PropertyBuilder.java:383) */
        propertyBuilder._throwWrapped(cloneNotSupportedException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Failed to get property '" + propName + "' of default " + defaultBean.getClass().getName() + " instance");
 *  */
    @Test
    public void test_throwWrapped_ThrowNullPointerException_2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(PropertyBuilder.java:383) */
        propertyBuilder._throwWrapped(interruptedException, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.Error} in: ClassUtil.throwIfError(t);
 *  */
    @Test(expected = Error.class)
    public void test_throwWrapped_ThrowError() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        Error cause = ((Error) createInstance("java.lang.Error"));
        setField(cause, "java.lang.Throwable", "cause", cause);
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        propertyBuilder._throwWrapped(interruptedException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: ClassUtil.throwIfRTE(t);
 *  */
    @Test(expected = NumberFormatException.class)
    public void test_throwWrapped_ThrowNumberFormatException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        propertyBuilder._throwWrapped(numberFormatException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Failed to get property '" + propName + "' of default " + defaultBean.getClass().getName() + " instance");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_throwWrapped_ThrowIllegalArgumentException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        XPathException xPathException = ((XPathException) createInstance("com.sun.org.apache.xpath.internal.XPathException"));
        
        propertyBuilder._throwWrapped(xPathException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} twice
 * @utbot.throwsException {@link java.lang.Error} in: ClassUtil.throwIfError(t);
 *  */
    @Test(expected = Error.class)
    public void test_throwWrapped_ThrowError_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        Error target = ((Error) createInstance("java.lang.Error"));
        setField(target, "java.lang.Throwable", "cause", target);
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        propertyBuilder._throwWrapped(interruptedException, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter
    
    ///region OTHER: ERROR SUITE for method buildWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary3);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary5);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter4() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary4);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter5() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary5);
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary6);
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter6() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary9);
        NopAnnotationIntrospector _secondary10 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary10);
        setField(_secondary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary9);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary8);
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary10);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary10);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter7() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:134) */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter8() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter9() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:134) */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter10() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter11() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter12() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary8);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getClassAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getClassAnnotations()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassAnnotations()}
 * @utbot.returnsFrom {@code return _beanDesc.getClassAnnotations();}
 *  */
    @Test
    public void testGetClassAnnotations_BeanDescriptionGetClassAnnotations() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        Annotations actual = propertyBuilder.getClassAnnotations();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getClassAnnotations()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanDesc.getClassAnnotations();
 *  */
    @Test
    public void testGetClassAnnotations_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getClassAnnotations(PropertyBuilder.java:83) */
        propertyBuilder.getClassAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPropertyDefaultValue(java.lang.String, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getPropertyDefaultValue(java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (defaultBean == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMember#getValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _throwWrapped(e, name, defaultBean);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetPropertyDefaultValue_ThrowNullPointerException() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            Boolean noDefaultMarker = false;
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", noDefaultMarker);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            byte[] _defaultBean = {};
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultBean", _defaultBean);
            
            propertyBuilder.getPropertyDefaultValue(null, null, null);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    ///endregion
    
    ///region Errors report for getPropertyDefaultValue
    
    public void testGetPropertyDefaultValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated, boolean, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType secondary = _annotationIntrospector.refineSerializationType(_config, a, declaredType);
 *  */
    @Test
    public void testFindSerializationType_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:261) */
        propertyBuilder.findSerializationType(null, false, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated, boolean, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testFindSerializationType1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated, boolean, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType3() throws Throwable  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        Object stdTypeConstructor = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class stdTypeConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class booleanType = boolean.class;
        Class resolvedRecursiveTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method findSerializationTypeMethod = propertyBuilderClazz.getDeclaredMethod("findSerializationType", stdTypeConstructorType, booleanType, resolvedRecursiveTypeType);
        findSerializationTypeMethod.setAccessible(true);
        java.lang.Object[] findSerializationTypeMethodArguments = new java.lang.Object[3];
        findSerializationTypeMethodArguments[0] = stdTypeConstructor;
        findSerializationTypeMethodArguments[1] = false;
        findSerializationTypeMethodArguments[2] = resolvedRecursiveType;
        try {
            findSerializationTypeMethod.invoke(propertyBuilder, findSerializationTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType4() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary1);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType5() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType6() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType7() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType8() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType9() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType10() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test
    public void testFindSerializationType11() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test
    public void testFindSerializationType12() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:530)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:530)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:261) */
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test
    public void testFindSerializationType13() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test
    public void testFindSerializationType14() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test
    public void testFindSerializationType15() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary4 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.refineSerializationType(JacksonAnnotationIntrospector.java:743)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:529)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:529)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:529)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:530)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:529)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:530)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:529)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:530)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:261) */
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test
    public void testFindSerializationType16() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary15 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary15);
        setField(_secondary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary14);
        setField(_secondary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary13);
        setField(_secondary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary12);
        setField(_secondary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary11);
        setField(_secondary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary10);
        setField(_secondary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary9);
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary8);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1092274447008600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1092274447008600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1092274447017100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092274447008600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092274447017100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1092274448177299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092274448177299.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092274448190199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092274448177299.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092274448190199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1092274448860999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092274448860999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092274448863500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092274448860999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092274448863500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1092274449769100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092274449769100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092274449772800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092274449769100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092274449772800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

