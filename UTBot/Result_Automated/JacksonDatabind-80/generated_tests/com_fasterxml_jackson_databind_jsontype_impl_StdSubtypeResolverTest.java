package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.NoAnnotations;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.ArrayList;
import java.util.Map;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_jsontype_impl_StdSubtypeResolverTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerSubtypes([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(java.lang.Class[])}
 *  */
    @Test
    public void testRegisterSubtypes() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        java.lang.Class[] classArray = {};
        
        stdSubtypeResolver.registerSubtypes(classArray);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(java.lang.Class[])}
 *  */
    @Test
    public void testRegisterSubtypes_1() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        java.lang.Class[] classArray = {};
        
        stdSubtypeResolver.registerSubtypes(classArray);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(java.lang.Class[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = classes.length; i < len; ++i)} once
 *  */
    @Test
    public void testRegisterSubtypes_IterateForLoop() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        
        Class initialClassArray0 = classArray[0];
        
        stdSubtypeResolver.registerSubtypes(classArray);
        
        Class finalClassArray0 = classArray[0];
        
        assertFalse(initialClassArray0 == finalClassArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerSubtypes([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NamedType[] types = new NamedType[classes.length];
 *  */
    @Test
    public void testRegisterSubtypes_ThrowNullPointerException() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes(StdSubtypeResolver.java:44) */
        stdSubtypeResolver.registerSubtypes(((java.lang.Class[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerSubtypes([Lcom.fasterxml.jackson.databind.jsontype.NamedType;)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
 *  */
    @Test
    public void testRegisterSubtypes1() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray = {};
        
        stdSubtypeResolver.registerSubtypes(namedTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
 * @utbot.iterates iterate the loop {@code for(NamedType type: types)} once
 *  */
    @Test
    public void testRegisterSubtypes_IterateForEachLoop() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray = {null};
        
        stdSubtypeResolver.registerSubtypes(namedTypeArray);
        
        NamedType finalNamedTypeArray0 = namedTypeArray[0];
        
        assertNull(finalNamedTypeArray0);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
 * @utbot.iterates iterate the loop {@code for(NamedType type: types)} once
 *  */
    @Test
    public void testRegisterSubtypes_IterateForEachLoop_2() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        _registeredSubtypes.add(namedType);
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray = new com.fasterxml.jackson.databind.jsontype.NamedType[1];
        namedTypeArray[0] = namedType;
        
        stdSubtypeResolver.registerSubtypes(namedTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
 * @utbot.iterates iterate the loop {@code for(NamedType type: types)} once
 *  */
    @Test
    public void testRegisterSubtypes_IterateForEachLoop_1() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        _registeredSubtypes.add(namedType);
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray = new com.fasterxml.jackson.databind.jsontype.NamedType[1];
        NamedType namedType1 = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        setField(namedType1, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        namedTypeArray[0] = namedType1;
        
        NamedType namedType2 = namedTypeArray[0];
        Class initialNamedTypeArray0_class = ((Class) getFieldValue(namedType2, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class"));
        
        stdSubtypeResolver.registerSubtypes(namedTypeArray);
        
        NamedType namedType3 = namedTypeArray[0];
        Class finalNamedTypeArray0_class = ((Class) getFieldValue(namedType3, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class"));
        
        assertFalse(initialNamedTypeArray0_class == finalNamedTypeArray0_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerSubtypes([Lcom.fasterxml.jackson.databind.jsontype.NamedType;)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
 * @utbot.executesCondition {@code (_registeredSubtypes == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(NamedType type: types)
 *  */
    @Test
    public void testRegisterSubtypes_ThrowNullPointerException_1() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes(StdSubtypeResolver.java:37) */
        stdSubtypeResolver.registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
 * @utbot.executesCondition {@code (_registeredSubtypes == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(NamedType type: types)
 *  */
    @Test
    public void testRegisterSubtypes_ThrowNullPointerException1() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.registerSubtypes(StdSubtypeResolver.java:37) */
        stdSubtypeResolver.registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method registerSubtypes([Lcom.fasterxml.jackson.databind.jsontype.NamedType;)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType[])}
     */
    @Test
    public void testRegisterSubtypesWithNonEmptyObjectArray() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray = {null, null, null};
        
        stdSubtypeResolver.registerSubtypes(namedTypeArray);
        
        NamedType finalNamedTypeArray0 = namedTypeArray[0];
        NamedType finalNamedTypeArray1 = namedTypeArray[1];
        NamedType finalNamedTypeArray2 = namedTypeArray[2];
        
        assertNull(finalNamedTypeArray0);
        
        assertNull(finalNamedTypeArray1);
        
        assertNull(finalNamedTypeArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector ai = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:101) */
        stdSubtypeResolver.collectAndResolveSubtypesByClass(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NamedType rootType = new NamedType(type.getRawType(), null);
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException_6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:116) */
            stdSubtypeResolver.collectAndResolveSubtypesByClass(serializationConfig, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NamedType rootType = new NamedType(type.getRawType(), null);
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException_2() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:116) */
        stdSubtypeResolver.collectAndResolveSubtypesByClass(serializationConfig, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawBase = type.getRawType();
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException_1() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:105) */
        stdSubtypeResolver.collectAndResolveSubtypesByClass(serializationConfig, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): True}
 * @utbot.iterates iterate the loop {@code for(NamedType subtype: _registeredSubtypes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rawBase.isAssignableFrom(subtype.getType())
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException_3() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        _registeredSubtypes.add(null);
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:108) */
        stdSubtypeResolver.collectAndResolveSubtypesByClass(serializationConfig, annotatedClass);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): True}
 * @utbot.iterates iterate the loop {@code for(NamedType subtype: _registeredSubtypes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rawBase.isAssignableFrom(subtype.getType())
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException_4() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        _registeredSubtypes.add(namedType);
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:108) */
        stdSubtypeResolver.collectAndResolveSubtypesByClass(serializationConfig, annotatedClass);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): True}
 * @utbot.iterates iterate the loop {@code for(NamedType subtype: _registeredSubtypes)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rawBase.isAssignableFrom(subtype.getType())
 *  */
    @Test
    public void testCollectAndResolveSubtypesByClass_ThrowNullPointerException_5() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        LinkedHashSet _registeredSubtypes = new LinkedHashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        _registeredSubtypes.add(namedType);
        _registeredSubtypes.add(null);
        stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:743)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.<init>(AnnotatedClassResolver.java:59)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:82)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:76)
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass(StdSubtypeResolver.java:109) */
        stdSubtypeResolver.collectAndResolveSubtypesByClass(serializationConfig, annotatedClass);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByClass
    
    ///region Errors report for collectAndResolveSubtypesByClass
    
    public void testCollectAndResolveSubtypesByClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.jsontype.NamedType, com.fasterxml.jackson.databind.cfg.MapperConfig, java.util.Set, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.NamedType#hasName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.NamedType#hasName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.NamedType#getName()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.NamedType#getType()}
 * @utbot.invokes {@link java.util.Set#add(java.lang.Object)}
 *  */
    @Test
    public void test_collectAndResolveByTypeId_SetAdd() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(_class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class initialNamedType_class = ((Class) getFieldValue(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class"));
        
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, serializationConfig, linkedHashSet, linkedHashMap);
        
        Class finalNamedType_class = ((Class) getFieldValue(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class"));
        
        assertFalse(initialNamedType_class == finalNamedType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.jsontype.NamedType, com.fasterxml.jackson.databind.cfg.MapperConfig, java.util.Set, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector ai = config.getAnnotationIntrospector();
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:242) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !namedType.hasName()
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException_6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:243) */
            stdSubtypeResolver._collectAndResolveByTypeId(null, null, deserializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !namedType.hasName()
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException_1() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:243) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, null, serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byName.put(namedType.getName(), namedType);
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException_3() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:250) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = ai.findTypeName(annotatedType);
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException_2() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:244) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, deserializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: typesHandled.add(namedType.getType())
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException_4() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:254) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, deserializationConfig, null, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.invokes {@link java.util.Set#add(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Collection<NamedType> st = ai.findSubtypes(annotatedType);
 *  */
    @Test
    public void test_collectAndResolveByTypeId_ThrowNullPointerException_5() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:255) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, serializationConfig, linkedHashSet, linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.jsontype.NamedType, com.fasterxml.jackson.databind.cfg.MapperConfig, java.util.Set, java.util.Map)
    
    @Test(expected = StackOverflowError.class)
    public void test_collectAndResolveByTypeId1() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        stdSubtypeResolver._collectAndResolveByTypeId(annotatedClass, namedType, deserializationConfig, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_collectAndResolveByTypeId2() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        stdSubtypeResolver._collectAndResolveByTypeId(annotatedClass, namedType, deserializationConfig, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_collectAndResolveByTypeId3() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Class class1 = Object.class;
        linkedHashSet.add(class1);
        linkedHashSet.add(class1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, serializationConfig, linkedHashSet, linkedHashMap);
    }
    
    @Test
    public void test_collectAndResolveByTypeId4() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:254) */
            stdSubtypeResolver._collectAndResolveByTypeId(annotatedClass, namedType, serializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_collectAndResolveByTypeId5() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:255) */
        stdSubtypeResolver._collectAndResolveByTypeId(annotatedClass, namedType, serializationConfig, linkedHashSet, linkedHashMap);
    }
    
    @Test
    public void test_collectAndResolveByTypeId6() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Class class1 = Object.class;
        linkedHashSet.add(class1);
        linkedHashSet.add(class1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1336)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSubtypes(JacksonAnnotationIntrospector.java:556)
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:255) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, deserializationConfig, linkedHashSet, linkedHashMap);
    }
    
    @Test
    public void test_collectAndResolveByTypeId7() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary2 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Class class1 = Object.class;
        linkedHashSet.add(class1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1336)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSubtypes(JacksonAnnotationIntrospector.java:556)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSubtypes(AnnotationIntrospectorPair.java:257)
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:255) */
        stdSubtypeResolver._collectAndResolveByTypeId(null, namedType, serializationConfig, linkedHashSet, linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._combineNamedAndUnnamed
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _combineNamedAndUnnamed(java.lang.Class, java.util.Set, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_combineNamedAndUnnamed(java.lang.Class,java.util.Set,java.util.Map)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ArrayList<NamedType> result = new ArrayList<NamedType>(byName.values());
 *  */
    @Test
    public void test_combineNamedAndUnnamed_ThrowNullPointerException() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._combineNamedAndUnnamed] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._combineNamedAndUnnamed(StdSubtypeResolver.java:273) */
        stdSubtypeResolver._combineNamedAndUnnamed(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector ai = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testCollectAndResolveSubtypesByTypeId_ThrowNullPointerException() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:131) */
        stdSubtypeResolver.collectAndResolveSubtypesByTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawBase = baseType.getRawClass();
 *  */
    @Test
    public void testCollectAndResolveSubtypesByTypeId_ThrowNullPointerException_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:132) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(deserializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawBase = baseType.getRawClass();
 *  */
    @Test
    public void testCollectAndResolveSubtypesByTypeId_ThrowNullPointerException_1() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:132) */
        stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class annotationCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector");
        Annotations prevNO_ANNOTATIONS = ((Annotations) getStaticFieldValue(annotationCollectorClazz, "NO_ANNOTATIONS"));
        Class annotatedClassResolverClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver");
        Annotations prevNO_ANNOTATIONS1 = ((Annotations) getStaticFieldValue(annotatedClassResolverClazz, "NO_ANNOTATIONS"));
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            AnnotationCollector.NoAnnotations noAnnotations = ((AnnotationCollector.NoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
            setStaticField(annotationCollectorClazz, "NO_ANNOTATIONS", noAnnotations);
            setStaticField(annotatedClassResolverClazz, "NO_ANNOTATIONS", noAnnotations);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            Class _class = Object.class;
            setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            ArrayList actual = ((ArrayList) stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, resolvedRecursiveType));
            
            ArrayList expected = new ArrayList();
            NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
            setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
            setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_hashCode", 1063877011);
            expected.add(namedType);
            
            assertTrue(deepEquals(expected, actual));
            
            SimpleMixInResolver serializationConfig_mixIns = ((SimpleMixInResolver) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            Map finalSerializationConfig_mixIns_localMixIns = ((Map) getFieldValue(serializationConfig_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_localMixIns"));
            
            Class finalResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertNull(finalSerializationConfig_mixIns_localMixIns);
            
            assertFalse(initialResolvedRecursiveType_class == finalResolvedRecursiveType_class);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(AnnotationCollector.class, "NO_ANNOTATIONS", prevNO_ANNOTATIONS);
            setStaticField(com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.class, "NO_ANNOTATIONS", prevNO_ANNOTATIONS1);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId2() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            AnnotatedField annotatedField = new AnnotatedField(null, null, null);
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            ArrayList actual = ((ArrayList) stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, annotatedField, collectionLikeType));
            
            ArrayList expected = new ArrayList();
            NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
            setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
            setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_hashCode", 1063877011);
            expected.add(namedType);
            
            assertTrue(deepEquals(expected, actual));
            
            SimpleMixInResolver serializationConfig_mixIns = ((SimpleMixInResolver) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            ClassIntrospector.MixInResolver serializationConfig_mixIns_mixIns_overrides = ((ClassIntrospector.MixInResolver) getFieldValue(serializationConfig_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides"));
            Map finalSerializationConfig_mixIns_overrides_localMixIns = ((Map) getFieldValue(serializationConfig_mixIns_mixIns_overrides, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_localMixIns"));
            SimpleMixInResolver serializationConfig_mixIns1 = ((SimpleMixInResolver) getFieldValue(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            Map finalSerializationConfig_mixIns_localMixIns = ((Map) getFieldValue(serializationConfig_mixIns1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_localMixIns"));
            
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertNull(finalSerializationConfig_mixIns_overrides_localMixIns);
            
            assertNull(finalSerializationConfig_mixIns_localMixIns);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = StackOverflowError.class)
    public void testCollectAndResolveSubtypesByTypeId3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SerializationConfig _overrides = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_overrides, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, virtualAnnotatedMember, arrayType);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId4() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SerializationConfig _overrides = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            DeserializationConfig _overrides1 = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(_mixIns1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides1);
            setField(_overrides, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns1);
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:743)
                com.fasterxml.jackson.databind.introspect.SimpleMixInResolver.findMixInClassFor(SimpleMixInResolver.java:92)
                com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:743)
                com.fasterxml.jackson.databind.introspect.SimpleMixInResolver.findMixInClassFor(SimpleMixInResolver.java:92)
                com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:743)
                com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.<init>(AnnotatedClassResolver.java:59)
                com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:82)
                com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:76)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:140) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, mapType);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId5() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            LinkedHashMap _localMixIns = new LinkedHashMap();
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_localMixIns", _localMixIns);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findTypeName(AnnotationIntrospectorPair.java:270)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:244)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:142) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, mapLikeType);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides2 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides3 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            DeserializationConfig _overrides4 = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(_overrides3, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides4);
            setField(_overrides2, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides3);
            setField(_overrides1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides2);
            setField(_overrides, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides1);
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException] */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, mapLikeType);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId7() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            DeserializationConfig _overrides = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            SimpleMixInResolver _mixIns1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SerializationConfig _overrides2 = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_overrides1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides2);
            setField(_mixIns1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides1);
            setField(_overrides, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns1);
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException] */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, referenceType);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId8() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SerializationConfig _overrides1 = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides2 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            LinkedHashMap _localMixIns = new LinkedHashMap();
            setField(_overrides2, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_localMixIns", _localMixIns);
            setField(_mixIns1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides2);
            setField(_overrides1, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns1);
            setField(_overrides, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides1);
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:269)
                com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:108)
                com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:82)
                com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolveWithoutSuperTypes(AnnotatedClassResolver.java:76)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:140) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, null, arrayType);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId9() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SerializationConfig _overrides = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            SimpleMixInResolver _overrides1 = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            setField(_mixIns1, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides1);
            setField(_overrides, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns1);
            setField(_mixIns, "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver", "_overrides", _overrides);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            AnnotatedField annotatedField = new AnnotatedField(null, null, null);
            ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            Class _class = Object.class;
            setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:244)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:142) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, annotatedField, resolvedRecursiveType);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCollectAndResolveSubtypesByTypeId10() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            SimpleMixInResolver _mixIns = ((SimpleMixInResolver) createInstance("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns", _mixIns);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
            setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            AnnotatedField annotatedField = new AnnotatedField(null, null, null);
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findTypeName(AnnotationIntrospectorPair.java:270)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolveByTypeId(StdSubtypeResolver.java:244)
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:142) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, annotatedField, arrayType);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Class<?> rawBase = baseType.getRawType();
 *  */
    @Test
    public void testCollectAndResolveSubtypesByTypeId_ThrowNullPointerException1() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:170) */
        stdSubtypeResolver.collectAndResolveSubtypesByTypeId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.executesCondition {@code (_registeredSubtypes != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getRawType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolveByTypeId(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,java.util.Set,java.util.Map)}
 * @utbot.invokes {@link java.util.LinkedHashSet#iterator()}
 * @utbot.iterates iterate the loop {@code for(NamedType subtype: _registeredSubtypes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rawBase.isAssignableFrom(subtype.getType())
 *  */
    @Test
    public void testCollectAndResolveSubtypesByTypeId_ThrowNullPointerException_11() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
            LinkedHashSet _registeredSubtypes = new LinkedHashSet();
            _registeredSubtypes.add(null);
            stdSubtypeResolver._registeredSubtypes = _registeredSubtypes;
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            Class _class = Object.class;
            setField(annotatedClass, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver.collectAndResolveSubtypesByTypeId(StdSubtypeResolver.java:180) */
            stdSubtypeResolver.collectAndResolveSubtypesByTypeId(serializationConfig, annotatedClass);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.jsontype.NamedType, com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.AnnotationIntrospector, java.util.HashMap)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): True}
 * @utbot.executesCondition {@code (namedType.hasName()): True}
 * @utbot.executesCondition {@code (!prev.hasName()): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_collectAndResolve_PrevHasName() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        hashMap.put(namedType, namedType);
        
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): False}
 *  */
    @Test
    public void test_collectAndResolve_NotCollectedSubtypesContainsKey() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        NamedType namedType1 = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        setField(namedType1, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        hashMap.put(namedType1, namedType1);
        
        Class initialNamedType_class = ((Class) getFieldValue(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class"));
        
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
        
        Class finalNamedType_class = ((Class) getFieldValue(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class"));
        
        assertFalse(initialNamedType_class == finalNamedType_class);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): False}
 * @utbot.executesCondition {@code (st != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSubtypes(com.fasterxml.jackson.databind.introspect.Annotated)}
 *  */
    @Test
    public void test_collectAndResolve_StEqualsNull() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        HashMap hashMap = new HashMap();
        hashMap.put(null, null);
        
        stdSubtypeResolver._collectAndResolve(null, namedType, null, anonymousNopAnnotationIntrospector, hashMap);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): True}
 * @utbot.executesCondition {@code (namedType.hasName()): True}
 * @utbot.executesCondition {@code (!prev.hasName()): True}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_collectAndResolve_NotPrevHasName() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        NamedType namedType1 = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        hashMap.put(namedType, namedType1);
        
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass, com.fasterxml.jackson.databind.jsontype.NamedType, com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.AnnotationIntrospector, java.util.HashMap)
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.NamedType#hasName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !namedType.hasName()
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException() {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:204) */
        stdSubtypeResolver._collectAndResolve(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): True}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: collectedSubtypes.containsKey(namedType)
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_2() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:212) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, anonymousNopAnnotationIntrospector, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = ai.findTypeName(annotatedType);
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_1() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:205) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: collectedSubtypes.containsKey(namedType)
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_3() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:212) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): False}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Collection<NamedType> st = ai.findSubtypes(annotatedType);
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_4() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:224) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): False}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Collection<NamedType> st = ai.findSubtypes(annotatedType);
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_7() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        hashMap.put(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:224) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): False}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): True}
 * @utbot.executesCondition {@code (namedType.hasName()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !prev.hasName()
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_5() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        hashMap.put(namedType, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:216) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
    }
    
    /**
    @utbot.classUnderTest {@link StdSubtypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver#_collectAndResolve(com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.jsontype.NamedType,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.AnnotationIntrospector,java.util.HashMap)}
 * @utbot.executesCondition {@code (!namedType.hasName()): False}
 * @utbot.executesCondition {@code (collectedSubtypes.containsKey(namedType)): True}
 * @utbot.executesCondition {@code (namedType.hasName()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !prev.hasName()
 *  */
    @Test
    public void test_collectAndResolve_ThrowNullPointerException_6() throws Exception  {
        StdSubtypeResolver stdSubtypeResolver = new StdSubtypeResolver();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        HashMap hashMap = new HashMap();
        NamedType namedType1 = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        hashMap.put(namedType1, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver._collectAndResolve(StdSubtypeResolver.java:216) */
        stdSubtypeResolver._collectAndResolve(null, namedType, null, null, hashMap);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1084169031177799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1084169031177799.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1084169031185300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084169031177799.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084169031185300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1084169031539300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084169031539300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084169031541900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084169031539300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084169031541900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1084169031883100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084169031883100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084169031887000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084169031883100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084169031887000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1084169032481000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084169032481000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084169032483800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084169032481000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084169032483800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

