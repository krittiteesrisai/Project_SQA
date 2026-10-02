package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.UnsupportedEncodingException;
import java.nio.file.DirectoryNotEmptyException;
import java.util.concurrent.TimeoutException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.nio.channels.NotYetBoundException;
import java.util.HashMap;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import java.util.Set;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.util.Collection;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.ObjectInputStream;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.TreeMap;
import java.util.Comparator;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_deser_BeanDeserializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_valueInstantiator.canCreateFromObjectWith()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromObjectWith()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: creatorProps = _valueInstantiator.getFromObjectArguments(ctxt.getConfig());
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve(BeanDeserializerBase.java:465) */
        builderBasedDeserializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromObjectWith()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _valueInstantiator.canCreateFromObjectWith()
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve(BeanDeserializerBase.java:464) */
        builderBasedDeserializer.resolve(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testResolve1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.resolve(BeanDeserializerBase.java:492) */
        beanAsArrayDeserializer.resolve(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.executesCondition {@code (_beanProperties == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#iterator()}
 * @utbot.returnsFrom {@code return _beanProperties.iterator();}
 *  */
    @Test
    public void testProperties__beanPropertiesNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        Object actual = builderBasedDeserializer.properties();
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.executesCondition {@code (_beanProperties == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _beanProperties == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProperties_ThrowIllegalStateException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        throwableDeserializer.properties();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -1);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:316)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:940) */
        builderBasedDeserializer.properties();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:940) */
        builderBasedDeserializer.properties();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowClassCastException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[14];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[3] = ((Object) innerClassProperty);
        Object object = createInstance("java.lang.Object");
        _hashArea[5] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:940) */
        builderBasedDeserializer.properties();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#properties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanProperties.iterator();
 *  */
    @Test
    public void testProperties_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.properties(BeanDeserializerBase.java:940) */
        builderBasedDeserializer.properties();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hasProperty(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        boolean actual = builderBasedDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[1] = ((Object) objectIdValueProperty);
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[9] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        boolean actual = builderBasedDeserializer.hasProperty(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "[";
        
        boolean actual = builderBasedDeserializer.hasProperty(string1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hasProperty(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.String#equals(java.lang.Object)} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#_find2(java.lang.String,int,java.lang.Object) twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        boolean actual = throwableDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return _beanProperties.find(propertyName) != null;}
 *  */
    @Test
    public void testHasProperty_Return_beanPropertiesFindEqualsNull_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        _hashArea[4] = object;
        _hashArea[8] = object;
        _hashArea[10] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        boolean actual = beanDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        beanDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        Object object1 = createInstance("java.lang.Object");
        _hashArea[5] = object1;
        _hashArea[7] = object1;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        builderBasedDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        throwableDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index -510 out of bounds for length 10]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        beanDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", Integer.MIN_VALUE);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_spillCount", 1);
        java.lang.Object[] _hashArea = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        _hashArea[2] = object;
        _hashArea[6] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483646 out of bounds for length 11]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:405)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        builderBasedDeserializer.hasProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test
    public void testHasProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        builderBasedDeserializer.hasProperty(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasProperty(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _beanProperties.find(propertyName) != null;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasProperty_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        builderBasedDeserializer.hasProperty(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    @Test
    public void testHasProperty1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = {null, null, null, null, null, null, null, null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        boolean actual = beanDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasProperty2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_spillCount", 1);
        java.lang.Object[] _hashArea = new java.lang.Object[13];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        _hashArea[2] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        boolean actual = throwableDeserializer.hasProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasProperty(java.lang.String)
    
    @Test
    public void testHasProperty3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        _hashArea[2] = object;
        _hashArea[3] = object;
        _hashArea[4] = object;
        _hashArea[5] = object;
        _hashArea[6] = object;
        _hashArea[7] = object;
        _hashArea[8] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        builderBasedDeserializer.hasProperty(string1);
    }
    
    @Test
    public void testHasProperty4() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "K";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasProperty(BeanDeserializerBase.java:896) */
        beanAsArrayBuilderDeserializer.hasProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testInjectValues() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        
        beanDeserializer.injectValues(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: injector.inject(ctxt, bean);
 *  */
    @Test
    public void testInjectValues_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null};
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1398) */
        beanDeserializer.injectValues(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ValueInjector injector: _injectables)
 *  */
    @Test
    public void testInjectValues_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1397) */
        builderBasedDeserializer.injectValues(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injector.inject(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInjectValues_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        byte[] _valueId = {};
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        builderBasedDeserializer.injectValues(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: injector.inject(ctxt, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInjectValues_ThrowIllegalArgumentException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        builderBasedDeserializer.injectValues(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(ValueInjector injector: _injectables)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: injector.inject(ctxt, bean);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInjectValues_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        builderBasedDeserializer.injectValues(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method injectValues(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testInjectValues1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        _injectables[1] = valueInjector;
        _injectables[2] = valueInjector;
        _injectables[3] = valueInjector;
        _injectables[4] = valueInjector;
        _injectables[5] = valueInjector;
        _injectables[6] = valueInjector;
        _injectables[7] = valueInjector;
        _injectables[8] = valueInjector;
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.BeanProperty$Std.getName(BeanProperty.java:294)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:75)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:380)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.findValue(ValueInjector.java:46)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1398) */
        throwableDeserializer.injectValues(impl, object);
    }
    
    @Test
    public void testInjectValues2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(_valueId, object);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object1 = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1398) */
        beanAsArrayDeserializer.injectValues(impl, object1);
    }
    
    @Test
    public void testInjectValues3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        ValueInjector valueInjector1 = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[1] = valueInjector1;
        _injectables[2] = valueInjector1;
        _injectables[3] = valueInjector1;
        _injectables[4] = valueInjector1;
        _injectables[5] = valueInjector1;
        _injectables[6] = valueInjector1;
        _injectables[7] = valueInjector1;
        _injectables[8] = valueInjector1;
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        _values.put(_valueId, null);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1398) */
        throwableDeserializer.injectValues(impl, object);
    }
    
    @Test
    public void testInjectValues4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[9];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        String _valueId = "";
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_member", _member);
        _injectables[0] = valueInjector;
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        _values.put(null, object);
        String string = "";
        _values.put(string, _injectables);
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedField.setValue(AnnotatedField.java:105)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector.inject(ValueInjector.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.injectValues(BeanDeserializerBase.java:1398) */
        beanDeserializer.injectValues(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.throwsException {@link java.lang.Error} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, index);
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) error), ((Object) null), 1, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.UnsupportedEncodingException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, index);
 *  */
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapAndThrow_ThrowUnsupportedEncodingException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) unsupportedEncodingException), ((Object) null), 2, ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.nio.file.DirectoryNotEmptyException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, index);
 *  */
    @Test(expected = DirectoryNotEmptyException.class)
    public void testWrapAndThrow_ThrowDirectoryNotEmptyException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DirectoryNotEmptyException directoryNotEmptyException = ((DirectoryNotEmptyException) createInstance("java.nio.file.DirectoryNotEmptyException"));
        
        beanDeserializer.wrapAndThrow(((Throwable) directoryNotEmptyException), ((Object) null), 0, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapAndThrow1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        beanDeserializer.wrapAndThrow(((Throwable) unsupportedEncodingException), ((Object) cloneNotSupportedException), 0, ((DeserializationContext) impl));
    }
    
    @Test(expected = UnresolvedForwardReference.class)
    public void testWrapAndThrow2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, 0, ((DeserializationContext) null));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow3() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TimeoutException timeoutException = ((TimeoutException) createInstance("java.util.concurrent.TimeoutException"));
        String detailMessage = "";
        setField(timeoutException, "java.lang.Throwable", "detailMessage", detailMessage);
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) timeoutException), object, 0, ((DeserializationContext) null));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow4() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TimeoutException timeoutException = ((TimeoutException) createInstance("java.util.concurrent.TimeoutException"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) timeoutException), object, 0, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = RuntimeException.class)
    public void testWrapAndThrow5() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        RuntimeException runtimeException = ((RuntimeException) createInstance("java.lang.RuntimeException"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) runtimeException), object, 0, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrapAndThrow(java.lang.Throwable, java.lang.Object, int, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testWrapAndThrow6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:366)
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:351)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow(BeanDeserializerBase.java:1595) */
        throwableDeserializer.wrapAndThrow(((Throwable) null), object, 0, ((DeserializationContext) impl));
    }
    
    @Test
    public void testWrapAndThrow7() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:366)
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:351)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow(BeanDeserializerBase.java:1595) */
        throwableDeserializer.wrapAndThrow(((Throwable) null), object, 0, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region Errors report for wrapAndThrow
    
    public void testWrapAndThrow_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.throwsException {@link java.lang.Error} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, fieldName);
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) error), ((Object) null), ((String) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.UnsupportedEncodingException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, fieldName);
 *  */
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapAndThrow_ThrowUnsupportedEncodingException1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        beanDeserializer.wrapAndThrow(((Throwable) unsupportedEncodingException), ((Object) null), ((String) null), ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.net.MalformedURLException} in: throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(t, ctxt), bean, fieldName);
 *  */
    @Test(expected = MalformedURLException.class)
    public void testWrapAndThrow_ThrowMalformedURLException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MalformedURLException malformedURLException = ((MalformedURLException) createInstance("java.net.MalformedURLException"));
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) malformedURLException), ((Object) null), ((String) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapAndThrow8() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        NoSuchAlgorithmException noSuchAlgorithmException = ((NoSuchAlgorithmException) createInstance("java.security.NoSuchAlgorithmException"));
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        beanAsArrayDeserializer.wrapAndThrow(((Throwable) unsupportedEncodingException), ((Object) noSuchAlgorithmException), string, ((DeserializationContext) impl));
    }
    
    @Test(expected = UnresolvedForwardReference.class)
    public void testWrapAndThrow9() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        LinkedList _path = new LinkedList();
        setField(unresolvedForwardReference, "com.fasterxml.jackson.databind.JsonMappingException", "_path", _path);
        Object object = new Object();
        String string = "";
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, string, ((DeserializationContext) null));
    }
    
    @Test(expected = UnresolvedForwardReference.class)
    public void testWrapAndThrow10() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        String string = "";
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, string, ((DeserializationContext) null));
    }
    
    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow11() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        NotYetBoundException notYetBoundException = ((NotYetBoundException) createInstance("java.nio.channels.NotYetBoundException"));
        Object object = new Object();
        String string = "";
        
        beanAsArrayDeserializer.wrapAndThrow(((Throwable) notYetBoundException), object, string, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = RuntimeException.class)
    public void testWrapAndThrow12() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        RuntimeException runtimeException = ((RuntimeException) createInstance("java.lang.RuntimeException"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        throwableDeserializer.wrapAndThrow(((Throwable) runtimeException), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow13() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer.wrapAndThrow(((Throwable) unresolvedForwardReference), object, ((String) null), ((DeserializationContext) null));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow14() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        throwableDeserializer.wrapAndThrow(((Throwable) null), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow15() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        throwableDeserializer.wrapAndThrow(((Throwable) null), object, ((String) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow16() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object object = new Object();
        
        builderBasedDeserializer.wrapAndThrow(((Throwable) null), object, ((String) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic
    
    ///region OTHER: ERROR SUITE for method handlePolymorphic(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void testHandlePolymorphic1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        HashMap _subDeserializers = new HashMap();
        builderBasedDeserializer._subDeserializers = _subDeserializers;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1547)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic(BeanDeserializerBase.java:1503) */
        builderBasedDeserializer.handlePolymorphic(treeTraversingParser, null, object, null);
    }
    
    @Test
    public void testHandlePolymorphic2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:475)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1554)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handlePolymorphic(BeanDeserializerBase.java:1503) */
        beanAsArrayBuilderDeserializer.handlePolymorphic(null, impl, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId
    
    ///region OTHER: ERROR SUITE for method _convertObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test(expected = StackOverflowError.class)
    public void test_convertObjectId1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Object object = new Object();
        
        beanDeserializer._convertObjectId(jsonParserDelegate1, null, object, null);
    }
    
    @Test
    public void test_convertObjectId2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId(BeanDeserializerBase.java:1152) */
        beanAsArrayBuilderDeserializer._convertObjectId(jsonParserSequence, null, object, null);
    }
    
    @Test
    public void test_convertObjectId3() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId(BeanDeserializerBase.java:1152) */
        beanAsArrayDeserializer._convertObjectId(jsonParserDelegate2, null, object, null);
    }
    
    @Test
    public void test_convertObjectId4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate8 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        MapEntryDeserializer mapEntryDeserializer = ((MapEntryDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:895)
            com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer.deserialize(MapEntryDeserializer.java:179)
            com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer.deserialize(MapEntryDeserializer.java:21)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId(BeanDeserializerBase.java:1152) */
        beanAsArrayDeserializer._convertObjectId(jsonParserSequence, null, object, mapEntryDeserializer);
    }
    
    @Test
    public void test_convertObjectId5() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate8 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate9 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate10 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate11 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
        setField(delegate9, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate10);
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate9);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._convertObjectId(BeanDeserializerBase.java:1152) */
        beanAsArrayBuilderDeserializer._convertObjectId(jsonParserDelegate, null, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.hasViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasViews()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#hasViews()}
 * @utbot.returnsFrom {@code return _needViewProcesing;}
 *  */
    @Test
    public void testHasViews_Return_needViewProcesing() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        boolean actual = builderBasedDeserializer.hasViews();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withBeanProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testWithBeanProperties_StringBuilderToString() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        BeanDeserializer actual = ((BeanDeserializer) throwableDeserializer.withBeanProperties(null));
        
        BeanDeserializer expected = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = ctxt.getAnnotationIntrospector();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:684) */
        builderBasedDeserializer.createContextual(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        JsonFormat.Value initialMultiView_propertyFormat = ((JsonFormat.Value) getFieldValue(multiView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        ThrowableDeserializer actual = ((ThrowableDeserializer) createContextualMethod.invoke(throwableDeserializer, createContextualMethodArguments));
        
        Exception actual_nullFromCreator = actual._nullFromCreator;
        assertNull(actual_nullFromCreator);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType throwableDeserializer_beanType = throwableDeserializer._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(throwableDeserializer_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader throwableDeserializer_objectIdReader = throwableDeserializer._objectIdReader;
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        JavaType actual_objectIdReader_idType = ((JavaType) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
        assertNull(actual_objectIdReader_idType);
        
        PropertyName actual_objectIdReaderPropertyName = actual_objectIdReader.propertyName;
        assertNull(actual_objectIdReaderPropertyName);
        
        ObjectIdGenerator actual_objectIdReaderGenerator = actual_objectIdReader.generator;
        assertNull(actual_objectIdReaderGenerator);
        
        ObjectIdResolver actual_objectIdReaderResolver = actual_objectIdReader.resolver;
        assertNull(actual_objectIdReaderResolver);
        
        JsonDeserializer actual_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
        assertNull(actual_objectIdReader_deserializer);
        
        SettableBeanProperty actual_objectIdReaderIdProperty = actual_objectIdReader.idProperty;
        assertNull(actual_objectIdReaderIdProperty);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        DeserializationConfig impl_config = ((DeserializationConfig) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config"));
        ConfigOverrides impl_config_config_configOverrides = ((ConfigOverrides) getFieldValue(impl_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(impl_config_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
        
        JsonFormat.Value finalMultiView_propertyFormat = ((JsonFormat.Value) getFieldValue(multiView, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        
        assertNull(finalImpl_config_configOverrides_overrides);
        
        assertFalse(initialMultiView_propertyFormat == finalMultiView_propertyFormat);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:882)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:741) */
            beanAsArrayDeserializer.createContextual(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual3() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            VirtualAnnotatedMember _member = ((VirtualAnnotatedMember) createInstance("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:882)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:741) */
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, beanPropertyWriterType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = beanPropertyWriter;
            try {
                createContextualMethod.invoke(builderBasedDeserializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:882)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:741) */
            beanDeserializer.createContextual(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual5() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:882)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:741) */
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class unwrappingBeanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, unwrappingBeanPropertyWriterType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = unwrappingBeanPropertyWriter;
            try {
                createContextualMethod.invoke(throwableDeserializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual6() throws Throwable  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.getDefaultPropertyFormat(MapperConfigBase.java:524)
            com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.findPropertyFormat(ConcreteBeanPropertyBase.java:76)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides(StdDeserializer.java:1043)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:741) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class unwrappingBeanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, unwrappingBeanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = unwrappingBeanPropertyWriter;
        try {
            createContextualMethod.invoke(beanAsArrayBuilderDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual7() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        JsonFormat.Value _propertyFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat", _propertyFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(JsonFormat.java:688)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.createContextual(BeanDeserializerBase.java:748) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class unwrappingBeanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanDeserializerBaseClazz.getDeclaredMethod("createContextual", implType, unwrappingBeanPropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = unwrappingBeanPropertyWriter;
        try {
            createContextualMethod.invoke(beanDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.isCachable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCachable()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#isCachable()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsCachable_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        boolean actual = builderBasedDeserializer.isCachable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObjectIdReader()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getObjectIdReader()}
 * @utbot.returnsFrom {@code return _objectIdReader;}
 *  */
    @Test
    public void testGetObjectIdReader_Return_objectIdReader() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        ObjectIdReader actual = builderBasedDeserializer.getObjectIdReader();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBeanClass()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getBeanClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetBeanClass_JavaTypeGetRawClass() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Class actual = builderBasedDeserializer.getBeanClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBeanClass()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getBeanClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetBeanClass_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass(BeanDeserializerBase.java:923) */
        builderBasedDeserializer.getBeanClass();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.creatorProperties
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method creatorProperties()
    
    @Test
    public void testCreatorProperties1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        beanAsArrayBuilderDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        Object actual = beanAsArrayBuilderDeserializer.creatorProperties();
        
        Object expected = createInstance("java.util.HashMap$ValueIterator");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        SettableBeanProperty actual = throwableDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return findProperty(propertyName.getSimpleName());}
 *  */
    @Test
    public void testFindProperty_ReturnFindProperty_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[1] = ((Object) innerClassProperty);
        Object object = createInstance("java.lang.Object");
        _hashArea[5] = object;
        _hashArea[7] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        InnerClassProperty actual = ((InnerClassProperty) beanDeserializer.findProperty(propertyName));
        
        SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        assertNull(actual_delegate);
        
        Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_annotated);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        builderBasedDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = " ";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        beanDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowClassCastException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        Object object1 = createInstance("java.lang.Object");
        _hashArea[5] = object1;
        _hashArea[7] = object1;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        throwableDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "@";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        throwableDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = " ";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 514 out of bounds for length 10]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        builderBasedDeserializer.findProperty(propertyName);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test
    public void testFindProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        builderBasedDeserializer.findProperty(((PropertyName) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#getSimpleName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findProperty(propertyName.getSimpleName());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindProperty_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        builderBasedDeserializer.findProperty(propertyName);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    @Test
    public void testFindProperty1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 10);
        java.lang.Object[] _hashArea = new java.lang.Object[37];
        Object object = createInstance("java.lang.Object");
        _hashArea[20] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = beanAsArrayBuilderDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindProperty2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = {null, null, null, null, null, null, null, null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = beanAsArrayBuilderDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindProperty3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _hashArea[1] = ((Object) creatorProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = throwableDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindProperty4() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = beanAsArrayBuilderDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindProperty5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        beanAsArrayDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        _hashArea[1] = ((Object) _beanProperties);
        _hashArea[2] = ((Object) _beanProperties);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[4] = ((Object) _beanProperties);
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[6] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[8] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = beanAsArrayDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindProperty6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        beanAsArrayBuilderDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        SettableBeanProperty actual = beanAsArrayBuilderDeserializer.findProperty(propertyName);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindProperty7() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[1] = ((Object) innerClassProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        InnerClassProperty actual = ((InnerClassProperty) beanAsArrayBuilderDeserializer.findProperty(propertyName));
        
        SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        assertNull(actual_delegate);
        
        Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_annotated);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findProperty(com.fasterxml.jackson.databind.PropertyName)
    
    @Test
    public void testFindProperty8() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        String string = "";
        _hashArea[0] = ((Object) string);
        _hashArea[1] = ((Object) _beanProperties);
        _hashArea[2] = ((Object) _beanProperties);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[4] = ((Object) _beanProperties);
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[6] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[8] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap and com.fasterxml.jackson.databind.deser.SettableBeanProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        throwableDeserializer.findProperty(propertyName);
    }
    
    @Test
    public void testFindProperty9() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        String string = "";
        _hashArea[0] = ((Object) string);
        _hashArea[1] = ((Object) _beanProperties);
        _hashArea[2] = ((Object) _beanProperties);
        _hashArea[3] = ((Object) _beanProperties);
        _hashArea[4] = ((Object) _beanProperties);
        _hashArea[5] = ((Object) _beanProperties);
        _hashArea[6] = ((Object) _beanProperties);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[8] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap and com.fasterxml.jackson.databind.deser.SettableBeanProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        beanAsArrayBuilderDeserializer.findProperty(propertyName);
    }
    
    @Test
    public void testFindProperty10() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000K";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:961) */
        throwableDeserializer.findProperty(propertyName);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findProperty(int)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): True}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__beanPropertiesEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _hashArea[1] = ((Object) objectIdValueProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        SettableBeanProperty actual = throwableDeserializer.findProperty(1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty_PropNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        objectIdValueProperty._propertyIndex = -255;
        _hashArea[1] = ((Object) objectIdValueProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ObjectIdValueProperty actual = ((ObjectIdValueProperty) builderBasedDeserializer.findProperty(-255));
        
        ObjectIdReader actual_objectIdReader = ((ObjectIdReader) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
        assertNull(actual_objectIdReader);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int objectIdValueProperty_propertyIndex = objectIdValueProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(objectIdValueProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findProperty(int)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(int)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _beanProperties.find(propertyIndex)
 *  */
    @Test
    public void testFindProperty_ThrowClassCastException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:360)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:994) */
        builderBasedDeserializer.findProperty(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findProperty(int)
    
    @Test
    public void testFindProperty11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        _hashArea[1] = ((Object) setterlessProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        SettableBeanProperty actual = beanDeserializer.findProperty(1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findProperty(int)
    
    @Test
    public void testFindProperty12() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        String string = "";
        java.lang.Object[] objectArray = new java.lang.Object[1];
        objectArray[0] = ((Object) string);
        _propertyLookup.put(string, objectArray);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        beanAsArrayBuilderDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setterlessProperty._propertyIndex = 2048;
        _hashArea[1] = ((Object) setterlessProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.findCreatorProperty(PropertyBasedCreator.java:109)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:996) */
        beanAsArrayBuilderDeserializer.findProperty(0);
    }
    
    @Test
    public void testFindProperty13() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        _propertyLookup.put(null, null);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        _hashArea[1] = ((Object) setterlessProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.findCreatorProperty(PropertyBasedCreator.java:110)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:996) */
        throwableDeserializer.findProperty(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): True}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorEqualsNull_11() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        SettableBeanProperty actual = throwableDeserializer.findProperty(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): True}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#findCreatorProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty__propertyBasedCreatorNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        HashMap _propertyLookup = new HashMap();
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup", _propertyLookup);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        SettableBeanProperty actual = builderBasedDeserializer.findProperty(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty_PropNotEqualsNull1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        _hashArea[1] = ((Object) managedReferenceProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ManagedReferenceProperty actual = ((ManagedReferenceProperty) builderBasedDeserializer.findProperty(string));
        
        String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
        assertNull(actual_referenceName);
        
        boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
        assertFalse(actual_isContainer);
        
        SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
        assertNull(actual_managedProperty);
        
        SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
        assertNull(actual_backProperty);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int managedReferenceProperty_propertyIndex = managedReferenceProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(managedReferenceProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testFindProperty_PropNotEqualsNull_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[1] = ((Object) innerClassProperty);
        _hashArea[7] = ((Object) _beanProperties);
        _hashArea[9] = ((Object) _beanProperties);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string1 = "";
        
        InnerClassProperty actual = ((InnerClassProperty) throwableDeserializer.findProperty(string1));
        
        SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        assertNull(actual_delegate);
        
        Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_annotated);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.executesCondition {@code ((_beanProperties == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#find(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: _beanProperties.find(propertyName)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindProperty_ThrowIllegalArgumentException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        builderBasedDeserializer.findProperty(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974) */
        throwableDeserializer.findProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowClassCastException2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        Object object1 = createInstance("java.lang.Object");
        _hashArea[5] = object1;
        _hashArea[7] = object1;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974) */
        builderBasedDeserializer.findProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:385)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974) */
        builderBasedDeserializer.findProperty(string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.find(propertyName)
 *  */
    @Test
    public void testFindProperty_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _hashArea[0] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 514 out of bounds for length 10]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._find2(BeanPropertyMap.java:398)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.find(BeanPropertyMap.java:387)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(BeanDeserializerBase.java:974) */
        builderBasedDeserializer.findProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findBackReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findBackReference(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findBackReference(java.lang.String)}
 * @utbot.executesCondition {@code (_backRefs == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindBackReference__backRefsEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        SettableBeanProperty actual = throwableDeserializer.findBackReference(null);
        
        assertNull(actual);
        
        Map finalThrowableDeserializer_backRefs = throwableDeserializer._backRefs;
        
        assertNull(finalThrowableDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findBackReference(java.lang.String)}
 * @utbot.executesCondition {@code (_backRefs == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return _backRefs.get(logicalName);}
 *  */
    @Test
    public void testFindBackReference__backRefsNotEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        String string = "";
        
        SettableBeanProperty actual = throwableDeserializer.findBackReference(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getPropertyCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyCount()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getPropertyCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#size()}
 * @utbot.returnsFrom {@code return _beanProperties.size();}
 *  */
    @Test
    public void testGetPropertyCount_BeanPropertyMapSize() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -255);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        int actual = builderBasedDeserializer.getPropertyCount();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyCount()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getPropertyCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanProperties.size();
 *  */
    @Test
    public void testGetPropertyCount_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getPropertyCount] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getPropertyCount(BeanDeserializerBase.java:907) */
        builderBasedDeserializer.getPropertyCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getValueType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueType()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getValueType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetValueType_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        JavaType actual = builderBasedDeserializer.getValueType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handledType()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return _beanType.getRawClass();}
 *  */
    @Test
    public void testHandledType_JavaTypeGetRawClass() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        Class actual = builderBasedDeserializer.handledType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handledType()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanType.getRawClass();
 *  */
    @Test
    public void testHandledType_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:882) */
        builderBasedDeserializer.handledType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 *  */
    @Test
    public void testReplaceProperty() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[14];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        BeanPropertyMap beanPropertyMap = throwableDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object initialThrowableDeserializer_beanProperties_hashArea1 = get(beanPropertyMap_beanProperties_hashArea, 1);
        
        throwableDeserializer.replaceProperty(null, objectIdValueProperty);
        
        BeanPropertyMap beanPropertyMap1 = throwableDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap1_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object finalThrowableDeserializer_beanProperties_hashArea1 = get(beanPropertyMap1_beanProperties_hashArea, 1);
        
        assertFalse(initialThrowableDeserializer_beanProperties_hashArea1 == finalThrowableDeserializer_beanProperties_hashArea1);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 *  */
    @Test
    public void testReplaceProperty_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        SetterlessProperty setterlessProperty = ((SetterlessProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        _propsInOrder[0] = ((SettableBeanProperty) setterlessProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        BeanPropertyMap beanPropertyMap = beanDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object initialBeanDeserializer_beanProperties_hashArea1 = get(beanPropertyMap_beanProperties_hashArea, 1);
        
        beanDeserializer.replaceProperty(null, objectIdValueProperty);
        
        BeanPropertyMap beanPropertyMap1 = beanDeserializer._beanProperties;
        java.lang.Object[] beanPropertyMap1_beanProperties_hashArea = ((java.lang.Object[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea"));
        Object finalBeanDeserializer_beanProperties_hashArea1 = get(beanPropertyMap1_beanProperties_hashArea, 1);
        
        assertFalse(initialBeanDeserializer_beanProperties_hashArea1 == finalBeanDeserializer_beanProperties_hashArea1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
        java.lang.Object[] _hashArea = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:563)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        throwableDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowClassCastException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        _hashArea[5] = ((Object) propertyName);
        _hashArea[7] = ((Object) propertyName);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", propertyName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:305)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        beanDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[1];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:305)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        beanDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:569)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        throwableDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 128);
        java.lang.Object[] _hashArea = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "[";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 258 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:569)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        builderBasedDeserializer.replaceProperty(null, objectIdValueProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        builderBasedDeserializer.replaceProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._hashCode(BeanPropertyMap.java:602)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:559)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        builderBasedDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[14];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findFromOrdered(BeanPropertyMap.java:588)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:308)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        builderBasedDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_caseInsensitive", true);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "[";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findIndexInHash(BeanPropertyMap.java:563)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:302)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        builderBasedDeserializer.replaceProperty(null, innerClassProperty);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#replaceProperty(com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _beanProperties.replace(replacement);
 *  */
    @Test
    public void testReplaceProperty_ThrowNullPointerException_3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
        java.lang.Object[] _hashArea = new java.lang.Object[10];
        String string = "";
        _hashArea[0] = ((Object) string);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._findFromOrdered(BeanPropertyMap.java:583)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(BeanPropertyMap.java:308)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.replaceProperty(BeanDeserializerBase.java:1039) */
        throwableDeserializer.replaceProperty(null, innerClassProperty);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code ((_subDeserializers == null)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_findSubclassDeserializer_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        HashMap _subDeserializers = new HashMap();
        builderBasedDeserializer._subDeserializers = _subDeserializers;
        
        builderBasedDeserializer._findSubclassDeserializer(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = ctxt.constructType(bean.getClass());
 *  */
    @Test
    public void test_findSubclassDeserializer_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1547) */
        builderBasedDeserializer._findSubclassDeserializer(null, byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = ctxt.constructType(bean.getClass());
 *  */
    @Test
    public void test_findSubclassDeserializer_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1547) */
        throwableDeserializer._findSubclassDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findSubclassDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void test_findSubclassDeserializer1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:475)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findSubclassDeserializer(BeanDeserializerBase.java:1554) */
        beanAsArrayBuilderDeserializer._findSubclassDeserializer(impl, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownProperties(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperties(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: unknownTokens.writeEndObject();
 *  */
    @Test
    public void testHandleUnknownProperties_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperties(BeanDeserializerBase.java:1413) */
        builderBasedDeserializer.handleUnknownProperties(null, null, null);
    }
    ///endregion
    
    ///region Errors report for handleUnknownProperties
    
    public void testHandleUnknownProperties_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testWrapInstantiationProblem_ThrowNumberFormatException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        beanDeserializer.wrapInstantiationProblem(numberFormatException, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapInstantiationProblem_ThrowError() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        builderBasedDeserializer.wrapInstantiationProblem(error, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.UnsupportedEncodingException} when: t instanceof IOException
 *  */
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapInstantiationProblem_ThrowUnsupportedEncodingException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        throwableDeserializer.wrapInstantiationProblem(unsupportedEncodingException, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.nio.file.DirectoryNotEmptyException} when: t instanceof IOException
 *  */
    @Test(expected = DirectoryNotEmptyException.class)
    public void testWrapInstantiationProblem_ThrowDirectoryNotEmptyException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DirectoryNotEmptyException directoryNotEmptyException = ((DirectoryNotEmptyException) createInstance("java.nio.file.DirectoryNotEmptyException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        builderBasedDeserializer.wrapInstantiationProblem(directoryNotEmptyException, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.io.UnsupportedEncodingException} when: t instanceof IOException
 *  */
    @Test(expected = UnsupportedEncodingException.class)
    public void testWrapInstantiationProblem_ThrowUnsupportedEncodingException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        
        beanDeserializer.wrapInstantiationProblem(unsupportedEncodingException, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrapInstantiationProblem(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleInstantiationProblem(_beanType.getRawClass(), null, t);
 *  */
    @Test
    public void testWrapInstantiationProblem_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645) */
        builderBasedDeserializer.wrapInstantiationProblem(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleInstantiationProblem(_beanType.getRawClass(), null, t);
 *  */
    @Test
    public void testWrapInstantiationProblem_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645) */
        builderBasedDeserializer.wrapInstantiationProblem(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleInstantiationProblem(_beanType.getRawClass(), null, t);
 *  */
    @Test
    public void testWrapInstantiationProblem_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645) */
        builderBasedDeserializer.wrapInstantiationProblem(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -256);
        int[] intArray = {};
        
        throwableDeserializer.handleUnknownProperty(treeTraversingParser, impl, intArray, null);
        
        Set finalThrowableDeserializer_ignorableProps = throwableDeserializer._ignorableProps;
        
        assertNull(finalThrowableDeserializer_ignorableProps);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        byte[][] byteArray = {};
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownProperty(treeTraversingParser, impl, byteArray, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 9);
        Object object = new Object();
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownProperty(jsonParserSequence, impl, object, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleUnknownProperty_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        int[][] intArray = {};
        
        JsonParser jsonParserDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownProperty(jsonParserDelegate, impl, intArray, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonParser jsonParserDelegateDelegate1 = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialJsonParserDelegateDelegate_currToken == finalJsonParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignoreAllUnknown): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#skipChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.skipChildren();
 *  */
    @Test
    public void testHandleUnknownProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownProperty(BeanDeserializerBase.java:1459) */
        builderBasedDeserializer.handleUnknownProperty(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        beanDeserializer.handleIgnoredProperty(jsonParserSequence, impl, null, null);
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        throwableDeserializer.handleIgnoredProperty(jsonParserSequence, impl, null, null);
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testHandleIgnoredProperty_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        beanDeserializer.handleIgnoredProperty(jsonParserSequence, impl, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowIllegalArgumentException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -1);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:316)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1481) */
        throwableDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowClassCastException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1481) */
        beanDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#skipChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.skipChildren();
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1483) */
        builderBasedDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1480) */
        builderBasedDeserializer.handleIgnoredProperty(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleIgnoredProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
 *  */
    @Test
    public void testHandleIgnoredProperty_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleIgnoredProperty(BeanDeserializerBase.java:1481) */
        beanDeserializer.handleIgnoredProperty(null, impl, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handleUnknownVanilla
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignorableProps != null): False}
 *  */
    @Test
    public void testHandleUnknownVanilla__ignorablePropsEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        throwableDeserializer.handleUnknownVanilla(treeTraversingParser, null, null, null);
        
        Set finalThrowableDeserializer_ignorableProps = throwableDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalThrowableDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignorableProps != null): False}
 *  */
    @Test
    public void testHandleUnknownVanilla__ignorablePropsEqualsNull_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        builderBasedDeserializer.handleUnknownVanilla(treeTraversingParser, null, null, null);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignorableProps != null): True}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 *  */
    @Test
    public void testHandleUnknownVanilla__ignorablePropsNotEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        LinkedHashSet _ignorableProps = new LinkedHashSet();
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        String string = "";
        
        beanDeserializer.handleUnknownVanilla(treeTraversingParser, null, null, string);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#handleUnknownVanilla(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (_ignorableProps != null): False}
 *  */
    @Test
    public void testHandleUnknownVanilla__ignorablePropsEqualsNull_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType javaType = builderBasedDeserializer._beanType;
        Class initialBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        builderBasedDeserializer.handleUnknownVanilla(treeTraversingParser, impl, null, null);
        
        JavaType javaType1 = builderBasedDeserializer._beanType;
        Class finalBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        assertFalse(initialBuilderBasedDeserializer_beanType_class == finalBuilderBasedDeserializer_beanType_class);
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.throwOrReturnThrowable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_NotTNotInstanceOfRuntimeException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class throwableType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", throwableType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = ((Object) null);
        throwOrReturnThrowableMethodArguments[1] = impl;
        Throwable actual = ((Throwable) throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof IOException): True}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonProcessingException)): False}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_TNotInstanceOfJsonProcessingException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class unrecognizedPropertyExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", unrecognizedPropertyExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = unrecognizedPropertyException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        UnrecognizedPropertyException actual = ((UnrecognizedPropertyException) throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments));
        
        Class actual_referringClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_referringClass"));
        assertNull(actual_referringClass);
        
        String actual_propertyName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyName"));
        assertNull(actual_propertyName);
        
        Collection actual_propertyIds = ((Collection) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyIds"));
        assertNull(actual_propertyIds);
        
        String actual_propertiesAsString = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertiesAsString"));
        assertNull(actual_propertiesAsString);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int unrecognizedPropertyExceptionDepth = ((Integer) getFieldValue(unrecognizedPropertyException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(unrecognizedPropertyExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (t instanceof IOException): False},
    ///     {@code (!wrap): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_BooleanWrapInitializedByCtxtNotEqualsNullOrCtxtIsEnabled() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class throwableType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", throwableType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = ((Object) null);
        throwOrReturnThrowableMethodArguments[1] = impl;
        Throwable actual = ((Throwable) throwOrReturnThrowableMethod.invoke(builderBasedDeserializer, throwOrReturnThrowableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_BooleanWrapInitializedByCtxtEqualsNullOrCtxtIsEnabled() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class throwableType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", throwableType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = ((Object) null);
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        Throwable actual = ((Throwable) throwOrReturnThrowableMethod.invoke(builderBasedDeserializer, throwOrReturnThrowableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowOrReturnThrowable_TNotInstanceOfInvocationTargetExceptionAndTGetCauseEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class invocationTargetExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", invocationTargetExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = invocationTargetException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        InvocationTargetException actual = ((InvocationTargetException) throwOrReturnThrowableMethod.invoke(builderBasedDeserializer, throwOrReturnThrowableMethodArguments));
        
        Throwable actualTarget = ((Throwable) getFieldValue(actual, "java.lang.reflect.InvocationTargetException", "target"));
        assertNull(actualTarget);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int invocationTargetExceptionDepth = ((Integer) getFieldValue(invocationTargetException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(invocationTargetExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testThrowOrReturnThrowable_ThrowNumberFormatException() throws Throwable  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class numberFormatExceptionType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", numberFormatExceptionType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = numberFormatException;
        throwOrReturnThrowableMethodArguments[1] = impl;
        try {
            throwOrReturnThrowableMethod.invoke(beanDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testThrowOrReturnThrowable_ThrowError() throws Throwable  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class errorType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", errorType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = error;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        try {
            throwOrReturnThrowableMethod.invoke(builderBasedDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testThrowOrReturnThrowable_ThrowError_1() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        Error target = ((Error) createInstance("java.lang.Error"));
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class invocationTargetExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", invocationTargetExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = invocationTargetException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        try {
            throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException1) {
            throw invocationTargetException1.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method throwOrReturnThrowable(java.lang.Throwable, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.net.MalformedURLException} when: !wrap || !(t instanceof JsonProcessingException)
 *  */
    @Test(expected = MalformedURLException.class)
    public void testThrowOrReturnThrowable_ThrowMalformedURLException() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        MalformedURLException malformedURLException = ((MalformedURLException) createInstance("java.net.MalformedURLException"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class malformedURLExceptionType = Class.forName("java.lang.Throwable");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", malformedURLExceptionType, implType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = malformedURLException;
        throwOrReturnThrowableMethodArguments[1] = impl;
        try {
            throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#throwOrReturnThrowable(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!wrap): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonProcessingException)): True}
 * @utbot.throwsException {@link java.net.UnknownHostException} when: !wrap || !(t instanceof JsonProcessingException)
 *  */
    @Test(expected = UnknownHostException.class)
    public void testThrowOrReturnThrowable_ThrowUnknownHostException() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UnknownHostException unknownHostException = ((UnknownHostException) createInstance("java.net.UnknownHostException"));
        
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class unknownHostExceptionType = Class.forName("java.lang.Throwable");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method throwOrReturnThrowableMethod = beanDeserializerBaseClazz.getDeclaredMethod("throwOrReturnThrowable", unknownHostExceptionType, deserializationContextType);
        throwOrReturnThrowableMethod.setAccessible(true);
        java.lang.Object[] throwOrReturnThrowableMethodArguments = new java.lang.Object[2];
        throwOrReturnThrowableMethodArguments[0] = unknownHostException;
        throwOrReturnThrowableMethodArguments[1] = ((Object) null);
        try {
            throwOrReturnThrowableMethod.invoke(throwableDeserializer, throwOrReturnThrowableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return _deserializeUsingPropertyBased(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNegativeArraySizeException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        beanDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1194) */
        beanDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return _deserializeUsingPropertyBased(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNegativeArraySizeException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:337)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1194) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isAbstract()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _beanType.isAbstract()
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1197) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_beanType.isAbstract()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isAbstract()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleMissingInstantiator(java.lang.Class,com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(_beanType.getRawClass(), p, "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enable type information?)");
 *  */
    @Test
    public void testDeserializeFromObjectUsingNonDefault_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1201) */
        builderBasedDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObjectUsingNonDefault_ThrowIllegalStateException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        beanDeserializer.deserializeFromObjectUsingNonDefault(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromDouble(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromDouble(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getNumberType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NumberType t = p.getNumberType();
 *  */
    @Test
    public void testDeserializeFromDouble_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromDouble(BeanDeserializerBase.java:1285) */
        builderBasedDeserializer.deserializeFromDouble(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveUnwrappedProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, objectIdValueProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(objectIdValueProperty, ((Constructor) null));
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, innerClassProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty5 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty5);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = beanDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ReturnNull_5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty3 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        InnerClassProperty _managedProperty4 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdValueProperty _delegate1 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_managedProperty4, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(_managedProperty3, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty4);
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        SettableBeanProperty actual = builderBasedDeserializer._resolveUnwrappedProperty(null, managedReferenceProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveUnwrappedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMember am = prop.getMember();
 *  */
    @Test
    public void test_resolveUnwrappedProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveUnwrappedProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveUnwrappedProperty(BeanDeserializerBase.java:821) */
        builderBasedDeserializer._resolveUnwrappedProperty(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (intr != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingDeserializer_IntrEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer actual = builderBasedDeserializer.findConvertingDeserializer(impl, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (intr != null): True}
 * @utbot.executesCondition {@code (convDef != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getMember()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingDeserializer_ConvDefEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ManagedReferenceProperty _managedProperty2 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        ObjectIdValueProperty _managedProperty3 = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(_managedProperty2, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty3);
        setField(_managedProperty1, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty2);
        setField(_managedProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty1);
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _managedProperty);
        
        JsonDeserializer actual = beanDeserializer.findConvertingDeserializer(impl, managedReferenceProperty);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = ctxt.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindConvertingDeserializer_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:657) */
        builderBasedDeserializer.findConvertingDeserializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = intr.findDeserializationConverter(prop.getMember());
 *  */
    @Test
    public void testFindConvertingDeserializer_ThrowNullPointerException_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:659) */
            throwableDeserializer.findConvertingDeserializer(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (intr != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = intr.findDeserializationConverter(prop.getMember());
 *  */
    @Test
    public void testFindConvertingDeserializer_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findConvertingDeserializer(BeanDeserializerBase.java:659) */
        throwableDeserializer.findConvertingDeserializer(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): False}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_NotDeserNotInstanceOfBeanDeserializerBase() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            
            ManagedReferenceProperty actual = ((ManagedReferenceProperty) builderBasedDeserializer._resolveInnerClassValuedProperty(null, managedReferenceProperty));
            
            String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
            assertNull(actual_referenceName);
            
            boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
            assertFalse(actual_isContainer);
            
            SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
            assertNull(actual_managedProperty);
            
            SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
            assertNull(actual_backProperty);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            assertNull(actual_valueDeserializer);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int managedReferenceProperty_propertyIndex = managedReferenceProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(managedReferenceProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_DeserInstanceOfBeanDeserializerBase_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(managedReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            ManagedReferenceProperty actual = ((ManagedReferenceProperty) builderBasedDeserializer._resolveInnerClassValuedProperty(null, managedReferenceProperty));
            
            String actual_referenceName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_referenceName"));
            assertNull(actual_referenceName);
            
            boolean actual_isContainer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_isContainer"));
            assertFalse(actual_isContainer);
            
            SettableBeanProperty actual_managedProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty"));
            assertNull(actual_managedProperty);
            
            SettableBeanProperty actual_backProperty = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_backProperty"));
            assertNull(actual_backProperty);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer managedReferenceProperty_valueDeserializer = managedReferenceProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            BeanDeserializerBase actual_valueDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
            assertNull(actual_valueDeserializer_delegate);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
            assertNull(actual_valueDeserializer_orderedProperties);
            
            AnnotatedMethod actual_valueDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
            assertNull(actual_valueDeserializer_buildMethod);
            
            Annotations actual_valueDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_valueDeserializer_classAnnotations);
            
            JavaType actual_valueDeserializer_beanType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
            assertNull(actual_valueDeserializer_beanType);
            
            JsonFormat.Shape actual_valueDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
            assertNull(actual_valueDeserializer_serializationShape);
            
            ValueInstantiator managedReferenceProperty_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(managedReferenceProperty_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            ValueInstantiator actual_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            int managedReferenceProperty_valueDeserializer_valueInstantiator_type = ((Integer) getFieldValue(managedReferenceProperty_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type"));
            int actual_valueDeserializer_valueInstantiator_type = ((Integer) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type"));
            assertEquals(managedReferenceProperty_valueDeserializer_valueInstantiator_type, actual_valueDeserializer_valueInstantiator_type);
            
            Class actual_valueDeserializer_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueType);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            JsonDeserializer actual_valueDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
            assertNull(actual_valueDeserializer_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_valueDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
            assertNull(actual_valueDeserializer_propertyBasedCreator);
            
            boolean actual_valueDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
            assertFalse(actual_valueDeserializer_nonStandardCreation);
            
            boolean actual_valueDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
            assertFalse(actual_valueDeserializer_vanillaProcessing);
            
            BeanPropertyMap actual_valueDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
            assertNull(actual_valueDeserializer_beanProperties);
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_valueDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
            assertNull(actual_valueDeserializer_injectables);
            
            SettableAnyProperty actual_valueDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
            assertNull(actual_valueDeserializer_anySetter);
            
            Set actual_valueDeserializer_ignorableProps = ((Set) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
            assertNull(actual_valueDeserializer_ignorableProps);
            
            boolean actual_valueDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
            assertFalse(actual_valueDeserializer_ignoreAllUnknown);
            
            boolean actual_valueDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
            assertFalse(actual_valueDeserializer_needViewProcesing);
            
            Map actual_valueDeserializer_backRefs = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
            assertNull(actual_valueDeserializer_backRefs);
            
            HashMap actual_valueDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
            assertNull(actual_valueDeserializer_subDeserializers);
            
            UnwrappedPropertyHandler actual_valueDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
            assertNull(actual_valueDeserializer_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_valueDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
            assertNull(actual_valueDeserializer_externalTypeIdHandler);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int managedReferenceProperty_propertyIndex = managedReferenceProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(managedReferenceProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_DeserInstanceOfBeanDeserializerBase() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            AnnotatedMethod _defaultCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
            setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            ObjectIdValueProperty actual = ((ObjectIdValueProperty) beanDeserializer._resolveInnerClassValuedProperty(null, objectIdValueProperty));
            
            ObjectIdReader actual_objectIdReader = ((ObjectIdReader) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
            assertNull(actual_objectIdReader);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer objectIdValueProperty_valueDeserializer = objectIdValueProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            BeanDeserializerBase actual_valueDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
            assertNull(actual_valueDeserializer_delegate);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
            assertNull(actual_valueDeserializer_orderedProperties);
            
            AnnotatedMethod actual_valueDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
            assertNull(actual_valueDeserializer_buildMethod);
            
            Annotations actual_valueDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_valueDeserializer_classAnnotations);
            
            JavaType actual_valueDeserializer_beanType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
            assertNull(actual_valueDeserializer_beanType);
            
            JsonFormat.Shape actual_valueDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
            assertNull(actual_valueDeserializer_serializationShape);
            
            ValueInstantiator objectIdValueProperty_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(objectIdValueProperty_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            ValueInstantiator actual_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            String actual_valueDeserializer_valueInstantiator_valueTypeDesc = ((String) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueTypeDesc);
            
            Class actual_valueDeserializer_valueInstantiator_valueClass = ((Class) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass"));
            assertNull(actual_valueDeserializer_valueInstantiator_valueClass);
            
            AnnotatedWithParams objectIdValueProperty_valueDeserializer_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(objectIdValueProperty_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
            Method actual_valueDeserializer_valueInstantiator_defaultCreator_method = ((Method) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_method);
            
            java.lang.Class[] actual_valueDeserializer_valueInstantiator_defaultCreator_paramClasses = ((java.lang.Class[]) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_paramClasses);
            
            Object actual_valueDeserializer_valueInstantiator_defaultCreator_serialization = getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_serialization");
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_serialization);
            
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_valueDeserializer_valueInstantiator_defaultCreator_paramAnnotations = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "_paramAnnotations"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_paramAnnotations);
            
            TypeResolutionContext actual_valueDeserializer_valueInstantiator_defaultCreator_typeContext = ((TypeResolutionContext) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_typeContext"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_typeContext);
            
            AnnotationMap actual_valueDeserializer_valueInstantiator_defaultCreator_annotations = ((AnnotationMap) getFieldValue(actual_valueDeserializer_valueInstantiator_defaultCreator, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
            assertNull(actual_valueDeserializer_valueInstantiator_defaultCreator_annotations);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_withArgsCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_withArgsCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_constructorArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_constructorArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_constructorArguments);
            
            JavaType actual_valueDeserializer_valueInstantiator_delegateType = ((JavaType) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateType);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_delegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_delegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_delegateArguments);
            
            JavaType actual_valueDeserializer_valueInstantiator_arrayDelegateType = ((JavaType) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateType);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_arrayDelegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_valueInstantiator_arrayDelegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateArguments"));
            assertNull(actual_valueDeserializer_valueInstantiator_arrayDelegateArguments);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromStringCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromStringCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromIntCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromIntCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromLongCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromLongCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromDoubleCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromDoubleCreator);
            
            AnnotatedWithParams actual_valueDeserializer_valueInstantiator_fromBooleanCreator = ((AnnotatedWithParams) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator"));
            assertNull(actual_valueDeserializer_valueInstantiator_fromBooleanCreator);
            
            AnnotatedParameter actual_valueDeserializer_valueInstantiator_incompleteParameter = ((AnnotatedParameter) getFieldValue(actual_valueDeserializer_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_incompleteParameter"));
            assertNull(actual_valueDeserializer_valueInstantiator_incompleteParameter);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            JsonDeserializer actual_valueDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
            assertNull(actual_valueDeserializer_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_valueDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
            assertNull(actual_valueDeserializer_propertyBasedCreator);
            
            boolean actual_valueDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
            assertFalse(actual_valueDeserializer_nonStandardCreation);
            
            boolean actual_valueDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
            assertFalse(actual_valueDeserializer_vanillaProcessing);
            
            BeanPropertyMap actual_valueDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
            assertNull(actual_valueDeserializer_beanProperties);
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_valueDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
            assertNull(actual_valueDeserializer_injectables);
            
            SettableAnyProperty actual_valueDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
            assertNull(actual_valueDeserializer_anySetter);
            
            Set actual_valueDeserializer_ignorableProps = ((Set) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
            assertNull(actual_valueDeserializer_ignorableProps);
            
            boolean actual_valueDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
            assertFalse(actual_valueDeserializer_ignoreAllUnknown);
            
            boolean actual_valueDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
            assertFalse(actual_valueDeserializer_needViewProcesing);
            
            Map actual_valueDeserializer_backRefs = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
            assertNull(actual_valueDeserializer_backRefs);
            
            HashMap actual_valueDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
            assertNull(actual_valueDeserializer_subDeserializers);
            
            UnwrappedPropertyHandler actual_valueDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
            assertNull(actual_valueDeserializer_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_valueDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
            assertNull(actual_valueDeserializer_externalTypeIdHandler);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int objectIdValueProperty_propertyIndex = objectIdValueProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(objectIdValueProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> deser = prop.getValueDeserializer();
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:846) */
        builderBasedDeserializer._resolveInnerClassValuedProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !vi.canCreateUsingDefault()
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:851) */
            builderBasedDeserializer._resolveInnerClassValuedProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (deser instanceof BeanDeserializerBase): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateUsingDefault()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> valueClass = prop.getType().getRawClass();
 *  */
    @Test
    public void test_resolveInnerClassValuedProperty_ThrowNullPointerException_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            BeanAsArrayDeserializer _valueDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:852) */
            beanDeserializer._resolveInnerClassValuedProperty(null, objectIdValueProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _resolveInnerClassValuedProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    @Test
    public void test_resolveInnerClassValuedProperty1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty] produces [java.lang.NullPointerException]
                java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
                com.fasterxml.jackson.databind.util.LRUMap.get(LRUMap.java:68)
                com.fasterxml.jackson.databind.util.ClassUtil._getMetadata(ClassUtil.java:453)
                com.fasterxml.jackson.databind.util.ClassUtil.hasEnclosingMethod(ClassUtil.java:382)
                com.fasterxml.jackson.databind.util.ClassUtil.getOuterClass(ClassUtil.java:229)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveInnerClassValuedProperty(BeanDeserializerBase.java:853) */
            beanAsArrayBuilderDeserializer._resolveInnerClassValuedProperty(null, objectIdValueProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKnownPropertyNames()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#iterator()}
 * @utbot.returnsFrom {@code return names;}
 *  */
    @Test
    public void testGetKnownPropertyNames_BeanPropertyMapIterator() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        ArrayList actual = ((ArrayList) throwableDeserializer.getKnownPropertyNames());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKnownPropertyNames()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowIllegalArgumentException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", -1);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:316)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913) */
        beanDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowClassCastException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _hashArea[1] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913) */
        builderBasedDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowClassCastException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        _hashArea[1] = ((Object) innerClassProperty);
        Object object = createInstance("java.lang.Object");
        _hashArea[3] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913) */
        builderBasedDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowClassCastException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        java.lang.Object[] _hashArea = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        _hashArea[3] = object;
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:318)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913) */
        builderBasedDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913) */
        throwableDeserializer.getKnownPropertyNames();
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getKnownPropertyNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(SettableBeanProperty prop: _beanProperties)
 *  */
    @Test
    public void testGetKnownPropertyNames_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.properties(BeanPropertyMap.java:317)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.iterator(BeanPropertyMap.java:331)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getKnownPropertyNames(BeanDeserializerBase.java:913) */
        beanDeserializer.getKnownPropertyNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (refName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolveManagedReferenceProperty_RefNameEqualsNull() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        
        InnerClassProperty actual = ((InnerClassProperty) beanDeserializer._resolveManagedReferenceProperty(null, innerClassProperty));
        
        SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
        assertNull(actual_delegate);
        
        Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
        assertNull(actual_creator);
        
        AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
        assertNull(actual_annotated);
        
        PropertyName actual_propName = actual._propName;
        assertNull(actual_propName);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        String actual_managedReferenceName = actual._managedReferenceName;
        assertNull(actual_managedReferenceName);
        
        ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
        assertNull(actual_objectIdInfo);
        
        ViewMatcher actual_viewMatcher = actual._viewMatcher;
        assertNull(actual_viewMatcher);
        
        int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
        int actual_propertyIndex = actual._propertyIndex;
        assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
        
        PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
        assertNull(actual_propertyFormat);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String refName = prop.getManagedReferenceName();
 *  */
    @Test
    public void test_resolveManagedReferenceProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty(BeanDeserializerBase.java:775) */
        builderBasedDeserializer._resolveManagedReferenceProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (refName == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getManagedReferenceName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty backProp = valueDeser.findBackReference(refName);
 *  */
    @Test
    public void test_resolveManagedReferenceProperty_ThrowNullPointerException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            String _managedReferenceName = "";
            managedReferenceProperty._managedReferenceName = _managedReferenceName;
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveManagedReferenceProperty(BeanDeserializerBase.java:780) */
            beanDeserializer._resolveManagedReferenceProperty(null, managedReferenceProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SettableBeanProperty backProp = valueDeser.findBackReference(refName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_resolveManagedReferenceProperty_ThrowIllegalArgumentException() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            builderBasedDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: prop.getType()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_resolveManagedReferenceProperty_ThrowIllegalArgumentException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            throwableDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolveManagedReferenceProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: prop.getType()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_resolveManagedReferenceProperty_ThrowIllegalArgumentException_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            LinkedHashMap _backRefProperties = new LinkedHashMap();
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties", _backRefProperties);
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            String _managedReferenceName = "";
            innerClassProperty._managedReferenceName = _managedReferenceName;
            
            throwableDeserializer._resolveManagedReferenceProperty(null, innerClassProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#readObjectReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object id = _objectIdReader.readObjectReference(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObjectId_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174) */
        builderBasedDeserializer.deserializeFromObjectId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _objectIdReader.readObjectReference(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObjectId_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        builderBasedDeserializer.deserializeFromObjectId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object id = _objectIdReader.readObjectReference(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObjectId_ThrowIllegalStateException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer1 = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        builderBasedDeserializer.deserializeFromObjectId(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ThrowableDeserializer _deserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanAsArrayBuilderDeserializer.deserializeFromObjectId(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        beanAsArrayBuilderDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId3() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        beanAsArrayBuilderDeserializer.deserializeFromObjectId(jsonParserDelegate2, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromObjectId4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanAsArrayDeserializer.deserializeFromObjectId(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromObjectId5() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174) */
        beanAsArrayBuilderDeserializer.deserializeFromObjectId(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectId6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174) */
        beanDeserializer.deserializeFromObjectId(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromObjectId7() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174) */
        beanAsArrayBuilderDeserializer.deserializeFromObjectId(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserializeFromObjectId8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174) */
        builderBasedDeserializer.deserializeFromObjectId(jsonParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean value = (p.getCurrentToken() == JsonToken.VALUE_TRUE);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1322) */
        builderBasedDeserializer.deserializeFromBoolean(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_valueInstantiator.canCreateFromBoolean()
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UntypedObjectDeserializer _delegateDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1314) */
        beanDeserializer.deserializeFromBoolean(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromBoolean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean value = (p.getCurrentToken() == JsonToken.VALUE_TRUE);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_2() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        UntypedObjectDeserializer _delegateDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1322) */
        beanDeserializer.deserializeFromBoolean(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanDeserializer.deserializeFromBoolean(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        builderBasedDeserializer.deserializeFromBoolean(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        throwableDeserializer.deserializeFromBoolean(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromBoolean(ctxt, value);
 *  */
    @Test
    public void testDeserializeFromBoolean_ThrowNullPointerException_6() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        builderBasedDeserializer.deserializeFromBoolean(jsonParserSequence, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromBoolean(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeFromBoolean1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        StringCollectionDeserializer _delegateDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getDeclaringClass(AnnotatedMethod.java:171)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanDeserializer.deserializeFromBoolean(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromBoolean2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getDeclaringClass(AnnotatedMethod.java:171)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanAsArrayBuilderDeserializer.deserializeFromBoolean(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromBoolean3() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:275)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanAsArrayBuilderDeserializer.deserializeFromBoolean(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromBoolean4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _fromBooleanCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.getDeclaringClass(AnnotatedConstructor.java:139)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanAsArrayDeserializer.deserializeFromBoolean(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromBoolean5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1315) */
        beanAsArrayDeserializer.deserializeFromBoolean(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromBoolean6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1315) */
        beanDeserializer.deserializeFromBoolean(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromBoolean7() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        StringDeserializer _delegateDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getDeclaringClass(AnnotatedMethod.java:171)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:383)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        throwableDeserializer.deserializeFromBoolean(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserializeFromBoolean8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:995)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:275)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:377)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        builderBasedDeserializer.deserializeFromBoolean(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeFromBoolean9() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:995)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:275)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:377)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanAsArrayBuilderDeserializer.deserializeFromBoolean(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeFromBoolean10() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:275)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:377)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromBoolean(BeanDeserializerBase.java:1323) */
        beanAsArrayDeserializer.deserializeFromBoolean(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region Errors report for deserializeFromBoolean
    
    public void testDeserializeFromBoolean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.nextToken();
 *  */
    @Test
    public void testDeserializeFromArray_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanDeserializer.deserializeFromArray(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserializeFromArray_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1352) */
        throwableDeserializer.deserializeFromArray(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromArray1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ThrowableDeserializer _arrayDelegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer", _arrayDelegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeFromArray(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromArray2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanAsArrayBuilderDeserializer.deserializeFromArray(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromArray3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanDeserializer.deserializeFromArray(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromArray4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:882)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1371) */
        beanAsArrayDeserializer.deserializeFromArray(null, impl);
    }
    
    @Test
    public void testDeserializeFromArray5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanAsArrayDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:594)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanAsArrayBuilderDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray7() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:594)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanAsArrayBuilderDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray8() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1357) */
        throwableDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray9() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _arrayDelegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_arrayDelegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _arrayDelegateDeserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer", _arrayDelegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1336) */
        beanDeserializer.deserializeFromArray(null, null);
    }
    
    @Test
    public void testDeserializeFromArray10() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        _delegateDeserializer._vanillaProcessing = true;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1348) */
        builderBasedDeserializer.deserializeFromArray(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromArray11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2200)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1357) */
        beanDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray12() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer._deserializeNonVanilla(BeanAsArrayBuilderDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer.deserialize(BeanAsArrayBuilderDeserializer.java:108)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1357) */
        beanAsArrayBuilderDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray13() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2200)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        builderBasedDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray14() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2200)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        builderBasedDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray15() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2183)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanAsArrayDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray16() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:721)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        throwableDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray17() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2183)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray18() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:723)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353) */
        beanAsArrayBuilderDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray19() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1348) */
        beanDeserializer.deserializeFromArray(null, impl);
    }
    
    @Test
    public void testDeserializeFromArray20() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1348) */
        beanDeserializer.deserializeFromArray(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromArray21() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1348) */
        beanAsArrayBuilderDeserializer.deserializeFromArray(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromArray22() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanDeserializer _arrayDelegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer", _arrayDelegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1336) */
        builderBasedDeserializer.deserializeFromArray(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserializeFromArray23() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2200)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1357) */
        throwableDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray24() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer._deserializeNonVanilla(BeanAsArrayBuilderDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer.deserialize(BeanAsArrayBuilderDeserializer.java:108)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1357) */
        beanAsArrayBuilderDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray25() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWS(UTF8DataInputJsonParser.java:2200)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1353)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1357) */
        throwableDeserializer.deserializeFromArray(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void testDeserializeFromArray26() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.wrapInstantiationProblem(BeanDeserializerBase.java:1645)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1348) */
        beanAsArrayDeserializer.deserializeFromArray(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromArray27() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        beanDeserializer.deserializeFromArray(null, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeFromObject(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithObjectId_ThrowIllegalStateException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        throwableDeserializer.deserializeWithObjectId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithObjectId_ThrowNegativeArraySizeException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        throwableDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:130)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeUsingPropertyBased(BeanDeserializer.java:383)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:65)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeWithObjectId1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeWithObjectId2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:87)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(null, null);
    }
    
    @Test
    public void testDeserializeWithObjectId3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:75)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(null, impl);
    }
    
    @Test
    public void testDeserializeWithObjectId4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:69)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeWithObjectId5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:69)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserializeWithObjectId6() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _defaultCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer.deserializeFromObject(ThrowableDeserializer.java:88)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithObjectId(BeanDeserializerBase.java:1165) */
        throwableDeserializer.deserializeWithObjectId(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region Errors report for deserializeWithObjectId
    
    public void testDeserializeWithObjectId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderEqualsNull() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            InnerClassProperty actual = ((InnerClassProperty) throwableDeserializer._resolvedObjectIdProperty(null, innerClassProperty));
            
            SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
            assertNull(actual_delegate);
            
            Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
            assertNull(actual_annotated);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer innerClassProperty_valueDeserializer = innerClassProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            String actual_valueDeserializer_message = ((String) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
            assertNull(actual_valueDeserializer_message);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderEqualsNull_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            InnerClassProperty actual = ((InnerClassProperty) throwableDeserializer._resolvedObjectIdProperty(null, innerClassProperty));
            
            SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
            assertNull(actual_delegate);
            
            Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
            assertNull(actual_annotated);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer innerClassProperty_valueDeserializer = innerClassProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            JavaType actual_valueDeserializer_baseType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
            assertNull(actual_valueDeserializer_baseType);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Map actual_valueDeserializer_backRefProperties = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
            assertNull(actual_valueDeserializer_backRefProperties);
            
            boolean actual_valueDeserializer_acceptString = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
            assertFalse(actual_valueDeserializer_acceptString);
            
            boolean actual_valueDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
            assertFalse(actual_valueDeserializer_acceptBoolean);
            
            boolean actual_valueDeserializer_acceptInt = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
            assertFalse(actual_valueDeserializer_acceptInt);
            
            boolean actual_valueDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
            assertFalse(actual_valueDeserializer_acceptDouble);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): True}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderEqualsNull_2() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            BeanAsArrayBuilderDeserializer _valueDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            InnerClassProperty actual = ((InnerClassProperty) throwableDeserializer._resolvedObjectIdProperty(null, innerClassProperty));
            
            SettableBeanProperty actual_delegate = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate"));
            assertNull(actual_delegate);
            
            Constructor actual_creator = ((Constructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_creator"));
            assertNull(actual_creator);
            
            AnnotatedConstructor actual_annotated = ((AnnotatedConstructor) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_annotated"));
            assertNull(actual_annotated);
            
            PropertyName actual_propName = actual._propName;
            assertNull(actual_propName);
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            JsonDeserializer innerClassProperty_valueDeserializer = innerClassProperty._valueDeserializer;
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            BeanDeserializerBase actual_valueDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
            assertNull(actual_valueDeserializer_delegate);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
            assertNull(actual_valueDeserializer_orderedProperties);
            
            AnnotatedMethod actual_valueDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
            assertNull(actual_valueDeserializer_buildMethod);
            
            Annotations actual_valueDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_valueDeserializer_classAnnotations);
            
            JavaType actual_valueDeserializer_beanType = ((JavaType) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
            assertNull(actual_valueDeserializer_beanType);
            
            JsonFormat.Shape actual_valueDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
            assertNull(actual_valueDeserializer_serializationShape);
            
            ValueInstantiator actual_valueDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
            assertNull(actual_valueDeserializer_valueInstantiator);
            
            JsonDeserializer actual_valueDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
            assertNull(actual_valueDeserializer_delegateDeserializer);
            
            JsonDeserializer actual_valueDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
            assertNull(actual_valueDeserializer_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_valueDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
            assertNull(actual_valueDeserializer_propertyBasedCreator);
            
            boolean actual_valueDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
            assertFalse(actual_valueDeserializer_nonStandardCreation);
            
            boolean actual_valueDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
            assertFalse(actual_valueDeserializer_vanillaProcessing);
            
            BeanPropertyMap actual_valueDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
            assertNull(actual_valueDeserializer_beanProperties);
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_valueDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
            assertNull(actual_valueDeserializer_injectables);
            
            SettableAnyProperty actual_valueDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
            assertNull(actual_valueDeserializer_anySetter);
            
            Set actual_valueDeserializer_ignorableProps = ((Set) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
            assertNull(actual_valueDeserializer_ignorableProps);
            
            boolean actual_valueDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
            assertFalse(actual_valueDeserializer_ignoreAllUnknown);
            
            boolean actual_valueDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
            assertFalse(actual_valueDeserializer_needViewProcesing);
            
            Map actual_valueDeserializer_backRefs = ((Map) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
            assertNull(actual_valueDeserializer_backRefs);
            
            HashMap actual_valueDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
            assertNull(actual_valueDeserializer_subDeserializers);
            
            UnwrappedPropertyHandler actual_valueDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
            assertNull(actual_valueDeserializer_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_valueDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
            assertNull(actual_valueDeserializer_externalTypeIdHandler);
            
            ObjectIdReader actual_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
            assertNull(actual_valueDeserializer_objectIdReader);
            
            Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueDeserializer_valueClass);
            
            TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
            assertNull(actual_valueTypeDeserializer);
            
            String actual_managedReferenceName = actual._managedReferenceName;
            assertNull(actual_managedReferenceName);
            
            ObjectIdInfo actual_objectIdInfo = actual._objectIdInfo;
            assertNull(actual_objectIdInfo);
            
            ViewMatcher actual_viewMatcher = actual._viewMatcher;
            assertNull(actual_viewMatcher);
            
            int innerClassProperty_propertyIndex = innerClassProperty._propertyIndex;
            int actual_propertyIndex = actual._propertyIndex;
            assertEquals(innerClassProperty_propertyIndex, actual_propertyIndex);
            
            PropertyMetadata actual_metadata = ((PropertyMetadata) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_propertyFormat = ((JsonFormat.Value) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_propertyFormat);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(prop, objectIdInfo);}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_Return() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            ObjectIdInfo _objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
            objectIdValueProperty._objectIdInfo = _objectIdInfo;
            objectIdValueProperty._propertyIndex = -255;
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) throwableDeserializer._resolvedObjectIdProperty(null, objectIdValueProperty));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", objectIdValueProperty);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            expected._objectIdInfo = _objectIdInfo;
            expected._propertyIndex = -255;
            
            SettableBeanProperty expected_forward = ((SettableBeanProperty) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            ObjectIdReader actual_forward_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
            assertNull(actual_forward_objectIdReader);
            
            PropertyName actual_forward_propName = actual_forward._propName;
            assertNull(actual_forward_propName);
            
            JavaType actual_forward_type = actual_forward._type;
            assertNull(actual_forward_type);
            
            PropertyName actual_forward_wrapperName = actual_forward._wrapperName;
            assertNull(actual_forward_wrapperName);
            
            Annotations actual_forward_contextAnnotations = actual_forward._contextAnnotations;
            assertNull(actual_forward_contextAnnotations);
            
            JsonDeserializer expected_forward_valueDeserializer = expected_forward._valueDeserializer;
            JsonDeserializer actual_forward_valueDeserializer = actual_forward._valueDeserializer;
            JavaType actual_forward_valueDeserializer_baseType = ((JavaType) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
            assertNull(actual_forward_valueDeserializer_baseType);
            
            ObjectIdReader actual_forward_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            assertNull(actual_forward_valueDeserializer_objectIdReader);
            
            Map actual_forward_valueDeserializer_backRefProperties = ((Map) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
            assertNull(actual_forward_valueDeserializer_backRefProperties);
            
            boolean actual_forward_valueDeserializer_acceptString = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
            assertFalse(actual_forward_valueDeserializer_acceptString);
            
            boolean actual_forward_valueDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
            assertFalse(actual_forward_valueDeserializer_acceptBoolean);
            
            boolean actual_forward_valueDeserializer_acceptInt = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
            assertFalse(actual_forward_valueDeserializer_acceptInt);
            
            boolean actual_forward_valueDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
            assertFalse(actual_forward_valueDeserializer_acceptDouble);
            
            TypeDeserializer actual_forward_valueTypeDeserializer = actual_forward._valueTypeDeserializer;
            assertNull(actual_forward_valueTypeDeserializer);
            
            String actual_forward_managedReferenceName = actual_forward._managedReferenceName;
            assertNull(actual_forward_managedReferenceName);
            
            ObjectIdInfo expected_forward_objectIdInfo = expected_forward._objectIdInfo;
            ObjectIdInfo actual_forward_objectIdInfo = actual_forward._objectIdInfo;
            PropertyName actual_forward_objectIdInfo_propertyName = ((PropertyName) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_propertyName"));
            assertNull(actual_forward_objectIdInfo_propertyName);
            
            Class actual_forward_objectIdInfo_generator = ((Class) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator"));
            assertNull(actual_forward_objectIdInfo_generator);
            
            Class actual_forward_objectIdInfo_resolver = ((Class) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver"));
            assertNull(actual_forward_objectIdInfo_resolver);
            
            Class actual_forward_objectIdInfo_scope = ((Class) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_scope"));
            assertNull(actual_forward_objectIdInfo_scope);
            
            boolean actual_forward_objectIdInfo_alwaysAsId = ((Boolean) getFieldValue(actual_forward_objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_alwaysAsId"));
            assertFalse(actual_forward_objectIdInfo_alwaysAsId);
            
            ViewMatcher actual_forward_viewMatcher = actual_forward._viewMatcher;
            assertNull(actual_forward_viewMatcher);
            
            int expected_forward_propertyIndex = expected_forward._propertyIndex;
            int actual_forward_propertyIndex = actual_forward._propertyIndex;
            assertEquals(expected_forward_propertyIndex, actual_forward_propertyIndex);
            
            PropertyMetadata actual_forward_metadata = ((PropertyMetadata) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_forward_metadata);
            
            JsonFormat.Value actual_forward_propertyFormat = ((JsonFormat.Value) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_forward_propertyFormat);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.executesCondition {@code (objectIdReader == null): False}
 * @utbot.returnsFrom {@code return new ObjectIdReferenceProperty(prop, objectIdInfo);}
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ObjectIdReaderNotEqualsNull() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
            setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            ObjectIdReferenceProperty actual = ((ObjectIdReferenceProperty) throwableDeserializer._resolvedObjectIdProperty(null, objectIdValueProperty));
            
            ObjectIdReferenceProperty expected = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", objectIdValueProperty);
            setField(expected, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            
            SettableBeanProperty expected_forward = ((SettableBeanProperty) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            SettableBeanProperty actual_forward = ((SettableBeanProperty) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward"));
            ObjectIdReader actual_forward_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader"));
            assertNull(actual_forward_objectIdReader);
            
            PropertyName actual_forward_propName = actual_forward._propName;
            assertNull(actual_forward_propName);
            
            JavaType actual_forward_type = actual_forward._type;
            assertNull(actual_forward_type);
            
            PropertyName actual_forward_wrapperName = actual_forward._wrapperName;
            assertNull(actual_forward_wrapperName);
            
            Annotations actual_forward_contextAnnotations = actual_forward._contextAnnotations;
            assertNull(actual_forward_contextAnnotations);
            
            JsonDeserializer expected_forward_valueDeserializer = expected_forward._valueDeserializer;
            JsonDeserializer actual_forward_valueDeserializer = actual_forward._valueDeserializer;
            JavaType actual_forward_valueDeserializer_baseType = ((JavaType) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_baseType"));
            assertNull(actual_forward_valueDeserializer_baseType);
            
            ObjectIdReader expected_forward_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(expected_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            ObjectIdReader actual_forward_valueDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader"));
            JavaType actual_forward_valueDeserializer_objectIdReader_idType = ((JavaType) getFieldValue(actual_forward_valueDeserializer_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType"));
            assertNull(actual_forward_valueDeserializer_objectIdReader_idType);
            
            PropertyName actual_forward_valueDeserializer_objectIdReaderPropertyName = actual_forward_valueDeserializer_objectIdReader.propertyName;
            assertNull(actual_forward_valueDeserializer_objectIdReaderPropertyName);
            
            ObjectIdGenerator actual_forward_valueDeserializer_objectIdReaderGenerator = actual_forward_valueDeserializer_objectIdReader.generator;
            assertNull(actual_forward_valueDeserializer_objectIdReaderGenerator);
            
            ObjectIdResolver actual_forward_valueDeserializer_objectIdReaderResolver = actual_forward_valueDeserializer_objectIdReader.resolver;
            assertNull(actual_forward_valueDeserializer_objectIdReaderResolver);
            
            JsonDeserializer actual_forward_valueDeserializer_objectIdReader_deserializer = ((JsonDeserializer) getFieldValue(actual_forward_valueDeserializer_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer"));
            assertNull(actual_forward_valueDeserializer_objectIdReader_deserializer);
            
            SettableBeanProperty actual_forward_valueDeserializer_objectIdReaderIdProperty = actual_forward_valueDeserializer_objectIdReader.idProperty;
            assertNull(actual_forward_valueDeserializer_objectIdReaderIdProperty);
            
            Map actual_forward_valueDeserializer_backRefProperties = ((Map) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_backRefProperties"));
            assertNull(actual_forward_valueDeserializer_backRefProperties);
            
            boolean actual_forward_valueDeserializer_acceptString = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptString"));
            assertFalse(actual_forward_valueDeserializer_acceptString);
            
            boolean actual_forward_valueDeserializer_acceptBoolean = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptBoolean"));
            assertFalse(actual_forward_valueDeserializer_acceptBoolean);
            
            boolean actual_forward_valueDeserializer_acceptInt = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptInt"));
            assertFalse(actual_forward_valueDeserializer_acceptInt);
            
            boolean actual_forward_valueDeserializer_acceptDouble = ((Boolean) getFieldValue(actual_forward_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_acceptDouble"));
            assertFalse(actual_forward_valueDeserializer_acceptDouble);
            
            TypeDeserializer actual_forward_valueTypeDeserializer = actual_forward._valueTypeDeserializer;
            assertNull(actual_forward_valueTypeDeserializer);
            
            String actual_forward_managedReferenceName = actual_forward._managedReferenceName;
            assertNull(actual_forward_managedReferenceName);
            
            ObjectIdInfo actual_forward_objectIdInfo = actual_forward._objectIdInfo;
            assertNull(actual_forward_objectIdInfo);
            
            ViewMatcher actual_forward_viewMatcher = actual_forward._viewMatcher;
            assertNull(actual_forward_viewMatcher);
            
            int expected_forward_propertyIndex = expected_forward._propertyIndex;
            int actual_forward_propertyIndex = actual_forward._propertyIndex;
            assertEquals(expected_forward_propertyIndex, actual_forward_propertyIndex);
            
            PropertyMetadata actual_forward_metadata = ((PropertyMetadata) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata"));
            assertNull(actual_forward_metadata);
            
            JsonFormat.Value actual_forward_propertyFormat = ((JsonFormat.Value) getFieldValue(actual_forward, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_propertyFormat"));
            assertNull(actual_forward_propertyFormat);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getObjectIdInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdInfo objectIdInfo = prop.getObjectIdInfo();
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty(BeanDeserializerBase.java:805) */
        builderBasedDeserializer._resolvedObjectIdProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_resolvedObjectIdProperty(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getObjectIdInfo()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#getValueDeserializer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectIdReader objectIdReader = valueDeser.getObjectIdReader();
 *  */
    @Test
    public void test_resolvedObjectIdProperty_ThrowNullPointerException_1() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolvedObjectIdProperty(BeanDeserializerBase.java:807) */
            beanDeserializer._resolvedObjectIdProperty(null, managedReferenceProperty);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate1, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return p.getEmbeddedObject();}
 *  */
    @Test
    public void testDeserializeFromEmbedded_ReturnPGetEmbeddedObject_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getEmbeddedObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return p.getEmbeddedObject();
 *  */
    @Test
    public void testDeserializeFromEmbedded_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1385) */
        builderBasedDeserializer.deserializeFromEmbedded(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeFromObjectId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromEmbedded_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        builderBasedDeserializer.deserializeFromEmbedded(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeFromEmbedded1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = beanAsArrayDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = beanAsArrayBuilderDeserializer.deserializeFromEmbedded(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded3() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        Object actual = beanAsArrayBuilderDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        POJONode _node = ((POJONode) createInstance("com.fasterxml.jackson.databind.node.POJONode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        Object actual = builderBasedDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        setField(delegate4, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Object actual = beanAsArrayBuilderDeserializer.deserializeFromEmbedded(jsonParserDelegate1, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded7() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(delegate4, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = throwableDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded8() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        
        Object actual = beanAsArrayBuilderDeserializer.deserializeFromEmbedded(jsonParserDelegate4, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeFromEmbedded9() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        
        Object actual = beanAsArrayBuilderDeserializer.deserializeFromEmbedded(jsonParserDelegate4, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromEmbedded(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromEmbedded10() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanAsArrayDeserializer.deserializeFromEmbedded(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromEmbedded11() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanAsArrayDeserializer.deserializeFromEmbedded(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromEmbedded12() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:878)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1385)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:165)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromEmbedded(BeanDeserializerBase.java:1380) */
        throwableDeserializer.deserializeFromEmbedded(filteringParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: TypeDeserializer td = delegateType.getTypeHandler();
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowClassCastException() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            int[] _typeHandler = {};
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.jsontype.TypeDeserializer ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.jsontype.TypeDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:633) */
            Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", deserializationContextType, mapTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = ((Object) null);
            _findDelegateDeserializerMethodArguments[1] = mapType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(throwableDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeDeserializer td = delegateType.getTypeHandler();
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowNullPointerException() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:633) */
            Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", deserializationContextType, javaTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = ((Object) null);
            _findDelegateDeserializerMethodArguments[1] = ((Object) null);
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.executesCondition {@code (td == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: td = ctxt.getConfig().findTypeDeserializer(delegateType);
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowNullPointerException_1() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:635) */
            Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", deserializationContextType, mapTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = ((Object) null);
            _findDelegateDeserializerMethodArguments[1] = mapType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(throwableDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 * @utbot.executesCondition {@code (td == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: td = ctxt.getConfig().findTypeDeserializer(delegateType);
 *  */
    @Test
    public void test_findDelegateDeserializer_ThrowNullPointerException_2() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdOptional, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:635) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(throwableDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findDelegateDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    @Test
    public void test_findDelegateDeserializer1() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.DeserializationConfig.introspectClassAnnotations(DeserializationConfig.java:763)
                com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:320)
                com.fasterxml.jackson.databind.DeserializationConfig.findTypeDeserializer(DeserializationConfig.java:922)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:635) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    @Test
    public void test_findDelegateDeserializer2() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
            BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:228)
                com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:142)
                com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:442)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:967)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:637) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapLikeTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapLikeType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanAsArrayBuilderDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    
    @Test
    public void test_findDelegateDeserializer3() throws Throwable  {
        PropertyName prevTEMP_PROPERTY_NAME = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        PropertyMetadata prevSTD_OPTIONAL = PropertyMetadata.STD_OPTIONAL;
        try {
            PropertyName tempPropertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "#temporary-name";
            setField(tempPropertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
            setStaticField(beanDeserializerBaseClazz, "TEMP_PROPERTY_NAME", tempPropertyName);
            PropertyMetadata stdOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_OPTIONAL", stdOptional);
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
            BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            AsWrapperTypeDeserializer _typeHandler1 = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:228)
                com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:142)
                com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:442)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:967)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase._findDelegateDeserializer(BeanDeserializerBase.java:637) */
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
            Method _findDelegateDeserializerMethod = beanDeserializerBaseClazz.getDeclaredMethod("_findDelegateDeserializer", implType, mapLikeTypeType, annotatedWithParamsType);
            _findDelegateDeserializerMethod.setAccessible(true);
            java.lang.Object[] _findDelegateDeserializerMethodArguments = new java.lang.Object[3];
            _findDelegateDeserializerMethodArguments[0] = impl;
            _findDelegateDeserializerMethodArguments[1] = mapLikeType;
            _findDelegateDeserializerMethodArguments[2] = ((Object) null);
            try {
                _findDelegateDeserializerMethod.invoke(beanAsArrayBuilderDeserializer, _findDelegateDeserializerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(BeanDeserializerBase.class, "TEMP_PROPERTY_NAME", prevTEMP_PROPERTY_NAME);
            setStaticField(PropertyMetadata.class, "STD_OPTIONAL", prevSTD_OPTIONAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getValueInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueInstantiator()
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getValueInstantiator()}
 * @utbot.returnsFrom {@code return _valueInstantiator;}
 *  */
    @Test
    public void testGetValueInstantiator_Return_valueInstantiator() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        ValueInstantiator actual = builderBasedDeserializer.getValueInstantiator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.canReadObjectId()
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1063) */
        beanDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        builderBasedDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1075) */
        builderBasedDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#maySerializeAsObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_3() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        ObjectIdGenerators.StringIdGenerator generator = ((ObjectIdGenerators.StringIdGenerator) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "generator", generator);
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeObjectIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        builderBasedDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithType1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanAsArrayBuilderDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithType2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        beanAsArrayBuilderDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType3() throws Throwable  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class typeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = beanDeserializerBaseClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, typeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = ((Object) null);
        try {
            deserializeWithTypeMethod.invoke(beanAsArrayBuilderDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType4() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanAsArrayBuilderDeserializer.deserializeWithType(filteringParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType5() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1630)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:236)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:86)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanAsArrayBuilderDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanAsArrayBuilderDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType7() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.maySerializeAsObject(ObjectIdReader.java:111)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1081) */
        throwableDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWithType8() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeObjectIds", true);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getObjectId(TokenBuffer.java:1635)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getObjectId(JsonParserDelegate.java:235)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getObjectId(JsonParserDelegate.java:235)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1064) */
        throwableDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWithType9() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        throwableDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWithType10() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeObjectIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class typeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = beanDeserializerBaseClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, typeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = ((Object) null);
        try {
            deserializeWithTypeMethod.invoke(throwableDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType11() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:52)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType12() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        builderBasedDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWithType13() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeObjectIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanAsArrayBuilderDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWithType14() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        beanAsArrayDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    @Test
    public void testDeserializeWithType15() throws Throwable  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeObjectIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeWithType(BeanDeserializerBase.java:1088) */
        Class beanDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class typeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = beanDeserializerBaseClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, typeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = ((Object) null);
        try {
            deserializeWithTypeMethod.invoke(beanAsArrayBuilderDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleTypedObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_handleTypedObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> idDeser = _objectIdReader.getDeserializer();
 *  */
    @Test
    public void test_handleTypedObjectId_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1103) */
        builderBasedDeserializer._handleTypedObjectId(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#_handleTypedObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ObjectIdReader#getDeserializer()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: idDeser.handledType() == rawId.getClass()
 *  */
    @Test
    public void test_handleTypedObjectId_ThrowNullPointerException_1() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1107) */
        beanDeserializer._handleTypedObjectId(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _handleTypedObjectId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId1() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(null, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId2() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(null, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId3() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId4() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(null, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId5() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(null, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId7() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId8() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer4 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer4, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer4);
        setField(_deserializer3, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer4);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId9() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer4 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer4, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer3);
        setField(_deserializer3, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer4);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId10() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer1);
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId11() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer3, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        beanAsArrayBuilderDeserializer._handleTypedObjectId(null, null, object, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_handleTypedObjectId12() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer3 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer3, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer1);
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer3);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        builderBasedDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test
    public void test_handleTypedObjectId13() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer3, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer3);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1107) */
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test
    public void test_handleTypedObjectId14() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer4 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer4, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer3, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer4);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1107) */
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test
    public void test_handleTypedObjectId15() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1107) */
        beanAsArrayBuilderDeserializer._handleTypedObjectId(jsonParserSequence, null, object, object);
    }
    
    @Test
    public void test_handleTypedObjectId16() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer3 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer3);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:148)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:36)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase._handleTypedObjectId(BeanDeserializerBase.java:1107) */
        beanAsArrayBuilderDeserializer._handleTypedObjectId(null, null, object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromNumber(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromObjectId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeFromObjectId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromNumber_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        builderBasedDeserializer.deserializeFromNumber(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromNumber(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_objectIdReader != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getNumberType())
 *  */
    @Test
    public void testDeserializeFromNumber_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1217) */
        throwableDeserializer.deserializeFromNumber(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromNumber1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanAsArrayDeserializer.deserializeFromNumber(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromNumber2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        beanAsArrayDeserializer.deserializeFromNumber(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserializeFromNumber3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        _delegateDeserializer._vanillaProcessing = true;
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:140)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1214) */
        builderBasedDeserializer.deserializeFromNumber(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1214) */
        builderBasedDeserializer.deserializeFromNumber(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1214) */
        builderBasedDeserializer.deserializeFromNumber(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromNumber6() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1214) */
        beanAsArrayBuilderDeserializer.deserializeFromNumber(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserializeFromNumber7() throws Exception  {
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayBuilderDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.readObjectReference(ObjectIdReader.java:136)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectId(BeanDeserializerBase.java:1174)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(BeanDeserializerBase.java:1214) */
        beanAsArrayBuilderDeserializer.deserializeFromNumber(jsonParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromString(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_valueInstantiator.canCreateFromString()
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(beanDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1268) */
        beanDeserializer.deserializeFromString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromStringCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        builderBasedDeserializer.deserializeFromString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#deserializeFromString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueInstantiator.createFromString(ctxt, p.getText());
 *  */
    @Test
    public void testDeserializeFromString_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        builderBasedDeserializer.deserializeFromString(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeFromString(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromString1() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        beanAsArrayDeserializer.deserializeFromString(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeFromString2() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        beanAsArrayDeserializer.deserializeFromString(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserializeFromString3() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:361)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromString(StdValueInstantiator.java:307)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString4() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString5() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString6() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromString7() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString8() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserializeFromString9() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        builderBasedDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString10() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 134217728);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString11() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:138)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1269) */
        beanAsArrayDeserializer.deserializeFromString(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserializeFromString12() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void testDeserializeFromString13() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromString(BeanDeserializerBase.java:1276) */
        beanAsArrayDeserializer.deserializeFromString(uTF8DataInputJsonParser, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromString(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromString14() throws Exception  {
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
        setField(beanAsArrayDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        
        beanAsArrayDeserializer.deserializeFromString(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1076574007783300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1076574007783300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1076574007788199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076574007783300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076574007788199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076574008275300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076574008275300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076574008276900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076574008275300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076574008276900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076574008567299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076574008567299.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076574008568900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076574008567299.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076574008568900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

