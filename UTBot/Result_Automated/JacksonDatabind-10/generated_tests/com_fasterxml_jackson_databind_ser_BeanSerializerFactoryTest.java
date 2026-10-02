package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import java.util.Set;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.core.Base64Variant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_ser_BeanSerializerFactoryTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.createSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#createSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SerializationConfig config = prov.getConfig();
 *  */
    @Test
    public void testCreateSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.createSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.createSerializer(BeanSerializerFactory.java:132) */
        beanSerializerFactory.createSerializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#createSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription beanDesc = config.introspect(origType);
 *  */
    @Test
    public void testCreateSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.createSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.createSerializer(BeanSerializerFactory.java:133) */
        beanSerializerFactory.createSerializer(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.withConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)}
 * @utbot.executesCondition {@code (_factoryConfig == config): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithConfig__factoryConfigEqualsConfig() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withConfig(null));
        
        SerializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
        assertNull(actual_factoryConfig);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)}
 * @utbot.executesCondition {@code (_factoryConfig == config): False}
 * @utbot.executesCondition {@code (getClass()): False}
 * @utbot.returnsFrom {@code return new BeanSerializerFactory(config);}
 *  */
    @Test
    public void testWithConfig_NotGetClass_1() throws Exception  {
        Class serializerFactoryConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        com.fasterxml.jackson.databind.ser.Serializers[] prevNO_SERIALIZERS = ((com.fasterxml.jackson.databind.ser.Serializers[]) getStaticFieldValue(serializerFactoryConfigClazz, "NO_SERIALIZERS"));
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] prevNO_MODIFIERS = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getStaticFieldValue(serializerFactoryConfigClazz, "NO_MODIFIERS"));
        try {
            com.fasterxml.jackson.databind.ser.Serializers[] noSerializers = {};
            setStaticField(serializerFactoryConfigClazz, "NO_SERIALIZERS", noSerializers);
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] noModifiers = {};
            setStaticField(serializerFactoryConfigClazz, "NO_MODIFIERS", noModifiers);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
            
            BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withConfig(null));
            
            BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", noSerializers);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", noSerializers);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", noModifiers);
            setField(expected, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig1);
            
            SerializerFactoryConfig expected_factoryConfig = expected._factoryConfig;
            SerializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
            com.fasterxml.jackson.databind.ser.Serializers[] expected_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(expected_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
            com.fasterxml.jackson.databind.ser.Serializers[] actual_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(actual_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
            int expected_factoryConfig_additionalSerializersSize = expected_factoryConfig_additionalSerializers.length;
            assertEquals(expected_factoryConfig_additionalSerializersSize, actual_factoryConfig_additionalSerializers.length);
            assertTrue(deepEquals(expected_factoryConfig_additionalSerializers, actual_factoryConfig_additionalSerializers));
            
            com.fasterxml.jackson.databind.ser.Serializers[] expected_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(expected_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
            com.fasterxml.jackson.databind.ser.Serializers[] actual_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(actual_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
            int expected_factoryConfig_additionalKeySerializersSize = expected_factoryConfig_additionalKeySerializers.length;
            assertEquals(expected_factoryConfig_additionalKeySerializersSize, actual_factoryConfig_additionalKeySerializers.length);
            assertTrue(deepEquals(expected_factoryConfig_additionalKeySerializers, actual_factoryConfig_additionalKeySerializers));
            
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] expected_factoryConfig_modifiers = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getFieldValue(expected_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers"));
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] actual_factoryConfig_modifiers = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getFieldValue(actual_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers"));
            int expected_factoryConfig_modifiersSize = expected_factoryConfig_modifiers.length;
            assertEquals(expected_factoryConfig_modifiersSize, actual_factoryConfig_modifiers.length);
            assertTrue(deepEquals(expected_factoryConfig_modifiers, actual_factoryConfig_modifiers));
            
        } finally {
            setStaticField(SerializerFactoryConfig.class, "NO_SERIALIZERS", prevNO_SERIALIZERS);
            setStaticField(SerializerFactoryConfig.class, "NO_MODIFIERS", prevNO_MODIFIERS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)}
 * @utbot.executesCondition {@code (_factoryConfig == config): False}
 * @utbot.executesCondition {@code (getClass()): False}
 * @utbot.returnsFrom {@code return new BeanSerializerFactory(config);}
 *  */
    @Test
    public void testWithConfig_NotGetClass() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig serializerFactoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withConfig(serializerFactoryConfig));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        setField(expected, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", serializerFactoryConfig);
        
        SerializerFactoryConfig expected_factoryConfig = expected._factoryConfig;
        SerializerFactoryConfig actual_factoryConfig = actual._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] actual_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(actual_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
        assertNull(actual_factoryConfig_additionalSerializers);
        
        com.fasterxml.jackson.databind.ser.Serializers[] actual_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(actual_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
        assertNull(actual_factoryConfig_additionalKeySerializers);
        
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] actual_factoryConfig_modifiers = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getFieldValue(actual_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers"));
        assertNull(actual_factoryConfig_modifiers);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.customSerializers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method customSerializers()
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#customSerializers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#serializers()}
 * @utbot.returnsFrom {@code return _factoryConfig.serializers();}
 *  */
    @Test
    public void testCustomSerializers_SerializerFactoryConfigSerializers() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        ArrayIterator actual = ((ArrayIterator) beanSerializerFactory.customSerializers());
        
        ArrayIterator expected = ((ArrayIterator) createInstance("com.fasterxml.jackson.databind.util.ArrayIterator"));
        
        // com.fasterxml.jackson.databind.util.ArrayIterator is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method customSerializers()
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#customSerializers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#serializers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _factoryConfig.serializers();
 *  */
    @Test
    public void testCustomSerializers_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.customSerializers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.customSerializers(BeanSerializerFactory.java:106) */
        beanSerializerFactory.customSerializers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createSerializer2(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#_createSerializer2(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.executesCondition {@code (ser != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SerializationConfig config = prov.getConfig();
 *  */
    @Test
    public void test_createSerializer2_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations(BasicSerializerFactory.java:343)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2(BeanSerializerFactory.java:173) */
        beanSerializerFactory._createSerializer2(null, collectionType, basicBeanDescription, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _createSerializer2(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    @Test
    public void test_createSerializer21() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:263)
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:553)
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2(BeanSerializerFactory.java:196) */
            beanSerializerFactory._createSerializer2(impl, collectionLikeType, basicBeanDescription, false);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (!isPotentialBeanType(type.getRawClass())): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#isPotentialBeanType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return constructBeanSerializer(prov, beanDesc);}
 *  */
    @Test
    public void testFindBeanSerializer_IsPotentialBeanType() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType basicBeanDescription_type = ((JavaType) getFieldValue(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        Class initialBasicBeanDescription_type_class = ((Class) getFieldValue(basicBeanDescription_type, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonSerializer actual = beanSerializerFactory.findBeanSerializer(impl, collectionType, basicBeanDescription);
        
        assertNull(actual);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType basicBeanDescription_type1 = ((JavaType) getFieldValue(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        Class finalBasicBeanDescription_type_class = ((Class) getFieldValue(basicBeanDescription_type1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
        
        assertFalse(initialBasicBeanDescription_type_class == finalBasicBeanDescription_type_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isPotentialBeanType(type.getRawClass())
 *  */
    @Test
    public void testFindBeanSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanSerializer(BeanSerializerFactory.java:262) */
        beanSerializerFactory.findBeanSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (!isPotentialBeanType(type.getRawClass())): True}
 * @utbot.executesCondition {@code (!type.isEnumType()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#isPotentialBeanType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isEnumType()}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testFindBeanSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer(BeanSerializerFactory.java:341)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanSerializer(BeanSerializerFactory.java:269) */
        beanSerializerFactory.findBeanSerializer(null, collectionType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findBeanProperties(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findBeanProperties(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindBeanProperties_ReturnNull_1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            ArrayList _properties = new ArrayList();
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
            
            List actual = beanSerializerFactory.findBeanProperties(impl, basicBeanDescription, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findBeanProperties(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindBeanProperties_ReturnNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ArrayList _properties = new ArrayList();
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
        
        List actual = beanSerializerFactory.findBeanProperties(impl, basicBeanDescription, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for findBeanProperties
    
    public void testFindBeanProperties_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.ser.PropertyBuilder, boolean, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#_constructWriter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final PropertyName name = propDef.getFullName();
 *  */
    @Test
    public void test_constructWriter_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:704) */
        beanSerializerFactory._constructWriter(null, null, null, null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#_constructWriter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prov.canOverrideAccessModifiers()
 *  */
    @Test
    public void test_constructWriter_ThrowNullPointerException_4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:705) */
        beanSerializerFactory._constructWriter(null, simpleBeanPropertyDefinition, null, null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#_constructWriter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prov.canOverrideAccessModifiers()
 *  */
    @Test
    public void test_constructWriter_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:705) */
        beanSerializerFactory._constructWriter(null, pOJOPropertyBuilder, null, null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#_constructWriter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMember#fixAccess()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accessor.fixAccess();
 *  */
    @Test
    public void test_constructWriter_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:706) */
        beanSerializerFactory._constructWriter(impl, pOJOPropertyBuilder, null, null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#_constructWriter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMember#getType(com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = accessor.getType(typeContext);
 *  */
    @Test
    public void test_constructWriter_ThrowNullPointerException_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:708) */
        beanSerializerFactory._constructWriter(impl, pOJOPropertyBuilder, null, null, false, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _constructWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.ser.PropertyBuilder, boolean, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test
    public void test_constructWriter1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.canOverrideAccessModifiers(DatabindContext.java:71)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:705) */
        beanSerializerFactory._constructWriter(impl, simpleBeanPropertyDefinition, null, null, false, null);
    }
    
    @Test
    public void test_constructWriter2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(propertyName, null, false);
        TypeBindings typeBindings = new TypeBindings(((TypeFactory) null), ((Class) null));
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:497)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:123)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:706) */
        beanSerializerFactory._constructWriter(impl, pOJOPropertyBuilder, typeBindings, null, false, annotatedConstructor);
    }
    
    @Test
    public void test_constructWriter3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        AnnotatedField annotatedField = new AnnotatedField(null, field, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Field.toString(Field.java:330)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:505)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:123)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory._constructWriter(BeanSerializerFactory.java:706) */
        beanSerializerFactory._constructWriter(impl, pOJOPropertyBuilder, null, null, false, annotatedField);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processViews(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.executesCondition {@code (includeByDefault): True}
 * @utbot.executesCondition {@code (viewsFound == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testProcessViews_ViewsFoundEqualsZero() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        beanSerializerBuilder._properties = _properties;
        
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.executesCondition {@code (includeByDefault): False}
 *  */
    @Test
    public void testProcessViews_NotIncludeByDefault() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        beanSerializerBuilder._properties = _properties;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProperties = {null};
        beanSerializerBuilder._filteredProperties = _filteredProperties;
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] initialBeanSerializerBuilder_filteredProperties = beanSerializerBuilder._filteredProperties;
        
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] finalBeanSerializerBuilder_filteredProperties = beanSerializerBuilder._filteredProperties;
        
        assertFalse(initialBeanSerializerBuilder_filteredProperties == finalBeanSerializerBuilder_filteredProperties);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.executesCondition {@code (includeByDefault): True}
 * @utbot.executesCondition {@code (viewsFound == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < propCount; ++i)} once
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testProcessViews_IncludeByDefault() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        _properties.add(attributePropertyWriter);
        beanSerializerBuilder._properties = _properties;
        
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.executesCondition {@code (includeByDefault): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < propCount; ++i)} once
 *  */
    @Test
    public void testProcessViews_NotIncludeByDefault_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        _properties.add(attributePropertyWriter);
        beanSerializerBuilder._properties = _properties;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProperties = {null};
        beanSerializerBuilder._filteredProperties = _filteredProperties;
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] initialBeanSerializerBuilder_filteredProperties = beanSerializerBuilder._filteredProperties;
        
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] finalBeanSerializerBuilder_filteredProperties = beanSerializerBuilder._filteredProperties;
        
        assertFalse(initialBeanSerializerBuilder_filteredProperties == finalBeanSerializerBuilder_filteredProperties);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processViews(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerBuilder#getProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<BeanPropertyWriter> props = builder.getProperties();
 *  */
    @Test
    public void testProcessViews_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:610) */
        beanSerializerFactory.processViews(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int propCount = props.size();
 *  */
    @Test
    public void testProcessViews_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:612) */
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int propCount = props.size();
 *  */
    @Test
    public void testProcessViews_ThrowNullPointerException_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:612) */
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean includeByDefault = config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
 *  */
    @Test
    public void testProcessViews_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:611) */
        beanSerializerFactory.processViews(null, beanSerializerBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#processViews(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < propCount; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?>[] views = bpw.getViews();
 *  */
    @Test
    public void testProcessViews_ThrowNullPointerException_4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        _properties.add(null);
        beanSerializerBuilder._properties = _properties;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:618) */
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processViews(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)
    
    @Test
    public void testProcessViews1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(serializationConfig);
        beanSerializerBuilder._properties = _properties;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.SerializationConfig cannot be cast to class com.fasterxml.jackson.databind.ser.BeanPropertyWriter (com.fasterxml.jackson.databind.SerializationConfig and com.fasterxml.jackson.databind.ser.BeanPropertyWriter are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:617) */
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    
    @Test
    public void testProcessViews2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BeanSerializerBuilder beanSerializerBuilder = new BeanSerializerBuilder(((BeanDescription) null));
        ArrayList _properties = new ArrayList();
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(attributePropertyWriter);
        _properties.add(serializationConfig);
        beanSerializerBuilder._properties = _properties;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.SerializationConfig cannot be cast to class com.fasterxml.jackson.databind.ser.BeanPropertyWriter (com.fasterxml.jackson.databind.SerializationConfig and com.fasterxml.jackson.databind.ser.BeanPropertyWriter are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.processViews(BeanSerializerFactory.java:617) */
        beanSerializerFactory.processViews(serializationConfig, beanSerializerBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testRemoveIgnorableTypes_ListIterator() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        
        beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AnnotatedMember accessor = property.getAccessor();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowClassCastException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _getters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        byte[] value = {};
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", _getters);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getters", _getters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getGetter(POJOPropertyBuilder.java:217)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getAccessor(POJOPropertyBuilder.java:364)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:648) */
        beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AnnotatedMember accessor = property.getAccessor();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowClassCastException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _getters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        byte[] value = {};
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getters", _getters);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getGetter(POJOPropertyBuilder.java:210)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getAccessor(POJOPropertyBuilder.java:364)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:648) */
        beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AnnotatedMember accessor = property.getAccessor();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowClassCastException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        byte[] value = {};
        setField(_fields, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedField ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedField is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getField(POJOPropertyBuilder.java:308)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getAccessor(POJOPropertyBuilder.java:366)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:648) */
        beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AnnotatedMember accessor = property.getAccessor();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowClassCastException_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        AnnotatedField value = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(_fields, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
        Object next = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        short[] value1 = {};
        setField(next, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value1);
        setField(_fields, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", next);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedField ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedField is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getField(POJOPropertyBuilder.java:311)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getAccessor(POJOPropertyBuilder.java:366)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:648) */
        beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:643) */
        beanSerializerFactory.removeIgnorableTypes(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<BeanPropertyDefinition> it = properties.iterator();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowNullPointerException_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:645) */
            beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeIgnorableTypes(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<BeanPropertyDefinition> it = properties.iterator();
 *  */
    @Test
    public void testRemoveIgnorableTypes_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:645) */
        beanSerializerFactory.removeIgnorableTypes(serializationConfig, null, null);
    }
    ///endregion
    
    ///region Errors report for removeIgnorableTypes
    
    public void testRemoveIgnorableTypes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field returnType is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeSetterlessGetters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(simpleBeanPropertyDefinition, "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition", "_member", _member);
        arrayList.add(simpleBeanPropertyDefinition);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(simpleBeanPropertyDefinition, "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition", "_member", _member);
        arrayList.add(simpleBeanPropertyDefinition);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        java.lang.Class[] _paramClasses = {null};
        setField(_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses", _paramClasses);
        setField(simpleBeanPropertyDefinition, "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition", "_member", _member);
        arrayList.add(simpleBeanPropertyDefinition);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _getters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Object next = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        PropertyName name = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000";
        setField(name, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(next, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "name", name);
        setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", next);
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getters", _getters);
        arrayList.add(pOJOPropertyBuilder);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.util.Iterator#next()} once,
    ///     {@link org.utbot.engine.overrides.collections.UtArrayList#preconditionCheck()} twice,
    ///     {@link org.utbot.engine.overrides.collections.UtArrayList#access$100(org.utbot.engine.overrides.collections.UtArrayList)} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.UtArrayList#access$100(org.utbot.engine.overrides.collections.UtArrayList)} twice,
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link java.util.Iterator#next()} once,
    ///     {@link com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition#couldDeserialize()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_6() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _ctorParameters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_ctorParameters", _ctorParameters);
        arrayList.add(pOJOPropertyBuilder);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _setters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_setters", _setters);
        arrayList.add(pOJOPropertyBuilder);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 *  */
    @Test
    public void testRemoveSetterlessGetters_5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object _fields = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_fields", _fields);
        arrayList.add(pOJOPropertyBuilder);
        
        beanSerializerFactory.removeSetterlessGetters(null, null, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#removeSetterlessGetters(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<BeanPropertyDefinition> it = properties.iterator();
 *  */
    @Test
    public void testRemoveSetterlessGetters_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeSetterlessGetters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeSetterlessGetters(BeanSerializerFactory.java:678) */
        beanSerializerFactory.removeSetterlessGetters(null, null, null);
    }
    ///endregion
    
    ///region Errors report for removeSetterlessGetters
    
    public void testRemoveSetterlessGetters_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructObjectIdHandler(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructObjectIdHandler(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.executesCondition {@code (objectIdInfo == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testConstructObjectIdHandler_ObjectIdInfoEqualsNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        ObjectIdWriter actual = beanSerializerFactory.constructObjectIdHandler(null, basicBeanDescription, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructObjectIdHandler(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructObjectIdHandler(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdInfo objectIdInfo = beanDesc.getObjectIdInfo();
 *  */
    @Test
    public void testConstructObjectIdHandler_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler(BeanSerializerFactory.java:430) */
        beanSerializerFactory.constructObjectIdHandler(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructObjectIdHandler(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.executesCondition {@code (objectIdInfo == null): False}
 * @utbot.executesCondition {@code (implClass): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getObjectIdInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getGeneratorType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#constructType(java.lang.reflect.Type)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = prov.constructType(implClass);
 *  */
    @Test
    public void testConstructObjectIdHandler_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _generator = Object.class;
        setField(_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler(BeanSerializerFactory.java:467) */
        beanSerializerFactory.constructObjectIdHandler(null, basicBeanDescription, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructObjectIdHandler(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    @Test
    public void testConstructObjectIdHandler1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _generator = Object.class;
        setField(_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:747)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:386)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:354)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:124)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler(BeanSerializerFactory.java:467) */
        beanSerializerFactory.constructObjectIdHandler(impl, basicBeanDescription, null);
    }
    
    @Test
    public void testConstructObjectIdHandler2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        PropertyName _propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_propertyName", _propertyName);
        Class _generator = Object.class;
        setField(_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo", _objectIdInfo);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.getTypeFactory(SerializerProvider.java:328)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:124)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructObjectIdHandler(BeanSerializerFactory.java:467) */
        beanSerializerFactory.constructObjectIdHandler(impl, basicBeanDescription, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyTypeSerializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findPropertyTypeSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector ai = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindPropertyTypeSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:286) */
        beanSerializerFactory.findPropertyTypeSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findPropertyTypeSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeResolverBuilder<?> b = ai.findPropertyTypeResolver(config, accessor, baseType);
 *  */
    @Test
    public void testFindPropertyTypeSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:287) */
        beanSerializerFactory.findPropertyTypeSerializer(null, serializationConfig, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findPropertyTypeSerializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test(expected = StackOverflowError.class)
    public void testFindPropertyTypeSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary2 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, annotatedConstructor);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPropertyTypeSerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPropertyTypeSerializer3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, annotatedConstructor);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPropertyTypeSerializer4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        
        beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, annotatedField);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindPropertyTypeSerializer5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        
        beanSerializerFactory.findPropertyTypeSerializer(mapLikeType, serializationConfig, annotatedField);
    }
    
    @Test
    public void testFindPropertyTypeSerializer6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:256)
                com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
                com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:263)
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:290) */
            beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testFindPropertyTypeSerializer7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:263)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:290) */
        beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, null);
    }
    
    @Test
    public void testFindPropertyTypeSerializer8() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:263)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:290) */
        beanSerializerFactory.findPropertyTypeSerializer(mapType, serializationConfig, null);
    }
    
    @Test
    public void testFindPropertyTypeSerializer9() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:263)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:290) */
        beanSerializerFactory.findPropertyTypeSerializer(mapType, serializationConfig, null);
    }
    
    @Test
    public void testFindPropertyTypeSerializer10() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPropertyTypeResolver(AnnotationIntrospectorPair.java:216)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:287) */
        beanSerializerFactory.findPropertyTypeSerializer(mapLikeType, serializationConfig, annotatedMethod);
    }
    
    @Test
    public void testFindPropertyTypeSerializer11() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException] */
        beanSerializerFactory.findPropertyTypeSerializer(arrayType, serializationConfig, null);
    }
    
    @Test
    public void testFindPropertyTypeSerializer12() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:747)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:386)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:358)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:263)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:290) */
        beanSerializerFactory.findPropertyTypeSerializer(mapLikeType, serializationConfig, annotatedParameter);
    }
    
    @Test
    public void testFindPropertyTypeSerializer13() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPropertyTypeResolver(AnnotationIntrospectorPair.java:214)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPropertyTypeResolver(AnnotationIntrospectorPair.java:214)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPropertyTypeResolver(AnnotationIntrospectorPair.java:214)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPropertyTypeResolver(AnnotationIntrospectorPair.java:216)
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyTypeSerializer(BeanSerializerFactory.java:287) */
        beanSerializerFactory.findPropertyTypeSerializer(mapLikeType, serializationConfig, annotatedConstructor);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findPropertyTypeSerializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyTypeSerializer14() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        beanSerializerFactory.findPropertyTypeSerializer(collectionLikeType, serializationConfig, annotatedMethod);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyTypeSerializer15() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        beanSerializerFactory.findPropertyTypeSerializer(mapType, serializationConfig, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPropertyContentTypeSerializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findPropertyContentTypeSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType contentType = containerType.getContentType();
 *  */
    @Test
    public void testFindPropertyContentTypeSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer(BeanSerializerFactory.java:311) */
        beanSerializerFactory.findPropertyContentTypeSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findPropertyContentTypeSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector ai = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindPropertyContentTypeSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer(BeanSerializerFactory.java:312) */
        beanSerializerFactory.findPropertyContentTypeSerializer(mapLikeType, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findPropertyContentTypeSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector ai = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindPropertyContentTypeSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer(BeanSerializerFactory.java:312) */
        beanSerializerFactory.findPropertyContentTypeSerializer(collectionType, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findPropertyContentTypeSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeResolverBuilder<?> b = ai.findPropertyContentTypeResolver(config, accessor, containerType);
 *  */
    @Test
    public void testFindPropertyContentTypeSerializer_ThrowNullPointerException_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findPropertyContentTypeSerializer(BeanSerializerFactory.java:313) */
        beanSerializerFactory.findPropertyContentTypeSerializer(mapType, serializationConfig, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructPropertyBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructPropertyBuilder(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructPropertyBuilder(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return new PropertyBuilder(config, beanDesc);}
 *  */
    @Test
    public void testConstructPropertyBuilder_Return_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            
            PropertyBuilder actual = beanSerializerFactory.constructPropertyBuilder(serializationConfig, basicBeanDescription);
            
            PropertyBuilder expected = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", serializationConfig);
            setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", basicBeanDescription);
            JsonInclude.Include _defaultInclusion = JsonInclude.Include.ALWAYS;
            setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultInclusion", _defaultInclusion);
            setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", instance);
            
            SerializationConfig expected_config = expected._config;
            SerializationConfig actual_config = actual._config;
            int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
            int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
            assertEquals(expected_config_serFeatures, actual_config_serFeatures);
            
            JsonInclude.Include actual_config_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
            assertNull(actual_config_serializationInclusion);
            
            FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
            assertNull(actual_config_filterProvider);
            
            int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
            int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
            assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
            
            int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
            int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
            assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
            
            Map actual_config_mixInAnnotations = ((Map) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
            assertNull(actual_config_mixInAnnotations);
            
            SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
            assertNull(actual_config_subtypeResolver);
            
            String actual_config_rootName = ((String) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
            assertNull(actual_config_rootName);
            
            Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
            assertNull(actual_config_view);
            
            ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
            assertNull(actual_config_attributes);
            
            int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
            int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
            assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
            
            BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
            assertNull(actual_config_base);
            
            BeanDescription expected_beanDesc = expected._beanDesc;
            BeanDescription actual_beanDesc = actual._beanDesc;
            MapperConfig actual_beanDesc_config = ((MapperConfig) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config"));
            assertNull(actual_beanDesc_config);
            
            AnnotationIntrospector actual_beanDesc_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector"));
            assertNull(actual_beanDesc_annotationIntrospector);
            
            AnnotatedClass actual_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
            assertNull(actual_beanDesc_classInfo);
            
            TypeBindings actual_beanDesc_bindings = ((TypeBindings) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_bindings"));
            assertNull(actual_beanDesc_bindings);
            
            List actual_beanDesc_properties = ((List) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties"));
            assertNull(actual_beanDesc_properties);
            
            ObjectIdInfo actual_beanDesc_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo"));
            assertNull(actual_beanDesc_objectIdInfo);
            
            AnnotatedMethod actual_beanDesc_anySetterMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anySetterMethod"));
            assertNull(actual_beanDesc_anySetterMethod);
            
            Map actual_beanDesc_injectables = ((Map) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_injectables"));
            assertNull(actual_beanDesc_injectables);
            
            Set actual_beanDesc_ignoredPropertyNames = ((Set) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_ignoredPropertyNames"));
            assertNull(actual_beanDesc_ignoredPropertyNames);
            
            AnnotatedMethod actual_beanDesc_jsonValueMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_jsonValueMethod"));
            assertNull(actual_beanDesc_jsonValueMethod);
            
            AnnotatedMember actual_beanDesc_anyGetter = ((AnnotatedMember) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anyGetter"));
            assertNull(actual_beanDesc_anyGetter);
            
            JavaType actual_beanDesc_type = ((JavaType) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
            assertNull(actual_beanDesc_type);
            
            JsonInclude.Include expected_defaultInclusion = expected._defaultInclusion;
            JsonInclude.Include actual_defaultInclusion = actual._defaultInclusion;
            assertEquals(expected_defaultInclusion, actual_defaultInclusion);
            
            AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
            AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
            
            Object actual_defaultBean = actual._defaultBean;
            assertNull(actual_defaultBean);
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructPropertyBuilder(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return new PropertyBuilder(config, beanDesc);}
 *  */
    @Test
    public void testConstructPropertyBuilder_Return() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        JsonInclude.Include _serializationInclusion = JsonInclude.Include.ALWAYS;
        setField(serializationConfig, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion", _serializationInclusion);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        PropertyBuilder actual = beanSerializerFactory.constructPropertyBuilder(serializationConfig, basicBeanDescription);
        
        PropertyBuilder expected = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", serializationConfig);
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", basicBeanDescription);
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultInclusion", _serializationInclusion);
        
        SerializationConfig expected_config = expected._config;
        SerializationConfig actual_config = actual._config;
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        JsonInclude.Include expected_config_serializationInclusion = ((JsonInclude.Include) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        JsonInclude.Include actual_config_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertEquals(expected_config_serializationInclusion, actual_config_serializationInclusion);
        
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        Map actual_config_mixInAnnotations = ((Map) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        assertNull(actual_config_mixInAnnotations);
        
        SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_config_subtypeResolver);
        
        String actual_config_rootName = ((String) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_config_rootName);
        
        Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_config_view);
        
        ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_config_attributes);
        
        int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
        
        BaseSettings expected_config_base = ((BaseSettings) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        ClassIntrospector actual_config_base_classIntrospector = ((ClassIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector"));
        assertNull(actual_config_base_classIntrospector);
        
        AnnotationIntrospector actual_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        assertNull(actual_config_base_annotationIntrospector);
        
        VisibilityChecker actual_config_base_visibilityChecker = ((VisibilityChecker) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_visibilityChecker"));
        assertNull(actual_config_base_visibilityChecker);
        
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
        
        BeanDescription expected_beanDesc = expected._beanDesc;
        BeanDescription actual_beanDesc = actual._beanDesc;
        MapperConfig actual_beanDesc_config = ((MapperConfig) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config"));
        assertNull(actual_beanDesc_config);
        
        AnnotationIntrospector actual_beanDesc_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector"));
        assertNull(actual_beanDesc_annotationIntrospector);
        
        AnnotatedClass actual_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
        assertNull(actual_beanDesc_classInfo);
        
        TypeBindings actual_beanDesc_bindings = ((TypeBindings) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_bindings"));
        assertNull(actual_beanDesc_bindings);
        
        List actual_beanDesc_properties = ((List) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties"));
        assertNull(actual_beanDesc_properties);
        
        ObjectIdInfo actual_beanDesc_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo"));
        assertNull(actual_beanDesc_objectIdInfo);
        
        AnnotatedMethod actual_beanDesc_anySetterMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anySetterMethod"));
        assertNull(actual_beanDesc_anySetterMethod);
        
        Map actual_beanDesc_injectables = ((Map) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_injectables"));
        assertNull(actual_beanDesc_injectables);
        
        Set actual_beanDesc_ignoredPropertyNames = ((Set) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_ignoredPropertyNames"));
        assertNull(actual_beanDesc_ignoredPropertyNames);
        
        AnnotatedMethod actual_beanDesc_jsonValueMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_jsonValueMethod"));
        assertNull(actual_beanDesc_jsonValueMethod);
        
        AnnotatedMember actual_beanDesc_anyGetter = ((AnnotatedMember) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anyGetter"));
        assertNull(actual_beanDesc_anyGetter);
        
        JavaType actual_beanDesc_type = ((JavaType) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        assertNull(actual_beanDesc_type);
        
        JsonInclude.Include expected_defaultInclusion = expected._defaultInclusion;
        JsonInclude.Include actual_defaultInclusion = actual._defaultInclusion;
        assertEquals(expected_defaultInclusion, actual_defaultInclusion);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        Object actual_defaultBean = actual._defaultBean;
        assertNull(actual_defaultBean);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructPropertyBuilder(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return new PropertyBuilder(config, beanDesc);}
 *  */
    @Test
    public void testConstructPropertyBuilder_Return_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        JsonInclude.Include _serializationInclusion = JsonInclude.Include.ALWAYS;
        setField(serializationConfig, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion", _serializationInclusion);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        PropertyBuilder actual = beanSerializerFactory.constructPropertyBuilder(serializationConfig, basicBeanDescription);
        
        PropertyBuilder expected = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", serializationConfig);
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", basicBeanDescription);
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultInclusion", _serializationInclusion);
        
        SerializationConfig expected_config = expected._config;
        SerializationConfig actual_config = actual._config;
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        JsonInclude.Include expected_config_serializationInclusion = ((JsonInclude.Include) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        JsonInclude.Include actual_config_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertEquals(expected_config_serializationInclusion, actual_config_serializationInclusion);
        
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        Map actual_config_mixInAnnotations = ((Map) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        assertNull(actual_config_mixInAnnotations);
        
        SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_config_subtypeResolver);
        
        String actual_config_rootName = ((String) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_config_rootName);
        
        Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_config_view);
        
        ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_config_attributes);
        
        int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
        
        BaseSettings expected_config_base = ((BaseSettings) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        ClassIntrospector actual_config_base_classIntrospector = ((ClassIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector"));
        assertNull(actual_config_base_classIntrospector);
        
        AnnotationIntrospector actual_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        assertNull(actual_config_base_annotationIntrospector);
        
        VisibilityChecker actual_config_base_visibilityChecker = ((VisibilityChecker) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_visibilityChecker"));
        assertNull(actual_config_base_visibilityChecker);
        
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
        
        BeanDescription expected_beanDesc = expected._beanDesc;
        BeanDescription actual_beanDesc = actual._beanDesc;
        MapperConfig actual_beanDesc_config = ((MapperConfig) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config"));
        assertNull(actual_beanDesc_config);
        
        AnnotationIntrospector expected_beanDesc_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(expected_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector"));
        AnnotationIntrospector actual_beanDesc_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector"));
        
        AnnotatedClass actual_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
        assertNull(actual_beanDesc_classInfo);
        
        TypeBindings actual_beanDesc_bindings = ((TypeBindings) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_bindings"));
        assertNull(actual_beanDesc_bindings);
        
        List actual_beanDesc_properties = ((List) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties"));
        assertNull(actual_beanDesc_properties);
        
        ObjectIdInfo actual_beanDesc_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo"));
        assertNull(actual_beanDesc_objectIdInfo);
        
        AnnotatedMethod actual_beanDesc_anySetterMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anySetterMethod"));
        assertNull(actual_beanDesc_anySetterMethod);
        
        Map actual_beanDesc_injectables = ((Map) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_injectables"));
        assertNull(actual_beanDesc_injectables);
        
        Set actual_beanDesc_ignoredPropertyNames = ((Set) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_ignoredPropertyNames"));
        assertNull(actual_beanDesc_ignoredPropertyNames);
        
        AnnotatedMethod actual_beanDesc_jsonValueMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_jsonValueMethod"));
        assertNull(actual_beanDesc_jsonValueMethod);
        
        AnnotatedMember actual_beanDesc_anyGetter = ((AnnotatedMember) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anyGetter"));
        assertNull(actual_beanDesc_anyGetter);
        
        JavaType actual_beanDesc_type = ((JavaType) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        assertNull(actual_beanDesc_type);
        
        JsonInclude.Include expected_defaultInclusion = expected._defaultInclusion;
        JsonInclude.Include actual_defaultInclusion = actual._defaultInclusion;
        assertEquals(expected_defaultInclusion, actual_defaultInclusion);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        Object actual_defaultBean = actual._defaultBean;
        assertNull(actual_defaultBean);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructPropertyBuilder(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return new PropertyBuilder(config, beanDesc);}
 *  */
    @Test
    public void testConstructPropertyBuilder_Return_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        PropertyBuilder actual = beanSerializerFactory.constructPropertyBuilder(serializationConfig, basicBeanDescription);
        
        PropertyBuilder expected = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", serializationConfig);
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", basicBeanDescription);
        JsonInclude.Include _defaultInclusion = JsonInclude.Include.ALWAYS;
        setField(expected, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultInclusion", _defaultInclusion);
        
        SerializationConfig expected_config = expected._config;
        SerializationConfig actual_config = actual._config;
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        JsonInclude.Include actual_config_serializationInclusion = ((JsonInclude.Include) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_config_serializationInclusion);
        
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        Map actual_config_mixInAnnotations = ((Map) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixInAnnotations"));
        assertNull(actual_config_mixInAnnotations);
        
        SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_config_subtypeResolver);
        
        String actual_config_rootName = ((String) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_config_rootName);
        
        Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_config_view);
        
        ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_config_attributes);
        
        int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
        
        BaseSettings expected_config_base = ((BaseSettings) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        ClassIntrospector actual_config_base_classIntrospector = ((ClassIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector"));
        assertNull(actual_config_base_classIntrospector);
        
        AnnotationIntrospector actual_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        assertNull(actual_config_base_annotationIntrospector);
        
        VisibilityChecker actual_config_base_visibilityChecker = ((VisibilityChecker) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_visibilityChecker"));
        assertNull(actual_config_base_visibilityChecker);
        
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
        
        BeanDescription expected_beanDesc = expected._beanDesc;
        BeanDescription actual_beanDesc = actual._beanDesc;
        MapperConfig actual_beanDesc_config = ((MapperConfig) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config"));
        assertNull(actual_beanDesc_config);
        
        AnnotationIntrospector actual_beanDesc_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector"));
        assertNull(actual_beanDesc_annotationIntrospector);
        
        AnnotatedClass actual_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
        assertNull(actual_beanDesc_classInfo);
        
        TypeBindings actual_beanDesc_bindings = ((TypeBindings) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_bindings"));
        assertNull(actual_beanDesc_bindings);
        
        List actual_beanDesc_properties = ((List) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties"));
        assertNull(actual_beanDesc_properties);
        
        ObjectIdInfo actual_beanDesc_objectIdInfo = ((ObjectIdInfo) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_objectIdInfo"));
        assertNull(actual_beanDesc_objectIdInfo);
        
        AnnotatedMethod actual_beanDesc_anySetterMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anySetterMethod"));
        assertNull(actual_beanDesc_anySetterMethod);
        
        Map actual_beanDesc_injectables = ((Map) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_injectables"));
        assertNull(actual_beanDesc_injectables);
        
        Set actual_beanDesc_ignoredPropertyNames = ((Set) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_ignoredPropertyNames"));
        assertNull(actual_beanDesc_ignoredPropertyNames);
        
        AnnotatedMethod actual_beanDesc_jsonValueMethod = ((AnnotatedMethod) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_jsonValueMethod"));
        assertNull(actual_beanDesc_jsonValueMethod);
        
        AnnotatedMember actual_beanDesc_anyGetter = ((AnnotatedMember) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_anyGetter"));
        assertNull(actual_beanDesc_anyGetter);
        
        JavaType actual_beanDesc_type = ((JavaType) getFieldValue(actual_beanDesc, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        assertNull(actual_beanDesc_type);
        
        JsonInclude.Include expected_defaultInclusion = expected._defaultInclusion;
        JsonInclude.Include actual_defaultInclusion = actual._defaultInclusion;
        assertEquals(expected_defaultInclusion, actual_defaultInclusion);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        Object actual_defaultBean = actual._defaultBean;
        assertNull(actual_defaultBean);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (beanDesc.getBeanClass()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getBeanClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getUnknownTypeSerializer(java.lang.Class)}
 * @utbot.returnsFrom {@code return prov.getUnknownTypeSerializer(Object.class);}
 *  */
    @Test
    public void testConstructBeanSerializer_BeanDescGetBeanClass() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        JavaType basicBeanDescription_type = ((JavaType) getFieldValue(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        Class initialBasicBeanDescription_type_class = ((Class) getFieldValue(basicBeanDescription_type, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonSerializer actual = beanSerializerFactory.constructBeanSerializer(impl, basicBeanDescription);
        
        assertNull(actual);
        
        JavaType basicBeanDescription_type1 = ((JavaType) getFieldValue(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type"));
        Class finalBasicBeanDescription_type_class = ((Class) getFieldValue(basicBeanDescription_type1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialBasicBeanDescription_type_class == finalBasicBeanDescription_type_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (beanDesc.getBeanClass()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializerBuilder(com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerBuilder#setConfig(com.fasterxml.jackson.databind.SerializationConfig)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#findBeanProperties(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<BeanPropertyWriter> props = findBeanProperties(prov, beanDesc, builder);
 *  */
    @Test
    public void testConstructBeanSerializer_ThrowClassCastException() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            ArrayList _properties = new ArrayList();
            POJOPropertyBuilder pOJOPropertyBuilder = ((POJOPropertyBuilder) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
            Object _getters = createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
            byte[] value = {};
            setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "value", value);
            setField(_getters, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", "next", _getters);
            setField(pOJOPropertyBuilder, "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder", "_getters", _getters);
            _properties.add(pOJOPropertyBuilder);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            _properties.add(null);
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_properties", _properties);
            ArrayType _type = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.introspect.AnnotatedMethod ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.introspect.AnnotatedMethod is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getGetter(POJOPropertyBuilder.java:217)
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getAccessor(POJOPropertyBuilder.java:364)
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory.removeIgnorableTypes(BeanSerializerFactory.java:648)
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory.findBeanProperties(BeanSerializerFactory.java:527)
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer(BeanSerializerFactory.java:350) */
            beanSerializerFactory.constructBeanSerializer(impl, basicBeanDescription);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getBeanClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: beanDesc.getBeanClass() == Object.class
 *  */
    @Test
    public void testConstructBeanSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer(BeanSerializerFactory.java:341) */
        beanSerializerFactory.constructBeanSerializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (beanDesc.getBeanClass()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getUnknownTypeSerializer(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return prov.getUnknownTypeSerializer(Object.class);
 *  */
    @Test
    public void testConstructBeanSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer(BeanSerializerFactory.java:342) */
        beanSerializerFactory.constructBeanSerializer(null, basicBeanDescription);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (beanDesc.getBeanClass()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SerializationConfig config = prov.getConfig();
 *  */
    @Test
    public void testConstructBeanSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.BeanDescription", "_type", _type);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializer(BeanSerializerFactory.java:345) */
        beanSerializerFactory.constructBeanSerializer(null, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.constructBeanSerializerBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructBeanSerializerBuilder(com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#constructBeanSerializerBuilder(com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return new BeanSerializerBuilder(beanDesc);}
 *  */
    @Test
    public void testConstructBeanSerializerBuilder_Return() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        BeanSerializerBuilder actual = beanSerializerFactory.constructBeanSerializerBuilder(null);
        
        BeanSerializerBuilder expected = new BeanSerializerBuilder(((BeanDescription) null));
        
        BeanDescription actual_beanDesc = actual._beanDesc;
        assertNull(actual_beanDesc);
        
        SerializationConfig actual_config = actual._config;
        assertNull(actual_config);
        
        List actual_properties = actual._properties;
        assertNull(actual_properties);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProperties = actual._filteredProperties;
        assertNull(actual_filteredProperties);
        
        AnyGetterWriter actual_anyGetter = actual._anyGetter;
        assertNull(actual_anyGetter);
        
        Object actual_filterId = actual._filterId;
        assertNull(actual_filterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        assertNull(actual_objectIdWriter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.isPotentialBeanType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPotentialBeanType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#isPotentialBeanType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#canBeABeanType(java.lang.Class)}
 * @utbot.returnsFrom {@code return (ClassUtil.canBeABeanType(type) == null) && !ClassUtil.isProxyType(type);}
 *  */
    @Test
    public void testIsPotentialBeanType_ClassUtilCanBeABeanTypeNotEqualsNullAndNotClassUtilIsProxyType() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        Class class1 = Object.class;
        
        boolean actual = beanSerializerFactory.isPotentialBeanType(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testFilterBeanProperties_SerializationConfigGetAnnotationIntrospector() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            
            List actual = beanSerializerFactory.filterBeanProperties(serializationConfig, basicBeanDescription, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, java.util.List)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testFilterBeanProperties_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties(BeanSerializerFactory.java:583) */
        beanSerializerFactory.filterBeanProperties(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedClass ac = beanDesc.getClassInfo();
 *  */
    @Test
    public void testFilterBeanProperties_ThrowNullPointerException_3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties(BeanSerializerFactory.java:584) */
            beanSerializerFactory.filterBeanProperties(serializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedClass ac = beanDesc.getClassInfo();
 *  */
    @Test
    public void testFilterBeanProperties_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties(BeanSerializerFactory.java:584) */
        beanSerializerFactory.filterBeanProperties(serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanSerializerFactory#filterBeanProperties(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String[] ignored = intr.findPropertiesToIgnore(ac);
 *  */
    @Test
    public void testFilterBeanProperties_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanSerializerFactory.filterBeanProperties(BeanSerializerFactory.java:585) */
        beanSerializerFactory.filterBeanProperties(serializationConfig, basicBeanDescription, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1064668633273599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1064668633273599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1064668633283500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064668633273599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064668633283500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1064668633673599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1064668633673599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1064668633677400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064668633673599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064668633677400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1064668634020300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1064668634020300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1064668634023000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064668634020300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064668634023000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1064668635022200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1064668635022200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1064668635029400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064668635022200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064668635029400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

