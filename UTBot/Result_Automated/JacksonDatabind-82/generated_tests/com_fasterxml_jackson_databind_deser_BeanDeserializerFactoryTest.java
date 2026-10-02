package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.deser.ValueInstantiators.Base;
import com.fasterxml.jackson.databind.module.SimpleValueInstantiators;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.BeanDescription;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import java.util.Set;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_BeanDeserializerFactoryTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer
    
    ///region FUZZER: ERROR SUITE for method findStdDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#findStdDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testFindStdDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1554)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:198) */
        beanDeserializerFactory.findStdDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStdDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test
    public void testFindStdDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1599)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:198) */
        beanDeserializerFactory.findStdDeserializer(null, collectionLikeType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType builderType = ctxt.constructType(builderClass);
 *  */
    @Test
    public void testCreateBuilderBasedDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBuilderBasedDeserializer(BeanDeserializerFactory.java:183) */
        beanDeserializerFactory.createBuilderBasedDeserializer(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateBuilderBasedDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        beanDeserializerFactory.createBuilderBasedDeserializer(impl, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer
    
    ///region FUZZER: ERROR SUITE for method buildBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#buildBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testBuildBeanDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:238)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer(BeanDeserializerFactory.java:251) */
        beanDeserializerFactory.buildBeanDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildBeanDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanDeserializerFactory.buildBeanDeserializer(impl, mapType, basicBeanDescription);
    }
    
    @Test
    public void testBuildBeanDeserializer2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 768);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getDefaultVisibilityChecker(MapperConfig.java:248)
                com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultVisibilityChecker(MapperConfigBase.java:260)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._constructDefaultValueInstantiator(BasicDeserializerFactory.java:303)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:253)
                com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer(BeanDeserializerFactory.java:251) */
            beanDeserializerFactory.buildBeanDeserializer(impl, collectionType, basicBeanDescription);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testBuildBeanDeserializer3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
            com.fasterxml.jackson.databind.deser.ValueInstantiators[] _valueInstantiators = {};
            setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_valueInstantiators", _valueInstantiators);
            BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultVisibilityChecker(MapperConfigBase.java:263)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._constructDefaultValueInstantiator(BasicDeserializerFactory.java:303)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:253)
                com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer(BeanDeserializerFactory.java:251) */
            beanDeserializerFactory.buildBeanDeserializer(impl, collectionLikeType, basicBeanDescription);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testBuildBeanDeserializer4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary8 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer] produces [java.lang.NullPointerException] */
        beanDeserializerFactory.buildBeanDeserializer(impl, null, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer
    
    ///region FUZZER: ERROR SUITE for method buildBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#buildBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
     */
    @Test
    public void testBuildBuilderBasedDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:238)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer(BeanDeserializerFactory.java:304) */
        beanDeserializerFactory.buildBuilderBasedDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildBuilderBasedDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildBuilderBasedDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanDeserializerFactory.buildBuilderBasedDeserializer(impl, collectionType, basicBeanDescription);
    }
    
    @Test
    public void testBuildBuilderBasedDeserializer2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 768);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getDefaultVisibilityChecker(MapperConfig.java:248)
                com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultVisibilityChecker(MapperConfigBase.java:260)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._constructDefaultValueInstantiator(BasicDeserializerFactory.java:303)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:253)
                com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer(BeanDeserializerFactory.java:304) */
            beanDeserializerFactory.buildBuilderBasedDeserializer(impl, arrayType, basicBeanDescription);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testBuildBuilderBasedDeserializer3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBuilderBasedDeserializer] produces [java.lang.NullPointerException] */
        beanDeserializerFactory.buildBuilderBasedDeserializer(impl, null, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildThrowableDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#buildThrowableDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void testBuildThrowableDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:388) */
        beanDeserializerFactory.buildThrowableDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildThrowableDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildThrowableDeserializer1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        beanDeserializerFactory.buildThrowableDeserializer(impl, mapLikeType, basicBeanDescription);
    }
    
    @Test
    public void testBuildThrowableDeserializer2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.BeanDescription.getBeanClass(BeanDescription.java:52)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._findStdValueInstantiator(BasicDeserializerFactory.java:284)
                com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:251)
                com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:391) */
            beanDeserializerFactory.buildThrowableDeserializer(impl, null, basicBeanDescription);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testBuildThrowableDeserializer3() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.ValueInstantiators[] _valueInstantiators = new com.fasterxml.jackson.databind.deser.ValueInstantiators[10];
        ValueInstantiators.Base base = ((ValueInstantiators.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiators$Base"));
        _valueInstantiators[0] = ((ValueInstantiators) base);
        SimpleValueInstantiators simpleValueInstantiators = ((SimpleValueInstantiators) createInstance("com.fasterxml.jackson.databind.module.SimpleValueInstantiators"));
        _valueInstantiators[1] = ((ValueInstantiators) simpleValueInstantiators);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_valueInstantiators", _valueInstantiators);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultVisibilityChecker(MapperConfigBase.java:263)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._constructDefaultValueInstantiator(BasicDeserializerFactory.java:303)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:253)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:391) */
        beanDeserializerFactory.buildThrowableDeserializer(impl, resolvedRecursiveType, basicBeanDescription);
    }
    
    @Test
    public void testBuildThrowableDeserializer4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 257);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultVisibilityChecker(MapperConfigBase.java:263)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._constructDefaultValueInstantiator(BasicDeserializerFactory.java:303)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:253)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:391) */
        beanDeserializerFactory.buildThrowableDeserializer(impl, mapLikeType, basicBeanDescription);
    }
    
    @Test
    public void testBuildThrowableDeserializer5() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:664)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:664)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:243)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:391) */
        beanDeserializerFactory.buildThrowableDeserializer(impl, null, basicBeanDescription);
    }
    
    @Test
    public void testBuildThrowableDeserializer6() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:664)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:664)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findValueInstantiator(AnnotationIntrospectorPair.java:663)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findValueInstantiator(BasicDeserializerFactory.java:243)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildThrowableDeserializer(BeanDeserializerFactory.java:391) */
        beanDeserializerFactory.buildThrowableDeserializer(impl, null, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructBeanDeserializerBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.returnsFrom {@code return new BeanDeserializerBuilder(beanDesc, ctxt.getConfig());}
 *  */
    @Test
    public void testConstructBeanDeserializerBuilder_DeserializationContextGetConfig() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        BeanDeserializerBuilder actual = beanDeserializerFactory.constructBeanDeserializerBuilder(impl, null);
        
        BeanDeserializerBuilder expected = ((BeanDeserializerBuilder) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        LinkedHashMap _properties = new LinkedHashMap();
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "_properties", _properties);
        
        DeserializationConfig actual_config = actual._config;
        assertNull(actual_config);
        
        BeanDescription actual_beanDesc = actual._beanDesc;
        assertNull(actual_beanDesc);
        
        Map expected_properties = expected._properties;
        Map actual_properties = actual._properties;
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        List actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        HashMap actual_backRefProperties = actual._backRefProperties;
        assertNull(actual_backRefProperties);
        
        HashSet actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        JsonPOJOBuilder.Value actual_builderConfig = actual._builderConfig;
        assertNull(actual_builderConfig);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructBeanDeserializerBuilder(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BeanDeserializerBuilder(beanDesc, ctxt.getConfig());
 *  */
    @Test
    public void testConstructBeanDeserializerBuilder_ThrowNullPointerException() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructBeanDeserializerBuilder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructBeanDeserializerBuilder(BeanDeserializerFactory.java:462) */
        beanDeserializerFactory.constructBeanDeserializerBuilder(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addReferenceProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (refs != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findBackReferenceProperties()}
 *  */
    @Test
    public void testAddReferenceProperties_RefsEqualsNull() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        beanDeserializerFactory.addReferenceProperties(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addReferenceProperties(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findBackReferenceProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Map<String, AnnotatedMember> refs = beanDesc.findBackReferenceProperties();
 *  */
    @Test
    public void testAddReferenceProperties_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addReferenceProperties(BeanDeserializerFactory.java:668) */
        beanDeserializerFactory.addReferenceProperties(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSettableProperty
    
    ///region Errors report for constructSettableProperty
    
    public void testConstructSettableProperty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMaterializeAbstractType_ReturnNull() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        JavaType actual = beanDeserializerFactory.materializeAbstractType(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.iterates iterate the loop {@code for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMaterializeAbstractType_ConcreteEqualsNull() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = new com.fasterxml.jackson.databind.AbstractTypeResolver[1];
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        _abstractTypeResolvers[0] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType actual = beanDeserializerFactory.materializeAbstractType(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig#abstractTypeResolvers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())
 *  */
    @Test
    public void testMaterializeAbstractType_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType(BeanDeserializerFactory.java:215) */
        beanDeserializerFactory.materializeAbstractType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.iterates iterate the loop {@code for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType concrete = r.resolveAbstractType(ctxt.getConfig(), beanDesc);
 *  */
    @Test
    public void testMaterializeAbstractType_ThrowNullPointerException_1() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType(BeanDeserializerFactory.java:216) */
        beanDeserializerFactory.materializeAbstractType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#materializeAbstractType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.iterates iterate the loop {@code for(AbstractTypeResolver r: _factoryConfig.abstractTypeResolvers())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType concrete = r.resolveAbstractType(ctxt.getConfig(), beanDesc);
 *  */
    @Test
    public void testMaterializeAbstractType_ThrowNullPointerException_2() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.materializeAbstractType(BeanDeserializerFactory.java:216) */
        beanDeserializerFactory.materializeAbstractType(impl, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSetterlessProperty
    
    ///region Errors report for constructSetterlessProperty
    
    public void testConstructSetterlessProperty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isPotentialBeanType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPotentialBeanType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isPotentialBeanType(java.lang.Class)}
 *  */
    @Test
    public void testIsPotentialBeanType() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        Class class1 = Object.class;
        
        boolean actual = beanDeserializerFactory.isPotentialBeanType(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isPotentialBeanType(java.lang.Class)}
 *  */
    @Test
    public void testIsPotentialBeanType_1() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        Class class1 = Object.class;
        
        boolean actual = beanDeserializerFactory.isPotentialBeanType(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:130) */
        beanDeserializerFactory.createBeanDeserializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isThrowable()
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:140) */
        beanDeserializerFactory.createBeanDeserializer(impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return custom;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return custom;
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_2() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        CoreXMLDeserializers coreXMLDeserializers = ((CoreXMLDeserializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) coreXMLDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig.hasAbstractTypeResolvers(DeserializerFactoryConfig.java:184)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1561)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:161) */
        beanDeserializerFactory.createBeanDeserializer(impl, mapType, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isThrowable()
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_3() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:140) */
        beanDeserializerFactory.createBeanDeserializer(impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return custom;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return custom;
 *  */
    @Test
    public void testCreateBeanDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        HashMap _classMappings = new HashMap();
        ClassKey classKey = ((ClassKey) createInstance("com.fasterxml.jackson.databind.type.ClassKey"));
        Class _class = Object.class;
        setField(classKey, "com.fasterxml.jackson.databind.type.ClassKey", "_class", _class);
        TokenBufferDeserializer tokenBufferDeserializer = ((TokenBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer"));
        _classMappings.put(classKey, tokenBufferDeserializer);
        setField(simpleDeserializers, "com.fasterxml.jackson.databind.module.SimpleDeserializers", "_classMappings", _classMappings);
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig.hasAbstractTypeResolvers(DeserializerFactoryConfig.java:184)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1561)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:161) */
        beanDeserializerFactory.createBeanDeserializer(impl, mapType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.withConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)}
 * @utbot.executesCondition {@code (_factoryConfig == config): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithConfig__factoryConfigEqualsConfig() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        BeanDeserializerFactory actual = ((BeanDeserializerFactory) beanDeserializerFactory.withConfig(null));
        
        Set beanDeserializerFactory_cfgIllegalClassNames = beanDeserializerFactory._cfgIllegalClassNames;
        Set actual_cfgIllegalClassNames = actual._cfgIllegalClassNames;
        assertTrue(deepEquals(beanDeserializerFactory_cfgIllegalClassNames, actual_cfgIllegalClassNames));
        
        DeserializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
        assertNull(actual_factoryConfig);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)}
     */
    @Test
    public void testWithConfig() {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        BeanDeserializerFactory actual = ((BeanDeserializerFactory) beanDeserializerFactory.withConfig(null));
        
        BeanDeserializerFactory expected = new BeanDeserializerFactory(null);
        Set _cfgIllegalClassNames = new LinkedHashSet();
        String string = "org.codehaus.groovy.runtime.ConvertedClosure";
        _cfgIllegalClassNames.add(string);
        String string1 = "org.springframework.beans.factory.ObjectFactory";
        _cfgIllegalClassNames.add(string1);
        String string2 = "org.apache.commons.collections.functors.InstantiateTransformer";
        _cfgIllegalClassNames.add(string2);
        String string3 = "org.codehaus.groovy.runtime.MethodClosure";
        _cfgIllegalClassNames.add(string3);
        String string4 = "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        _cfgIllegalClassNames.add(string4);
        String string5 = "org.apache.commons.collections4.functors.InvokerTransformer";
        _cfgIllegalClassNames.add(string5);
        String string6 = "org.apache.commons.collections.functors.InvokerTransformer";
        _cfgIllegalClassNames.add(string6);
        String string7 = "org.apache.commons.collections4.functors.InstantiateTransformer";
        _cfgIllegalClassNames.add(string7);
        String string8 = "org.apache.xalan.xsltc.trax.TemplatesImpl";
        _cfgIllegalClassNames.add(string8);
        expected._cfgIllegalClassNames = _cfgIllegalClassNames;
        
        Set expected_cfgIllegalClassNames = expected._cfgIllegalClassNames;
        Set actual_cfgIllegalClassNames = actual._cfgIllegalClassNames;
        assertTrue(deepEquals(expected_cfgIllegalClassNames, actual_cfgIllegalClassNames));
        
        DeserializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
        assertNull(actual_factoryConfig);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkIllegalTypes(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#checkIllegalTypes(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (_cfgIllegalClassNames.contains(full)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 *  */
    @Test
    public void testCheckIllegalTypes_Not_cfgIllegalClassNamesContains() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        LinkedHashSet _cfgIllegalClassNames = new LinkedHashSet();
        beanDeserializerFactory._cfgIllegalClassNames = _cfgIllegalClassNames;
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        beanDeserializerFactory.checkIllegalTypes(null, mapType, null);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkIllegalTypes(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#checkIllegalTypes(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String full = type.getRawClass().getName();
 *  */
    @Test
    public void testCheckIllegalTypes_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes(BeanDeserializerFactory.java:900) */
        beanDeserializerFactory.checkIllegalTypes(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#checkIllegalTypes(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String full = type.getRawClass().getName();
 *  */
    @Test
    public void testCheckIllegalTypes_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes(BeanDeserializerFactory.java:900) */
        beanDeserializerFactory.checkIllegalTypes(null, mapType, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#checkIllegalTypes(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _cfgIllegalClassNames.contains(full)
 *  */
    @Test
    public void testCheckIllegalTypes_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        beanDeserializerFactory._cfgIllegalClassNames = null;
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.checkIllegalTypes(BeanDeserializerFactory.java:902) */
        beanDeserializerFactory.checkIllegalTypes(null, mapType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Boolean status = ignoredTypes.get(type);
 *  */
    @Test
    public void testIsIgnorableType_ThrowNullPointerException() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:870) */
        beanDeserializerFactory.isIgnorableType(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class,java.util.Map)}
 * @utbot.executesCondition {@code (status != null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#findConfigOverride(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ConfigOverride override = config.findConfigOverride(type);
 *  */
    @Test
    public void testIsIgnorableType_ThrowNullPointerException_1() {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:875) */
        beanDeserializerFactory.isIgnorableType(null, null, null, linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class, java.util.Map)
    
    @Test
    public void testIsIgnorableType1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean boolean1 = false;
        linkedHashMap.put(class1, boolean1);
        
        boolean actual = beanDeserializerFactory.isIgnorableType(deserializationConfig, null, class1, linkedHashMap);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class, java.util.Map)
    
    @Test
    public void testIsIgnorableType2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:278)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:290)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:320)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:880) */
        beanDeserializerFactory.isIgnorableType(deserializationConfig, basicBeanDescription, class1, linkedHashMap);
    }
    
    @Test
    public void testIsIgnorableType3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Class class1 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean boolean1 = false;
        linkedHashMap.put(null, boolean1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findConfigOverride(MapperConfigBase.java:519)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.isIgnorableType(BeanDeserializerFactory.java:875) */
        beanDeserializerFactory.isIgnorableType(deserializationConfig, basicBeanDescription, class1, linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isIgnorableType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.lang.Class, java.util.Map)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsIgnorableType4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        beanDeserializerFactory.isIgnorableType(deserializationConfig, null, null, linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter
    
    ///region FUZZER: ERROR SUITE for method constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
     */
    @Test
    public void testConstructAnySetterThrowsNPE() throws JsonMappingException  {
        DeserializerFactoryConfig deserializerFactoryConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.resolveMemberAndTypeAnnotations(BasicDeserializerFactory.java:1824)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(BeanDeserializerFactory.java:737) */
        beanDeserializerFactory.constructAnySetter(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test
    public void testConstructAnySetter1() throws Throwable  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object stdTypeConstructor = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.resolveMemberAndTypeAnnotations(BasicDeserializerFactory.java:1832)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(BeanDeserializerFactory.java:737) */
        Class beanDeserializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class beanDescriptionType = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Class stdTypeConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Method constructAnySetterMethod = beanDeserializerFactoryClazz.getDeclaredMethod("constructAnySetter", implType, beanDescriptionType, stdTypeConstructorType);
        constructAnySetterMethod.setAccessible(true);
        java.lang.Object[] constructAnySetterMethodArguments = new java.lang.Object[3];
        constructAnySetterMethodArguments[0] = impl;
        constructAnySetterMethodArguments[1] = ((Object) null);
        constructAnySetterMethodArguments[2] = stdTypeConstructor;
        try {
            constructAnySetterMethod.invoke(beanDeserializerFactory, constructAnySetterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testConstructAnySetter2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getName(AnnotatedConstructor.java:68)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(BeanDeserializerFactory.java:738) */
        beanDeserializerFactory.constructAnySetter(impl, null, annotatedConstructor);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (objectIdInfo == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddObjectIdReader_ObjectIdInfoEqualsNull() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanDeserializerFactory.addObjectIdReader(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdInfo objectIdInfo = beanDesc.getObjectIdInfo();
 *  */
    @Test
    public void testAddObjectIdReader_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader(BeanDeserializerFactory.java:350) */
        beanDeserializerFactory.addObjectIdReader(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (objectIdInfo == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getGeneratorType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdResolver resolver = ctxt.objectIdResolverInstance(beanDesc.getClassInfo(), objectIdInfo);
 *  */
    @Test
    public void testAddObjectIdReader_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader(BeanDeserializerFactory.java:359) */
        beanDeserializerFactory.addObjectIdReader(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addObjectIdReader(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddObjectIdReader1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _resolver = Object.class;
        setField(_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver", _resolver);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.annotation.ObjectIdResolver (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.annotation.ObjectIdResolver is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @345acdc6)]
            com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance(DatabindContext.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader(BeanDeserializerFactory.java:359) */
        beanDeserializerFactory.addObjectIdReader(impl, basicBeanDescription, null);
    }
    
    @Test
    public void testAddObjectIdReader2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _resolver = Object.class;
        setField(_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver", _resolver);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.annotation.ObjectIdResolver (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.annotation.ObjectIdResolver is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @345acdc6)]
            com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance(DatabindContext.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addObjectIdReader(BeanDeserializerFactory.java:359) */
        beanDeserializerFactory.addObjectIdReader(impl, basicBeanDescription, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder, java.util.List, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.lang.Math#max(int,int)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFilterBeanProps_ListIterator() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder, java.util.List, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: rawPropertyType = property.getSetter().getRawParameterType(0);
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _setters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        byte[] value = {};
        setField(_setters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(_setters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", _setters);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setters", _setters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @345acdc6)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getSetter(POJOPropertyBuilder.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:641) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: rawPropertyType = property.getSetter().getRawParameterType(0);
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_name, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _setters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        int[] value = {};
        setField(_setters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setters", _setters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @345acdc6)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getSetter(POJOPropertyBuilder.java:276)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:641) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: rawPropertyType = property.getField().getRawType();
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException_3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        byte[] value = {};
        setField(_fields, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedField ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedField is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @345acdc6)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getField(POJOPropertyBuilder.java:339)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:643) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: rawPropertyType = property.getField().getRawType();
 *  */
    @Test
    public void testFilterBeanProps_ThrowClassCastException_2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Object next = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        int[] value = {};
        setField(next, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(_fields, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", next);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedField ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedField is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @345acdc6)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getField(POJOPropertyBuilder.java:342)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:643) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Math.max(4, propDefsIn.size())
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_1() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:630) */
        beanDeserializerFactory.filterBeanProps(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = property.getName();
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:634) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ignored.contains(name)
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_7() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        PropertyName _fullName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_fullName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(simpleBeanPropertyDefinition, "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition", "_fullName", _fullName);
        arrayList.add(simpleBeanPropertyDefinition);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:635) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ignored.contains(name)
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_2() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, null);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:635) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ignored.contains(name)
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:635) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rawPropertyType = property.getSetter().getRawParameterType(0);
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_name, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _setters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setters", _setters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:641) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.executesCondition {@code (rawPropertyType != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getRawParameterType(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: isIgnorableType(ctxt.getConfig(), beanDesc, rawPropertyType, ignoredTypes)
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_6() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_name, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _setters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        AnnotatedMethod value = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = new java.lang.Class[1];
        Class class1 = Object.class;
        _paramClasses[0] = class1;
        setField(value, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        setField(_setters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setters", _setters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:648) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#filterBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedField#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rawPropertyType = property.getField().getRawType();
 *  */
    @Test
    public void testFilterBeanProps_ThrowNullPointerException_5() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        PropertyName _name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_name", _name);
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.filterBeanProps(BeanDeserializerFactory.java:643) */
        beanDeserializerFactory.filterBeanProps(null, null, null, arrayList, linkedHashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean isConcrete = !beanDesc.getType().isAbstract();
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:476) */
        beanDeserializerFactory.addBeanProps(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder#getValueInstantiator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.getValueInstantiator().getFromObjectArguments(ctxt.getConfig())
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:478) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean isConcrete = !beanDesc.getType().isAbstract();
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:476) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonIgnoreProperties.Value ignorals = ctxt.getConfig().getDefaultPropertyIgnorals(beanDesc.getBeanClass(), beanDesc.getClassInfo());
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_5() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:478) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.getValueInstantiator().getFromObjectArguments(ctxt.getConfig())
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:478) */
        beanDeserializerFactory.addBeanProps(null, basicBeanDescription, beanDeserializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addBeanProps(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.executesCondition {@code (isConcrete): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.getValueInstantiator().getFromObjectArguments(ctxt.getConfig())
 *  */
    @Test
    public void testAddBeanProps_ThrowNullPointerException_4() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:478) */
        beanDeserializerFactory.addBeanProps(impl, basicBeanDescription, beanDeserializerBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    @Test
    public void testAddBeanProps1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        BeanDeserializerBuilder beanDeserializerBuilder = new BeanDeserializerBuilder(null, null);
        JsonLocationInstantiator _valueInstantiator = new JsonLocationInstantiator();
        beanDeserializerBuilder._valueInstantiator = _valueInstantiator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultPropertyIgnorals(MapperConfigBase.java:536)
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultPropertyIgnorals(MapperConfigBase.java:555)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:487) */
        beanDeserializerFactory.addBeanProps(impl, basicBeanDescription, beanDeserializerBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addInjectables(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addInjectables(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 *  */
    @Test
    public void testAddInjectables() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addInjectables(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 *  */
    @Test
    public void testAddInjectables_1() throws Exception  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        beanDeserializerFactory.addInjectables(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addInjectables(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerFactory#addInjectables(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findInjectables()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Map<Object, AnnotatedMember> raw = beanDesc.findInjectables();
 *  */
    @Test
    public void testAddInjectables_ThrowNullPointerException() throws JsonMappingException  {
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addInjectables(BeanDeserializerFactory.java:702) */
        beanDeserializerFactory.addInjectables(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1084578388332299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1084578388332299.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1084578388338000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084578388332299.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084578388338000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1084578388664100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084578388664100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084578388666100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084578388664100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084578388666100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1084578391926300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084578391926300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084578391928700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084578391926300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084578391928700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

