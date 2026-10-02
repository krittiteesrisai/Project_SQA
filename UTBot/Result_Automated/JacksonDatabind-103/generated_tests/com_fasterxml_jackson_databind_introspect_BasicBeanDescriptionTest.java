package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.JavaType;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators;
import java.util.ArrayList;
import java.util.Map;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.TwoAnnotations;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector.NoAnnotations;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Set;
import java.util.LinkedHashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_introspect_BasicBeanDescriptionTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forSerialization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forSerialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forSerialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)}
 * @utbot.returnsFrom {@code return new BasicBeanDescription(coll);}
 *  */
    @Test
    public void testForSerialization_Return() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_type", _type);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        BasicBeanDescription actual = BasicBeanDescription.forSerialization(pOJOPropertiesCollector);
        
        BasicBeanDescription expected = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", pOJOPropertiesCollector);
        setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        setField(expected, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        POJOPropertiesCollector expected_propCollector = expected._propCollector;
        POJOPropertiesCollector actual_propCollector = actual._propCollector;
        MapperConfig expected_propCollector_config = expected_propCollector._config;
        MapperConfig actual_propCollector_config = actual_propCollector._config;
        LinkedNode actual_propCollector_config_problemHandlers = ((LinkedNode) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_problemHandlers"));
        assertNull(actual_propCollector_config_problemHandlers);
        
        JsonNodeFactory actual_propCollector_config_nodeFactory = ((JsonNodeFactory) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory"));
        assertNull(actual_propCollector_config_nodeFactory);
        
        int expected_propCollector_config_deserFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        int actual_propCollector_config_deserFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        assertEquals(expected_propCollector_config_deserFeatures, actual_propCollector_config_deserFeatures);
        
        int expected_propCollector_config_parserFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        int actual_propCollector_config_parserFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        assertEquals(expected_propCollector_config_parserFeatures, actual_propCollector_config_parserFeatures);
        
        int expected_propCollector_config_parserFeaturesToChange = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        int actual_propCollector_config_parserFeaturesToChange = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        assertEquals(expected_propCollector_config_parserFeaturesToChange, actual_propCollector_config_parserFeaturesToChange);
        
        int expected_propCollector_config_formatReadFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        int actual_propCollector_config_formatReadFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        assertEquals(expected_propCollector_config_formatReadFeatures, actual_propCollector_config_formatReadFeatures);
        
        int expected_propCollector_config_formatReadFeaturesToChange = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        int actual_propCollector_config_formatReadFeaturesToChange = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        assertEquals(expected_propCollector_config_formatReadFeaturesToChange, actual_propCollector_config_formatReadFeaturesToChange);
        
        SimpleMixInResolver actual_propCollector_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
        assertNull(actual_propCollector_config_mixIns);
        
        SubtypeResolver actual_propCollector_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_propCollector_config_subtypeResolver);
        
        PropertyName actual_propCollector_config_rootName = ((PropertyName) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_propCollector_config_rootName);
        
        Class actual_propCollector_config_view = ((Class) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_propCollector_config_view);
        
        ContextAttributes actual_propCollector_config_attributes = ((ContextAttributes) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_propCollector_config_attributes);
        
        RootNameLookup actual_propCollector_config_rootNames = ((RootNameLookup) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
        assertNull(actual_propCollector_config_rootNames);
        
        ConfigOverrides actual_propCollector_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        assertNull(actual_propCollector_config_configOverrides);
        
        int expected_propCollector_config_mapperFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_propCollector_config_mapperFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_propCollector_config_mapperFeatures, actual_propCollector_config_mapperFeatures);
        
        BaseSettings expected_propCollector_config_base = ((BaseSettings) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        BaseSettings actual_propCollector_config_base = ((BaseSettings) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        ClassIntrospector actual_propCollector_config_base_classIntrospector = ((ClassIntrospector) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector"));
        assertNull(actual_propCollector_config_base_classIntrospector);
        
        AnnotationIntrospector actual_propCollector_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        assertNull(actual_propCollector_config_base_annotationIntrospector);
        
        PropertyNamingStrategy actual_propCollector_config_base_propertyNamingStrategy = ((PropertyNamingStrategy) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_propertyNamingStrategy"));
        assertNull(actual_propCollector_config_base_propertyNamingStrategy);
        
        TypeFactory actual_propCollector_config_base_typeFactory = ((TypeFactory) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory"));
        assertNull(actual_propCollector_config_base_typeFactory);
        
        TypeResolverBuilder actual_propCollector_config_base_typeResolverBuilder = ((TypeResolverBuilder) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeResolverBuilder"));
        assertNull(actual_propCollector_config_base_typeResolverBuilder);
        
        DateFormat actual_propCollector_config_base_dateFormat = ((DateFormat) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat"));
        assertNull(actual_propCollector_config_base_dateFormat);
        
        HandlerInstantiator actual_propCollector_config_base_handlerInstantiator = ((HandlerInstantiator) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_handlerInstantiator"));
        assertNull(actual_propCollector_config_base_handlerInstantiator);
        
        Locale actual_propCollector_config_base_locale = ((Locale) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_locale"));
        assertNull(actual_propCollector_config_base_locale);
        
        TimeZone actual_propCollector_config_base_timeZone = ((TimeZone) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_timeZone"));
        assertNull(actual_propCollector_config_base_timeZone);
        
        Base64Variant actual_propCollector_config_base_defaultBase64 = ((Base64Variant) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_defaultBase64"));
        assertNull(actual_propCollector_config_base_defaultBase64);
        
        boolean actual_propCollector_forSerialization = actual_propCollector._forSerialization;
        assertFalse(actual_propCollector_forSerialization);
        
        boolean actual_propCollector_stdBeanNaming = actual_propCollector._stdBeanNaming;
        assertFalse(actual_propCollector_stdBeanNaming);
        
        JavaType expected_propCollector_type = expected_propCollector._type;
        JavaType actual_propCollector_type = actual_propCollector._type;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_propCollector_type, actual_propCollector_type);
        
        AnnotatedClass actual_propCollector_classDef = actual_propCollector._classDef;
        assertNull(actual_propCollector_classDef);
        
        VisibilityChecker actual_propCollector_visibilityChecker = actual_propCollector._visibilityChecker;
        assertNull(actual_propCollector_visibilityChecker);
        
        AnnotationIntrospector expected_propCollector_annotationIntrospector = expected_propCollector._annotationIntrospector;
        AnnotationIntrospector actual_propCollector_annotationIntrospector = actual_propCollector._annotationIntrospector;
        
        boolean actual_propCollector_useAnnotations = actual_propCollector._useAnnotations;
        assertFalse(actual_propCollector_useAnnotations);
        
        String actual_propCollector_mutatorPrefix = actual_propCollector._mutatorPrefix;
        assertNull(actual_propCollector_mutatorPrefix);
        
        boolean actual_propCollector_collected = actual_propCollector._collected;
        assertFalse(actual_propCollector_collected);
        
        LinkedHashMap actual_propCollector_properties = actual_propCollector._properties;
        assertNull(actual_propCollector_properties);
        
        LinkedList actual_propCollector_creatorProperties = actual_propCollector._creatorProperties;
        assertNull(actual_propCollector_creatorProperties);
        
        LinkedList actual_propCollector_anyGetters = actual_propCollector._anyGetters;
        assertNull(actual_propCollector_anyGetters);
        
        LinkedList actual_propCollector_anySetters = actual_propCollector._anySetters;
        assertNull(actual_propCollector_anySetters);
        
        LinkedList actual_propCollector_anySetterField = actual_propCollector._anySetterField;
        assertNull(actual_propCollector_anySetterField);
        
        LinkedList actual_propCollector_jsonValueAccessors = actual_propCollector._jsonValueAccessors;
        assertNull(actual_propCollector_jsonValueAccessors);
        
        HashSet actual_propCollector_ignoredPropertyNames = actual_propCollector._ignoredPropertyNames;
        assertNull(actual_propCollector_ignoredPropertyNames);
        
        LinkedHashMap actual_propCollector_injectables = actual_propCollector._injectables;
        assertNull(actual_propCollector_injectables);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        AnnotatedClass actual_classInfo = actual._classInfo;
        assertNull(actual_classInfo);
        
        java.lang.Class[] actual_defaultViews = actual._defaultViews;
        assertNull(actual_defaultViews);
        
        boolean actual_defaultViewsResolved = actual._defaultViewsResolved;
        assertFalse(actual_defaultViewsResolved);
        
        List actual_properties = actual._properties;
        assertNull(actual_properties);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method forSerialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forSerialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)}
     */
    @Test
    public void testForSerializationThrowsNPE() {
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forSerialization] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.<init>(BasicBeanDescription.java:130)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forSerialization(BasicBeanDescription.java:147) */
        BasicBeanDescription.forSerialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.addProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addProperty(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#addProperty(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition#getFullName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: hasProperty(def.getFullName())
 *  */
    @Test
    public void testAddProperty_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.addProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.addProperty(BasicBeanDescription.java:198) */
        basicBeanDescription.addProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getConstructors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstructors()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getConstructors()}
 * @utbot.returnsFrom {@code return _classInfo.getConstructors();}
 *  */
    @Test
    public void testGetConstructors_Return_classInfoGetConstructors() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        List actual = basicBeanDescription.getConstructors();
        
        assertNull(actual);
        
        List finalBasicBeanDescription_classInfo_creatorsConstructors = basicBeanDescription._classInfo._creators.constructors;
        
        assertNull(finalBasicBeanDescription_classInfo_creatorsConstructors);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getConstructors()}
 * @utbot.returnsFrom {@code return _classInfo.getConstructors();}
 *  */
    @Test
    public void testGetConstructors_Return_classInfoGetConstructors_1() throws Exception  {
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        AnnotatedClass.Creators prevNO_CREATORS = ((AnnotatedClass.Creators) getStaticFieldValue(annotatedClassClazz, "NO_CREATORS"));
        try {
            AnnotatedClass.Creators noCreators = new AnnotatedClass.Creators(null, null, null);
            setStaticField(annotatedClassClazz, "NO_CREATORS", noCreators);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            AnnotatedClass.Creators initialBasicBeanDescription_classInfo_creators = basicBeanDescription._classInfo._creators;
            
            List actual = basicBeanDescription.getConstructors();
            
            assertNull(actual);
            
            AnnotatedClass.Creators finalBasicBeanDescription_classInfo_creators = basicBeanDescription._classInfo._creators;
            
            assertFalse(initialBasicBeanDescription_classInfo_creators == finalBasicBeanDescription_classInfo_creators);
        } finally {
            setStaticField(AnnotatedClass.class, "NO_CREATORS", prevNO_CREATORS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConstructors()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getConstructors()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getConstructors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classInfo.getConstructors();
 *  */
    @Test
    public void testGetConstructors_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getConstructors] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getConstructors(BasicBeanDescription.java:341) */
        basicBeanDescription.getConstructors();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findFactoryMethod
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findFactoryMethod([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findFactoryMethod(java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getFactoryMethods()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedMethod am: _classInfo.getFactoryMethods())
 *  */
    @Test
    public void testFindFactoryMethod_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findFactoryMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findFactoryMethod(BasicBeanDescription.java:577) */
        basicBeanDescription.findFactoryMethod(null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findFactoryMethod(java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getFactoryMethods()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedMethod am: _classInfo.getFactoryMethods())
 *  */
    @Test
    public void testFindFactoryMethod_ThrowNullPointerException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findFactoryMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findFactoryMethod(BasicBeanDescription.java:577) */
        basicBeanDescription.findFactoryMethod(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDefaultConstructor()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultConstructor()}
 * @utbot.returnsFrom {@code return _classInfo.getDefaultConstructor();}
 *  */
    @Test
    public void testFindDefaultConstructor_Return_classInfoGetDefaultConstructor() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        AnnotatedConstructor actual = basicBeanDescription.findDefaultConstructor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultConstructor()}
 * @utbot.returnsFrom {@code return _classInfo.getDefaultConstructor();}
 *  */
    @Test
    public void testFindDefaultConstructor_Return_classInfoGetDefaultConstructor_1() throws Exception  {
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        AnnotatedClass.Creators prevNO_CREATORS = ((AnnotatedClass.Creators) getStaticFieldValue(annotatedClassClazz, "NO_CREATORS"));
        try {
            AnnotatedClass.Creators noCreators = new AnnotatedClass.Creators(null, null, null);
            setStaticField(annotatedClassClazz, "NO_CREATORS", noCreators);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            AnnotatedClass.Creators initialBasicBeanDescription_classInfo_creators = basicBeanDescription._classInfo._creators;
            
            AnnotatedConstructor actual = basicBeanDescription.findDefaultConstructor();
            
            assertNull(actual);
            
            AnnotatedClass.Creators finalBasicBeanDescription_classInfo_creators = basicBeanDescription._classInfo._creators;
            
            assertFalse(initialBasicBeanDescription_classInfo_creators == finalBasicBeanDescription_classInfo_creators);
        } finally {
            setStaticField(AnnotatedClass.class, "NO_CREATORS", prevNO_CREATORS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findDefaultConstructor()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultConstructor()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classInfo.getDefaultConstructor();
 *  */
    @Test
    public void testFindDefaultConstructor_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultConstructor(BasicBeanDescription.java:292) */
        basicBeanDescription.findDefaultConstructor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _properties()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_properties()}
 * @utbot.executesCondition {@code (_properties == null): False}
 * @utbot.returnsFrom {@code return _properties;}
 *  */
    @Test
    public void test_properties__propertiesNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        ArrayList actual = ((ArrayList) basicBeanDescription._properties());
        
        assertTrue(deepEquals(_properties, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _properties()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_properties()}
 * @utbot.executesCondition {@code (_properties == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _properties = _propCollector.getProperties();
 *  */
    @Test
    public void test_properties_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164) */
        basicBeanDescription._properties();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method instantiateBean(boolean)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#instantiateBean(boolean)}
 * @utbot.executesCondition {@code (ac == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testInstantiateBean_AcEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        Object actual = basicBeanDescription.instantiateBean(false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method instantiateBean(boolean)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#instantiateBean(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedConstructor ac = _classInfo.getDefaultConstructor();
 *  */
    @Test
    public void testInstantiateBean_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:346) */
        basicBeanDescription.instantiateBean(false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#instantiateBean(boolean)}
 * @utbot.executesCondition {@code (ac == null): False}
 * @utbot.executesCondition {@code (fixAccess): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ac.fixAccess(_config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
 *  */
    @Test
    public void testInstantiateBean_ThrowNullPointerException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        AnnotatedConstructor defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_creators, "com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators", "defaultConstructor", defaultConstructor);
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:351) */
        basicBeanDescription.instantiateBean(true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method instantiateBean(boolean)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#instantiateBean(boolean)}
 * @utbot.executesCondition {@code (ac == null): False}
 * @utbot.executesCondition {@code (fixAccess): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getDefaultConstructor()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedConstructor#getAnnotated()}
 * @utbot.invokes {@link java.lang.reflect.Constructor#newInstance(java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfError(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotated()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getMessage()
 *  */
    @Test(expected = NullPointerException.class)
    public void testInstantiateBean_ThrowNullPointerException_2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        AnnotatedConstructor defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_creators, "com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators", "defaultConstructor", defaultConstructor);
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        basicBeanDescription.instantiateBean(false);
    }
    ///endregion
    
    ///region Errors report for instantiateBean
    
    public void testInstantiateBean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getClassInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassInfo()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getClassInfo()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetClassInfo_Return() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        AnnotatedClass actual = basicBeanDescription.getClassInfo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forDeserialization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forDeserialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forDeserialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)}
 * @utbot.returnsFrom {@code return new BasicBeanDescription(coll);}
 *  */
    @Test
    public void testForDeserialization_Return() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_type", _type);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        BasicBeanDescription actual = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector);
        
        BasicBeanDescription expected = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", pOJOPropertiesCollector);
        setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        setField(expected, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        POJOPropertiesCollector expected_propCollector = expected._propCollector;
        POJOPropertiesCollector actual_propCollector = actual._propCollector;
        MapperConfig expected_propCollector_config = expected_propCollector._config;
        MapperConfig actual_propCollector_config = actual_propCollector._config;
        LinkedNode actual_propCollector_config_problemHandlers = ((LinkedNode) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_problemHandlers"));
        assertNull(actual_propCollector_config_problemHandlers);
        
        JsonNodeFactory actual_propCollector_config_nodeFactory = ((JsonNodeFactory) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory"));
        assertNull(actual_propCollector_config_nodeFactory);
        
        int expected_propCollector_config_deserFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        int actual_propCollector_config_deserFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        assertEquals(expected_propCollector_config_deserFeatures, actual_propCollector_config_deserFeatures);
        
        int expected_propCollector_config_parserFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        int actual_propCollector_config_parserFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        assertEquals(expected_propCollector_config_parserFeatures, actual_propCollector_config_parserFeatures);
        
        int expected_propCollector_config_parserFeaturesToChange = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        int actual_propCollector_config_parserFeaturesToChange = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        assertEquals(expected_propCollector_config_parserFeaturesToChange, actual_propCollector_config_parserFeaturesToChange);
        
        int expected_propCollector_config_formatReadFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        int actual_propCollector_config_formatReadFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        assertEquals(expected_propCollector_config_formatReadFeatures, actual_propCollector_config_formatReadFeatures);
        
        int expected_propCollector_config_formatReadFeaturesToChange = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        int actual_propCollector_config_formatReadFeaturesToChange = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        assertEquals(expected_propCollector_config_formatReadFeaturesToChange, actual_propCollector_config_formatReadFeaturesToChange);
        
        SimpleMixInResolver actual_propCollector_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
        assertNull(actual_propCollector_config_mixIns);
        
        SubtypeResolver actual_propCollector_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_propCollector_config_subtypeResolver);
        
        PropertyName actual_propCollector_config_rootName = ((PropertyName) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_propCollector_config_rootName);
        
        Class actual_propCollector_config_view = ((Class) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_propCollector_config_view);
        
        ContextAttributes actual_propCollector_config_attributes = ((ContextAttributes) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_propCollector_config_attributes);
        
        RootNameLookup actual_propCollector_config_rootNames = ((RootNameLookup) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
        assertNull(actual_propCollector_config_rootNames);
        
        ConfigOverrides actual_propCollector_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        assertNull(actual_propCollector_config_configOverrides);
        
        int expected_propCollector_config_mapperFeatures = ((Integer) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_propCollector_config_mapperFeatures = ((Integer) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_propCollector_config_mapperFeatures, actual_propCollector_config_mapperFeatures);
        
        BaseSettings expected_propCollector_config_base = ((BaseSettings) getFieldValue(expected_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        BaseSettings actual_propCollector_config_base = ((BaseSettings) getFieldValue(actual_propCollector_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        ClassIntrospector actual_propCollector_config_base_classIntrospector = ((ClassIntrospector) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector"));
        assertNull(actual_propCollector_config_base_classIntrospector);
        
        AnnotationIntrospector actual_propCollector_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        assertNull(actual_propCollector_config_base_annotationIntrospector);
        
        PropertyNamingStrategy actual_propCollector_config_base_propertyNamingStrategy = ((PropertyNamingStrategy) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_propertyNamingStrategy"));
        assertNull(actual_propCollector_config_base_propertyNamingStrategy);
        
        TypeFactory actual_propCollector_config_base_typeFactory = ((TypeFactory) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory"));
        assertNull(actual_propCollector_config_base_typeFactory);
        
        TypeResolverBuilder actual_propCollector_config_base_typeResolverBuilder = ((TypeResolverBuilder) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeResolverBuilder"));
        assertNull(actual_propCollector_config_base_typeResolverBuilder);
        
        DateFormat actual_propCollector_config_base_dateFormat = ((DateFormat) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat"));
        assertNull(actual_propCollector_config_base_dateFormat);
        
        HandlerInstantiator actual_propCollector_config_base_handlerInstantiator = ((HandlerInstantiator) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_handlerInstantiator"));
        assertNull(actual_propCollector_config_base_handlerInstantiator);
        
        Locale actual_propCollector_config_base_locale = ((Locale) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_locale"));
        assertNull(actual_propCollector_config_base_locale);
        
        TimeZone actual_propCollector_config_base_timeZone = ((TimeZone) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_timeZone"));
        assertNull(actual_propCollector_config_base_timeZone);
        
        Base64Variant actual_propCollector_config_base_defaultBase64 = ((Base64Variant) getFieldValue(actual_propCollector_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_defaultBase64"));
        assertNull(actual_propCollector_config_base_defaultBase64);
        
        boolean actual_propCollector_forSerialization = actual_propCollector._forSerialization;
        assertFalse(actual_propCollector_forSerialization);
        
        boolean actual_propCollector_stdBeanNaming = actual_propCollector._stdBeanNaming;
        assertFalse(actual_propCollector_stdBeanNaming);
        
        JavaType expected_propCollector_type = expected_propCollector._type;
        JavaType actual_propCollector_type = actual_propCollector._type;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_propCollector_type, actual_propCollector_type);
        
        AnnotatedClass actual_propCollector_classDef = actual_propCollector._classDef;
        assertNull(actual_propCollector_classDef);
        
        VisibilityChecker actual_propCollector_visibilityChecker = actual_propCollector._visibilityChecker;
        assertNull(actual_propCollector_visibilityChecker);
        
        AnnotationIntrospector expected_propCollector_annotationIntrospector = expected_propCollector._annotationIntrospector;
        AnnotationIntrospector actual_propCollector_annotationIntrospector = actual_propCollector._annotationIntrospector;
        
        boolean actual_propCollector_useAnnotations = actual_propCollector._useAnnotations;
        assertFalse(actual_propCollector_useAnnotations);
        
        String actual_propCollector_mutatorPrefix = actual_propCollector._mutatorPrefix;
        assertNull(actual_propCollector_mutatorPrefix);
        
        boolean actual_propCollector_collected = actual_propCollector._collected;
        assertFalse(actual_propCollector_collected);
        
        LinkedHashMap actual_propCollector_properties = actual_propCollector._properties;
        assertNull(actual_propCollector_properties);
        
        LinkedList actual_propCollector_creatorProperties = actual_propCollector._creatorProperties;
        assertNull(actual_propCollector_creatorProperties);
        
        LinkedList actual_propCollector_anyGetters = actual_propCollector._anyGetters;
        assertNull(actual_propCollector_anyGetters);
        
        LinkedList actual_propCollector_anySetters = actual_propCollector._anySetters;
        assertNull(actual_propCollector_anySetters);
        
        LinkedList actual_propCollector_anySetterField = actual_propCollector._anySetterField;
        assertNull(actual_propCollector_anySetterField);
        
        LinkedList actual_propCollector_jsonValueAccessors = actual_propCollector._jsonValueAccessors;
        assertNull(actual_propCollector_jsonValueAccessors);
        
        HashSet actual_propCollector_ignoredPropertyNames = actual_propCollector._ignoredPropertyNames;
        assertNull(actual_propCollector_ignoredPropertyNames);
        
        LinkedHashMap actual_propCollector_injectables = actual_propCollector._injectables;
        assertNull(actual_propCollector_injectables);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        assertTrue(deepEquals(expected_config, actual_config));
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        AnnotatedClass actual_classInfo = actual._classInfo;
        assertNull(actual_classInfo);
        
        java.lang.Class[] actual_defaultViews = actual._defaultViews;
        assertNull(actual_defaultViews);
        
        boolean actual_defaultViewsResolved = actual._defaultViewsResolved;
        assertFalse(actual_defaultViewsResolved);
        
        List actual_properties = actual._properties;
        assertNull(actual_properties);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method forDeserialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forDeserialization(com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)}
     */
    @Test
    public void testForDeserializationThrowsNPE() {
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forDeserialization] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.<init>(BasicBeanDescription.java:130)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forDeserialization(BasicBeanDescription.java:139) */
        BasicBeanDescription.forDeserialization(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findProperties()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findProperties()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_properties()}
 * @utbot.returnsFrom {@code return _properties();}
 *  */
    @Test
    public void testFindProperties_BasicBeanDescription_properties() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        ArrayList actual = ((ArrayList) basicBeanDescription.findProperties());
        
        assertTrue(deepEquals(_properties, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findInjectables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findInjectables()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findInjectables()}
 * @utbot.executesCondition {@code (_propCollector != null): False}
 * @utbot.invokes {@link java.util.Collections#emptyMap()}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testFindInjectables__propCollectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Map actual = basicBeanDescription.findInjectables();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findInjectables()}
 * @utbot.executesCondition {@code (_propCollector != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getInjectables()}
 * @utbot.returnsFrom {@code return _propCollector.getInjectables();}
 *  */
    @Test
    public void testFindInjectables__propCollectorNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        Map actual = basicBeanDescription.findInjectables();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMethod(java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findMethod(java.lang.String,java.lang.Class[])}
 * @utbot.returnsFrom {@code return _classInfo.findMethod(name, paramTypes);}
 *  */
    @Test
    public void testFindMethod_Return_classInfoFindMethod() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        _classInfo._memberMethods = _memberMethods;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        AnnotatedMethod actual = basicBeanDescription.findMethod(null, null);
        
        assertNull(actual);
        
        Map finalBasicBeanDescription_classInfo_memberMethods_methods = basicBeanDescription._classInfo._memberMethods._methods;
        
        assertNull(finalBasicBeanDescription_classInfo_memberMethods_methods);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findMethod(java.lang.String,java.lang.Class[])}
 * @utbot.returnsFrom {@code return _classInfo.findMethod(name, paramTypes);}
 *  */
    @Test
    public void testFindMethod_Return_classInfoFindMethod_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        AnnotatedMethodMap initialBasicBeanDescription_classInfo_memberMethods = basicBeanDescription._classInfo._memberMethods;
        
        AnnotatedMethod actual = basicBeanDescription.findMethod(null, null);
        
        assertNull(actual);
        
        AnnotatedMethodMap finalBasicBeanDescription_classInfo_memberMethods = basicBeanDescription._classInfo._memberMethods;
        
        assertFalse(initialBasicBeanDescription_classInfo_memberMethods == finalBasicBeanDescription_classInfo_memberMethods);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findMethod(java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findMethod(java.lang.String,java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#findMethod(java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classInfo.findMethod(name, paramTypes);
 *  */
    @Test
    public void testFindMethod_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMethod(java.lang.String, [Ljava.lang.Class;)
    
    @Test
    public void testFindMethod1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _methods.put(null, annotatedMethod);
        setField(_memberMethods, "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "_methods", _methods);
        _classInfo._memberMethods = _memberMethods;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        AnnotatedMethod actual = basicBeanDescription.findMethod(string, classArray);
        
        assertNull(actual);
        
        Class finalClassArray0 = classArray[0];
        Class finalClassArray1 = classArray[1];
        Class finalClassArray2 = classArray[2];
        Class finalClassArray3 = classArray[3];
        Class finalClassArray4 = classArray[4];
        Class finalClassArray5 = classArray[5];
        Class finalClassArray6 = classArray[6];
        Class finalClassArray7 = classArray[7];
        Class finalClassArray8 = classArray[8];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray1);
        
        assertNull(finalClassArray2);
        
        assertNull(finalClassArray3);
        
        assertNull(finalClassArray4);
        
        assertNull(finalClassArray5);
        
        assertNull(finalClassArray6);
        
        assertNull(finalClassArray7);
        
        assertNull(finalClassArray8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMethod(java.lang.String, [Ljava.lang.Class;)
    
    @Test
    public void testFindMethod2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(null, classArray);
    }
    
    @Test
    public void testFindMethod3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        java.lang.Class[] classArray = {null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.isAnnotationBundle(AnnotationIntrospectorPair.java:95)
            com.fasterxml.jackson.databind.introspect.CollectorBase.collectAnnotations(CollectorBase.java:29)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector._addMemberMethods(AnnotatedMethodCollector.java:118)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:42)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(null, classArray);
    }
    
    @Test
    public void testFindMethod4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.isAnnotationBundle(JacksonAnnotationIntrospector.java:159)
            com.fasterxml.jackson.databind.introspect.CollectorBase.collectAnnotations(CollectorBase.java:29)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector._addMemberMethods(AnnotatedMethodCollector.java:118)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:42)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(string, classArray);
    }
    
    @Test
    public void testFindMethod5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(null, classArray);
    }
    
    @Test
    public void testFindMethod6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        Class _primaryMixIn = Object.class;
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(string, classArray);
    }
    
    @Test
    public void testFindMethod7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(string, classArray);
    }
    
    @Test
    public void testFindMethod8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        ArrayList _superTypes = new ArrayList();
        _superTypes.add(null);
        _superTypes.add(null);
        _superTypes.add(null);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:48)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.findMethod(AnnotatedClass.java:313)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findMethod(BasicBeanDescription.java:376) */
        basicBeanDescription.findMethod(string, classArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getObjectIdInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObjectIdInfo()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getObjectIdInfo()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetObjectIdInfo_Return() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        ObjectIdInfo actual = basicBeanDescription.getObjectIdInfo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty
    
    ///region OTHER: ERROR SUITE for method removeProperty(java.lang.String)
    
    @Test
    public void testRemoveProperty1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 512);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty(BasicBeanDescription.java:184) */
        basicBeanDescription.removeProperty(string);
    }
    
    @Test
    public void testRemoveProperty2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty(BasicBeanDescription.java:184) */
        basicBeanDescription.removeProperty(null);
    }
    
    @Test
    public void testRemoveProperty3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        _properties.put(null, null);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty(BasicBeanDescription.java:187) */
        basicBeanDescription.removeProperty(string);
    }
    
    @Test
    public void testRemoveProperty4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        _properties.add(null);
        _properties.add(null);
        _properties.add(null);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty(BasicBeanDescription.java:187) */
        basicBeanDescription.removeProperty(null);
    }
    
    @Test
    public void testRemoveProperty5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapType _type = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.removeProperty(BasicBeanDescription.java:184) */
        basicBeanDescription.removeProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.resolveType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveType(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#resolveType(java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (jdkType == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testResolveType_JdkTypeEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        JavaType actual = basicBeanDescription.resolveType(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#resolveType(java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (jdkType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _config.getTypeFactory().constructType(jdkType, _type.getBindings());}
 *  */
    @Test
    public void testResolveType_JdkTypeNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        Class basicBeanDescriptionClazz = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class arrayTypeType = Class.forName("java.lang.reflect.Type");
        Method resolveTypeMethod = basicBeanDescriptionClazz.getDeclaredMethod("resolveType", arrayTypeType);
        resolveTypeMethod.setAccessible(true);
        java.lang.Object[] resolveTypeMethodArguments = new java.lang.Object[1];
        resolveTypeMethodArguments[0] = arrayType;
        ArrayType actual = ((ArrayType) resolveTypeMethod.invoke(basicBeanDescription, resolveTypeMethodArguments));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveType(java.lang.reflect.Type)
    
    @Test
    public void testResolveType1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) basicBeanDescription.resolveType(class1));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region Errors report for resolveType
    
    public void testResolveType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forOtherUse(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.introspect.AnnotatedClass)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forOtherUse(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 *  */
    @Test
    public void testForOtherUse() throws Exception  {
        BasicBeanDescription actual = BasicBeanDescription.forOtherUse(null, null, null);
        
        BasicBeanDescription expected = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        List _properties = new ArrayList();
        expected._properties = _properties;
        
        POJOPropertiesCollector actual_propCollector = actual._propCollector;
        assertNull(actual_propCollector);
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        AnnotatedClass actual_classInfo = actual._classInfo;
        assertNull(actual_classInfo);
        
        java.lang.Class[] actual_defaultViews = actual._defaultViews;
        assertNull(actual_defaultViews);
        
        boolean actual_defaultViewsResolved = actual._defaultViewsResolved;
        assertFalse(actual_defaultViewsResolved);
        
        List expected_properties = expected._properties;
        List actual_properties = actual._properties;
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        assertNull(actual_type);
        
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forOtherUse(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 *  */
    @Test
    public void testForOtherUse_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -252);
            
            BasicBeanDescription actual = BasicBeanDescription.forOtherUse(deserializationConfig, null, null);
            
            BasicBeanDescription expected = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", deserializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", instance);
            List _properties = new ArrayList();
            expected._properties = _properties;
            
            POJOPropertiesCollector actual_propCollector = actual._propCollector;
            assertNull(actual_propCollector);
            
            MapperConfig expected_config = expected._config;
            MapperConfig actual_config = actual._config;
            LinkedNode actual_config_problemHandlers = ((LinkedNode) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_problemHandlers"));
            assertNull(actual_config_problemHandlers);
            
            JsonNodeFactory actual_config_nodeFactory = ((JsonNodeFactory) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory"));
            assertNull(actual_config_nodeFactory);
            
            int expected_config_deserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
            int actual_config_deserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
            assertEquals(expected_config_deserFeatures, actual_config_deserFeatures);
            
            int expected_config_parserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
            int actual_config_parserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
            assertEquals(expected_config_parserFeatures, actual_config_parserFeatures);
            
            int expected_config_parserFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
            int actual_config_parserFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
            assertEquals(expected_config_parserFeaturesToChange, actual_config_parserFeaturesToChange);
            
            int expected_config_formatReadFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
            int actual_config_formatReadFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
            assertEquals(expected_config_formatReadFeatures, actual_config_formatReadFeatures);
            
            int expected_config_formatReadFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
            int actual_config_formatReadFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
            assertEquals(expected_config_formatReadFeaturesToChange, actual_config_formatReadFeaturesToChange);
            
            SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
            assertNull(actual_config_mixIns);
            
            SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
            assertNull(actual_config_subtypeResolver);
            
            PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
            assertNull(actual_config_rootName);
            
            Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            assertNull(actual_config_view);
            
            ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
            assertNull(actual_config_attributes);
            
            RootNameLookup actual_config_rootNames = ((RootNameLookup) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
            assertNull(actual_config_rootNames);
            
            ConfigOverrides actual_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
            assertNull(actual_config_configOverrides);
            
            int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
            int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
            assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
            
            BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
            assertNull(actual_config_base);
            
            AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
            AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
            
            AnnotatedClass actual_classInfo = actual._classInfo;
            assertNull(actual_classInfo);
            
            java.lang.Class[] actual_defaultViews = actual._defaultViews;
            assertNull(actual_defaultViews);
            
            boolean actual_defaultViewsResolved = actual._defaultViewsResolved;
            assertFalse(actual_defaultViewsResolved);
            
            List expected_properties = expected._properties;
            List actual_properties = actual._properties;
            assertTrue(deepEquals(expected_properties, actual_properties));
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
            assertNull(actual_type);
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#forOtherUse(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 *  */
    @Test
    public void testForOtherUse_1() throws Exception  {
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        BasicBeanDescription actual = BasicBeanDescription.forOtherUse(deserializationConfig, null, null);
        
        BasicBeanDescription expected = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", deserializationConfig);
        setField(expected, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        List _properties = new ArrayList();
        expected._properties = _properties;
        
        POJOPropertiesCollector actual_propCollector = actual._propCollector;
        assertNull(actual_propCollector);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        LinkedNode actual_config_problemHandlers = ((LinkedNode) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_problemHandlers"));
        assertNull(actual_config_problemHandlers);
        
        JsonNodeFactory actual_config_nodeFactory = ((JsonNodeFactory) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory"));
        assertNull(actual_config_nodeFactory);
        
        int expected_config_deserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        int actual_config_deserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        assertEquals(expected_config_deserFeatures, actual_config_deserFeatures);
        
        int expected_config_parserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        int actual_config_parserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        assertEquals(expected_config_parserFeatures, actual_config_parserFeatures);
        
        int expected_config_parserFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        int actual_config_parserFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        assertEquals(expected_config_parserFeaturesToChange, actual_config_parserFeaturesToChange);
        
        int expected_config_formatReadFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        int actual_config_formatReadFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        assertEquals(expected_config_formatReadFeatures, actual_config_formatReadFeatures);
        
        int expected_config_formatReadFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        int actual_config_formatReadFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        assertEquals(expected_config_formatReadFeaturesToChange, actual_config_formatReadFeaturesToChange);
        
        SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
        assertNull(actual_config_mixIns);
        
        SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_config_subtypeResolver);
        
        PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_config_rootName);
        
        Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_config_view);
        
        ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_config_attributes);
        
        RootNameLookup actual_config_rootNames = ((RootNameLookup) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
        assertNull(actual_config_rootNames);
        
        ConfigOverrides actual_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        assertNull(actual_config_configOverrides);
        
        int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
        
        BaseSettings expected_config_base = ((BaseSettings) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        ClassIntrospector actual_config_base_classIntrospector = ((ClassIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector"));
        assertNull(actual_config_base_classIntrospector);
        
        AnnotationIntrospector expected_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(expected_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        AnnotationIntrospector actual_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        LRUMap actual_config_base_annotationIntrospector_annotationsInside = ((LRUMap) getFieldValue(actual_config_base_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_annotationsInside"));
        assertNull(actual_config_base_annotationIntrospector_annotationsInside);
        
        boolean actual_config_base_annotationIntrospector_cfgConstructorPropertiesImpliesCreator = ((Boolean) getFieldValue(actual_config_base_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_cfgConstructorPropertiesImpliesCreator"));
        assertFalse(actual_config_base_annotationIntrospector_cfgConstructorPropertiesImpliesCreator);
        
        PropertyNamingStrategy actual_config_base_propertyNamingStrategy = ((PropertyNamingStrategy) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_propertyNamingStrategy"));
        assertNull(actual_config_base_propertyNamingStrategy);
        
        TypeFactory actual_config_base_typeFactory = ((TypeFactory) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory"));
        assertNull(actual_config_base_typeFactory);
        
        TypeResolverBuilder actual_config_base_typeResolverBuilder = ((TypeResolverBuilder) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeResolverBuilder"));
        assertNull(actual_config_base_typeResolverBuilder);
        
        DateFormat actual_config_base_dateFormat = ((DateFormat) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat"));
        assertNull(actual_config_base_dateFormat);
        
        HandlerInstantiator actual_config_base_handlerInstantiator = ((HandlerInstantiator) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_handlerInstantiator"));
        assertNull(actual_config_base_handlerInstantiator);
        
        Locale actual_config_base_locale = ((Locale) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_locale"));
        assertNull(actual_config_base_locale);
        
        TimeZone actual_config_base_timeZone = ((TimeZone) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_timeZone"));
        assertNull(actual_config_base_timeZone);
        
        Base64Variant actual_config_base_defaultBase64 = ((Base64Variant) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_defaultBase64"));
        assertNull(actual_config_base_defaultBase64);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertTrue(deepEquals(expected_annotationIntrospector, actual_annotationIntrospector));
        assertTrue(deepEquals(expected_annotationIntrospector, actual_annotationIntrospector));
        
        AnnotatedClass actual_classInfo = actual._classInfo;
        assertNull(actual_classInfo);
        
        java.lang.Class[] actual_defaultViews = actual._defaultViews;
        assertNull(actual_defaultViews);
        
        boolean actual_defaultViewsResolved = actual._defaultViewsResolved;
        assertFalse(actual_defaultViewsResolved);
        
        List expected_properties = expected._properties;
        List actual_properties = actual._properties;
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        assertNull(actual_type);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription._createConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _createConverter(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_createConverter(java.lang.Object)}
 * @utbot.executesCondition {@code (converterDef == null): True}
 *  */
    @Test
    public void test_createConverter_ConverterDefEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Converter actual = basicBeanDescription._createConverter(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_createConverter(java.lang.Object)}
 * @utbot.executesCondition {@code (converterDef == null): False}
 * @utbot.executesCondition {@code (converterDef instanceof Converter<?, ?>): True}
 * @utbot.returnsFrom {@code return (Converter<Object, Object>) converterDef;}
 *  */
    @Test
    public void test_createConverter_ConverterDefInstanceOfConverter() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object javaUtilCollectionsConverter = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        
        Object actual = basicBeanDescription._createConverter(javaUtilCollectionsConverter);
        
        JavaType actual_inputType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType"));
        assertNull(actual_inputType);
        
        int javaUtilCollectionsConverter_kind = ((Integer) getFieldValue(javaUtilCollectionsConverter, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        int actual_kind = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        assertEquals(javaUtilCollectionsConverter_kind, actual_kind);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _createConverter(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_createConverter(java.lang.Object)}
 * @utbot.executesCondition {@code (!(converterDef instanceof Class)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: converterDef.getClass().getName()
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_createConverter_ThrowIllegalStateException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        byte[] byteArray = {};
        
        basicBeanDescription._createConverter(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_createConverter(java.lang.Object)}
 * @utbot.executesCondition {@code (!(converterDef instanceof Class)): False}
 * @utbot.executesCondition {@code (converterClass): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return null;
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_createConverter_ThrowIllegalStateException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Class class1 = Object.class;
        
        basicBeanDescription._createConverter(class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findBackReferences()
    
    @Test
    public void testFindBackReferences1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        List actual = basicBeanDescription.findBackReferences();
        
        assertNull(actual);
    }
    
    @Test
    public void testFindBackReferences2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(string, pOJOPropertyBuilder);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        List actual = basicBeanDescription.findBackReferences();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findBackReferences()
    
    @Test
    public void testFindBackReferences3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 512);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        _properties.add(null);
        _properties.add(null);
        _properties.add(null);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:490) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences9() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(string, pOJOPropertyBuilder);
        String string1 = "";
        _properties.put(string1, null);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:490) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences10() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    
    @Test
    public void testFindBackReferences11() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489) */
        basicBeanDescription.findBackReferences();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFactoryMethods()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getFactoryMethods()}
 * @utbot.executesCondition {@code (candidates.isEmpty()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getFactoryMethods()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return candidates;}
 *  */
    @Test
    public void testGetFactoryMethods_CandidatesIsEmpty() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        ArrayList creatorMethods = new ArrayList();
        setField(_creators, "com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators", "creatorMethods", creatorMethods);
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        ArrayList actual = ((ArrayList) basicBeanDescription.getFactoryMethods());
        
        assertTrue(deepEquals(creatorMethods, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFactoryMethods()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getFactoryMethods()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getFactoryMethods()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<AnnotatedMethod> candidates = _classInfo.getFactoryMethods();
 *  */
    @Test
    public void testGetFactoryMethods_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods(BasicBeanDescription.java:534) */
        basicBeanDescription.getFactoryMethods();
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getFactoryMethods()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getFactoryMethods()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: candidates.isEmpty()
 *  */
    @Test
    public void testGetFactoryMethods_ThrowNullPointerException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods(BasicBeanDescription.java:535) */
        basicBeanDescription.getFactoryMethods();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFactoryMethods()
    
    @Test
    public void testGetFactoryMethods1() throws Exception  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            JavaType javaType = basicBeanDescription._classInfo._type;
            Class initialBasicBeanDescription_classInfo_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            AnnotatedClass.Creators initialBasicBeanDescription_classInfo_creators = basicBeanDescription._classInfo._creators;
            
            List actual = basicBeanDescription.getFactoryMethods();
            
            List expected = new ArrayList();
            
            assertTrue(deepEquals(expected, actual));
            
            JavaType javaType1 = basicBeanDescription._classInfo._type;
            Class finalBasicBeanDescription_classInfo_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            AnnotatedClass.Creators finalBasicBeanDescription_classInfo_creators = basicBeanDescription._classInfo._creators;
            
            assertFalse(initialBasicBeanDescription_classInfo_type_class == finalBasicBeanDescription_classInfo_type_class);
            
            assertFalse(initialBasicBeanDescription_classInfo_creators == finalBasicBeanDescription_classInfo_creators);
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFactoryMethods()
    
    @Test
    public void testGetFactoryMethods2() throws Exception  {
        Class annotatedClassClazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        AnnotatedClass.Creators prevNO_CREATORS = ((AnnotatedClass.Creators) getStaticFieldValue(annotatedClassClazz, "NO_CREATORS"));
        try {
            AnnotatedClass.Creators noCreators = new AnnotatedClass.Creators(null, null, null);
            setStaticField(annotatedClassClazz, "NO_CREATORS", noCreators);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods(BasicBeanDescription.java:535) */
            basicBeanDescription.getFactoryMethods();
        } finally {
            setStaticField(AnnotatedClass.class, "NO_CREATORS", prevNO_CREATORS);
        }
    }
    
    @Test
    public void testGetFactoryMethods3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        ArrayList creatorMethods = new ArrayList();
        creatorMethods.add(null);
        creatorMethods.add(null);
        creatorMethods.add(null);
        setField(_creators, "com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators", "creatorMethods", creatorMethods);
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.isFactoryMethod(BasicBeanDescription.java:597)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getFactoryMethods(BasicBeanDescription.java:540) */
        basicBeanDescription.getFactoryMethods();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findAnyGetter()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findAnyGetter()}
 * @utbot.executesCondition {@code ((_propCollector == null)): True}
 * @utbot.returnsFrom {@code return anyGetter;}
 *  */
    @Test
    public void testFindAnyGetter__propCollectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        AnnotatedMember actual = basicBeanDescription.findAnyGetter();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findAnyGetter()}
 * @utbot.executesCondition {@code ((_propCollector == null)): False}
 * @utbot.returnsFrom {@code return anyGetter;}
 *  */
    @Test
    public void testFindAnyGetter__propCollectorNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMember actual = basicBeanDescription.findAnyGetter();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findAnyGetter()}
 * @utbot.executesCondition {@code ((_propCollector == null)): False}
 * @utbot.returnsFrom {@code return anyGetter;}
 *  */
    @Test
    public void testFindAnyGetter__propCollectorNotEqualsNull_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _anyGetters = new LinkedList();
        _anyGetters.add(null);
        _propCollector._anyGetters = _anyGetters;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMember actual = basicBeanDescription.findAnyGetter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findAnyGetter()
    
    @Test
    public void testFindAnyGetter1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _anyGetters = new LinkedList();
        _propCollector._anyGetters = _anyGetters;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.getFirst(LinkedList.java:248)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:221)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 512);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:380)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter9() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    
    @Test
    public void testFindAnyGetter10() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:380)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter(POJOPropertiesCollector.java:214)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnyGetter(BasicBeanDescription.java:471) */
        basicBeanDescription.findAnyGetter();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findAnyGetter()
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindAnyGetter11() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _anyGetters = new LinkedList();
        _anyGetters.add(null);
        _anyGetters.add(null);
        _anyGetters.add(null);
        _propCollector._anyGetters = _anyGetters;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        basicBeanDescription.findAnyGetter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDefaultViews()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultViews()}
 * @utbot.executesCondition {@code (!_defaultViewsResolved): False}
 * @utbot.returnsFrom {@code return _defaultViews;}
 *  */
    @Test
    public void testFindDefaultViews__defaultViewsResolved() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        basicBeanDescription._defaultViewsResolved = true;
        
        java.lang.Class[] actual = basicBeanDescription.findDefaultViews();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultViews()}
 * @utbot.executesCondition {@code (!_defaultViewsResolved): True}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.executesCondition {@code (def == null): True}
 * @utbot.returnsFrom {@code return _defaultViews;}
 *  */
    @Test
    public void testFindDefaultViews_DefEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        
        java.lang.Class[] actual = basicBeanDescription.findDefaultViews();
        
        assertNull(actual);
        
        boolean finalBasicBeanDescription_defaultViewsResolved = basicBeanDescription._defaultViewsResolved;
        
        assertTrue(finalBasicBeanDescription_defaultViewsResolved);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultViews()}
 * @utbot.executesCondition {@code (!_defaultViewsResolved): True}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.executesCondition {@code (def == null): True}
 *  */
    @Test
    public void testFindDefaultViews_DefEqualsNull_1() throws Exception  {
        Class basicBeanDescriptionClazz = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        java.lang.Class[] prevNO_VIEWS = ((java.lang.Class[]) getStaticFieldValue(basicBeanDescriptionClazz, "NO_VIEWS"));
        try {
            java.lang.Class[] noViews = {};
            setStaticField(basicBeanDescriptionClazz, "NO_VIEWS", noViews);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
            
            java.lang.Class[] initialBasicBeanDescription_defaultViews = basicBeanDescription._defaultViews;
            
            java.lang.Class[] actual = basicBeanDescription.findDefaultViews();
            
            int noViewsSize = noViews.length;
            assertEquals(noViewsSize, actual.length);
            assertTrue(deepEquals(noViews, actual));
            
            java.lang.Class[] finalBasicBeanDescription_defaultViews = basicBeanDescription._defaultViews;
            boolean finalBasicBeanDescription_defaultViewsResolved = basicBeanDescription._defaultViewsResolved;
            
            assertFalse(initialBasicBeanDescription_defaultViews == finalBasicBeanDescription_defaultViews);
            
            assertTrue(finalBasicBeanDescription_defaultViewsResolved);
        } finally {
            setStaticField(BasicBeanDescription.class, "NO_VIEWS", prevNO_VIEWS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findDefaultViews()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultViews()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)
 *  */
    @Test
    public void testFindDefaultViews_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews(BasicBeanDescription.java:420) */
        basicBeanDescription.findDefaultViews();
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDefaultViews()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findViews(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)
 *  */
    @Test
    public void testFindDefaultViews_ThrowNullPointerException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews(BasicBeanDescription.java:420) */
        basicBeanDescription.findDefaultViews();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findDefaultViews()
    
    @Test(expected = StackOverflowError.class)
    public void testFindDefaultViews1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDefaultViews();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDefaultViews2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDefaultViews();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDefaultViews3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDefaultViews();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDefaultViews4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDefaultViews();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDefaultViews5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDefaultViews();
    }
    
    @Test
    public void testFindDefaultViews6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:419)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:419)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews(BasicBeanDescription.java:417) */
        basicBeanDescription.findDefaultViews();
    }
    
    @Test
    public void testFindDefaultViews7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        JacksonAnnotationIntrospector _primary10 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
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
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1336)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findViews(JacksonAnnotationIntrospector.java:480)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:417)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findViews(AnnotationIntrospectorPair.java:419)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDefaultViews(BasicBeanDescription.java:417) */
        basicBeanDescription.findDefaultViews();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findExpectedFormat
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value v = _config.getDefaultPropertyFormat(_classInfo.getRawType());
 *  */
    @Test
    public void testFindExpectedFormat_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findExpectedFormat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findExpectedFormat(BasicBeanDescription.java:400) */
        basicBeanDescription.findExpectedFormat(null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getRawType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getDefaultPropertyFormat(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value v = _config.getDefaultPropertyFormat(_classInfo.getRawType());
 *  */
    @Test
    public void testFindExpectedFormat_ThrowNullPointerException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findExpectedFormat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findExpectedFormat(BasicBeanDescription.java:400) */
        basicBeanDescription.findExpectedFormat(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)
    
    @Test
    public void testFindExpectedFormat1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", class1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        
        Class initialBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
        
        JsonFormat.Value actual = basicBeanDescription.findExpectedFormat(value);
        
        JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(expected, actual);
        
        Class finalBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
        
        assertFalse(initialBasicBeanDescription_classInfo_class == finalBasicBeanDescription_classInfo_class);
    }
    
    @Test
    public void testFindExpectedFormat2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        
        JsonFormat.Value actual = basicBeanDescription.findExpectedFormat(value);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(value, actual);
    }
    
    @Test
    public void testFindExpectedFormat3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", class1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        JsonFormat.Value value = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        
        Class initialBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
        
        JsonFormat.Value actual = basicBeanDescription.findExpectedFormat(value);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(value, actual);
        
        Class finalBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
        
        assertFalse(initialBasicBeanDescription_classInfo_class == finalBasicBeanDescription_classInfo_class);
    }
    
    @Test
    public void testFindExpectedFormat4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", class1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        Class initialBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
        
        JsonFormat.Value actual = basicBeanDescription.findExpectedFormat(null);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(_format, actual);
        
        Class finalBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
        
        assertFalse(initialBasicBeanDescription_classInfo_class == finalBasicBeanDescription_classInfo_class);
    }
    
    @Test
    public void testFindExpectedFormat5() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY1 = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            JsonFormat.Features empty1 = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty1);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config);
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            Class _class = Object.class;
            setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            Class initialBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
            
            JsonFormat.Value actual = basicBeanDescription.findExpectedFormat(null);
            
            JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
            
            // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
            assertEquals(expected, actual);
            
            MapperConfig mapperConfig = basicBeanDescription._config;
            ConfigOverrides mapperConfig_config_configOverrides = ((ConfigOverrides) getFieldValue(mapperConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
            Map finalBasicBeanDescription_config_configOverrides_overrides = ((Map) getFieldValue(mapperConfig_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
            Class finalBasicBeanDescription_classInfo_class = basicBeanDescription._classInfo._class;
            
            assertFalse(initialBasicBeanDescription_classInfo_class == finalBasicBeanDescription_classInfo_class);
            
            assertNull(finalBasicBeanDescription_config_configOverrides_overrides);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY1);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)
    
    @Test(expected = StackOverflowError.class)
    public void testFindExpectedFormat6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findExpectedFormat(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPOJOBuilder()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findPOJOBuilder()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.returnsFrom {@code return (_annotationIntrospector == null) ? null : _annotationIntrospector.findPOJOBuilder(_classInfo);}
 *  */
    @Test
    public void testFindPOJOBuilder__annotationIntrospectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Class actual = basicBeanDescription.findPOJOBuilder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findPOJOBuilder()
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilder1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilder();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilder2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilder();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilder3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary1);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilder();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilder4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        NopAnnotationIntrospector _primary11 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary8);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilder();
    }
    
    @Test
    public void testFindPOJOBuilder5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:732)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder(BasicBeanDescription.java:653) */
        basicBeanDescription.findPOJOBuilder();
    }
    
    @Test
    public void testFindPOJOBuilder6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary15 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary16 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary16, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary17 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary17);
        setField(_primary16, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary16);
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1336)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilder(JacksonAnnotationIntrospector.java:1216)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:732)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:732)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder(BasicBeanDescription.java:653) */
        basicBeanDescription.findPOJOBuilder();
    }
    
    @Test
    public void testFindPOJOBuilder7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary15 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary16 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary17 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary18 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary19 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary18, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary19);
        setField(_primary17, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary18);
        setField(_primary16, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary17);
        setField(_primary15, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary16);
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1336)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findPOJOBuilder(JacksonAnnotationIntrospector.java:1216)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:732)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilder(AnnotationIntrospectorPair.java:731)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilder(BasicBeanDescription.java:653) */
        basicBeanDescription.findPOJOBuilder();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.isFactoryMethod
    
    ///region Errors report for isFactoryMethod
    
    public void testIsFactoryMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field name is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getClassAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getClassAnnotations()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotations()}
 * @utbot.returnsFrom {@code return _classInfo.getAnnotations();}
 *  */
    @Test
    public void testGetClassAnnotations_AnnotatedClassGetAnnotations() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        Annotations actual = basicBeanDescription.getClassAnnotations();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getClassAnnotations()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classInfo.getAnnotations();
 *  */
    @Test
    public void testGetClassAnnotations_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getClassAnnotations(BasicBeanDescription.java:272) */
        basicBeanDescription.getClassAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findJsonValueAccessor()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueAccessor()}
 * @utbot.executesCondition {@code ((_propCollector == null)): True}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueAccessor();}
 *  */
    @Test
    public void testFindJsonValueAccessor__propCollectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        AnnotatedMember actual = basicBeanDescription.findJsonValueAccessor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueAccessor()}
 * @utbot.executesCondition {@code ((_propCollector == null)): False}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueAccessor();}
 *  */
    @Test
    public void testFindJsonValueAccessor__propCollectorNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMember actual = basicBeanDescription.findJsonValueAccessor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueAccessor()}
 * @utbot.executesCondition {@code ((_propCollector == null)): False}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueAccessor();}
 *  */
    @Test
    public void testFindJsonValueAccessor__propCollectorNotEqualsNull_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _jsonValueAccessors = new LinkedList();
        _jsonValueAccessors.add(null);
        _propCollector._jsonValueAccessors = _jsonValueAccessors;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMember actual = basicBeanDescription.findJsonValueAccessor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findJsonValueAccessor()
    
    @Test
    public void testFindJsonValueAccessor1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _jsonValueAccessors = new LinkedList();
        _propCollector._jsonValueAccessors = _jsonValueAccessors;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.IndexOutOfBoundsException: Index: 0, Size: 0]
            java.base/java.util.LinkedList.checkElementIndex(LinkedList.java:559)
            java.base/java.util.LinkedList.get(LinkedList.java:480)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:206)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 512);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:380)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor9() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _referencedType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_type, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    
    @Test
    public void testFindJsonValueAccessor10() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:196)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueAccessor(BasicBeanDescription.java:252) */
        basicBeanDescription.findJsonValueAccessor();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findJsonValueAccessor()
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindJsonValueAccessor11() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _jsonValueAccessors = new LinkedList();
        _jsonValueAccessors.add(null);
        _jsonValueAccessors.add(null);
        _jsonValueAccessors.add(null);
        _propCollector._jsonValueAccessors = _jsonValueAccessors;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        basicBeanDescription.findJsonValueAccessor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.hasKnownClassAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasKnownClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#hasKnownClassAnnotations()}
 * @utbot.returnsFrom {@code return _classInfo.hasAnnotations();}
 *  */
    @Test
    public void testHasKnownClassAnnotations_Return_classInfoHasAnnotations_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationCollector.TwoAnnotations _classAnnotations = ((AnnotationCollector.TwoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        boolean actual = basicBeanDescription.hasKnownClassAnnotations();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#hasKnownClassAnnotations()}
 * @utbot.returnsFrom {@code return _classInfo.hasAnnotations();}
 *  */
    @Test
    public void testHasKnownClassAnnotations_Return_classInfoHasAnnotations_2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationCollector.OneAnnotation _classAnnotations = ((AnnotationCollector.OneAnnotation) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        boolean actual = basicBeanDescription.hasKnownClassAnnotations();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#hasKnownClassAnnotations()}
 * @utbot.returnsFrom {@code return _classInfo.hasAnnotations();}
 *  */
    @Test
    public void testHasKnownClassAnnotations_Return_classInfoHasAnnotations_3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationCollector.NoAnnotations _classAnnotations = ((AnnotationCollector.NoAnnotations) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        boolean actual = basicBeanDescription.hasKnownClassAnnotations();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#hasKnownClassAnnotations()}
 * @utbot.returnsFrom {@code return _classInfo.hasAnnotations();}
 *  */
    @Test
    public void testHasKnownClassAnnotations_Return_classInfoHasAnnotations() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        boolean actual = basicBeanDescription.hasKnownClassAnnotations();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasKnownClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#hasKnownClassAnnotations()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#hasAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classInfo.hasAnnotations();
 *  */
    @Test
    public void testHasKnownClassAnnotations_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.hasKnownClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.hasKnownClassAnnotations(BasicBeanDescription.java:267) */
        basicBeanDescription.hasKnownClassAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.bindingsForBeanType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bindingsForBeanType()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#bindingsForBeanType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.returnsFrom {@code return _type.getBindings();}
 *  */
    @Test
    public void testBindingsForBeanType_JavaTypeGetBindings() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        TypeBindings actual = basicBeanDescription.bindingsForBeanType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bindingsForBeanType()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#bindingsForBeanType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _type.getBindings();
 *  */
    @Test
    public void testBindingsForBeanType_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.bindingsForBeanType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.bindingsForBeanType(BasicBeanDescription.java:278) */
        basicBeanDescription.bindingsForBeanType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPOJOBuilderConfig()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findPOJOBuilderConfig()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.returnsFrom {@code return (_annotationIntrospector == null) ? null : _annotationIntrospector.findPOJOBuilderConfig(_classInfo);}
 *  */
    @Test
    public void testFindPOJOBuilderConfig__annotationIntrospectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value actual = basicBeanDescription.findPOJOBuilderConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findPOJOBuilderConfig()
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilderConfig1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilderConfig2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilderConfig3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        NopAnnotationIntrospector _primary11 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary8);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPOJOBuilderConfig4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary15 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary13);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test
    public void testFindPOJOBuilderConfig5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:738)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:738)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig(BasicBeanDescription.java:660) */
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test
    public void testFindPOJOBuilderConfig6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:738)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig(BasicBeanDescription.java:660) */
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test
    public void testFindPOJOBuilderConfig7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:738)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPOJOBuilderConfig(AnnotationIntrospectorPair.java:737)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig(BasicBeanDescription.java:660) */
        basicBeanDescription.findPOJOBuilderConfig();
    }
    
    @Test
    public void testFindPOJOBuilderConfig8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary15 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary16 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary17 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary18 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary19 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary20 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary19, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary20);
        setField(_primary18, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary19);
        setField(_primary17, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary18);
        setField(_primary16, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary17);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary16);
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPOJOBuilderConfig] produces [java.lang.NullPointerException] */
        basicBeanDescription.findPOJOBuilderConfig();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findBackReferenceProperties()
    
    @Test
    public void testFindBackReferenceProperties1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        Map actual = basicBeanDescription.findBackReferenceProperties();
        
        assertNull(actual);
    }
    
    @Test
    public void testFindBackReferenceProperties2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(null, pOJOPropertyBuilder);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        Map actual = basicBeanDescription.findBackReferenceProperties();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findBackReferenceProperties()
    
    @Test
    public void testFindBackReferenceProperties3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(null, pOJOPropertyBuilder);
        String string = "";
        Object object = createInstance("java.lang.Object");
        _properties.put(string, object);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @784e262f)]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 512);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:379)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.isNonStaticInnerClass(AnnotatedClass.java:331)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:312)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties9() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        _properties.add(null);
        _properties.add(null);
        _properties.add(null);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:490)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties10() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(string, pOJOPropertyBuilder);
        String string1 = "";
        _properties.put(string1, null);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:490)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties11() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    
    @Test
    public void testFindBackReferenceProperties12() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapLikeType _type = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(AnnotatedMethodCollector.java:45)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(AnnotatedMethodCollector.java:33)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._methods(AnnotatedClass.java:365)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:305)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:525)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:309)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferences(BasicBeanDescription.java:489)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findBackReferenceProperties(BasicBeanDescription.java:513) */
        basicBeanDescription.findBackReferenceProperties();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializationConverter()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findDeserializationConverter()}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializationConverter__annotationIntrospectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Converter actual = basicBeanDescription.findDeserializationConverter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findDeserializationConverter()
    
    @Test
    public void testFindDeserializationConverter1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        Converter actual = basicBeanDescription.findDeserializationConverter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findDeserializationConverter()
    
    @Test(expected = StackOverflowError.class)
    public void testFindDeserializationConverter2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDeserializationConverter3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDeserializationConverter4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDeserializationConverter5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDeserializationConverter6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindDeserializationConverter7() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test
    public void testFindDeserializationConverter8() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:680)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:680)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter(BasicBeanDescription.java:669) */
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test
    public void testFindDeserializationConverter9() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:680)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter(BasicBeanDescription.java:669) */
        basicBeanDescription.findDeserializationConverter();
    }
    
    @Test
    public void testFindDeserializationConverter10() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:680)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:679)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:680)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findDeserializationConverter(BasicBeanDescription.java:669) */
        basicBeanDescription.findDeserializationConverter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _findPropertyFields(java.util.Collection, boolean)
    
    @Test
    public void test_findPropertyFields1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        LinkedHashMap actual = basicBeanDescription._findPropertyFields(null, false);
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void test_findPropertyFields2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(string, pOJOPropertyBuilder);
        _properties.put(string, pOJOPropertyBuilder);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        LinkedHashMap actual = basicBeanDescription._findPropertyFields(null, false);
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findPropertyFields(java.util.Collection, boolean)
    
    @Test
    public void test_findPropertyFields3() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(null, pOJOPropertyBuilder);
        String string = "";
        _properties.put(string, basicBeanDescription);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.introspect.BasicBeanDescription cannot be cast to class com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition (com.fasterxml.jackson.databind.introspect.BasicBeanDescription and com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @784e262f)]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields(BasicBeanDescription.java:701) */
        basicBeanDescription._findPropertyFields(null, false);
    }
    
    @Test
    public void test_findPropertyFields4() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:376)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:287)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:170)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._properties(BasicBeanDescription.java:164)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields(BasicBeanDescription.java:701) */
        basicBeanDescription._findPropertyFields(null, false);
    }
    
    @Test
    public void test_findPropertyFields5() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        _properties.add(null);
        _properties.add(null);
        _properties.add(null);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields(BasicBeanDescription.java:702) */
        basicBeanDescription._findPropertyFields(null, false);
    }
    
    @Test
    public void test_findPropertyFields6() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        _properties.put(string, pOJOPropertyBuilder);
        String string1 = "";
        _properties.put(string1, null);
        _propCollector._properties = _properties;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findPropertyFields(BasicBeanDescription.java:702) */
        basicBeanDescription._findPropertyFields(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findClassDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findClassDescription()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findClassDescription()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.returnsFrom {@code return (_annotationIntrospector == null) ? null : _annotationIntrospector.findClassDescription(_classInfo);}
 *  */
    @Test
    public void testFindClassDescription__annotationIntrospectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        String actual = basicBeanDescription.findClassDescription();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findClassDescription()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findClassDescription(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return (_annotationIntrospector == null) ? null : _annotationIntrospector.findClassDescription(_classInfo);}
 *  */
    @Test
    public void testFindClassDescription__annotationIntrospectorNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        String actual = basicBeanDescription.findClassDescription();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findClassDescription()
    
    @Test(expected = StackOverflowError.class)
    public void testFindClassDescription1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findClassDescription();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindClassDescription2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        basicBeanDescription.findClassDescription();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findCreatorPropertyName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findCreatorPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#_findCreatorPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNameForDeserialization(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyName name = _annotationIntrospector.findNameForDeserialization(param);
 *  */
    @Test
    public void test_findCreatorPropertyName_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findCreatorPropertyName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription._findCreatorPropertyName(BasicBeanDescription.java:634) */
        basicBeanDescription._findCreatorPropertyName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSerializationConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializationConverter()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findSerializationConverter()}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializationConverter__annotationIntrospectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Converter actual = basicBeanDescription.findSerializationConverter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSingleArgConstructor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSingleArgConstructor([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findSingleArgConstructor(java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getConstructors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedConstructor ac: _classInfo.getConstructors())
 *  */
    @Test
    public void testFindSingleArgConstructor_ThrowNullPointerException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSingleArgConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSingleArgConstructor(BasicBeanDescription.java:556) */
        basicBeanDescription.findSingleArgConstructor(null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findSingleArgConstructor(java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#getConstructors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedConstructor ac: _classInfo.getConstructors())
 *  */
    @Test
    public void testFindSingleArgConstructor_ThrowNullPointerException_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedClass.Creators _creators = ((AnnotatedClass.Creators) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators"));
        _classInfo._creators = _creators;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSingleArgConstructor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSingleArgConstructor(BasicBeanDescription.java:556) */
        basicBeanDescription.findSingleArgConstructor(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findAnySetterAccessor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findAnySetterAccessor()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findAnySetterAccessor()}
 * @utbot.executesCondition {@code (_propCollector != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindAnySetterAccessor__propCollectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        AnnotatedMember actual = basicBeanDescription.findAnySetterAccessor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findAnySetterAccessor()}
 * @utbot.executesCondition {@code (_propCollector != null): True}
 * @utbot.executesCondition {@code (anyMethod != null): False}
 * @utbot.executesCondition {@code (anyField != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnySetterMethod()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnySetterField()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindAnySetterAccessor_AnyFieldEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMember actual = basicBeanDescription.findAnySetterAccessor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.getIgnoredPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoredPropertyNames()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getIgnoredPropertyNames()}
 * @utbot.executesCondition {@code ((_propCollector == null)): True}
 * @utbot.executesCondition {@code (ign == null): True}
 * @utbot.invokes {@link java.util.Collections#emptySet()}
 * @utbot.returnsFrom {@code return Collections.emptySet();}
 *  */
    @Test
    public void testGetIgnoredPropertyNames_IgnEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Set actual = basicBeanDescription.getIgnoredPropertyNames();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#getIgnoredPropertyNames()}
 * @utbot.executesCondition {@code ((_propCollector == null)): False}
 * @utbot.executesCondition {@code (ign == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getIgnoredPropertyNames()}
 * @utbot.returnsFrom {@code return ign;}
 *  */
    @Test
    public void testGetIgnoredPropertyNames_IgnNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        HashSet _ignoredPropertyNames = new HashSet();
        _propCollector._ignoredPropertyNames = _ignoredPropertyNames;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        HashSet actual = ((HashSet) basicBeanDescription.getIgnoredPropertyNames());
        
        assertTrue(deepEquals(_ignoredPropertyNames, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findPropertyInclusion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value)}
 * @utbot.executesCondition {@code (_annotationIntrospector != null): False}
 * @utbot.returnsFrom {@code return defValue;}
 *  */
    @Test
    public void testFindPropertyInclusion__annotationIntrospectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        com.fasterxml.jackson.annotation.JsonInclude.Value actual = basicBeanDescription.findPropertyInclusion(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value)}
 * @utbot.executesCondition {@code (_annotationIntrospector != null): True}
 * @utbot.executesCondition {@code ((defValue == null)): True}
 * @utbot.returnsFrom {@code return (defValue == null) ? incl : defValue.withOverrides(incl);}
 *  */
    @Test
    public void testFindPropertyInclusion_DefValueEqualsNull() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
            NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
            setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            com.fasterxml.jackson.annotation.JsonInclude.Value actual = basicBeanDescription.findPropertyInclusion(null);
            
            // com.fasterxml.jackson.annotation.JsonInclude.Value has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value)}
 * @utbot.executesCondition {@code (_annotationIntrospector != null): True}
 * @utbot.executesCondition {@code ((defValue == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonInclude.Value#withOverrides(com.fasterxml.jackson.annotation.JsonInclude.Value)}
 * @utbot.returnsFrom {@code return (defValue == null) ? incl : defValue.withOverrides(incl);}
 *  */
    @Test
    public void testFindPropertyInclusion_DefValueNotEqualsNull() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
            NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
            NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
            com.fasterxml.jackson.annotation.JsonInclude.Value value = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            
            com.fasterxml.jackson.annotation.JsonInclude.Value actual = basicBeanDescription.findPropertyInclusion(value);
            
            // com.fasterxml.jackson.annotation.JsonInclude.Value has overridden equals method
            assertEquals(value, actual);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findJsonValueMethod()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueMethod()}
 * @utbot.executesCondition {@code ((_propCollector == null)): True}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueMethod();}
 *  */
    @Test
    public void testFindJsonValueMethod__propCollectorEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        AnnotatedMethod actual = basicBeanDescription.findJsonValueMethod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findJsonValueMethod()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code ((_propCollector == null)): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getJsonValueMethod()} twice
    /// return from: {@code return (_propCollector == null) ? null : _propCollector.getJsonValueMethod();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueMethod()}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueMethod();}
 *  */
    @Test
    public void testFindJsonValueMethod_Return_propCollectorNotEqualsNull() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMethod actual = basicBeanDescription.findJsonValueMethod();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueMethod()}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueMethod();}
 *  */
    @Test
    public void testFindJsonValueMethod_Return_propCollectorNotEqualsNull_1() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _jsonValueAccessors = new LinkedList();
        _jsonValueAccessors.add(null);
        _propCollector._jsonValueAccessors = _jsonValueAccessors;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMethod actual = basicBeanDescription.findJsonValueMethod();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueMethod()}
 * @utbot.returnsFrom {@code return (_propCollector == null) ? null : _propCollector.getJsonValueMethod();}
 *  */
    @Test
    public void testFindJsonValueMethod_Return_propCollectorNotEqualsNull_2() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _jsonValueAccessors = new LinkedList();
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _jsonValueAccessors.add(annotatedMethod);
        _propCollector._jsonValueAccessors = _jsonValueAccessors;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        AnnotatedMethod actual = basicBeanDescription.findJsonValueMethod();
        
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(annotatedMethod, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findJsonValueMethod()
    
    /**
    @utbot.classUnderTest {@link BasicBeanDescription}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.BasicBeanDescription#findJsonValueMethod()}
 * @utbot.executesCondition {@code ((_propCollector == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getJsonValueMethod()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFindJsonValueMethod_ThrowIndexOutOfBoundsException() throws Exception  {
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        _propCollector._collected = true;
        LinkedList _jsonValueAccessors = new LinkedList();
        _propCollector._jsonValueAccessors = _jsonValueAccessors;
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueMethod] produces [java.lang.IndexOutOfBoundsException: Index: 0, Size: 0]
            java.base/java.util.LinkedList.checkElementIndex(LinkedList.java:559)
            java.base/java.util.LinkedList.get(LinkedList.java:480)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueAccessor(POJOPropertiesCollector.java:206)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueMethod(POJOPropertiesCollector.java:183)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueMethod(BasicBeanDescription.java:246) */
        basicBeanDescription.findJsonValueMethod();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1091950297552299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1091950297552299.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1091950297557700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091950297552299.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091950297557700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091950297928400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091950297928400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091950297929200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091950297928400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091950297929200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1091950301588800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091950301588800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091950301591200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091950301588800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091950301591200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091950302129700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091950302129700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091950302131400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091950302129700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091950302131400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

