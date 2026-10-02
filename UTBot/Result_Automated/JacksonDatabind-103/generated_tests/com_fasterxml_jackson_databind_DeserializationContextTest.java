package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.security.SecureClassLoader;
import java.util.Locale;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import java.util.SimpleTimeZone;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import java.util.Calendar;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.util.LinkedList;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.BeanProperty.Bogus;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.nio.charset.CharacterCodingException;
import java.time.temporal.UnsupportedTemporalTypeException;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder;
import com.fasterxml.jackson.databind.util.ArrayBuilders.ByteBuilder;
import com.fasterxml.jackson.databind.util.ArrayBuilders.ShortBuilder;
import com.fasterxml.jackson.databind.util.ArrayBuilders.IntBuilder;
import com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder;
import com.fasterxml.jackson.databind.util.ArrayBuilders.FloatBuilder;
import com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder;
import java.sql.Date;
import sun.util.BuddhistCalendar;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.InputStream;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_DeserializationContextTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFactory()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getFactory()}
 * @utbot.returnsFrom {@code return _factory;}
 *  */
    @Test
    public void testGetFactory_Return_factory() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        BeanDeserializerFactory actual = ((BeanDeserializerFactory) impl.getFactory());
        
        BeanDeserializerFactory expected = new BeanDeserializerFactory(null);
        
        DeserializerFactoryConfig actual_factoryConfig = ((DeserializerFactoryConfig) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig"));
        assertNull(actual_factoryConfig);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.findClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findClass(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getTypeFactory().findClass(className);
 *  */
    @Test
    public void testFindClass_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findClass(DeserializationContext.java:557) */
        impl.findClass(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method findClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findClass(java.lang.String)}
 * @utbot.returnsFrom {@code return getTypeFactory().findClass(className);}
 * @utbot.throwsException {@link java.lang.ClassNotFoundException} in: return getTypeFactory().findClass(className);
 *  */
    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_ThrowClassNotFoundException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SecureClassLoader _classLoader = ((SecureClassLoader) createInstance("java.security.SecureClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = ".";
        
        impl.findClass(string);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findClass(java.lang.String)}
 * @utbot.returnsFrom {@code return getTypeFactory().findClass(className);}
 * @utbot.throwsException {@link java.lang.ClassNotFoundException} in: return getTypeFactory().findClass(className);
 *  */
    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_ThrowClassNotFoundException_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = ".";
        
        impl.findClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.setAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAttribute(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#setAttribute(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.ContextAttributes#withPerCallAttribute(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _attributes = _attributes.withPerCallAttribute(key, value);
 *  */
    @Test
    public void testSetAttribute_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.setAttribute] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.setAttribute(DeserializationContext.java:289) */
        impl.setAttribute(((Object) null), ((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAttribute(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getAttribute(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.ContextAttributes#getAttribute(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _attributes.getAttribute(key);
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getAttribute] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getAttribute(DeserializationContext.java:283) */
        impl.getAttribute(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocale()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getLocale()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getLocale()}
 * @utbot.returnsFrom {@code return _config.getLocale();}
 *  */
    @Test
    public void testGetLocale_DeserializationConfigGetLocale() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Locale actual = impl.getLocale();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLocale()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getLocale()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getLocale()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getLocale();
 *  */
    @Test
    public void testGetLocale_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getLocale] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getLocale(DeserializationContext.java:261) */
        impl.getLocale();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.isEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEnabled(com.fasterxml.jackson.databind.MapperFeature)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.returnsFrom {@code return _config.isEnabled(feature);}
 *  */
    @Test
    public void testIsEnabled_Return_configIsEnabled() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapperFeature mapperFeature = MapperFeature.AUTO_DETECT_FIELDS;
        
        boolean actual = impl.isEnabled(mapperFeature);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.returnsFrom {@code return _config.isEnabled(feature);}
 *  */
    @Test
    public void testIsEnabled_Return_configIsEnabled_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -5);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapperFeature mapperFeature = MapperFeature.AUTO_DETECT_FIELDS;
        
        boolean actual = impl.isEnabled(mapperFeature);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEnabled(com.fasterxml.jackson.databind.MapperFeature)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.isEnabled(feature);
 *  */
    @Test
    public void testIsEnabled_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.isEnabled] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.isEnabled(DeserializationContext.java:235) */
        impl.isEnabled(((MapperFeature) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.isEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return (_featureFlags & feat.getMask()) != 0;}
 *  */
    @Test
    public void testIsEnabled__featureFlagsBitwiseAndFeatGetMaskEqualsZero() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS;
        
        boolean actual = impl.isEnabled(deserializationFeature);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return (_featureFlags & feat.getMask()) != 0;}
 *  */
    @Test
    public void testIsEnabled__featureFlagsBitwiseAndFeatGetMaskNotEqualsZero() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 255);
        DeserializationFeature deserializationFeature = DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY;
        
        boolean actual = impl.isEnabled(deserializationFeature);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationFeature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_featureFlags & feat.getMask()) != 0;
 *  */
    @Test
    public void testIsEnabled_ThrowNullPointerException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.isEnabled] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.isEnabled(DeserializationContext.java:331) */
        impl.isEnabled(((DeserializationFeature) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.readValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readValue(com.fasterxml.jackson.core.JsonParser, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#readValue(com.fasterxml.jackson.core.JsonParser,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return readValue(p, getTypeFactory().constructType(type));
 *  */
    @Test
    public void testReadValue_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.readValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.readValue(DeserializationContext.java:747) */
        impl.readValue(((JsonParser) null), ((Class) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readValue(com.fasterxml.jackson.core.JsonParser, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testReadValue1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        impl.readValue(((JsonParser) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.readValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#readValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findRootValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JsonDeserializer<Object> deser = findRootValueDeserializer(type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        impl.readValue(((JsonParser) null), ((JavaType) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getTimeZone()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getTimeZone()}
 * @utbot.returnsFrom {@code return _config.getTimeZone();}
 *  */
    @Test
    public void testGetTimeZone_DeserializationConfigGetTimeZone() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleTimeZone _timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_timeZone", _timeZone);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        SimpleTimeZone actual = ((SimpleTimeZone) impl.getTimeZone());
        
        // java.util.SimpleTimeZone has overridden equals method
        assertEquals(_timeZone, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getTimeZone()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getTimeZone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getTimeZone();
 *  */
    @Test
    public void testGetTimeZone_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getTimeZone] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTimeZone(DeserializationContext.java:272) */
        impl.getTimeZone();
    }
    ///endregion
    
    ///region Errors report for getTimeZone
    
    public void testGetTimeZone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeFactory()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getTypeFactory()}
 * @utbot.returnsFrom {@code return _config.getTypeFactory();}
 *  */
    @Test
    public void testGetTypeFactory_DeserializationConfigGetTypeFactory() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        TypeFactory actual = impl.getTypeFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeFactory()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getTypeFactory();
 *  */
    @Test
    public void testGetTypeFactory_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250) */
        impl.getTypeFactory();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getNodeFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNodeFactory()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getNodeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getNodeFactory()}
 * @utbot.returnsFrom {@code return _config.getNodeFactory();}
 *  */
    @Test
    public void testGetNodeFactory_DeserializationConfigGetNodeFactory() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonNodeFactory actual = impl.getNodeFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNodeFactory()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getNodeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getNodeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getNodeFactory();
 *  */
    @Test
    public void testGetNodeFactory_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getNodeFactory] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getNodeFactory(DeserializationContext.java:404) */
        impl.getNodeFactory();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null)): True}
 * @utbot.returnsFrom {@code return (cls == null) ? null : _config.constructType(cls);}
 *  */
    @Test
    public void testConstructType_ClsEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JavaType actual = impl.constructType(((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.executesCondition {@code ((cls == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#constructType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _config.constructType(cls)
 *  */
    @Test
    public void testConstructType_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.constructType(DeserializationContext.java:543) */
        impl.constructType(class1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructType(java.lang.Class)
    
    @Test
    public void testConstructType1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) impl.constructType(class1));
        
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getDateFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDateFormat()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.executesCondition {@code (_dateFormat != null): False}
 * @utbot.returnsFrom {@code return df;}
 *  */
    @Test
    public void testGetDateFormat__dateFormatEqualsNull_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        ISO8601DateFormat actual = ((ISO8601DateFormat) impl.getDateFormat());
        
        Calendar actualCalendar = actual.getCalendar();
        assertNull(actualCalendar);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.executesCondition {@code (_dateFormat != null): True}
 * @utbot.returnsFrom {@code return _dateFormat;}
 *  */
    @Test
    public void testGetDateFormat__dateFormatNotEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        SimpleDateFormat actual = ((SimpleDateFormat) impl.getDateFormat());
        
        // java.text.SimpleDateFormat has overridden equals method
        assertEquals(_dateFormat, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.executesCondition {@code (_dateFormat != null): False}
 * @utbot.returnsFrom {@code return df;}
 *  */
    @Test
    public void testGetDateFormat__dateFormatEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        DateFormat initialImpl_dateFormat = impl._dateFormat;
        
        StdDateFormat actual = ((StdDateFormat) impl.getDateFormat());
        
        StdDateFormat expected = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        
        // com.fasterxml.jackson.databind.util.StdDateFormat has overridden equals method
        assertEquals(expected, actual);
        
        DateFormat finalImpl_dateFormat = impl._dateFormat;
        
        assertFalse(initialImpl_dateFormat == finalImpl_dateFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateFormat()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getDateFormat()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DateFormat df = _config.getDateFormat();
 *  */
    @Test
    public void testGetDateFormat_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getDateFormat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1773) */
        impl.getDateFormat();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.invokes {@link java.text.DateFormat#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _dateFormat = df = (DateFormat) df.clone();
 *  */
    @Test
    public void testGetDateFormat_ThrowNullPointerException_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getDateFormat] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1774) */
        impl.getDateFormat();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _dateFormat = df = (DateFormat) df.clone();
 *  */
    @Test
    public void testGetDateFormat_ThrowNullPointerException_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getDateFormat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1774) */
        impl.getDateFormat();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findRootValueDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findRootValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> deser = _cache.findValueDeserializer(this, _factory, type);
 *  */
    @Test
    public void testFindRootValueDeserializer_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:477) */
        impl.findRootValueDeserializer(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRootValueDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findRootValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JsonDeserializer<Object> deser = _cache.findValueDeserializer(this, _factory, type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRootValueDeserializer_ThrowIllegalArgumentException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        impl.findRootValueDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportBadDefinition
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportBadDefinition(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadDefinition(com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.exc.InvalidDefinitionException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.InvalidDefinitionException} in: throw InvalidDefinitionException.from(_parser, msg, type);
 *  */
    @Test(expected = InvalidDefinitionException.class)
    public void testReportBadDefinition_ThrowInvalidDefinitionException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        impl.reportBadDefinition(((JavaType) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.hasValueDeserializerFor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasValueDeserializerFor(com.fasterxml.jackson.databind.JavaType, java.util.concurrent.atomic.AtomicReference)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasValueDeserializerFor(com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference)}
 * @utbot.executesCondition {@code (cause == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#set(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasValueDeserializerFor_Catch_cacheHasValueDeserializerFor() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AtomicReference atomicReference = new AtomicReference(null);
        
        Object initialAtomicReferenceValue = getFieldValue(atomicReference, "java.util.concurrent.atomic.AtomicReference", "value");
        
        boolean actual = impl.hasValueDeserializerFor(null, atomicReference);
        
        assertFalse(actual);
        
        Object finalAtomicReferenceValue = getFieldValue(atomicReference, "java.util.concurrent.atomic.AtomicReference", "value");
        
        assertFalse(initialAtomicReferenceValue == finalAtomicReferenceValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasValueDeserializerFor(com.fasterxml.jackson.databind.JavaType, java.util.concurrent.atomic.AtomicReference)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasValueDeserializerFor(com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference)}
 * @utbot.executesCondition {@code (cause == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: cause == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasValueDeserializerFor_ThrowIllegalArgumentException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        impl.hasValueDeserializerFor(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasValueDeserializerFor(com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference)}
 * @utbot.executesCondition {@code (cause == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cause == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testHasValueDeserializerFor_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        impl.hasValueDeserializerFor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParser()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.returnsFrom {@code return _parser;}
 *  */
    @Test
    public void testGetParser_Return_parser() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonParser actual = impl.getParser();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.instantiationException
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method instantiationException(java.lang.Class, java.lang.String)
    
    @Test
    public void testInstantiationException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        
        InvalidDefinitionException actual = ((InvalidDefinitionException) impl.instantiationException(((Class) null), string));
        
        InvalidDefinitionException expected = ((InvalidDefinitionException) createInstance("com.fasterxml.jackson.databind.exc.InvalidDefinitionException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 5;
        shortArray[1] = (short) 22;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 15400960;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidDefinitionException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class3);
        objectArray[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class6);
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class13);
        objectArray[15] = ((Object) class13);
        objectArray[16] = ((Object) class13);
        objectArray[17] = ((Object) class13);
        objectArray[18] = ((Object) class13);
        objectArray[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class14);
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class17);
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class20);
        objectArray[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class21);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708318668064L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot construct instance of [null]: ";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        assertNull(actual_type);
        
        BeanDescription actual_beanDesc = ((BeanDescription) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_beanDesc"));
        assertNull(actual_beanDesc);
        
        BeanPropertyDefinition actual_property = ((BeanPropertyDefinition) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_property"));
        assertNull(actual_property);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testInstantiationException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        
        InvalidDefinitionException actual = ((InvalidDefinitionException) impl.instantiationException(class1, ((String) null)));
        
        InvalidDefinitionException expected = ((InvalidDefinitionException) createInstance("com.fasterxml.jackson.databind.exc.InvalidDefinitionException"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type", _type);
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 5;
        shortArray[1] = (short) 22;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 15400960;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class2 = InvalidDefinitionException.class;
        objectArray[0] = ((Object) class2);
        Class class3 = DeserializationContext.class;
        objectArray[1] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class4);
        objectArray[3] = ((Object) class4);
        Class class5 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class5);
        Class class6 = Method.class;
        objectArray[5] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class7);
        objectArray[7] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class11);
        Class class12 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class12);
        Class class13 = java.security.AccessController.class;
        objectArray[13] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class14);
        objectArray[15] = ((Object) class14);
        objectArray[16] = ((Object) class14);
        objectArray[17] = ((Object) class14);
        objectArray[18] = ((Object) class14);
        objectArray[19] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class15);
        objectArray[21] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class16);
        Class class17 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class18);
        objectArray[25] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class20);
        Class class21 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class21);
        objectArray[29] = ((Object) class21);
        Class class22 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class22);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708318668064L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot construct instance of `java.lang.Object`: null";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
        BeanDescription actual_beanDesc = ((BeanDescription) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_beanDesc"));
        assertNull(actual_beanDesc);
        
        BeanPropertyDefinition actual_property = ((BeanPropertyDefinition) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_property"));
        assertNull(actual_property);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.hasDeserializationFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasDeserializationFeatures(int)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasDeserializationFeatures(int)}
 * @utbot.returnsFrom {@code return (_featureFlags & featureMask) == featureMask;}
 *  */
    @Test
    public void testHasDeserializationFeatures__featureFlagsBitwiseAndFeatureMaskEqualsFeatureMask() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -1);
        
        boolean actual = impl.hasDeserializationFeatures(-1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasDeserializationFeatures(int)}
 * @utbot.returnsFrom {@code return (_featureFlags & featureMask) == featureMask;}
 *  */
    @Test
    public void testHasDeserializationFeatures__featureFlagsBitwiseAndFeatureMaskNotEqualsFeatureMask() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -2);
        
        boolean actual = impl.hasDeserializationFeatures(-1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleMissingInstantiator(java.lang.Class, com.fasterxml.jackson.databind.deser.ValueInstantiator, com.fasterxml.jackson.core.JsonParser, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleMissingInstantiator(java.lang.Class,com.fasterxml.jackson.databind.deser.ValueInstantiator,com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Object[])}
 * @utbot.executesCondition {@code (p == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleMissingInstantiator_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1005) */
        impl.handleMissingInstantiator(null, null, uTF8StreamJsonParser, null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleMissingInstantiator(java.lang.Class,com.fasterxml.jackson.databind.deser.ValueInstantiator,com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Object[])}
 * @utbot.executesCondition {@code (p == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleMissingInstantiator_ThrowNullPointerException_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1005) */
        impl.handleMissingInstantiator(null, null, null, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportUnresolvedObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportUnresolvedObjectId(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportUnresolvedObjectId(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#classNameOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ClassUtil.classNameOf(bean)
 *  */
    @Test
    public void testReportUnresolvedObjectId_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnresolvedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportUnresolvedObjectId(DeserializationContext.java:1302) */
        impl.reportUnresolvedObjectId(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportUnresolvedObjectId(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader, java.lang.Object)
    
    @Test
    public void testReportUnresolvedObjectId1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnresolvedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportUnresolvedObjectId(DeserializationContext.java:1302) */
        impl.reportUnresolvedObjectId(null, object);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportUnresolvedObjectId(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader, java.lang.Object)
    
    @Test(expected = MismatchedInputException.class)
    public void testReportUnresolvedObjectId2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object object = new Object();
        
        impl.reportUnresolvedObjectId(objectIdReader, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.invalidTypeIdException
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method invalidTypeIdException(com.fasterxml.jackson.databind.JavaType, java.lang.String, java.lang.String)
    
    @Test
    public void testInvalidTypeIdException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        InvalidTypeIdException actual = ((InvalidTypeIdException) impl.invalidTypeIdException(null, null, null));
        
        InvalidTypeIdException expected = ((InvalidTypeIdException) createInstance("com.fasterxml.jackson.databind.exc.InvalidTypeIdException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 1;
        shortArray[1] = (short) 33;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 8585216;
        intArray[1] = 16121856;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidTypeIdException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class3);
        objectArray[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class6);
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class13);
        objectArray[15] = ((Object) class13);
        objectArray[16] = ((Object) class13);
        objectArray[17] = ((Object) class13);
        objectArray[18] = ((Object) class13);
        objectArray[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class14);
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class17);
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class20);
        objectArray[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class21);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708318668592L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Could not resolve type id 'null' as a subtype of null";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType actual_baseType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidTypeIdException", "_baseType"));
        assertNull(actual_baseType);
        
        String actual_typeId = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidTypeIdException", "_typeId"));
        assertNull(actual_typeId);
        
        Class actual_targetType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.MismatchedInputException", "_targetType"));
        assertNull(actual_targetType);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getDefaultPropertyFormat
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultPropertyFormat(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDefaultPropertyFormat(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getDefaultPropertyFormat(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getDefaultPropertyFormat(baseType);
 *  */
    @Test
    public void testGetDefaultPropertyFormat_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getDefaultPropertyFormat] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getDefaultPropertyFormat(DeserializationContext.java:240) */
        impl.getDefaultPropertyFormat(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDefaultPropertyFormat(java.lang.Class)
    
    @Test
    public void testGetDefaultPropertyFormat1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        
        JsonFormat.Value actual = impl.getDefaultPropertyFormat(class1);
        
        JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "";
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetDefaultPropertyFormat2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonFormat.Value actual = impl.getDefaultPropertyFormat(class1);
        
        JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "";
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetDefaultPropertyFormat3() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            JsonFormat.Value actual = impl.getDefaultPropertyFormat(null);
            
            JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
            
            // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
            assertEquals(expected, actual);
            
            DeserializationConfig deserializationConfig = impl._config;
            ConfigOverrides deserializationConfig_config_configOverrides = ((ConfigOverrides) getFieldValue(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
            Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(deserializationConfig_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
            
            assertNull(finalImpl_config_configOverrides_overrides);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnexpectedToken(java.lang.Class, com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleUnexpectedToken(instClass, p.getCurrentToken(), p, null);
 *  */
    @Test
    public void testHandleUnexpectedToken_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093) */
        impl.handleUnexpectedToken(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleUnexpectedToken(java.lang.Class, com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = StackOverflowError.class)
    public void testHandleUnexpectedToken1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        impl.handleUnexpectedToken(class1, jsonParserDelegate2);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method handleUnexpectedToken(java.lang.Class, com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        impl.handleUnexpectedToken(class1, jsonParserSequence);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        impl.handleUnexpectedToken(class1, jsonParserDelegate);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        impl.handleUnexpectedToken(null, jsonParserDelegate);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        impl.handleUnexpectedToken(null, jsonParserDelegate);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnexpectedToken(java.lang.Class, com.fasterxml.jackson.core.JsonToken, com.fasterxml.jackson.core.JsonParser, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonToken,com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleUnexpectedToken_ThrowNullPointerException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116) */
        impl.handleUnexpectedToken(null, null, null, null, objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleUnexpectedToken(java.lang.Class, com.fasterxml.jackson.core.JsonToken, com.fasterxml.jackson.core.JsonParser, java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testHandleUnexpectedToken6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1115) */
        impl.handleUnexpectedToken(null, jsonToken, null, null, objectArray);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method handleUnexpectedToken(java.lang.Class, com.fasterxml.jackson.core.JsonToken, com.fasterxml.jackson.core.JsonParser, java.lang.String, [Ljava.lang.Object;)
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        impl.handleUnexpectedToken(class1, jsonToken, null, null, objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken8() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        java.lang.Object[] objectArray = {};
        
        impl.handleUnexpectedToken(class1, null, null, null, objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken9() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        impl.handleUnexpectedToken(null, jsonToken, null, null, objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken10() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        String string = "";
        java.lang.Object[] objectArray = {};
        
        impl.handleUnexpectedToken(null, jsonToken, null, string, objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testHandleUnexpectedToken11() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        java.lang.Object[] objectArray = {};
        
        impl.handleUnexpectedToken(null, null, null, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.canOverrideAccessModifiers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canOverrideAccessModifiers()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#canOverrideAccessModifiers()}
 * @utbot.returnsFrom {@code return _config.canOverrideAccessModifiers();}
 *  */
    @Test
    public void testCanOverrideAccessModifiers_Return_configCanOverrideAccessModifiers() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        boolean actual = impl.canOverrideAccessModifiers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#canOverrideAccessModifiers()}
 * @utbot.returnsFrom {@code return _config.canOverrideAccessModifiers();}
 *  */
    @Test
    public void testCanOverrideAccessModifiers_Return_configCanOverrideAccessModifiers_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        boolean actual = impl.canOverrideAccessModifiers();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canOverrideAccessModifiers()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#canOverrideAccessModifiers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#canOverrideAccessModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.canOverrideAccessModifiers();
 *  */
    @Test
    public void testCanOverrideAccessModifiers_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.canOverrideAccessModifiers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.canOverrideAccessModifiers(DeserializationContext.java:230) */
        impl.canOverrideAccessModifiers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException
    
    ///region OTHER: ERROR SUITE for method reportWrongTokenException(java.lang.Class, com.fasterxml.jackson.core.JsonToken, java.lang.String, [Ljava.lang.Object;)
    
    @Test(expected = StackOverflowError.class)
    public void testReportWrongTokenException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", _parser);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        impl.reportWrongTokenException(((Class) null), jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1291) */
        impl.reportWrongTokenException(class1, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate _parser = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1292) */
        impl.reportWrongTokenException(class1, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1292) */
        impl.reportWrongTokenException(class1, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        Class class1 = Object.class;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1292) */
        impl.reportWrongTokenException(class1, ((JsonToken) null), ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException
    
    ///region OTHER: ERROR SUITE for method reportWrongTokenException(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.JsonToken, java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testReportWrongTokenException6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1373) */
        impl.reportWrongTokenException(jsonParserSequence, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1515)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1374) */
        impl.reportWrongTokenException(filteringParserDelegate, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException8() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1515)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1374) */
        impl.reportWrongTokenException(jsonParserDelegate, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException9() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        String string = "";
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1515)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1374) */
        impl.reportWrongTokenException(jsonParserDelegate, ((JsonToken) null), string, objectArray);
    }
    
    @Test
    public void testReportWrongTokenException10() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1515)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1374) */
        impl.reportWrongTokenException(jsonParserDelegate2, jsonToken, ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException
    
    ///region OTHER: ERROR SUITE for method reportWrongTokenException(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.JsonToken, java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testReportWrongTokenException11() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PlaceholderForType placeholderForType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        JsonToken jsonToken = JsonToken.START_OBJECT;
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1273) */
        impl.reportWrongTokenException(placeholderForType, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException12() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate _parser = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1274) */
        impl.reportWrongTokenException(((JavaType) null), jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException13() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1274) */
        impl.reportWrongTokenException(((JavaType) null), jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException14() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1274) */
        impl.reportWrongTokenException(simpleType, jsonToken, ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportWrongTokenException(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.core.JsonToken, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportWrongTokenException(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.core.JsonToken,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw wrongTokenException(getParser(), deser.handledType(), expToken, msg);
 *  */
    @Test
    public void testReportWrongTokenException_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1256) */
        impl.reportWrongTokenException(((JsonDeserializer) null), ((JsonToken) null), ((String) null), objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportWrongTokenException(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.core.JsonToken, java.lang.String, [Ljava.lang.Object;)
    
    @Test(expected = StackOverflowError.class)
    public void testReportWrongTokenException15() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        impl.reportWrongTokenException(stdDelegatingDeserializer, jsonToken, ((String) null), objectArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testReportWrongTokenException16() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", stdDelegatingDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        impl.reportWrongTokenException(typeWrappedDeserializer, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException17() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AbstractDeserializer abstractDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1255) */
        impl.reportWrongTokenException(abstractDeserializer, jsonToken, ((String) null), objectArray);
    }
    
    @Test
    public void testReportWrongTokenException18() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:152)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1256) */
        impl.reportWrongTokenException(stdDelegatingDeserializer, jsonToken, ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportUnknownProperty(java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportUnknownProperty(java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 *  */
    @Test
    public void testReportUnknownProperty_DeserializationContextIsEnabled() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        impl.reportUnknownProperty(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportUnknownProperty(java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test
    public void testReportUnknownProperty1() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16);
        Object object = new Object();
        String string = "";
        Object factoryBasedEnumDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(UnrecognizedPropertyException.java:61)
            com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty(DeserializationContext.java:1396) */
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.String");
        Class factoryBasedEnumDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method reportUnknownPropertyMethod = deserializationContextClazz.getDeclaredMethod("reportUnknownProperty", objectType, stringType, factoryBasedEnumDeserializerType);
        reportUnknownPropertyMethod.setAccessible(true);
        java.lang.Object[] reportUnknownPropertyMethodArguments = new java.lang.Object[3];
        reportUnknownPropertyMethodArguments[0] = object;
        reportUnknownPropertyMethodArguments[1] = string;
        reportUnknownPropertyMethodArguments[2] = factoryBasedEnumDeserializer;
        try {
            reportUnknownPropertyMethod.invoke(impl, reportUnknownPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReportUnknownProperty2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16);
        Class class1 = Object.class;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(UnrecognizedPropertyException.java:61)
            com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty(DeserializationContext.java:1396) */
        impl.reportUnknownProperty(class1, string, null);
    }
    
    @Test
    public void testReportUnknownProperty3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(UnrecognizedPropertyException.java:61)
            com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty(DeserializationContext.java:1396) */
        impl.reportUnknownProperty(object, string, null);
    }
    
    @Test
    public void testReportUnknownProperty4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16);
        Object object = new Object();
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((Converter) null));
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(UnrecognizedPropertyException.java:61)
            com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty(DeserializationContext.java:1396) */
        impl.reportUnknownProperty(object, null, typeWrappedDeserializer);
    }
    
    @Test
    public void testReportUnknownProperty5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16);
        Object object = new Object();
        String string = "";
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer2 = new TypeWrappedDeserializer(null, typeWrappedDeserializer1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getKnownPropertyNames(TypeWrappedDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getKnownPropertyNames(TypeWrappedDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.getKnownPropertyNames(TypeWrappedDeserializer.java:52)
            com.fasterxml.jackson.databind.DeserializationContext.reportUnknownProperty(DeserializationContext.java:1395) */
        impl.reportUnknownProperty(object, string, typeWrappedDeserializer2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.missingTypeIdException
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method missingTypeIdException(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    @Test
    public void testMissingTypeIdException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        InvalidTypeIdException actual = ((InvalidTypeIdException) impl.missingTypeIdException(null, null));
        
        InvalidTypeIdException expected = ((InvalidTypeIdException) createInstance("com.fasterxml.jackson.databind.exc.InvalidTypeIdException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 1;
        shortArray[1] = (short) 43;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 8585216;
        intArray[1] = 12517376;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidTypeIdException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class3);
        objectArray[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class6);
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class13);
        objectArray[15] = ((Object) class13);
        objectArray[16] = ((Object) class13);
        objectArray[17] = ((Object) class13);
        objectArray[18] = ((Object) class13);
        objectArray[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class14);
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class17);
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class20);
        objectArray[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class21);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708318669264L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Missing type id when trying to resolve subtype of null";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType actual_baseType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidTypeIdException", "_baseType"));
        assertNull(actual_baseType);
        
        String actual_typeId = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidTypeIdException", "_typeId"));
        assertNull(actual_typeId);
        
        Class actual_targetType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.MismatchedInputException", "_targetType"));
        assertNull(actual_targetType);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method missingTypeIdException(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    @Test
    public void testMissingTypeIdException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.missingTypeIdException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:134)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DeserializationContext.missingTypeIdException(DeserializationContext.java:1643) */
        impl.missingTypeIdException(collectionType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportMappingException
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportMappingException(java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportMappingException(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw JsonMappingException.from(getParser(), _format(msg, msgArgs));
 *  */
    @Test(expected = JsonMappingException.class)
    public void testReportMappingException_ThrowJsonMappingException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {};
        
        impl.reportMappingException(null, objectArray);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportMappingException(java.lang.String, [Ljava.lang.Object;)
    
    @Test(expected = JsonMappingException.class)
    public void testReportMappingException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        impl.reportMappingException(string, objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportMappingException(java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testReportMappingException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportMappingException] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportMappingException(DeserializationContext.java:1702) */
        impl.reportMappingException(null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.unknownTypeException
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unknownTypeException(com.fasterxml.jackson.databind.JavaType, java.lang.String, java.lang.String)
    
    @Test
    public void testUnknownTypeException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        MismatchedInputException actual = ((MismatchedInputException) impl.unknownTypeException(null, null, null));
        
        MismatchedInputException expected = ((MismatchedInputException) createInstance("com.fasterxml.jackson.databind.exc.MismatchedInputException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 4;
        shortArray[1] = (short) 36;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7536640;
        intArray[1] = 16842752;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = MismatchedInputException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class3);
        objectArray[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class6);
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class13);
        objectArray[15] = ((Object) class13);
        objectArray[16] = ((Object) class13);
        objectArray[17] = ((Object) class13);
        objectArray[18] = ((Object) class13);
        objectArray[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class14);
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class17);
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class20);
        objectArray[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class21);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708318668784L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Could not resolve type id 'null' into a subtype of null";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        Class actual_targetType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.MismatchedInputException", "_targetType"));
        assertNull(actual_targetType);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getAnnotationIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotationIntrospector()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return _config.getAnnotationIntrospector();}
 *  */
    @Test
    public void testGetAnnotationIntrospector_Return_configGetAnnotationIntrospector_1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            NopAnnotationIntrospector actual = ((NopAnnotationIntrospector) impl.getAnnotationIntrospector());
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return _config.getAnnotationIntrospector();}
 *  */
    @Test
    public void testGetAnnotationIntrospector_Return_configGetAnnotationIntrospector() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        AnnotationIntrospector actual = impl.getAnnotationIntrospector();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAnnotationIntrospector()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getAnnotationIntrospector();
 *  */
    @Test
    public void testGetAnnotationIntrospector_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getAnnotationIntrospector] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getAnnotationIntrospector(DeserializationContext.java:245) */
        impl.getAnnotationIntrospector();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> deser = _cache.findValueDeserializer(this, _factory, type);
 *  */
    @Test
    public void testFindContextualValueDeserializer_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444) */
        impl.findContextualValueDeserializer(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JsonDeserializer<Object> deser = _cache.findValueDeserializer(this, _factory, type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindContextualValueDeserializer_ThrowIllegalArgumentException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        impl.findContextualValueDeserializer(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testFindContextualValueDeserializer1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomHandlers(DeserializerCache.java:556)
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:207)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444) */
        impl.findContextualValueDeserializer(mapLikeType, null);
    }
    
    @Test
    public void testFindContextualValueDeserializer2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444) */
        impl.findContextualValueDeserializer(collectionLikeType, null);
    }
    
    @Test
    public void testFindContextualValueDeserializer3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        PlaceholderForType _elementType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:139)
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:444) */
        impl.findContextualValueDeserializer(collectionLikeType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findKeyDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findKeyDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: KeyDeserializer kd = _cache.findKeyDeserializer(this, _factory, keyType);
 *  */
    @Test
    public void testFindKeyDeserializer_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:500) */
        impl.findKeyDeserializer(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findKeyDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testFindKeyDeserializer1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:773)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.<init>(AnnotatedClassResolver.java:44)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolve(AnnotatedClassResolver.java:69)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector._resolveAnnotatedClass(BasicClassIntrospector.java:282)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:192)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:112)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:16)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:731)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1634)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166)
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:500) */
        impl.findKeyDeserializer(mapType, null);
    }
    
    @Test
    public void testFindKeyDeserializer2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:773)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.<init>(AnnotatedClassResolver.java:44)
            com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.resolve(AnnotatedClassResolver.java:69)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector._resolveAnnotatedClass(BasicClassIntrospector.java:282)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:192)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:112)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:16)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:731)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1634)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166)
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:500) */
        impl.findKeyDeserializer(simpleType, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findKeyDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindKeyDeserializer3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        impl.findKeyDeserializer(simpleType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handlePrimaryContextualization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handlePrimaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handlePrimaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (deser instanceof ContextualDeserializer): False}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testHandlePrimaryContextualization_NotDeserNotInstanceOfContextualDeserializer() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonDeserializer actual = impl.handlePrimaryContextualization(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handlePrimaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (deser instanceof ContextualDeserializer): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ContextualDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.LinkedNode#next()}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testHandlePrimaryContextualization_DeserInstanceOfContextualDeserializer() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) impl.handlePrimaryContextualization(stdDelegatingDeserializer, null, null));
        
        Converter actual_converter = ((Converter) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
        assertNull(actual_converter);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        String actual_delegateDeserializer_message = ((String) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
        assertNull(actual_delegateDeserializer_message);
        
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        assertTrue(deepEquals(stdDelegatingDeserializer, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handlePrimaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization1() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method handlePrimaryContextualizationMethod = deserializationContextClazz.getDeclaredMethod("handlePrimaryContextualization", collectionDeserializerType, singleViewType, javaTypeType);
        handlePrimaryContextualizationMethod.setAccessible(true);
        java.lang.Object[] handlePrimaryContextualizationMethodArguments = new java.lang.Object[3];
        handlePrimaryContextualizationMethodArguments[0] = collectionDeserializer;
        handlePrimaryContextualizationMethodArguments[1] = singleView;
        handlePrimaryContextualizationMethodArguments[2] = ((Object) null);
        try {
            handlePrimaryContextualizationMethod.invoke(impl, handlePrimaryContextualizationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        impl.handlePrimaryContextualization(stdDelegatingDeserializer, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization3() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedNode _currentType = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        impl._currentType = _currentType;
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        PlaceholderForType _arrayDelegateType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType", _arrayDelegateType);
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method handlePrimaryContextualizationMethod = deserializationContextClazz.getDeclaredMethod("handlePrimaryContextualization", collectionDeserializerType, singleViewType, javaTypeType);
        handlePrimaryContextualizationMethod.setAccessible(true);
        java.lang.Object[] handlePrimaryContextualizationMethodArguments = new java.lang.Object[3];
        handlePrimaryContextualizationMethodArguments[0] = collectionDeserializer;
        handlePrimaryContextualizationMethodArguments[1] = singleView;
        handlePrimaryContextualizationMethodArguments[2] = ((Object) null);
        try {
            handlePrimaryContextualizationMethod.invoke(impl, handlePrimaryContextualizationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        
        impl.handlePrimaryContextualization(collectionDeserializer, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        BeanProperty.Bogus bogus = new BeanProperty.Bogus();
        
        impl.handlePrimaryContextualization(collectionDeserializer, bogus, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        impl.handlePrimaryContextualization(collectionDeserializer, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        impl.handlePrimaryContextualization(collectionDeserializer, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization8() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        Object _converter = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        SimpleType _inputType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_converter, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType", _inputType);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter", _converter);
        
        impl.handlePrimaryContextualization(stdDelegatingDeserializer, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization9() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        Object _converter = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        MapType _inputType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_converter, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType", _inputType);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter", _converter);
        
        impl.handlePrimaryContextualization(stdDelegatingDeserializer, null, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testHandlePrimaryContextualization10() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        LinkedNode _currentType = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        SimpleType value = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_currentType, "com.fasterxml.jackson.databind.util.LinkedNode", "value", value);
        impl._currentType = _currentType;
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class valueType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method handlePrimaryContextualizationMethod = deserializationContextClazz.getDeclaredMethod("handlePrimaryContextualization", collectionDeserializerType, valueInjectorType, valueType);
        handlePrimaryContextualizationMethod.setAccessible(true);
        java.lang.Object[] handlePrimaryContextualizationMethodArguments = new java.lang.Object[3];
        handlePrimaryContextualizationMethodArguments[0] = collectionDeserializer;
        handlePrimaryContextualizationMethodArguments[1] = valueInjector;
        handlePrimaryContextualizationMethodArguments[2] = value;
        try {
            handlePrimaryContextualizationMethod.invoke(impl, handlePrimaryContextualizationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNativeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleWeirdNativeValue(com.fasterxml.jackson.databind.JavaType, java.lang.Object, com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdNativeValue(com.fasterxml.jackson.databind.JavaType,java.lang.Object,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleWeirdNativeValue_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNativeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNativeValue(DeserializationContext.java:961) */
        impl.handleWeirdNativeValue(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdNativeValue(com.fasterxml.jackson.databind.JavaType,java.lang.Object,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Class<?> raw = targetType.getRawClass();
 *  */
    @Test
    public void testHandleWeirdNativeValue_ThrowNullPointerException_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNativeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNativeValue(DeserializationContext.java:962) */
        impl.handleWeirdNativeValue(null, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method handleWeirdNativeValue(com.fasterxml.jackson.databind.JavaType, java.lang.Object, com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = Exception.class)
    public void testHandleWeirdNativeValue1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        impl.handleWeirdNativeValue(mapType, object, uTF8DataInputJsonParser);
    }
    
    @Test(expected = Exception.class)
    public void testHandleWeirdNativeValue2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser _parser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        impl.handleWeirdNativeValue(mapType, object, uTF8StreamJsonParser);
    }
    
    @Test(expected = Exception.class)
    public void testHandleWeirdNativeValue3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        impl.handleWeirdNativeValue(mapLikeType, object, uTF8DataInputJsonParser);
    }
    
    @Test(expected = Exception.class)
    public void testHandleWeirdNativeValue4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object object = new Object();
        
        impl.handleWeirdNativeValue(mapType, object, null);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testHandleWeirdNativeValue5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        impl.handleWeirdNativeValue(mapType, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleInstantiationProblem(java.lang.Class, java.lang.Object, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleInstantiationProblem(java.lang.Class,java.lang.Object,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleInstantiationProblem_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1056) */
        impl.handleInstantiationProblem(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method handleInstantiationProblem(java.lang.Class, java.lang.Object, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleInstantiationProblem(java.lang.Class,java.lang.Object,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.nio.charset.CharacterCodingException} in: ClassUtil.throwIfIOE(t);
 *  */
    @Test(expected = CharacterCodingException.class)
    public void testHandleInstantiationProblem_ThrowCharacterCodingException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CharacterCodingException characterCodingException = ((CharacterCodingException) createInstance("java.nio.charset.CharacterCodingException"));
        
        impl.handleInstantiationProblem(null, null, characterCodingException);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method handleInstantiationProblem(java.lang.Class, java.lang.Object, java.lang.Throwable)
    
    @Test(expected = InvalidDefinitionException.class)
    public void testHandleInstantiationProblem1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        UnsupportedTemporalTypeException unsupportedTemporalTypeException = ((UnsupportedTemporalTypeException) createInstance("java.time.temporal.UnsupportedTemporalTypeException"));
        
        impl.handleInstantiationProblem(null, object, unsupportedTemporalTypeException);
    }
    
    @Test(expected = InvalidDefinitionException.class)
    public void testHandleInstantiationProblem2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        Object object = new Object();
        
        impl.handleInstantiationProblem(class1, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleUnknownTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String)}
 * @utbot.executesCondition {@code (!isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 *  */
    @Test
    public void testHandleUnknownTypeId_NotIsEnabled() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        JavaType actual = impl.handleUnknownTypeId(null, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleUnknownTypeId_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownTypeId(DeserializationContext.java:1166) */
        impl.handleUnknownTypeId(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, java.lang.String)
    
    @Test(expected = InvalidTypeIdException.class)
    public void testHandleUnknownTypeId1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        PlaceholderForType placeholderForType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        String string = "";
        
        impl.handleUnknownTypeId(placeholderForType, null, null, string);
    }
    
    @Test(expected = InvalidTypeIdException.class)
    public void testHandleUnknownTypeId2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        String string = "";
        
        impl.handleUnknownTypeId(null, string, null, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: throw MismatchedInputException.from(getParser(), type, msg);
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch_ThrowMismatchedInputException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(((BeanProperty) null), ((String) null), objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: throw MismatchedInputException.from(getParser(), type, msg);
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch_ThrowMismatchedInputException_1() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        SimpleType _declaredType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        java.lang.Object[] objectArray = {};
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringType = Class.forName("java.lang.String");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method reportInputMismatchMethod = deserializationContextClazz.getDeclaredMethod("reportInputMismatch", singleViewType, stringType, objectArrayType);
        reportInputMismatchMethod.setAccessible(true);
        java.lang.Object[] reportInputMismatchMethodArguments = new java.lang.Object[3];
        reportInputMismatchMethodArguments[0] = singleView;
        reportInputMismatchMethodArguments[1] = ((Object) null);
        reportInputMismatchMethodArguments[2] = ((Object) objectArray);
        try {
            reportInputMismatchMethod.invoke(impl, reportInputMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: throw MismatchedInputException.from(getParser(), type, msg);
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch_ThrowMismatchedInputException_2() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        AttributePropertyWriter _property = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        SimpleType _declaredType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_property, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_property", _property);
        java.lang.Object[] objectArray = {};
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringType = Class.forName("java.lang.String");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method reportInputMismatchMethod = deserializationContextClazz.getDeclaredMethod("reportInputMismatch", mapPropertyType, stringType, objectArrayType);
        reportInputMismatchMethod.setAccessible(true);
        java.lang.Object[] reportInputMismatchMethodArguments = new java.lang.Object[3];
        reportInputMismatchMethodArguments[0] = mapProperty;
        reportInputMismatchMethodArguments[1] = ((Object) null);
        reportInputMismatchMethodArguments[2] = ((Object) objectArray);
        try {
            reportInputMismatchMethod.invoke(impl, reportInputMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty, java.lang.String, [Ljava.lang.Object;)
    
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanProperty.Bogus bogus = new BeanProperty.Bogus();
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(bogus, ((String) null), objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch2() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        MapProperty _property = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        UnwrappingBeanPropertyWriter _property1 = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        setField(_property, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_property", _property1);
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_property", _property);
        java.lang.Object[] objectArray = {};
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringType = Class.forName("java.lang.String");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method reportInputMismatchMethod = deserializationContextClazz.getDeclaredMethod("reportInputMismatch", mapPropertyType, stringType, objectArrayType);
        reportInputMismatchMethod.setAccessible(true);
        java.lang.Object[] reportInputMismatchMethodArguments = new java.lang.Object[3];
        reportInputMismatchMethodArguments[0] = mapProperty;
        reportInputMismatchMethodArguments[1] = ((Object) null);
        reportInputMismatchMethodArguments[2] = ((Object) objectArray);
        try {
            reportInputMismatchMethod.invoke(impl, reportInputMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch3() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringType = Class.forName("java.lang.String");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method reportInputMismatchMethod = deserializationContextClazz.getDeclaredMethod("reportInputMismatch", valueInjectorType, stringType, objectArrayType);
        reportInputMismatchMethod.setAccessible(true);
        java.lang.Object[] reportInputMismatchMethodArguments = new java.lang.Object[3];
        reportInputMismatchMethodArguments[0] = valueInjector;
        reportInputMismatchMethodArguments[1] = string;
        reportInputMismatchMethodArguments[2] = ((Object) objectArray);
        try {
            reportInputMismatchMethod.invoke(impl, reportInputMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty, java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testReportInputMismatch4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch(DeserializationContext.java:1315) */
        impl.reportInputMismatch(((BeanProperty) null), ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportInputMismatch(com.fasterxml.jackson.databind.JavaType, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportInputMismatch(com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.exc.MismatchedInputException#from(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: throw MismatchedInputException.from(getParser(), targetType, msg);
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch_ThrowMismatchedInputException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(((JavaType) null), ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportInputMismatch(java.lang.Class, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportInputMismatch(java.lang.Class,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.exc.MismatchedInputException#from(com.fasterxml.jackson.core.JsonParser,java.lang.Class,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: throw MismatchedInputException.from(getParser(), targetType, msg);
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testReportInputMismatch_ThrowMismatchedInputException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(((Class) null), ((String) null), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw MismatchedInputException.from(getParser(), src.handledType(), msg);
 *  */
    @Test
    public void testReportInputMismatch_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch(DeserializationContext.java:1330) */
        impl.reportInputMismatch(((JsonDeserializer) null), ((String) null), objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer, java.lang.String, [Ljava.lang.Object;)
    
    @Test(expected = StackOverflowError.class)
    public void testReportInputMismatch5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", stdDelegatingDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(typeWrappedDeserializer, ((String) null), objectArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testReportInputMismatch6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(typeWrappedDeserializer, ((String) null), objectArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testReportInputMismatch7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", stdDelegatingDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(typeWrappedDeserializer1, ((String) null), objectArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testReportInputMismatch8() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer2 = new TypeWrappedDeserializer(null, typeWrappedDeserializer1);
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(typeWrappedDeserializer2, ((String) null), objectArray);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testReportInputMismatch9() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", stdDelegatingDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        java.lang.Object[] objectArray = {};
        
        impl.reportInputMismatch(typeWrappedDeserializer1, ((String) null), objectArray);
    }
    
    @Test
    public void testReportInputMismatch10() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object objectDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch(DeserializationContext.java:1329) */
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Class stringType = Class.forName("java.lang.String");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method reportInputMismatchMethod = deserializationContextClazz.getDeclaredMethod("reportInputMismatch", objectDeserializerType, stringType, objectArrayType);
        reportInputMismatchMethod.setAccessible(true);
        java.lang.Object[] reportInputMismatchMethodArguments = new java.lang.Object[3];
        reportInputMismatchMethodArguments[0] = objectDeserializer;
        reportInputMismatchMethodArguments[1] = ((Object) null);
        reportInputMismatchMethodArguments[2] = ((Object) objectArray);
        try {
            reportInputMismatchMethod.invoke(impl, reportInputMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleWeirdStringValue(java.lang.Class, java.lang.String, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdStringValue(java.lang.Class,java.lang.String,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleWeirdStringValue_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:896) */
        impl.handleWeirdStringValue(null, null, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportMissingContent
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportMissingContent(java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportMissingContent(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.exc.MismatchedInputException#from(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
 *  */
    @Test(expected = MismatchedInputException.class)
    public void testReportMissingContent_ThrowMismatchedInputException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        impl.reportMissingContent(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportBadTypeDefinition
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportBadTypeDefinition(com.fasterxml.jackson.databind.BeanDescription, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadTypeDefinition(com.fasterxml.jackson.databind.BeanDescription,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String beanDesc = ClassUtil.nameOf(bean.getBeanClass());
 *  */
    @Test
    public void testReportBadTypeDefinition_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportBadTypeDefinition] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportBadTypeDefinition(DeserializationContext.java:1428) */
        impl.reportBadTypeDefinition(null, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportBadPropertyDefinition(com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadPropertyDefinition(com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String beanDesc = ClassUtil.nameOf(bean.getBeanClass());
 *  */
    @Test
    public void testReportBadPropertyDefinition_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition(DeserializationContext.java:1444) */
        impl.reportBadPropertyDefinition(null, null, null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadPropertyDefinition(com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String beanDesc = ClassUtil.nameOf(bean.getBeanClass());
 *  */
    @Test
    public void testReportBadPropertyDefinition_ThrowNullPointerException_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, null);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition(DeserializationContext.java:1444) */
        impl.reportBadPropertyDefinition(null, pOJOPropertyBuilder, null, objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadPropertyDefinition(com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String beanDesc = ClassUtil.nameOf(bean.getBeanClass());
 *  */
    @Test
    public void testReportBadPropertyDefinition_ThrowNullPointerException_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportBadPropertyDefinition(DeserializationContext.java:1444) */
        impl.reportBadPropertyDefinition(null, pOJOPropertyBuilder, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.findNonContextualValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findNonContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findNonContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cache.findValueDeserializer(this, _factory, type);
 *  */
    @Test
    public void testFindNonContextualValueDeserializer_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.findNonContextualValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findNonContextualValueDeserializer(DeserializationContext.java:467) */
        impl.findNonContextualValueDeserializer(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findNonContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#findNonContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _cache.findValueDeserializer(this, _factory, type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindNonContextualValueDeserializer_ThrowIllegalArgumentException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        impl.findNonContextualValueDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JsonDeserializer, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty_ReturnTrue() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        boolean actual = impl.handleUnknownProperty(treeTraversingParser, null, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty_ReturnTrue_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        boolean actual = impl.handleUnknownProperty(treeTraversingParser, null, null, null);
        
        assertTrue(actual);
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty_ReturnTrue_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        boolean actual = impl.handleUnknownProperty(treeTraversingParser, null, null, null);
        
        assertTrue(actual);
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JsonDeserializer, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleUnknownProperty_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty(DeserializationContext.java:808) */
        impl.handleUnknownProperty(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#skipChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.skipChildren();
 *  */
    @Test
    public void testHandleUnknownProperty_ThrowNullPointerException_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownProperty(DeserializationContext.java:818) */
        impl.handleUnknownProperty(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrongTokenException(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.JsonToken, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#wrongTokenException(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonToken,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.getCurrentToken()
 *  */
    @Test
    public void testWrongTokenException_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1497) */
        impl.wrongTokenException(((JsonParser) null), ((JavaType) null), ((JsonToken) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrongTokenException(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.JsonToken, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testWrongTokenException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        impl.wrongTokenException(((JsonParser) jsonParserSequence), ((JavaType) null), jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499) */
        impl.wrongTokenException(((JsonParser) jsonParserSequence), mapLikeType, jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499) */
        impl.wrongTokenException(((JsonParser) filteringParserDelegate), ((JavaType) null), jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499) */
        impl.wrongTokenException(((JsonParser) jsonParserSequence), referenceType, jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:48)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:59)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1499) */
        impl.wrongTokenException(((JsonParser) jsonParserDelegate1), ((JavaType) null), jsonToken, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrongTokenException(com.fasterxml.jackson.core.JsonParser, java.lang.Class, com.fasterxml.jackson.core.JsonToken, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#wrongTokenException(com.fasterxml.jackson.core.JsonParser,java.lang.Class,com.fasterxml.jackson.core.JsonToken,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.getCurrentToken()
 *  */
    @Test
    public void testWrongTokenException_ThrowNullPointerException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1506) */
        impl.wrongTokenException(((JsonParser) null), ((Class) null), ((JsonToken) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrongTokenException(com.fasterxml.jackson.core.JsonParser, java.lang.Class, com.fasterxml.jackson.core.JsonToken, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testWrongTokenException6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        impl.wrongTokenException(((JsonParser) jsonParserDelegate), ((Class) null), jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508) */
        impl.wrongTokenException(((JsonParser) filteringParserDelegate), class1, jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException8() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508) */
        impl.wrongTokenException(((JsonParser) jsonParserDelegate), class1, jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException9() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508) */
        impl.wrongTokenException(((JsonParser) jsonParserDelegate1), class1, jsonToken, ((String) null));
    }
    
    @Test
    public void testWrongTokenException10() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Class class1 = Object.class;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:910)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1508) */
        impl.wrongTokenException(((JsonParser) jsonParserDelegate2), class1, jsonToken, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.weirdNumberException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method weirdNumberException(java.lang.Number, java.lang.Class, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#weirdNumberException(java.lang.Number,java.lang.Class,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#nameOf(java.lang.Class)}
 *  */
    @Test
    public void testWeirdNumberException_ClassUtilNameOf() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        
        InvalidFormatException actual = ((InvalidFormatException) impl.weirdNumberException(null, class1, null));
        
        InvalidFormatException expected = ((InvalidFormatException) createInstance("com.fasterxml.jackson.databind.exc.InvalidFormatException"));
        setField(expected, "com.fasterxml.jackson.databind.exc.MismatchedInputException", "_targetType", class1);
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 4;
        shortArray[1] = (short) 50;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 8585216;
        intArray[1] = 16711680;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class2 = InvalidFormatException.class;
        objectArray[0] = ((Object) class2);
        Class class3 = DeserializationContext.class;
        objectArray[1] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class4);
        objectArray[3] = ((Object) class4);
        Class class5 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class5);
        Class class6 = Method.class;
        objectArray[5] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class7);
        objectArray[7] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class11);
        Class class12 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class12);
        Class class13 = java.security.AccessController.class;
        objectArray[13] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class14);
        objectArray[15] = ((Object) class14);
        objectArray[16] = ((Object) class14);
        objectArray[17] = ((Object) class14);
        objectArray[18] = ((Object) class14);
        objectArray[19] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class15);
        objectArray[21] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class16);
        Class class17 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class18);
        objectArray[25] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class20);
        Class class21 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class21);
        objectArray[29] = ((Object) class21);
        Class class22 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class22);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708318669504L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot deserialize value of type `java.lang.Object` from number null: null";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        Object actual_value = getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidFormatException", "_value");
        assertNull(actual_value);
        
        Class expected_targetType = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.exc.MismatchedInputException", "_targetType"));
        Class actual_targetType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.MismatchedInputException", "_targetType"));
        assertEquals(Class.class, actual_targetType.getClass());
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getDeserializationFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeserializationFeatures()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getDeserializationFeatures()}
 * @utbot.returnsFrom {@code return _featureFlags;}
 *  */
    @Test
    public void testGetDeserializationFeatures_Return_featureFlags() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        int actual = impl.getDeserializationFeatures();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNumberValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleWeirdNumberValue(java.lang.Class, java.lang.Number, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdNumberValue(java.lang.Class,java.lang.Number,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleWeirdNumberValue_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdNumberValue(DeserializationContext.java:939) */
        impl.handleWeirdNumberValue(null, null, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleMissingTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleMissingTypeId(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleMissingTypeId(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleMissingTypeId_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleMissingTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingTypeId(DeserializationContext.java:1196) */
        impl.handleMissingTypeId(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleMissingTypeId(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, java.lang.String)
    
    @Test
    public void testHandleMissingTypeId1() throws Throwable  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleMissingTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DeserializationContext.missingTypeIdException(DeserializationContext.java:1643)
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingTypeId(DeserializationContext.java:1218) */
        Class deserializationContextClazz = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class simpleTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class classNameIdResolverType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        Class stringType = Class.forName("java.lang.String");
        Method handleMissingTypeIdMethod = deserializationContextClazz.getDeclaredMethod("handleMissingTypeId", simpleTypeType, classNameIdResolverType, stringType);
        handleMissingTypeIdMethod.setAccessible(true);
        java.lang.Object[] handleMissingTypeIdMethodArguments = new java.lang.Object[3];
        handleMissingTypeIdMethodArguments[0] = simpleType;
        handleMissingTypeIdMethodArguments[1] = classNameIdResolver;
        handleMissingTypeIdMethodArguments[2] = ((Object) null);
        try {
            handleMissingTypeIdMethod.invoke(impl, handleMissingTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleSecondaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleSecondaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testHandleSecondaryContextualization_ReturnDeser() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonDeserializer actual = impl.handleSecondaryContextualization(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleSecondaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (deser instanceof ContextualDeserializer): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ContextualDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.LinkedNode#next()}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testHandleSecondaryContextualization_DeserInstanceOfContextualDeserializer() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) impl.handleSecondaryContextualization(stdDelegatingDeserializer, null, null));
        
        Converter actual_converter = ((Converter) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
        assertNull(actual_converter);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        String actual_delegateDeserializer_message = ((String) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
        assertNull(actual_delegateDeserializer_message);
        
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        assertTrue(deepEquals(stdDelegatingDeserializer, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConfig()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetConfig_Return() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        DeserializationConfig actual = impl.getConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getActiveView
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getActiveView()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getActiveView()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetActiveView_Return() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Class actual = impl.getActiveView();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.hasSomeOfFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasSomeOfFeatures(int)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasSomeOfFeatures(int)}
 * @utbot.returnsFrom {@code return (_featureFlags & featureMask) != 0;}
 *  */
    @Test
    public void testHasSomeOfFeatures__featureFlagsBitwiseAndFeatureMaskNotEqualsZero() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -1);
        
        boolean actual = impl.hasSomeOfFeatures(-1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#hasSomeOfFeatures(int)}
 * @utbot.returnsFrom {@code return (_featureFlags & featureMask) != 0;}
 *  */
    @Test
    public void testHasSomeOfFeatures__featureFlagsBitwiseAndFeatureMaskEqualsZero() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        boolean actual = impl.hasSomeOfFeatures(2);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getContextualType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextualType()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getContextualType()}
 * @utbot.executesCondition {@code ((_currentType == null)): True}
 * @utbot.returnsFrom {@code return (_currentType == null) ? null : _currentType.value();}
 *  */
    @Test
    public void testGetContextualType__currentTypeEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JavaType actual = impl.getContextualType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getContextualType()}
 * @utbot.executesCondition {@code ((_currentType == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.LinkedNode#value()}
 * @utbot.returnsFrom {@code return (_currentType == null) ? null : _currentType.value();}
 *  */
    @Test
    public void testGetContextualType__currentTypeNotEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedNode _currentType = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        impl._currentType = _currentType;
        
        JavaType actual = impl.getContextualType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContextualType()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getContextualType()}
 * @utbot.executesCondition {@code ((_currentType == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.LinkedNode#value()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _currentType.value()
 *  */
    @Test
    public void testGetContextualType_ThrowClassCastException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedNode _currentType = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        byte[] value = {};
        setField(_currentType, "com.fasterxml.jackson.databind.util.LinkedNode", "value", value);
        impl._currentType = _currentType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getContextualType] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.JavaType ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JavaType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4b69888e)]
            com.fasterxml.jackson.databind.DeserializationContext.getContextualType(DeserializationContext.java:307) */
        impl.getContextualType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.leaseObjectBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method leaseObjectBuffer()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#leaseObjectBuffer()}
 * @utbot.executesCondition {@code (buf == null): False}
 * @utbot.returnsFrom {@code return buf;}
 *  */
    @Test
    public void testLeaseObjectBuffer_BufNotEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        impl._objectBuffer = _objectBuffer;
        
        ObjectBuffer actual = impl.leaseObjectBuffer();
        
        ObjectBuffer expected = new ObjectBuffer();
        
        LinkedNode actual_head = ((LinkedNode) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head"));
        assertNull(actual_head);
        
        LinkedNode actual_tail = ((LinkedNode) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail"));
        assertNull(actual_tail);
        
        int expected_size = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size"));
        int actual_size = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size"));
        assertEquals(expected_size, actual_size);
        
        java.lang.Object[] actual_freeBuffer = ((java.lang.Object[]) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer"));
        assertNull(actual_freeBuffer);
        
        ObjectBuffer finalImpl_objectBuffer = impl._objectBuffer;
        
        assertNull(finalImpl_objectBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#leaseObjectBuffer()}
 * @utbot.executesCondition {@code (buf == null): True}
 * @utbot.returnsFrom {@code return buf;}
 *  */
    @Test
    public void testLeaseObjectBuffer_BufEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        ObjectBuffer actual = impl.leaseObjectBuffer();
        
        ObjectBuffer expected = new ObjectBuffer();
        
        LinkedNode actual_head = ((LinkedNode) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head"));
        assertNull(actual_head);
        
        LinkedNode actual_tail = ((LinkedNode) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail"));
        assertNull(actual_tail);
        
        int expected_size = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size"));
        int actual_size = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size"));
        assertEquals(expected_size, actual_size);
        
        java.lang.Object[] actual_freeBuffer = ((java.lang.Object[]) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer"));
        assertNull(actual_freeBuffer);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleWeirdKey(java.lang.Class, java.lang.String, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdKey(java.lang.Class,java.lang.String,java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getProblemHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: LinkedNode<DeserializationProblemHandler> h = _config.getProblemHandlers();
 *  */
    @Test
    public void testHandleWeirdKey_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:852) */
        impl.handleWeirdKey(null, null, null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.returnObjectBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method returnObjectBuffer(com.fasterxml.jackson.databind.util.ObjectBuffer)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#returnObjectBuffer(com.fasterxml.jackson.databind.util.ObjectBuffer)}
 * @utbot.executesCondition {@code (_objectBuffer == null): True}
 *  */
    @Test
    public void testReturnObjectBuffer__objectBufferEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        impl.returnObjectBuffer(null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#returnObjectBuffer(com.fasterxml.jackson.databind.util.ObjectBuffer)}
 * @utbot.executesCondition {@code (_objectBuffer == null): False}
 * @utbot.executesCondition {@code (buf.initialCapacity() >= _objectBuffer.initialCapacity()): False}
 *  */
    @Test
    public void testReturnObjectBuffer_BufInitialCapacityLessThan_objectBufferInitialCapacity() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        impl._objectBuffer = _objectBuffer;
        ObjectBuffer objectBuffer = new ObjectBuffer();
        
        impl.returnObjectBuffer(objectBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#returnObjectBuffer(com.fasterxml.jackson.databind.util.ObjectBuffer)}
 * @utbot.executesCondition {@code (_objectBuffer == null): False}
 * @utbot.executesCondition {@code (buf.initialCapacity() >= _objectBuffer.initialCapacity()): True}
 *  */
    @Test
    public void testReturnObjectBuffer_BufInitialCapacityGreaterOrEqual_objectBufferInitialCapacity() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        impl._objectBuffer = _objectBuffer;
        ObjectBuffer objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        java.lang.Object[] _freeBuffer = {};
        setField(objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        
        ObjectBuffer initialImpl_objectBuffer = impl._objectBuffer;
        
        impl.returnObjectBuffer(objectBuffer);
        
        ObjectBuffer finalImpl_objectBuffer = impl._objectBuffer;
        
        assertFalse(initialImpl_objectBuffer == finalImpl_objectBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method returnObjectBuffer(com.fasterxml.jackson.databind.util.ObjectBuffer)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#returnObjectBuffer(com.fasterxml.jackson.databind.util.ObjectBuffer)}
 * @utbot.executesCondition {@code (_objectBuffer == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ObjectBuffer#initialCapacity()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.initialCapacity() >= _objectBuffer.initialCapacity()
 *  */
    @Test
    public void testReturnObjectBuffer_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        impl._objectBuffer = _objectBuffer;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.returnObjectBuffer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.returnObjectBuffer(DeserializationContext.java:595) */
        impl.returnObjectBuffer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.readPropertyValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readPropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#readPropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JsonDeserializer<Object> deser = findContextualValueDeserializer(type, prop);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadPropertyValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        impl.readPropertyValue(((JsonParser) null), ((BeanProperty) null), ((JavaType) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.readPropertyValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readPropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#readPropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return readPropertyValue(p, prop, getTypeFactory().constructType(type));
 *  */
    @Test
    public void testReadPropertyValue_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.readPropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.readPropertyValue(DeserializationContext.java:772) */
        impl.readPropertyValue(((JsonParser) null), ((BeanProperty) null), ((Class) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readPropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testReadPropertyValue1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        impl.readPropertyValue(((JsonParser) null), ((BeanProperty) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getBase64Variant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBase64Variant()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getBase64Variant()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getBase64Variant()}
 * @utbot.returnsFrom {@code return _config.getBase64Variant();}
 *  */
    @Test
    public void testGetBase64Variant_DeserializationConfigGetBase64Variant() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Base64Variant actual = impl.getBase64Variant();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBase64Variant()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getBase64Variant()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getBase64Variant()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getBase64Variant();
 *  */
    @Test
    public void testGetBase64Variant_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.getBase64Variant] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getBase64Variant(DeserializationContext.java:394) */
        impl.getBase64Variant();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.parseDate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#parseDate(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getDateFormat()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DateFormat df = getDateFormat();
 *  */
    @Test
    public void testParseDate_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1774)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:709) */
        impl.parseDate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.getArrayBuilders
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayBuilders()
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getArrayBuilders()}
 * @utbot.executesCondition {@code (_arrayBuilders == null): False}
 * @utbot.returnsFrom {@code return _arrayBuilders;}
 *  */
    @Test
    public void testGetArrayBuilders__arrayBuildersNotEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayBuilders _arrayBuilders = ((ArrayBuilders) createInstance("com.fasterxml.jackson.databind.util.ArrayBuilders"));
        impl._arrayBuilders = _arrayBuilders;
        
        ArrayBuilders actual = impl.getArrayBuilders();
        
        ArrayBuilders.BooleanBuilder actual_booleanBuilder = ((ArrayBuilders.BooleanBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_booleanBuilder"));
        assertNull(actual_booleanBuilder);
        
        ArrayBuilders.ByteBuilder actual_byteBuilder = ((ArrayBuilders.ByteBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_byteBuilder"));
        assertNull(actual_byteBuilder);
        
        ArrayBuilders.ShortBuilder actual_shortBuilder = ((ArrayBuilders.ShortBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_shortBuilder"));
        assertNull(actual_shortBuilder);
        
        ArrayBuilders.IntBuilder actual_intBuilder = ((ArrayBuilders.IntBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_intBuilder"));
        assertNull(actual_intBuilder);
        
        ArrayBuilders.LongBuilder actual_longBuilder = ((ArrayBuilders.LongBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_longBuilder"));
        assertNull(actual_longBuilder);
        
        ArrayBuilders.FloatBuilder actual_floatBuilder = ((ArrayBuilders.FloatBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_floatBuilder"));
        assertNull(actual_floatBuilder);
        
        ArrayBuilders.DoubleBuilder actual_doubleBuilder = ((ArrayBuilders.DoubleBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_doubleBuilder"));
        assertNull(actual_doubleBuilder);
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#getArrayBuilders()}
 * @utbot.executesCondition {@code (_arrayBuilders == null): True}
 * @utbot.returnsFrom {@code return _arrayBuilders;}
 *  */
    @Test
    public void testGetArrayBuilders__arrayBuildersEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        ArrayBuilders initialImpl_arrayBuilders = impl._arrayBuilders;
        
        ArrayBuilders actual = impl.getArrayBuilders();
        
        ArrayBuilders expected = ((ArrayBuilders) createInstance("com.fasterxml.jackson.databind.util.ArrayBuilders"));
        
        ArrayBuilders.BooleanBuilder actual_booleanBuilder = ((ArrayBuilders.BooleanBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_booleanBuilder"));
        assertNull(actual_booleanBuilder);
        
        ArrayBuilders.ByteBuilder actual_byteBuilder = ((ArrayBuilders.ByteBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_byteBuilder"));
        assertNull(actual_byteBuilder);
        
        ArrayBuilders.ShortBuilder actual_shortBuilder = ((ArrayBuilders.ShortBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_shortBuilder"));
        assertNull(actual_shortBuilder);
        
        ArrayBuilders.IntBuilder actual_intBuilder = ((ArrayBuilders.IntBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_intBuilder"));
        assertNull(actual_intBuilder);
        
        ArrayBuilders.LongBuilder actual_longBuilder = ((ArrayBuilders.LongBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_longBuilder"));
        assertNull(actual_longBuilder);
        
        ArrayBuilders.FloatBuilder actual_floatBuilder = ((ArrayBuilders.FloatBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_floatBuilder"));
        assertNull(actual_floatBuilder);
        
        ArrayBuilders.DoubleBuilder actual_doubleBuilder = ((ArrayBuilders.DoubleBuilder) getFieldValue(actual, "com.fasterxml.jackson.databind.util.ArrayBuilders", "_doubleBuilder"));
        assertNull(actual_doubleBuilder);
        
        ArrayBuilders finalImpl_arrayBuilders = impl._arrayBuilders;
        
        assertFalse(initialImpl_arrayBuilders == finalImpl_arrayBuilders);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.constructCalendar
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructCalendar(java.util.Date)
    
    @Test
    public void testConstructCalendar1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleTimeZone _timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_timeZone", _timeZone);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Date date = new Date(0L);
        
        BuddhistCalendar actual = ((BuddhistCalendar) impl.constructCalendar(date));
        
        BuddhistCalendar expected = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        
        // sun.util.BuddhistCalendar has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for constructCalendar
    
    public void testConstructCalendar_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext._isCompatible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isCompatible(java.lang.Class, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#_isCompatible(java.lang.Class,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (target.isInstance(value)): True}
 * @utbot.invokes {@link java.lang.Class#isInstance(java.lang.Object)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isCompatible_TargetIsInstance() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        short[] shortArray = {};
        
        boolean actual = impl._isCompatible(class1, shortArray);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#_isCompatible(java.lang.Class,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isCompatible_ValueEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        boolean actual = impl._isCompatible(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _isCompatible(java.lang.Class, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#_isCompatible(java.lang.Class,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.invokes {@link java.lang.Class#isInstance(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (value == null) || target.isInstance(value)
 *  */
    @Test
    public void test_isCompatible_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext._isCompatible] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext._isCompatible(DeserializationContext.java:1226) */
        impl._isCompatible(null, byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.reportBadMerge
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportBadMerge(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadMerge(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testReportBadMerge_IsEnabled() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 33554432);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Object actual = impl.reportBadMerge(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportBadMerge(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#reportBadMerge(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = constructType(deser.handledType());
 *  */
    @Test
    public void testReportBadMerge_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.reportBadMerge] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.reportBadMerge(DeserializationContext.java:1471) */
        impl.reportBadMerge(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.mappingException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mappingException(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#mappingException(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String)}
 * @utbot.returnsFrom {@code return JsonMappingException.from(getParser(), message);}
 *  */
    @Test
    public void testMappingException_JsonMappingExceptionFrom() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonMappingException actual = impl.mappingException(((String) null));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 12;
        shortArray[1] = (short) 92;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7405568;
        intArray[1] = 4587520;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class3);
        objectArray[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class6);
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class13);
        objectArray[15] = ((Object) class13);
        objectArray[16] = ((Object) class13);
        objectArray[17] = ((Object) class13);
        objectArray[18] = ((Object) class13);
        objectArray[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class14);
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class17);
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class20);
        objectArray[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class21);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708332101712L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.mappingException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mappingException(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#mappingException(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return mappingException(targetClass, _parser.getCurrentToken());
 *  */
    @Test
    public void testMappingException_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.mappingException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:1744) */
        impl.mappingException(((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DeserializationContext.mappingException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mappingException(java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DeserializationContext#mappingException(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String)}
 * @utbot.returnsFrom {@code return JsonMappingException.from(getParser(), _format(msg, msgArgs));}
 *  */
    @Test
    public void testMappingException_JsonMappingExceptionFrom1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {};
        
        JsonMappingException actual = impl.mappingException(((String) null), objectArray);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(expected, "com.fasterxml.jackson.databind.JsonMappingException", "_processor", _parser);
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalBytes", -1L);
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalChars", -1L);
        setField(expected, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 12;
        shortArray[1] = (short) 95;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7405568;
        intArray[1] = 6291456;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray1 = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray1[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray1[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray1[2] = ((Object) class3);
        objectArray1[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray1[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray1[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray1[6] = ((Object) class6);
        objectArray1[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray1[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray1[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray1[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray1[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray1[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray1[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray1[14] = ((Object) class13);
        objectArray1[15] = ((Object) class13);
        objectArray1[16] = ((Object) class13);
        objectArray1[17] = ((Object) class13);
        objectArray1[18] = ((Object) class13);
        objectArray1[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray1[20] = ((Object) class14);
        objectArray1[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray1[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray1[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray1[24] = ((Object) class17);
        objectArray1[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray1[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray1[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray1[28] = ((Object) class20);
        objectArray1[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray1[30] = ((Object) class21);
        backtrace[2] = objectArray1;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708332101712L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable expected_processor = expected._processor;
        Closeable actual_processor = actual._processor;
        ObjectCodec actual_processor_objectCodec = ((ObjectCodec) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_processor_objectCodec);
        
        ByteQuadsCanonicalizer actual_processor_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_processor_symbols);
        
        int[] actual_processor_quadBuffer = ((int[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_processor_quadBuffer);
        
        boolean actual_processor_tokenIncomplete = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_processor_tokenIncomplete);
        
        int expected_processor_quad1 = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_processor_quad1 = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(expected_processor_quad1, actual_processor_quad1);
        
        int expected_processor_nameStartOffset = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        int actual_processor_nameStartOffset = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartOffset"));
        assertEquals(expected_processor_nameStartOffset, actual_processor_nameStartOffset);
        
        int expected_processor_nameStartRow = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        int actual_processor_nameStartRow = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartRow"));
        assertEquals(expected_processor_nameStartRow, actual_processor_nameStartRow);
        
        int expected_processor_nameStartCol = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        int actual_processor_nameStartCol = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_nameStartCol"));
        assertEquals(expected_processor_nameStartCol, actual_processor_nameStartCol);
        
        InputStream actual_processor_inputStream = ((InputStream) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_processor_inputStream);
        
        byte[] actual_processor_inputBuffer = ((byte[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_processor_inputBuffer);
        
        boolean actual_processor_bufferRecyclable = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_processor_bufferRecyclable);
        
        IOContext actual_processor_ioContext = ((IOContext) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext"));
        assertNull(actual_processor_ioContext);
        
        boolean actual_processor_closed = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_closed"));
        assertFalse(actual_processor_closed);
        
        int expected_processor_inputPtr = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        int actual_processor_inputPtr = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        assertEquals(expected_processor_inputPtr, actual_processor_inputPtr);
        
        int expected_processor_inputEnd = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        int actual_processor_inputEnd = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        assertEquals(expected_processor_inputEnd, actual_processor_inputEnd);
        
        long expected_processor_currInputProcessed = ((Long) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        long actual_processor_currInputProcessed = ((Long) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        assertEquals(expected_processor_currInputProcessed, actual_processor_currInputProcessed);
        
        int expected_processor_currInputRow = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        int actual_processor_currInputRow = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        assertEquals(expected_processor_currInputRow, actual_processor_currInputRow);
        
        int expected_processor_currInputRowStart = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        int actual_processor_currInputRowStart = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        assertEquals(expected_processor_currInputRowStart, actual_processor_currInputRowStart);
        
        long expected_processor_tokenInputTotal = ((Long) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        long actual_processor_tokenInputTotal = ((Long) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        assertEquals(expected_processor_tokenInputTotal, actual_processor_tokenInputTotal);
        
        int expected_processor_tokenInputRow = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        int actual_processor_tokenInputRow = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        assertEquals(expected_processor_tokenInputRow, actual_processor_tokenInputRow);
        
        int expected_processor_tokenInputCol = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        int actual_processor_tokenInputCol = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        assertEquals(expected_processor_tokenInputCol, actual_processor_tokenInputCol);
        
        JsonReadContext actual_processor_parsingContext = ((JsonReadContext) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        assertNull(actual_processor_parsingContext);
        
        JsonToken actual_processor_nextToken = ((JsonToken) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actual_processor_nextToken);
        
        TextBuffer actual_processor_textBuffer = ((TextBuffer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actual_processor_textBuffer);
        
        char[] actual_processor_nameCopyBuffer = ((char[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actual_processor_nameCopyBuffer);
        
        boolean actual_processor_nameCopied = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actual_processor_nameCopied);
        
        ByteArrayBuilder actual_processor_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actual_processor_byteArrayBuilder);
        
        byte[] actual_processor_binaryValue = ((byte[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actual_processor_binaryValue);
        
        int expected_processor_numTypesValid = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actual_processor_numTypesValid = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(expected_processor_numTypesValid, actual_processor_numTypesValid);
        
        int expected_processor_numberInt = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actual_processor_numberInt = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(expected_processor_numberInt, actual_processor_numberInt);
        
        long expected_processor_numberLong = ((Long) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actual_processor_numberLong = ((Long) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(expected_processor_numberLong, actual_processor_numberLong);
        
        double expected_processor_numberDouble = ((Double) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actual_processor_numberDouble = ((Double) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(expected_processor_numberDouble, actual_processor_numberDouble, 1.0E-6);
        
        BigInteger actual_processor_numberBigInt = ((BigInteger) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actual_processor_numberBigInt);
        
        BigDecimal actual_processor_numberBigDecimal = ((BigDecimal) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actual_processor_numberBigDecimal);
        
        boolean actual_processor_numberNegative = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actual_processor_numberNegative);
        
        int expected_processor_intLength = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actual_processor_intLength = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(expected_processor_intLength, actual_processor_intLength);
        
        int expected_processor_fractLength = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actual_processor_fractLength = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(expected_processor_fractLength, actual_processor_fractLength);
        
        int expected_processor_expLength = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actual_processor_expLength = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(expected_processor_expLength, actual_processor_expLength);
        
        JsonToken actual_processor_currToken = ((JsonToken) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_processor_currToken);
        
        JsonToken actual_processor_lastClearedToken = ((JsonToken) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_processor_lastClearedToken);
        
        int expected_processor_features = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_processor_features = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_processor_features, actual_processor_features);
        
        RequestPayload actual_processor_requestPayload = ((RequestPayload) getFieldValue(actual_processor, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_processor_requestPayload);
        
        JsonLocation expected_location = ((JsonLocation) getFieldValue(expected, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected_location, actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mappingException(java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testMappingException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        JsonMappingException actual = impl.mappingException(string, objectArray);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 12;
        shortArray[1] = (short) 95;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 1;
        shortArray[17] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 6;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7405568;
        intArray[1] = 6291456;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray1 = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray1[0] = ((Object) class1);
        Class class2 = DeserializationContext.class;
        objectArray1[1] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray1[2] = ((Object) class3);
        objectArray1[3] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray1[4] = ((Object) class4);
        Class class5 = Method.class;
        objectArray1[5] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray1[6] = ((Object) class6);
        objectArray1[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray1[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray1[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray1[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray1[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray1[12] = ((Object) class11);
        Class class12 = java.security.AccessController.class;
        objectArray1[13] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray1[14] = ((Object) class13);
        objectArray1[15] = ((Object) class13);
        objectArray1[16] = ((Object) class13);
        objectArray1[17] = ((Object) class13);
        objectArray1[18] = ((Object) class13);
        objectArray1[19] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray1[20] = ((Object) class14);
        objectArray1[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray1[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray1[23] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray1[24] = ((Object) class17);
        objectArray1[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray1[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray1[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray1[28] = ((Object) class20);
        objectArray1[29] = ((Object) class20);
        Class class21 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray1[30] = ((Object) class21);
        backtrace[2] = objectArray1;
        long[] longArray = new long[32];
        longArray[0] = 2707142593168L;
        longArray[1] = 2708332101712L;
        longArray[2] = 2707143274672L;
        longArray[3] = 2707142549504L;
        longArray[4] = 2707142549504L;
        longArray[5] = 2707142549504L;
        longArray[6] = 2708329153424L;
        longArray[7] = 2707142549504L;
        longArray[8] = 2707142549504L;
        longArray[9] = 2707142549504L;
        longArray[10] = 2707142549504L;
        longArray[11] = 2707142549504L;
        longArray[12] = 2707142556872L;
        longArray[13] = 2707142597616L;
        longArray[14] = 2708234195008L;
        longArray[15] = 2708234195008L;
        longArray[16] = 2708234195008L;
        longArray[17] = 2708234195008L;
        longArray[18] = 2708234195136L;
        longArray[19] = 2708234195456L;
        longArray[20] = 2708237438048L;
        longArray[21] = 2707142549504L;
        longArray[22] = 2708236321504L;
        longArray[23] = 2708332151632L;
        longArray[24] = 2708329153424L;
        longArray[25] = 2707142549504L;
        longArray[26] = 2707142549504L;
        longArray[27] = 2707142549504L;
        longArray[28] = 2707142549504L;
        longArray[29] = 2707142549504L;
        longArray[30] = 2707142556872L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mappingException(java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testMappingException2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DeserializationContext.mappingException] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:1734) */
        impl.mappingException(((String) null), objectArray);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1090332165314300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1090332165314300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1090332165323700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090332165314300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090332165323700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1090332166011099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090332166011099.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090332166014000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090332166011099.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090332166014000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1090332169669400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090332169669400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090332169673000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090332169669400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090332169673000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1090332170549700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090332170549700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090332170551399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090332170549700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090332170551399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

