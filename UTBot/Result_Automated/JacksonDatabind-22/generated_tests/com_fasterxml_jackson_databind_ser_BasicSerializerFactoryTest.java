package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.ser.Serializers.Base;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import java.util.LinkedList;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_ser_BasicSerializerFactoryTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.getFactoryConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFactoryConfig()
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#getFactoryConfig()}
 * @utbot.returnsFrom {@code return _factoryConfig;}
 *  */
    @Test
    public void testGetFactoryConfig_Return_factoryConfig() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        SerializerFactoryConfig actual = beanSerializerFactory.getFactoryConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConverter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findConverter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConverter_SerializerProviderGetAnnotationIntrospector() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            Converter actual = beanSerializerFactory.findConverter(impl, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConverter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findConverter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = prov.getAnnotationIntrospector().findSerializationConverter(a);
 *  */
    @Test
    public void testFindConverter_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter(BasicSerializerFactory.java:528) */
        beanSerializerFactory.findConverter(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findConverter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = prov.getAnnotationIntrospector().findSerializationConverter(a);
 *  */
    @Test
    public void testFindConverter_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter(BasicSerializerFactory.java:528) */
        beanSerializerFactory.findConverter(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findConverter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanSerializerFactory.findConverter(impl, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary9 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary8);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
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
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanSerializerFactory.findConverter(impl, null);
    }
    
    @Test
    public void testFindConverter3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary9 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary15 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
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
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:383)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationConverter(AnnotationIntrospectorPair.java:382)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConverter(BasicSerializerFactory.java:528) */
        beanSerializerFactory.findConverter(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findFilterId(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findFilterId(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return config.getAnnotationIntrospector().findFilterId((Annotated) beanDesc.getClassInfo());
 *  */
    @Test
    public void testFindFilterId_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId(BasicSerializerFactory.java:1063) */
        beanSerializerFactory.findFilterId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findFilterId(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return config.getAnnotationIntrospector().findFilterId((Annotated) beanDesc.getClassInfo());
 *  */
    @Test
    public void testFindFilterId_ThrowNullPointerException_3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId(BasicSerializerFactory.java:1063) */
            beanSerializerFactory.findFilterId(serializationConfig, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findFilterId(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return config.getAnnotationIntrospector().findFilterId((Annotated) beanDesc.getClassInfo());
 *  */
    @Test
    public void testFindFilterId_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId(BasicSerializerFactory.java:1063) */
        beanSerializerFactory.findFilterId(serializationConfig, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findFilterId(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return config.getAnnotationIntrospector().findFilterId((Annotated) beanDesc.getClassInfo());
 *  */
    @Test
    public void testFindFilterId_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId(BasicSerializerFactory.java:1063) */
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findFilterId(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test
    public void testFindFilterId1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            
            Object actual = beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findFilterId(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test(expected = StackOverflowError.class)
    public void testFindFilterId2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFilterId3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFilterId4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFilterId5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary14 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary15 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary15, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
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
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    
    @Test
    public void testFindFilterId6() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
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
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary10 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
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
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findFilterId(JacksonAnnotationIntrospector.java:161)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findFilterId(JacksonAnnotationIntrospector.java:156)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:171)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId(BasicSerializerFactory.java:1063) */
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    
    @Test
    public void testFindFilterId7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary9 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
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
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:171)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFilterId(AnnotationIntrospectorPair.java:169)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId(BasicSerializerFactory.java:1063) */
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    
    @Test
    public void testFindFilterId8() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findFilterId] produces [java.lang.NullPointerException] */
        beanSerializerFactory.findFilterId(serializationConfig, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.isIndexedList
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isIndexedList(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#isIndexedList(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code return RandomAccess.class.isAssignableFrom(cls);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return RandomAccess.class.isAssignableFrom(cls);
 *  */
    @Test
    public void testIsIndexedList_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.isIndexedList] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.isIndexedList(BasicSerializerFactory.java:711) */
        beanSerializerFactory.isIndexedList(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildMapSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildMapSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#customSerializers()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ser = serializers.findMapSerializer(config, type, beanDesc, keySerializer, elementTypeSerializer, elementValueSerializer);
 *  */
    @Test
    public void testBuildMapSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(BasicSerializerFactory.java:751) */
        beanSerializerFactory.buildMapSerializer(null, null, null, false, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildMapSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildMapSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AsExistingPropertyTypeSerializer asExistingPropertyTypeSerializer = new AsExistingPropertyTypeSerializer(null, null, null);
        
        beanSerializerFactory.buildMapSerializer(serializationConfig, mapType, basicBeanDescription, false, null, asExistingPropertyTypeSerializer, null);
    }
    
    @Test
    public void testBuildMapSerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[9];
        SimpleSerializers simpleSerializers = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        HashMap _interfaceMappings = new HashMap();
        setField(simpleSerializers, "com.fasterxml.jackson.databind.module.SimpleSerializers", "_interfaceMappings", _interfaceMappings);
        _additionalSerializers[0] = ((Serializers) simpleSerializers);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(BasicSerializerFactory.java:751) */
        beanSerializerFactory.buildMapSerializer(null, mapType, null, false, null, null, null);
    }
    
    @Test
    public void testBuildMapSerializer3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[9];
        SimpleSerializers simpleSerializers = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        _additionalSerializers[0] = ((Serializers) simpleSerializers);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(BasicSerializerFactory.java:751) */
        beanSerializerFactory.buildMapSerializer(null, mapType, null, false, null, null, null);
    }
    
    @Test
    public void testBuildMapSerializer4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[9];
        CoreXMLSerializers coreXMLSerializers = ((CoreXMLSerializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLSerializers"));
        _additionalSerializers[0] = ((Serializers) coreXMLSerializers);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(BasicSerializerFactory.java:751) */
        beanSerializerFactory.buildMapSerializer(null, null, null, false, null, null, null);
    }
    
    @Test
    public void testBuildMapSerializer5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[9];
        SimpleSerializers simpleSerializers = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        HashMap _classMappings = new HashMap();
        setField(simpleSerializers, "com.fasterxml.jackson.databind.module.SimpleSerializers", "_classMappings", _classMappings);
        _additionalSerializers[0] = ((Serializers) simpleSerializers);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        AsWrapperTypeSerializer asWrapperTypeSerializer = new AsWrapperTypeSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(BasicSerializerFactory.java:751) */
        beanSerializerFactory.buildMapSerializer(serializationConfig, mapType, null, false, null, asWrapperTypeSerializer, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findKeySerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_findKeySerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findKeySerializer_SerializerProviderGetAnnotationIntrospector() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            JsonSerializer actual = beanSerializerFactory._findKeySerializer(impl, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findKeySerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_findKeySerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = prov.getAnnotationIntrospector();
 *  */
    @Test
    public void test_findKeySerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer(BasicSerializerFactory.java:1033) */
        beanSerializerFactory._findKeySerializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_findKeySerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object serDef = intr.findKeySerializer(a);
 *  */
    @Test
    public void test_findKeySerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer(BasicSerializerFactory.java:1034) */
        beanSerializerFactory._findKeySerializer(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findKeySerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    @Test(expected = StackOverflowError.class)
    public void test_findKeySerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        beanSerializerFactory._findKeySerializer(impl, annotatedConstructor);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findKeySerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanSerializerFactory._findKeySerializer(impl, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findKeySerializer3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        beanSerializerFactory._findKeySerializer(impl, annotatedConstructor);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findKeySerializer4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        beanSerializerFactory._findKeySerializer(impl, virtualAnnotatedMember);
    }
    
    @Test
    public void test_findKeySerializer5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:309)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer(BasicSerializerFactory.java:1034) */
        beanSerializerFactory._findKeySerializer(impl, annotatedConstructor);
    }
    
    @Test
    public void test_findKeySerializer6() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
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
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary13 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
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
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams.getAnnotation(AnnotatedWithParams.java:98)
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findKeySerializer(JacksonAnnotationIntrospector.java:448)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:309)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer(BasicSerializerFactory.java:1034) */
        beanSerializerFactory._findKeySerializer(impl, annotatedConstructor);
    }
    
    @Test
    public void test_findKeySerializer7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary13 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
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
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:309)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findKeySerializer(AnnotationIntrospectorPair.java:307)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findKeySerializer(BasicSerializerFactory.java:1034) */
        beanSerializerFactory._findKeySerializer(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory._verifyAsClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyAsClass(java.lang.Object, java.lang.String, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): False}
 * @utbot.executesCondition {@code (!(src instanceof Class)): False}
 * @utbot.executesCondition {@code (cls == noneClass): True}
 *  */
    @Test
    public void test_verifyAsClass_ClsEqualsNoneClass() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        Class class1 = Object.class;
        
        Class actual = beanSerializerFactory._verifyAsClass(class1, null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): False}
 * @utbot.executesCondition {@code (!(src instanceof Class)): False}
 * @utbot.executesCondition {@code (cls == noneClass): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(cls)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isBogusClass(java.lang.Class)}
 *  */
    @Test
    public void test_verifyAsClass_ClassUtilIsBogusClass() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        Class class1 = Object.class;
        
        Class actual = beanSerializerFactory._verifyAsClass(class1, null, null);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): True}
 *  */
    @Test
    public void test_verifyAsClass_SrcEqualsNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        Class actual = beanSerializerFactory._verifyAsClass(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _verifyAsClass(java.lang.Object, java.lang.String, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): False}
 * @utbot.executesCondition {@code (!(src instanceof Class)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !(src instanceof Class)
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_verifyAsClass_ThrowIllegalStateException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        byte[] byteArray = {};
        
        beanSerializerFactory._verifyAsClass(byteArray, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (typeSer != null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.MapperFeature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.returnsFrom {@code return config.isEnabled(MapperFeature.USE_STATIC_TYPING);}
 *  */
    @Test
    public void testUsesStaticTyping_TypeSerEqualsNull() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            
            boolean actual = beanSerializerFactory.usesStaticTyping(serializationConfig, basicBeanDescription, null);
            
            assertFalse(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (typeSer != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testUsesStaticTyping_TypeSerNotEqualsNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        AsExistingPropertyTypeSerializer asExistingPropertyTypeSerializer = new AsExistingPropertyTypeSerializer(null, null, null);
        
        boolean actual = beanSerializerFactory.usesStaticTyping(null, null, asExistingPropertyTypeSerializer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testUsesStaticTyping_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping(BasicSerializerFactory.java:1083) */
        beanSerializerFactory.usesStaticTyping(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerialize.Typing t = intr.findSerializationTyping(beanDesc.getClassInfo());
 *  */
    @Test
    public void testUsesStaticTyping_ThrowNullPointerException_3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping(BasicSerializerFactory.java:1084) */
            beanSerializerFactory.usesStaticTyping(serializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerialize.Typing t = intr.findSerializationTyping(beanDesc.getClassInfo());
 *  */
    @Test
    public void testUsesStaticTyping_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping(BasicSerializerFactory.java:1084) */
        beanSerializerFactory.usesStaticTyping(serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerialize.Typing t = intr.findSerializationTyping(beanDesc.getClassInfo());
 *  */
    @Test
    public void testUsesStaticTyping_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping(BasicSerializerFactory.java:1084) */
        beanSerializerFactory.usesStaticTyping(serializationConfig, basicBeanDescription, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method usesStaticTyping(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    @Test(expected = StackOverflowError.class)
    public void testUsesStaticTyping1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.usesStaticTyping(serializationConfig, basicBeanDescription, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testUsesStaticTyping2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
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
        NopAnnotationIntrospector _primary18 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary17, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary18);
        setField(_primary17, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary17);
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
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.usesStaticTyping(serializationConfig, basicBeanDescription, null);
    }
    
    @Test
    public void testUsesStaticTyping3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
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
        JacksonAnnotationIntrospector _primary16 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
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
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationTyping(JacksonAnnotationIntrospector.java:586)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:377)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping(BasicSerializerFactory.java:1084) */
        beanSerializerFactory.usesStaticTyping(serializationConfig, basicBeanDescription, null);
    }
    
    @Test
    public void testUsesStaticTyping4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary14 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary15 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary16 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary17 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary18 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary17, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary18);
        setField(_primary16, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary17);
        setField(_primary15, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary16);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
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
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:377)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationTyping(AnnotationIntrospectorPair.java:376)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.usesStaticTyping(BasicSerializerFactory.java:1084) */
        beanSerializerFactory.usesStaticTyping(serializationConfig, basicBeanDescription, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildEnumSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildEnumSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value format = beanDesc.findExpectedFormat(null);
 *  */
    @Test
    public void testBuildEnumSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer(BasicSerializerFactory.java:947) */
        beanSerializerFactory.buildEnumSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildEnumSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: enumClass = (Class<Enum<?>>) type.getRawClass()
 *  */
    @Test
    public void testBuildEnumSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer(BasicSerializerFactory.java:955) */
        beanSerializerFactory.buildEnumSerializer(null, null, basicBeanDescription);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildEnumSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildEnumSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.buildEnumSerializer(serializationConfig, null, basicBeanDescription);
    }
    
    @Test
    public void testBuildEnumSerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.EnumValues.constructFromName(EnumValues.java:44)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct(EnumSerializer.java:87)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer(BasicSerializerFactory.java:956) */
        beanSerializerFactory.buildEnumSerializer(serializationConfig, mapLikeType, basicBeanDescription);
    }
    
    @Test
    public void testBuildEnumSerializer3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSerializer(BasicSerializerFactory.java:955) */
        beanSerializerFactory.buildEnumSerializer(null, null, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SerializationConfig config = prov.getConfig();
 *  */
    @Test
    public void testBuildContainerSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:548) */
        beanSerializerFactory.buildContainerSerializer(null, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType elementType = type.getContentType();
 *  */
    @Test
    public void testBuildContainerSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:561) */
        beanSerializerFactory.buildContainerSerializer(impl, null, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#useStaticType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !staticTyping && type.useStaticType()
 *  */
    @Test
    public void testBuildContainerSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:554) */
        beanSerializerFactory.buildContainerSerializer(impl, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    @Test
    public void testBuildContainerSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:555) */
        beanSerializerFactory.buildContainerSerializer(impl, mapType, null, false);
    }
    
    @Test
    public void testBuildContainerSerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:562) */
        beanSerializerFactory.buildContainerSerializer(impl, simpleType, null, false);
    }
    
    @Test
    public void testBuildContainerSerializer3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:562) */
        beanSerializerFactory.buildContainerSerializer(impl, mapType, null, false);
    }
    
    @Test
    public void testBuildContainerSerializer4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:562) */
        beanSerializerFactory.buildContainerSerializer(impl, collectionLikeType, basicBeanDescription, false);
    }
    
    @Test
    public void testBuildContainerSerializer5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:562) */
        beanSerializerFactory.buildContainerSerializer(impl, collectionLikeType, basicBeanDescription, true);
    }
    
    @Test
    public void testBuildContainerSerializer6() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(BasicSerializerFactory.java:562) */
        beanSerializerFactory.buildContainerSerializer(impl, collectionLikeType, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuildContainerSerializer7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        beanSerializerFactory.buildContainerSerializer(impl, collectionLikeType, null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildArraySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.type.ArrayType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildArraySerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (ser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.ArrayType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> raw = type.getRawClass();
 *  */
    @Test
    public void testBuildArraySerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:852) */
        beanSerializerFactory.buildArraySerializer(null, null, null, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildArraySerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ser = serializers.findArraySerializer(config, type, beanDesc, elementTypeSerializer, elementValueSerializer);
 *  */
    @Test
    public void testBuildArraySerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:844) */
        beanSerializerFactory.buildArraySerializer(null, null, null, false, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildArraySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.type.ArrayType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test
    public void testBuildArraySerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig.hasSerializerModifiers(SerializerFactoryConfig.java:85)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:868) */
        beanSerializerFactory.buildArraySerializer(serializationConfig, arrayType, basicBeanDescription, false, null, null);
    }
    
    @Test
    public void testBuildArraySerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[9];
        SimpleSerializers simpleSerializers = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        _additionalSerializers[0] = ((Serializers) simpleSerializers);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:844) */
        beanSerializerFactory.buildArraySerializer(serializationConfig, arrayType, null, false, null, null);
    }
    
    @Test
    public void testBuildArraySerializer3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig.hasSerializerModifiers(SerializerFactoryConfig.java:85)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:868) */
        beanSerializerFactory.buildArraySerializer(null, arrayType, null, false, null, null);
    }
    
    @Test
    public void testBuildArraySerializer4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[9];
        CoreXMLSerializers coreXMLSerializers = ((CoreXMLSerializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLSerializers"));
        _additionalSerializers[0] = ((Serializers) coreXMLSerializers);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:844) */
        beanSerializerFactory.buildArraySerializer(null, null, null, false, null, null);
    }
    
    @Test
    public void testBuildArraySerializer5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers.findStandardImpl(StdArraySerializers.java:46)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(BasicSerializerFactory.java:859) */
        beanSerializerFactory.buildArraySerializer(serializationConfig, arrayType, null, false, asExternalTypeSerializer, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterable.class);
 *  */
    @Test
    public void testBuildIterableSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer(BasicSerializerFactory.java:920) */
        beanSerializerFactory.buildIterableSerializer(null, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterable.class);
 *  */
    @Test
    public void testBuildIterableSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer(BasicSerializerFactory.java:920) */
        beanSerializerFactory.buildIterableSerializer(serializationConfig, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterable.class);
 *  */
    @Test
    public void testBuildIterableSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain(TypeFactory.java:1118)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1091)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:276)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer(BasicSerializerFactory.java:920) */
        beanSerializerFactory.buildIterableSerializer(serializationConfig, referenceType, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterable.class);
 *  */
    @Test
    public void testBuildIterableSerializer_ThrowNullPointerException_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain(TypeFactory.java:1118)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1091)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:276)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer(BasicSerializerFactory.java:920) */
        beanSerializerFactory.buildIterableSerializer(serializationConfig, referenceType, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuildIterableSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        beanSerializerFactory.buildIterableSerializer(serializationConfig, referenceType, basicBeanDescription, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer
    
    ///region OTHER: ERROR SUITE for method buildIterableSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testBuildIterableSerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIterableSerializer(BasicSerializerFactory.java:911) */
        beanSerializerFactory.buildIterableSerializer(serializationConfig, collectionLikeType, null, false, mapType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withAdditionalSerializers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalSerializers() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SimpleSerializers simpleSerializers = new SimpleSerializers();
        
        Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class simpleSerializersType = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
        Method withAdditionalSerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalSerializers", simpleSerializersType);
        withAdditionalSerializersMethod.setAccessible(true);
        java.lang.Object[] withAdditionalSerializersMethodArguments = new java.lang.Object[1];
        withAdditionalSerializersMethodArguments[0] = simpleSerializers;
        BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalSerializersMethod.invoke(beanSerializerFactory, withAdditionalSerializersMethodArguments));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[1];
        SimpleSerializers simpleSerializers1 = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        _additionalSerializers1[0] = ((Serializers) simpleSerializers1);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers1);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalSerializers_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SimpleSerializers simpleSerializers = new SimpleSerializers();
        
        Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class simpleSerializersType = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
        Method withAdditionalSerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalSerializers", simpleSerializersType);
        withAdditionalSerializersMethod.setAccessible(true);
        java.lang.Object[] withAdditionalSerializersMethodArguments = new java.lang.Object[1];
        withAdditionalSerializersMethodArguments[0] = simpleSerializers;
        BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalSerializersMethod.invoke(beanSerializerFactory, withAdditionalSerializersMethodArguments));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
        SimpleSerializers simpleSerializers1 = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        _additionalSerializers1[0] = ((Serializers) simpleSerializers1);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers1);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalSerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalSerializers, 0));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalSerializers0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalSerializers_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[2];
        Serializers.Base base = ((Serializers.Base) createInstance("com.fasterxml.jackson.databind.ser.Serializers$Base"));
        _additionalSerializers[1] = ((Serializers) base);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        Serializers.Base base1 = new Serializers.Base();
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withAdditionalSerializers(base1));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[3];
        _additionalSerializers1[0] = ((Serializers) base);
        _additionalSerializers1[2] = ((Serializers) base);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers1);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalSerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalSerializers, 0));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalSerializers0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalSerializers_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[3];
        Serializers.Base base = ((Serializers.Base) createInstance("com.fasterxml.jackson.databind.ser.Serializers$Base"));
        _additionalSerializers[1] = ((Serializers) base);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        Serializers.Base base1 = new Serializers.Base();
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withAdditionalSerializers(base1));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[4];
        _additionalSerializers1[0] = ((Serializers) base);
        _additionalSerializers1[2] = ((Serializers) base);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers1);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalSerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalSerializers, 0));
        SerializerFactoryConfig serializerFactoryConfig1 = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig1_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalSerializers2 = ((Serializers) get(serializerFactoryConfig1_factoryConfig_additionalSerializers, 2));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalSerializers0);
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalSerializers2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.util.ArrayBuilders#insertInListNoDup(java.lang.Object[],java.lang.Object)} once,
    ///     {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)} twice
    /// return from: {@code return withConfig(_factoryConfig.withAdditionalSerializers(additional));}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.returnsFrom {@code return withConfig(_factoryConfig.withAdditionalSerializers(additional));}
 *  */
    @Test
    public void testWithAdditionalSerializers_ReturnWithConfig() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[1];
        Serializers.Base base = ((Serializers.Base) createInstance("com.fasterxml.jackson.databind.ser.Serializers$Base"));
        _additionalSerializers[0] = ((Serializers) base);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        Serializers.Base base1 = new Serializers.Base();
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withAdditionalSerializers(base1));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
        _additionalSerializers1[0] = ((Serializers) base);
        _additionalSerializers1[1] = ((Serializers) base);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers1);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalKeySerializers, 0));
        SerializerFactoryConfig serializerFactoryConfig1 = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] serializerFactoryConfig1_factoryConfig_modifiers = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getFieldValue(serializerFactoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers"));
        BeanSerializerModifier finalBeanSerializerFactory_factoryConfig_modifiers0 = ((BeanSerializerModifier) get(serializerFactoryConfig1_factoryConfig_modifiers, 0));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0);
        
        assertNull(finalBeanSerializerFactory_factoryConfig_modifiers0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return withConfig(_factoryConfig.withAdditionalSerializers(additional));}
 *  */
    @Test
    public void testWithAdditionalSerializers_ReturnWithConfig_1() throws Exception  {
        Class serializerFactoryConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] prevNO_MODIFIERS = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getStaticFieldValue(serializerFactoryConfigClazz, "NO_MODIFIERS"));
        try {
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] noModifiers = {};
            setStaticField(serializerFactoryConfigClazz, "NO_MODIFIERS", noModifiers);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = new com.fasterxml.jackson.databind.ser.Serializers[1];
            CoreXMLSerializers coreXMLSerializers = ((CoreXMLSerializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLSerializers"));
            _additionalSerializers[0] = ((Serializers) coreXMLSerializers);
            setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {null};
            setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
            setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
            CoreXMLSerializers coreXMLSerializers1 = new CoreXMLSerializers();
            
            Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
            Class coreXMLSerializers1Type = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
            Method withAdditionalSerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalSerializers", coreXMLSerializers1Type);
            withAdditionalSerializersMethod.setAccessible(true);
            java.lang.Object[] withAdditionalSerializersMethodArguments = new java.lang.Object[1];
            withAdditionalSerializersMethodArguments[0] = coreXMLSerializers1;
            BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalSerializersMethod.invoke(beanSerializerFactory, withAdditionalSerializersMethodArguments));
            
            BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
            _additionalSerializers1[0] = ((Serializers) coreXMLSerializers);
            _additionalSerializers1[1] = ((Serializers) coreXMLSerializers);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers1);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
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
            
            SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
            com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
            Serializers finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalKeySerializers, 0));
            
            assertNull(finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0);
        } finally {
            setStaticField(SerializerFactoryConfig.class, "NO_MODIFIERS", prevNO_MODIFIERS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return withConfig(_factoryConfig.withAdditionalSerializers(additional));
 *  */
    @Test
    public void testWithAdditionalSerializers_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withAdditionalSerializers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withAdditionalSerializers(BasicSerializerFactory.java:170) */
        beanSerializerFactory.withAdditionalSerializers(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#withAdditionalSerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withConfig(_factoryConfig.withAdditionalSerializers(additional));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAdditionalSerializers_ThrowIllegalArgumentException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        beanSerializerFactory.withAdditionalSerializers(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withSerializerModifier
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withSerializerModifier(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withSerializerModifier(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#withSerializerModifier(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return withConfig(_factoryConfig.withSerializerModifier(modifier));
 *  */
    @Test
    public void testWithSerializerModifier_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withSerializerModifier] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withSerializerModifier(BasicSerializerFactory.java:188) */
        beanSerializerFactory.withSerializerModifier(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSerializerModifier(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withSerializerModifier(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#withSerializerModifier(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withConfig(_factoryConfig.withSerializerModifier(modifier));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSerializerModifier_ThrowIllegalArgumentException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        beanSerializerFactory.withSerializerModifier(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSuppressableContentValue(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSuppressableContentValue(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (incl != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findSerializationInclusionForContent(com.fasterxml.jackson.annotation.JsonInclude.Include)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSuppressableContentValue_InclEqualsNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Object actual = beanSerializerFactory.findSuppressableContentValue(null, null, basicBeanDescription);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSuppressableContentValue(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSuppressableContentValue(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findSerializationInclusionForContent(com.fasterxml.jackson.annotation.JsonInclude.Include)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonInclude.Include incl = beanDesc.findSerializationInclusionForContent(null);
 *  */
    @Test
    public void testFindSuppressableContentValue_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue(BasicSerializerFactory.java:804) */
        beanSerializerFactory.findSuppressableContentValue(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findSuppressableContentValue(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test
    public void testFindSuppressableContentValue1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        Object actual = beanSerializerFactory.findSuppressableContentValue(null, null, basicBeanDescription);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findSuppressableContentValue(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test(expected = StackOverflowError.class)
    public void testFindSuppressableContentValue2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, mapType, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSuppressableContentValue3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, mapType, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSuppressableContentValue4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, mapType, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSuppressableContentValue5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary2);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, mapType, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSuppressableContentValue6() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary4);
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, mapType, basicBeanDescription);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSuppressableContentValue7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary8 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary8);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        beanSerializerFactory.findSuppressableContentValue(null, null, basicBeanDescription);
    }
    
    @Test
    public void testFindSuppressableContentValue8() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary4 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion(JacksonAnnotationIntrospector.java:491)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:332)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:332)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusionForContent(AnnotationIntrospectorPair.java:340)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSerializationInclusionForContent(BasicBeanDescription.java:389)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue(BasicSerializerFactory.java:804) */
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, null, basicBeanDescription);
    }
    
    @Test
    public void testFindSuppressableContentValue9() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary8 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary8);
        setField(_secondary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary9 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary9);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationInclusion(JacksonAnnotationIntrospector.java:491)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:332)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusionForContent(AnnotationIntrospectorPair.java:340)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSerializationInclusionForContent(BasicBeanDescription.java:389)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue(BasicSerializerFactory.java:804) */
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, mapType, basicBeanDescription);
    }
    
    @Test
    public void testFindSuppressableContentValue10() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
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
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_secondary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
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
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:332)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusionForContent(AnnotationIntrospectorPair.java:340)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSerializationInclusionForContent(BasicBeanDescription.java:389)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue(BasicSerializerFactory.java:804) */
        beanSerializerFactory.findSuppressableContentValue(null, collectionLikeType, basicBeanDescription);
    }
    
    @Test
    public void testFindSuppressableContentValue11() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary7 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary7);
        setField(_secondary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary7);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary8);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:332)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusion(AnnotationIntrospectorPair.java:331)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationInclusionForContent(AnnotationIntrospectorPair.java:341)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findSerializationInclusionForContent(BasicBeanDescription.java:389)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSuppressableContentValue(BasicSerializerFactory.java:804) */
        beanSerializerFactory.findSuppressableContentValue(serializationConfig, null, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return modifySecondaryTypesByAnnotation(config, a, type);}
 *  */
    @Test
    public void testModifyTypeByAnnotation_BasicSerializerFactoryModifySecondaryTypesByAnnotation() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        SimpleType actual = ((SimpleType) beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, simpleType));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> superclass = config.getAnnotationIntrospector().findSerializationType(a);
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation(BasicSerializerFactory.java:980) */
        beanSerializerFactory.modifyTypeByAnnotation(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> superclass = config.getAnnotationIntrospector().findSerializationType(a);
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation(BasicSerializerFactory.java:980) */
        beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testModifyTypeByAnnotation1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        CollectionLikeType actual = ((CollectionLikeType) beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, annotatedParameter, collectionLikeType));
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(collectionLikeType, actual);
    }
    
    @Test
    public void testModifyTypeByAnnotation2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        MapLikeType actual = ((MapLikeType) beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, annotatedParameter, mapLikeType));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = StackOverflowError.class)
    public void testModifyTypeByAnnotation3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, mapType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testModifyTypeByAnnotation4() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testModifyTypeByAnnotation5() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
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
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary11 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary10);
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
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, null);
    }
    
    @Test
    public void testModifyTypeByAnnotation6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(BasicSerializerFactory.java:997)
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation(BasicSerializerFactory.java:988) */
            beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, annotatedClass, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testModifyTypeByAnnotation7() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:359)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation(BasicSerializerFactory.java:980) */
        beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, mapType);
    }
    
    @Test
    public void testModifyTypeByAnnotation8() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary8 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:565)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:359)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findSerializationType(AnnotationIntrospectorPair.java:358)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifyTypeByAnnotation(BasicSerializerFactory.java:980) */
        beanSerializerFactory.modifyTypeByAnnotation(serializationConfig, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findConvertingSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (conv == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findConverter(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return ser;}
 *  */
    @Test
    public void testFindConvertingSerializer_ConvEqualsNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        JsonSerializer actual = beanSerializerFactory.findConvertingSerializer(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_AnnotationIntrospectorFindSerializationContentType() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            
            MapLikeType actual = ((MapLikeType) BasicSerializerFactory.modifySecondaryTypesByAnnotation(serializationConfig, null, mapLikeType));
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(mapLikeType, actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_ReturnType() throws Exception  {
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = ((ReferenceType) BasicSerializerFactory.modifySecondaryTypesByAnnotation(serializationConfig, null, referenceType));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = config.getAnnotationIntrospector();
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(BasicSerializerFactory.java:995) */
        BasicSerializerFactory.modifySecondaryTypesByAnnotation(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isContainerType()
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_ThrowNullPointerException_3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(BasicSerializerFactory.java:997) */
            BasicSerializerFactory.modifySecondaryTypesByAnnotation(serializationConfig, null, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> keyClass = intr.findSerializationKeyType(a, type.getKeyType());
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_ThrowNullPointerException_2() throws Exception  {
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(BasicSerializerFactory.java:998) */
        BasicSerializerFactory.modifySecondaryTypesByAnnotation(serializationConfig, null, collectionLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isContainerType()
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_ThrowNullPointerException_1() throws Exception  {
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(BasicSerializerFactory.java:997) */
        BasicSerializerFactory.modifySecondaryTypesByAnnotation(serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#modifySecondaryTypesByAnnotation(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> keyClass = intr.findSerializationKeyType(a, type.getKeyType());
 *  */
    @Test
    public void testModifySecondaryTypesByAnnotation_ThrowNullPointerException_4() throws Exception  {
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(BasicSerializerFactory.java:998) */
        BasicSerializerFactory.modifySecondaryTypesByAnnotation(serializationConfig, null, mapLikeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapEntrySerializer
    
    ///region OTHER: ERROR SUITE for method buildMapEntrySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testBuildMapEntrySerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapEntrySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapEntrySerializer(BasicSerializerFactory.java:935) */
        beanSerializerFactory.buildMapEntrySerializer(serializationConfig, null, basicBeanDescription, false, null, mapType);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildMapEntrySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuildMapEntrySerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        beanSerializerFactory.buildMapEntrySerializer(serializationConfig, null, null, false, null, mapType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#createTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription bean = config.introspectClassAnnotations(baseType.getRawClass());
 *  */
    @Test
    public void testCreateTypeSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264) */
        beanSerializerFactory.createTypeSerializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#createTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription bean = config.introspectClassAnnotations(baseType.getRawClass());
 *  */
    @Test
    public void testCreateTypeSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264) */
        beanSerializerFactory.createTypeSerializer(null, arrayType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testCreateTypeSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264) */
        beanSerializerFactory.createTypeSerializer(serializationConfig, mapType);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateTypeSerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        beanSerializerFactory.createTypeSerializer(serializationConfig, mapType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withAdditionalKeySerializers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalKeySerializers() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SimpleSerializers simpleSerializers = new SimpleSerializers();
        
        Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class simpleSerializersType = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
        Method withAdditionalKeySerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalKeySerializers", simpleSerializersType);
        withAdditionalKeySerializersMethod.setAccessible(true);
        java.lang.Object[] withAdditionalKeySerializersMethodArguments = new java.lang.Object[1];
        withAdditionalKeySerializersMethodArguments[0] = simpleSerializers;
        BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalKeySerializersMethod.invoke(beanSerializerFactory, withAdditionalKeySerializersMethodArguments));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[1];
        SimpleSerializers simpleSerializers1 = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        _additionalKeySerializers1[0] = ((Serializers) simpleSerializers1);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalKeySerializers_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        SimpleSerializers simpleSerializers = new SimpleSerializers();
        
        Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class simpleSerializersType = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
        Method withAdditionalKeySerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalKeySerializers", simpleSerializersType);
        withAdditionalKeySerializersMethod.setAccessible(true);
        java.lang.Object[] withAdditionalKeySerializersMethodArguments = new java.lang.Object[1];
        withAdditionalKeySerializersMethodArguments[0] = simpleSerializers;
        BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalKeySerializersMethod.invoke(beanSerializerFactory, withAdditionalKeySerializersMethodArguments));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
        SimpleSerializers simpleSerializers1 = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
        _additionalKeySerializers1[0] = ((Serializers) simpleSerializers1);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalKeySerializers, 0));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalKeySerializers_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = new com.fasterxml.jackson.databind.ser.Serializers[2];
        Serializers.Base base = ((Serializers.Base) createInstance("com.fasterxml.jackson.databind.ser.Serializers$Base"));
        _additionalKeySerializers[1] = ((Serializers) base);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        Serializers.Base base1 = new Serializers.Base();
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withAdditionalKeySerializers(base1));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[3];
        _additionalKeySerializers1[0] = ((Serializers) base);
        _additionalKeySerializers1[2] = ((Serializers) base);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalKeySerializers, 0));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 *  */
    @Test
    public void testWithAdditionalKeySerializers_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = new com.fasterxml.jackson.databind.ser.Serializers[3];
        Serializers.Base base = ((Serializers.Base) createInstance("com.fasterxml.jackson.databind.ser.Serializers$Base"));
        _additionalKeySerializers[1] = ((Serializers) base);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        Serializers.Base base1 = new Serializers.Base();
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withAdditionalKeySerializers(base1));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[4];
        _additionalKeySerializers1[0] = ((Serializers) base);
        _additionalKeySerializers1[2] = ((Serializers) base);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {};
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalKeySerializers, 0));
        SerializerFactoryConfig serializerFactoryConfig1 = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig1_factoryConfig_additionalKeySerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalKeySerializers2 = ((Serializers) get(serializerFactoryConfig1_factoryConfig_additionalKeySerializers, 2));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalKeySerializers0);
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalKeySerializers2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.util.ArrayBuilders#insertInListNoDup(java.lang.Object[],java.lang.Object)} once,
    ///     {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withConfig(com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)} twice
    /// return from: {@code return withConfig(_factoryConfig.withAdditionalKeySerializers(additional));}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.returnsFrom {@code return withConfig(_factoryConfig.withAdditionalKeySerializers(additional));}
 *  */
    @Test
    public void testWithAdditionalKeySerializers_ReturnWithConfig() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = new com.fasterxml.jackson.databind.ser.Serializers[1];
        Serializers.Base base = ((Serializers.Base) createInstance("com.fasterxml.jackson.databind.ser.Serializers$Base"));
        _additionalKeySerializers[0] = ((Serializers) base);
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        Serializers.Base base1 = new Serializers.Base();
        
        BeanSerializerFactory actual = ((BeanSerializerFactory) beanSerializerFactory.withAdditionalKeySerializers(base1));
        
        BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
        _additionalKeySerializers1[0] = ((Serializers) base);
        _additionalKeySerializers1[1] = ((Serializers) base);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
        setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
        
        SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
        Serializers finalBeanSerializerFactory_factoryConfig_additionalSerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalSerializers, 0));
        SerializerFactoryConfig serializerFactoryConfig1 = beanSerializerFactory._factoryConfig;
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] serializerFactoryConfig1_factoryConfig_modifiers = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getFieldValue(serializerFactoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers"));
        BeanSerializerModifier finalBeanSerializerFactory_factoryConfig_modifiers0 = ((BeanSerializerModifier) get(serializerFactoryConfig1_factoryConfig_modifiers, 0));
        
        assertNull(finalBeanSerializerFactory_factoryConfig_additionalSerializers0);
        
        assertNull(finalBeanSerializerFactory_factoryConfig_modifiers0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return withConfig(_factoryConfig.withAdditionalKeySerializers(additional));}
 *  */
    @Test
    public void testWithAdditionalKeySerializers_ReturnWithConfig_1() throws Exception  {
        Class serializerFactoryConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] prevNO_MODIFIERS = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getStaticFieldValue(serializerFactoryConfigClazz, "NO_MODIFIERS"));
        try {
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] noModifiers = {};
            setStaticField(serializerFactoryConfigClazz, "NO_MODIFIERS", noModifiers);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {null};
            setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = new com.fasterxml.jackson.databind.ser.Serializers[1];
            CoreXMLSerializers coreXMLSerializers = ((CoreXMLSerializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLSerializers"));
            _additionalKeySerializers[0] = ((Serializers) coreXMLSerializers);
            setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
            setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
            CoreXMLSerializers coreXMLSerializers1 = new CoreXMLSerializers();
            
            Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
            Class coreXMLSerializers1Type = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
            Method withAdditionalKeySerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalKeySerializers", coreXMLSerializers1Type);
            withAdditionalKeySerializersMethod.setAccessible(true);
            java.lang.Object[] withAdditionalKeySerializersMethodArguments = new java.lang.Object[1];
            withAdditionalKeySerializersMethodArguments[0] = coreXMLSerializers1;
            BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalKeySerializersMethod.invoke(beanSerializerFactory, withAdditionalKeySerializersMethodArguments));
            
            BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
            _additionalKeySerializers1[0] = ((Serializers) coreXMLSerializers);
            _additionalKeySerializers1[1] = ((Serializers) coreXMLSerializers);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
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
            
            SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
            com.fasterxml.jackson.databind.ser.Serializers[] serializerFactoryConfig_factoryConfig_additionalSerializers = ((com.fasterxml.jackson.databind.ser.Serializers[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers"));
            Serializers finalBeanSerializerFactory_factoryConfig_additionalSerializers0 = ((Serializers) get(serializerFactoryConfig_factoryConfig_additionalSerializers, 0));
            
            assertNull(finalBeanSerializerFactory_factoryConfig_additionalSerializers0);
        } finally {
            setStaticField(SerializerFactoryConfig.class, "NO_MODIFIERS", prevNO_MODIFIERS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return withConfig(_factoryConfig.withAdditionalKeySerializers(additional));}
 *  */
    @Test
    public void testWithAdditionalKeySerializers_ReturnWithConfig_2() throws Exception  {
        Class serializerFactoryConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig");
        com.fasterxml.jackson.databind.ser.Serializers[] prevNO_SERIALIZERS = ((com.fasterxml.jackson.databind.ser.Serializers[]) getStaticFieldValue(serializerFactoryConfigClazz, "NO_SERIALIZERS"));
        try {
            com.fasterxml.jackson.databind.ser.Serializers[] noSerializers = {};
            setStaticField(serializerFactoryConfigClazz, "NO_SERIALIZERS", noSerializers);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers = new com.fasterxml.jackson.databind.ser.Serializers[1];
            SimpleSerializers simpleSerializers = ((SimpleSerializers) createInstance("com.fasterxml.jackson.databind.module.SimpleSerializers"));
            _additionalKeySerializers[0] = ((Serializers) simpleSerializers);
            setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers);
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] _modifiers = {null};
            setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
            setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
            SimpleSerializers simpleSerializers1 = new SimpleSerializers();
            
            Class basicSerializerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
            Class simpleSerializers1Type = Class.forName("com.fasterxml.jackson.databind.ser.Serializers");
            Method withAdditionalKeySerializersMethod = basicSerializerFactoryClazz.getDeclaredMethod("withAdditionalKeySerializers", simpleSerializers1Type);
            withAdditionalKeySerializersMethod.setAccessible(true);
            java.lang.Object[] withAdditionalKeySerializersMethodArguments = new java.lang.Object[1];
            withAdditionalKeySerializersMethodArguments[0] = simpleSerializers1;
            BeanSerializerFactory actual = ((BeanSerializerFactory) withAdditionalKeySerializersMethod.invoke(beanSerializerFactory, withAdditionalKeySerializersMethodArguments));
            
            BeanSerializerFactory expected = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            SerializerFactoryConfig _factoryConfig1 = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", noSerializers);
            com.fasterxml.jackson.databind.ser.Serializers[] _additionalKeySerializers1 = new com.fasterxml.jackson.databind.ser.Serializers[2];
            _additionalKeySerializers1[0] = ((Serializers) simpleSerializers);
            _additionalKeySerializers1[1] = ((Serializers) simpleSerializers);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalKeySerializers", _additionalKeySerializers1);
            setField(_factoryConfig1, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers", _modifiers);
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
            
            SerializerFactoryConfig serializerFactoryConfig = beanSerializerFactory._factoryConfig;
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier[] serializerFactoryConfig_factoryConfig_modifiers = ((com.fasterxml.jackson.databind.ser.BeanSerializerModifier[]) getFieldValue(serializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_modifiers"));
            BeanSerializerModifier finalBeanSerializerFactory_factoryConfig_modifiers0 = ((BeanSerializerModifier) get(serializerFactoryConfig_factoryConfig_modifiers, 0));
            
            assertNull(finalBeanSerializerFactory_factoryConfig_modifiers0);
        } finally {
            setStaticField(SerializerFactoryConfig.class, "NO_SERIALIZERS", prevNO_SERIALIZERS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return withConfig(_factoryConfig.withAdditionalKeySerializers(additional));
 *  */
    @Test
    public void testWithAdditionalKeySerializers_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withAdditionalKeySerializers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.withAdditionalKeySerializers(BasicSerializerFactory.java:179) */
        beanSerializerFactory.withAdditionalKeySerializers(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig#withAdditionalKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withConfig(_factoryConfig.withAdditionalKeySerializers(additional));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAdditionalKeySerializers_ThrowIllegalArgumentException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        beanSerializerFactory.withAdditionalKeySerializers(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByPrimaryType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializerByPrimaryType(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByPrimaryType(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findOptionalStdSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 *  */
    @Test
    public void testFindSerializerByPrimaryType_BasicSerializerFactoryFindOptionalStdSerializer() throws Exception  {
        OptionalHandlerFactory prevInstance = OptionalHandlerFactory.instance;
        try {
            OptionalHandlerFactory instance = ((OptionalHandlerFactory) createInstance("com.fasterxml.jackson.databind.ext.OptionalHandlerFactory"));
            Class optionalHandlerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ext.OptionalHandlerFactory");
            setStaticField(optionalHandlerFactoryClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            JsonSerializer actual = beanSerializerFactory.findSerializerByPrimaryType(impl, arrayType, null, false);
            
            assertNull(actual);
            
            Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialArrayType_class == finalArrayType_class);
        } finally {
            setStaticField(OptionalHandlerFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializerByPrimaryType(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByPrimaryType(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> raw = type.getRawClass();
 *  */
    @Test
    public void testFindSerializerByPrimaryType_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByPrimaryType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByPrimaryType(BasicSerializerFactory.java:380) */
        beanSerializerFactory.findSerializerByPrimaryType(null, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerFromAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializerFromAnnotation(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerFromAnnotation(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializerFromAnnotation_SerializerProviderGetAnnotationIntrospector() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            JsonSerializer actual = beanSerializerFactory.findSerializerFromAnnotation(impl, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializerFromAnnotation(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerFromAnnotation(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object serDef = prov.getAnnotationIntrospector().findSerializer(a);
 *  */
    @Test
    public void testFindSerializerFromAnnotation_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerFromAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerFromAnnotation(BasicSerializerFactory.java:497) */
        beanSerializerFactory.findSerializerFromAnnotation(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerFromAnnotation(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object serDef = prov.getAnnotationIntrospector().findSerializer(a);
 *  */
    @Test
    public void testFindSerializerFromAnnotation_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerFromAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerFromAnnotation(BasicSerializerFactory.java:497) */
        beanSerializerFactory.findSerializerFromAnnotation(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterator.class);
 *  */
    @Test
    public void testBuildIteratorSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer(BasicSerializerFactory.java:897) */
        beanSerializerFactory.buildIteratorSerializer(null, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterator.class);
 *  */
    @Test
    public void testBuildIteratorSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer(BasicSerializerFactory.java:897) */
        beanSerializerFactory.buildIteratorSerializer(serializationConfig, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterator.class);
 *  */
    @Test
    public void testBuildIteratorSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain(TypeFactory.java:1118)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1091)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:276)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer(BasicSerializerFactory.java:897) */
        beanSerializerFactory.buildIteratorSerializer(serializationConfig, referenceType, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(type, Iterator.class);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildIteratorSerializer_ThrowIllegalArgumentException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        beanSerializerFactory.buildIteratorSerializer(serializationConfig, referenceType, null, false);
    }
    ///endregion
    
    ///region Errors report for buildIteratorSerializer
    
    public void testBuildIteratorSerializer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer
    
    ///region OTHER: ERROR SUITE for method buildIteratorSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testBuildIteratorSerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createTypeSerializer(BasicSerializerFactory.java:264)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIteratorSerializer(BasicSerializerFactory.java:890) */
        beanSerializerFactory.buildIteratorSerializer(serializationConfig, collectionLikeType, null, false, mapType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildIndexedListSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildIndexedListSerializer(com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIndexedListSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return new IndexedListSerializer(elemType, staticTyping, vts, valueSerializer);}
 *  */
    @Test
    public void testBuildIndexedListSerializer_Return_1() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            IndexedListSerializer actual = ((IndexedListSerializer) beanSerializerFactory.buildIndexedListSerializer(null, false, null, null));
            
            IndexedListSerializer expected = ((IndexedListSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = List.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            assertNull(actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertFalse(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIndexedListSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return new IndexedListSerializer(elemType, staticTyping, vts, valueSerializer);}
 *  */
    @Test
    public void testBuildIndexedListSerializer_Return_2() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            IndexedListSerializer actual = ((IndexedListSerializer) beanSerializerFactory.buildIndexedListSerializer(null, true, null, null));
            
            IndexedListSerializer expected = ((IndexedListSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping", true);
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = List.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            assertNull(actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertTrue(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildIndexedListSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return new IndexedListSerializer(elemType, staticTyping, vts, valueSerializer);}
 *  */
    @Test
    public void testBuildIndexedListSerializer_Return() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            IndexedListSerializer actual = ((IndexedListSerializer) beanSerializerFactory.buildIndexedListSerializer(arrayType, false, null, null));
            
            IndexedListSerializer expected = ((IndexedListSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType", arrayType);
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = List.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType expected_elementType = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertFalse(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
            Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialArrayType_class == finalArrayType_class);
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildEnumSetSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildEnumSetSerializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildEnumSetSerializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new EnumSetSerializer(enumType);}
 *  */
    @Test
    public void testBuildEnumSetSerializer_Return() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            EnumSetSerializer actual = ((EnumSetSerializer) beanSerializerFactory.buildEnumSetSerializer(null));
            
            EnumSetSerializer expected = ((EnumSetSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping", true);
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = java.util.EnumSet.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            assertNull(actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertTrue(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription beanDesc = config.introspectClassAnnotations(keyType.getRawClass());
 *  */
    @Test
    public void testCreateKeySerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:210) */
        beanSerializerFactory.createKeySerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription beanDesc = config.introspectClassAnnotations(keyType.getRawClass());
 *  */
    @Test
    public void testCreateKeySerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:210) */
        beanSerializerFactory.createKeySerializer(null, arrayType, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test
    public void testCreateKeySerializer1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:210) */
        beanSerializerFactory.createKeySerializer(serializationConfig, mapLikeType, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateKeySerializer2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        beanSerializerFactory.createKeySerializer(serializationConfig, mapLikeType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findOptionalStdSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findOptionalStdSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findOptionalStdSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ext.OptionalHandlerFactory#findSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 *  */
    @Test
    public void testFindOptionalStdSerializer_OptionalHandlerFactoryFindSerializer() throws Exception  {
        OptionalHandlerFactory prevInstance = OptionalHandlerFactory.instance;
        try {
            OptionalHandlerFactory instance = ((OptionalHandlerFactory) createInstance("com.fasterxml.jackson.databind.ext.OptionalHandlerFactory"));
            Class optionalHandlerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ext.OptionalHandlerFactory");
            setStaticField(optionalHandlerFactoryClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            JsonSerializer actual = beanSerializerFactory.findOptionalStdSerializer(impl, arrayType, null, false);
            
            assertNull(actual);
            
            Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialArrayType_class == finalArrayType_class);
        } finally {
            setStaticField(OptionalHandlerFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findOptionalStdSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findOptionalStdSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return OptionalHandlerFactory.instance.findSerializer(prov.getConfig(), type, beanDesc);
 *  */
    @Test
    public void testFindOptionalStdSerializer_ThrowNullPointerException() throws Exception  {
        OptionalHandlerFactory prevInstance = OptionalHandlerFactory.instance;
        try {
            OptionalHandlerFactory instance = ((OptionalHandlerFactory) createInstance("com.fasterxml.jackson.databind.ext.OptionalHandlerFactory"));
            Class optionalHandlerFactoryClazz = Class.forName("com.fasterxml.jackson.databind.ext.OptionalHandlerFactory");
            setStaticField(optionalHandlerFactoryClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findOptionalStdSerializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findOptionalStdSerializer(BasicSerializerFactory.java:451) */
            beanSerializerFactory.findOptionalStdSerializer(null, null, null, false);
        } finally {
            setStaticField(OptionalHandlerFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildCollectionSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (ser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value format = beanDesc.findExpectedFormat(null);
 *  */
    @Test
    public void testBuildCollectionSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(BasicSerializerFactory.java:657) */
        beanSerializerFactory.buildCollectionSerializer(null, null, null, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.iterates iterate the loop {@code for(Serializers serializers: customSerializers())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ser = serializers.findCollectionSerializer(config, type, beanDesc, elementTypeSerializer, elementValueSerializer);
 *  */
    @Test
    public void testBuildCollectionSerializer_ThrowNullPointerException_3() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(BasicSerializerFactory.java:647) */
        beanSerializerFactory.buildCollectionSerializer(null, null, null, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (ser == null): True}
 * @utbot.executesCondition {@code (format != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> raw = type.getRawClass();
 *  */
    @Test
    public void testBuildCollectionSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(BasicSerializerFactory.java:661) */
        beanSerializerFactory.buildCollectionSerializer(null, null, basicBeanDescription, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (ser == null): True}
 * @utbot.executesCondition {@code (format != null): False}
 * @utbot.executesCondition {@code (EnumSet.class.isAssignableFrom(raw)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isEnumType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !enumType.isEnumType()
 *  */
    @Test
    public void testBuildCollectionSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        SerializerFactoryConfig _factoryConfig = ((SerializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"));
        com.fasterxml.jackson.databind.ser.Serializers[] _additionalSerializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "_additionalSerializers", _additionalSerializers);
        setField(beanSerializerFactory, "com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_factoryConfig", _factoryConfig);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(BasicSerializerFactory.java:671) */
        beanSerializerFactory.buildCollectionSerializer(null, collectionType, basicBeanDescription, false, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildCollectionSerializer(com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return new CollectionSerializer(elemType, staticTyping, vts, valueSerializer);}
 *  */
    @Test
    public void testBuildCollectionSerializer_Return_1() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            CollectionSerializer actual = ((CollectionSerializer) beanSerializerFactory.buildCollectionSerializer(null, false, null, null));
            
            CollectionSerializer expected = ((CollectionSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CollectionSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = java.util.Collection.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            assertNull(actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertFalse(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return new CollectionSerializer(elemType, staticTyping, vts, valueSerializer);}
 *  */
    @Test
    public void testBuildCollectionSerializer_Return_2() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            
            CollectionSerializer actual = ((CollectionSerializer) beanSerializerFactory.buildCollectionSerializer(null, true, null, null));
            
            CollectionSerializer expected = ((CollectionSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CollectionSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping", true);
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = java.util.Collection.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            assertNull(actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertTrue(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#buildCollectionSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return new CollectionSerializer(elemType, staticTyping, vts, valueSerializer);}
 *  */
    @Test
    public void testBuildCollectionSerializer_Return() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionSerializer actual = ((CollectionSerializer) beanSerializerFactory.buildCollectionSerializer(arrayType, false, null, null));
            
            CollectionSerializer expected = ((CollectionSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CollectionSerializer"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType", arrayType);
            setField(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers", forProperties);
            Class _handledType = java.util.Collection.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            JavaType expected_elementType = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementType"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            BeanProperty actual_property = ((BeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_property"));
            assertNull(actual_property);
            
            boolean actual_staticTyping = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_staticTyping"));
            assertFalse(actual_staticTyping);
            
            Boolean actual_unwrapSingle = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_unwrapSingle"));
            assertNull(actual_unwrapSingle);
            
            TypeSerializer actual_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_valueTypeSerializer"));
            assertNull(actual_valueTypeSerializer);
            
            JsonSerializer actual_elementSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_elementSerializer"));
            assertNull(actual_elementSerializer);
            
            PropertySerializerMap expected_dynamicSerializers = ((PropertySerializerMap) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            PropertySerializerMap actual_dynamicSerializers = ((PropertySerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase", "_dynamicSerializers"));
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
            assertEquals(Class.class, actual_handledType.getClass());
            
            Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialArrayType_class == finalArrayType_class);
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAddonType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializerByAddonType(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAddonType(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.executesCondition {@code (Iterator.class.isAssignableFrom(type)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getTypeFactory()}
 *  */
    @Test
    public void testFindSerializerByAddonType_IteratorClassIsAssignableFrom() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonSerializer actual = beanSerializerFactory.findSerializerByAddonType(null, arrayType, null, false);
        
        assertNull(actual);
        
        Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialArrayType_class == finalArrayType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializerByAddonType(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAddonType(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> type = javaType.getRawClass();
 *  */
    @Test
    public void testFindSerializerByAddonType_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAddonType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAddonType(BasicSerializerFactory.java:465) */
        beanSerializerFactory.findSerializerByAddonType(null, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAddonType(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.executesCondition {@code (Iterator.class.isAssignableFrom(type)): False}
 * @utbot.executesCondition {@code (Iterable.class.isAssignableFrom(type)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType[] params = config.getTypeFactory().findTypeParameters(javaType, Iterable.class);
 *  */
    @Test
    public void testFindSerializerByAddonType_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAddonType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAddonType(BasicSerializerFactory.java:467) */
        beanSerializerFactory.findSerializerByAddonType(null, arrayType, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findContentSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findContentSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_findContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findContentSerializer_SerializerProviderGetAnnotationIntrospector() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            JsonSerializer actual = beanSerializerFactory._findContentSerializer(impl, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findContentSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_findContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = prov.getAnnotationIntrospector();
 *  */
    @Test
    public void test_findContentSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findContentSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findContentSerializer(BasicSerializerFactory.java:1050) */
        beanSerializerFactory._findContentSerializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#_findContentSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object serDef = intr.findContentSerializer(a);
 *  */
    @Test
    public void test_findContentSerializer_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findContentSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory._findContentSerializer(BasicSerializerFactory.java:1051) */
        beanSerializerFactory._findContentSerializer(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByLookup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializerByLookup(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByLookup(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.executesCondition {@code (type.isReferenceType()): True}
 * @utbot.executesCondition {@code (type.isTypeOrSubTypeOf(AtomicReference.class)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isReferenceType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isTypeOrSubTypeOf(java.lang.Class)}
 * @utbot.returnsFrom {@code return new AtomicReferenceSerializer((ReferenceType) type);}
 *  */
    @Test
    public void testFindSerializerByLookup_TypeIsTypeOrSubTypeOf() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonSerializer actual = beanSerializerFactory.findSerializerByLookup(referenceType, null, null, false);
        
        assertNull(actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializerByLookup(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, boolean)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByLookup(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> raw = type.getRawClass();
 *  */
    @Test
    public void testFindSerializerByLookup_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByLookup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByLookup(BasicSerializerFactory.java:307) */
        beanSerializerFactory.findSerializerByLookup(null, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByLookup(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String clsName = raw.getName();
 *  */
    @Test
    public void testFindSerializerByLookup_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByLookup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByLookup(BasicSerializerFactory.java:308) */
        beanSerializerFactory.findSerializerByLookup(arrayType, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializerByAnnotations_ReturnNull() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonSerializer actual = beanSerializerFactory.findSerializerByAnnotations(null, arrayType, basicBeanDescription);
        
        assertNull(actual);
        
        Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialArrayType_class == finalArrayType_class);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindSerializerByAnnotations_ReturnNull_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        LinkedList _jsonValueGetters = new LinkedList();
        _jsonValueGetters.add(null);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_jsonValueGetters", _jsonValueGetters);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonSerializer actual = beanSerializerFactory.findSerializerByAnnotations(null, arrayType, basicBeanDescription);
        
        assertNull(actual);
        
        Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialArrayType_class == finalArrayType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (JsonSerializable.class.isAssignableFrom(raw)): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: AnnotatedMethod valueMethod = beanDesc.findJsonValueMethod();
 *  */
    @Test
    public void testFindSerializerByAnnotations_ThrowIndexOutOfBoundsException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        LinkedList _jsonValueGetters = new LinkedList();
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_jsonValueGetters", _jsonValueGetters);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations] produces [java.lang.IndexOutOfBoundsException: Index: 0, Size: 0]
            java.base/java.util.LinkedList.checkElementIndex(LinkedList.java:559)
            java.base/java.util.LinkedList.get(LinkedList.java:480)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueMethod(POJOPropertiesCollector.java:178)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.findJsonValueMethod(BasicBeanDescription.java:223)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations(BasicSerializerFactory.java:355) */
        beanSerializerFactory.findSerializerByAnnotations(null, arrayType, basicBeanDescription);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> raw = type.getRawClass();
 *  */
    @Test
    public void testFindSerializerByAnnotations_ThrowNullPointerException() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations(BasicSerializerFactory.java:349) */
        beanSerializerFactory.findSerializerByAnnotations(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (JsonSerializable.class.isAssignableFrom(raw)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findJsonValueMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMethod valueMethod = beanDesc.findJsonValueMethod();
 *  */
    @Test
    public void testFindSerializerByAnnotations_ThrowNullPointerException_1() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations(BasicSerializerFactory.java:351) */
        beanSerializerFactory.findSerializerByAnnotations(null, arrayType, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasicSerializerFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BasicSerializerFactory#findSerializerByAnnotations(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (JsonSerializable.class.isAssignableFrom(raw)): False}
 * @utbot.executesCondition {@code (valueMethod != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getAnnotated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prov.canOverrideAccessModifiers()
 *  */
    @Test
    public void testFindSerializerByAnnotations_ThrowNullPointerException_2() throws Exception  {
        BeanSerializerFactory beanSerializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        POJOPropertiesCollector _propCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_collected", true);
        LinkedList _jsonValueGetters = new LinkedList();
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(annotatedMethod, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        _jsonValueGetters.add(annotatedMethod);
        setField(_propCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_jsonValueGetters", _jsonValueGetters);
        setField(basicBeanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_propCollector", _propCollector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByAnnotations(BasicSerializerFactory.java:358) */
        beanSerializerFactory.findSerializerByAnnotations(null, arrayType, basicBeanDescription);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1068148528753900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1068148528753900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1068148528759199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1068148528753900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1068148528759199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1068148529207600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1068148529207600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1068148529208700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1068148529207600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1068148529208700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1068148529431700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1068148529431700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1068148529432799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1068148529431700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1068148529432799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1068148532833000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1068148532833000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1068148532835400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1068148532833000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1068148532835400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

