package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.util.HashMap;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.core.Base64Variant;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.BeanProperty;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_jsontype_impl_StdTypeResolverBuilderTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.init
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, com.fasterxml.jackson.databind.jsontype.TypeIdResolver)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver)}
 * @utbot.executesCondition {@code (idType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonTypeInfo.Id#getDefaultPropertyName()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInit_IdTypeNotEqualsNull() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id id = JsonTypeInfo.Id.NONE;
        
        JsonTypeInfo.Id initialStdTypeResolverBuilder_idType = stdTypeResolverBuilder._idType;
        
        StdTypeResolverBuilder actual = stdTypeResolverBuilder.init(id, ((TypeIdResolver) null));
        
        JsonTypeInfo.Id stdTypeResolverBuilder_idType = stdTypeResolverBuilder._idType;
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertEquals(stdTypeResolverBuilder_idType, actual_idType);
        
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertNull(actual_includeAs);
        
        String actual_typeProperty = actual._typeProperty;
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
        JsonTypeInfo.Id finalStdTypeResolverBuilder_idType = stdTypeResolverBuilder._idType;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, com.fasterxml.jackson.databind.jsontype.TypeIdResolver)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver)}
 * @utbot.executesCondition {@code (idType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: idType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInit_ThrowIllegalArgumentException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        stdTypeResolverBuilder.init(((JsonTypeInfo.Id) null), ((TypeIdResolver) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.defaultImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defaultImpl(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#defaultImpl(java.lang.Class)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDefaultImpl_Return() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        StdTypeResolverBuilder actual = stdTypeResolverBuilder.defaultImpl(((Class) null));
        
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertNull(actual_idType);
        
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertNull(actual_includeAs);
        
        String actual_typeProperty = actual._typeProperty;
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.inclusion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As)}
 * @utbot.executesCondition {@code (includeAs == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInclusion_IncludeAsNotEqualsNull() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.As as = JsonTypeInfo.As.PROPERTY;
        
        JsonTypeInfo.As initialStdTypeResolverBuilder_includeAs = stdTypeResolverBuilder._includeAs;
        
        StdTypeResolverBuilder actual = stdTypeResolverBuilder.inclusion(as);
        
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertNull(actual_idType);
        
        JsonTypeInfo.As stdTypeResolverBuilder_includeAs = stdTypeResolverBuilder._includeAs;
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertEquals(stdTypeResolverBuilder_includeAs, actual_includeAs);
        
        String actual_typeProperty = actual._typeProperty;
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
        JsonTypeInfo.As finalStdTypeResolverBuilder_includeAs = stdTypeResolverBuilder._includeAs;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As)}
 * @utbot.executesCondition {@code (includeAs == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: includeAs == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInclusion_ThrowIllegalArgumentException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        stdTypeResolverBuilder.inclusion(((JsonTypeInfo.As) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.typeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method typeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#typeProperty(java.lang.String)}
 * @utbot.executesCondition {@code (typeIdPropName == null): False}
 * @utbot.executesCondition {@code (typeIdPropName.length() == 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTypeProperty_TypeIdPropNameLengthNotEqualsZero() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        String string = " ";
        
        StdTypeResolverBuilder actual = stdTypeResolverBuilder.typeProperty(string);
        
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertNull(actual_idType);
        
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertNull(actual_includeAs);
        
        String stdTypeResolverBuilder_typeProperty = stdTypeResolverBuilder._typeProperty;
        String actual_typeProperty = actual._typeProperty;
        assertEquals(stdTypeResolverBuilder_typeProperty, actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#typeProperty(java.lang.String)}
 * @utbot.executesCondition {@code (typeIdPropName == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonTypeInfo.Id#getDefaultPropertyName()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTypeProperty_TypeIdPropNameEqualsNull() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        stdTypeResolverBuilder._idType = _idType;
        
        StdTypeResolverBuilder actual = stdTypeResolverBuilder.typeProperty(((String) null));
        
        JsonTypeInfo.Id stdTypeResolverBuilder_idType = stdTypeResolverBuilder._idType;
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertEquals(stdTypeResolverBuilder_idType, actual_idType);
        
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertNull(actual_includeAs);
        
        String actual_typeProperty = actual._typeProperty;
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method typeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#typeProperty(java.lang.String)}
 * @utbot.executesCondition {@code (typeIdPropName == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeIdPropName = _idType.getDefaultPropertyName();
 *  */
    @Test
    public void testTypeProperty_ThrowNullPointerException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.typeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.typeProperty(StdTypeResolverBuilder.java:169) */
        stdTypeResolverBuilder.typeProperty(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#typeProperty(java.lang.String)}
 * @utbot.executesCondition {@code (typeIdPropName == null): False}
 * @utbot.executesCondition {@code (typeIdPropName.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeIdPropName = _idType.getDefaultPropertyName();
 *  */
    @Test
    public void testTypeProperty_ThrowNullPointerException_1() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.typeProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.typeProperty(StdTypeResolverBuilder.java:169) */
        stdTypeResolverBuilder.typeProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.typeIdVisibility
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method typeIdVisibility(boolean)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#typeIdVisibility(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTypeIdVisibility_Return() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        stdTypeResolverBuilder._typeIdVisible = false;
        
        StdTypeResolverBuilder actual = stdTypeResolverBuilder.typeIdVisibility(false);
        
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertNull(actual_idType);
        
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertNull(actual_includeAs);
        
        String actual_typeProperty = actual._typeProperty;
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.getTypeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeProperty()
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#getTypeProperty()}
 * @utbot.returnsFrom {@code return _typeProperty;}
 *  */
    @Test
    public void testGetTypeProperty_Return_typeProperty() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        String actual = stdTypeResolverBuilder.getTypeProperty();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.getDefaultImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultImpl()
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#getDefaultImpl()}
 * @utbot.returnsFrom {@code return _defaultImpl;}
 *  */
    @Test
    public void testGetDefaultImpl_Return_defaultImpl() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        Class actual = stdTypeResolverBuilder.getDefaultImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method noTypeInfoBuilder()
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#noTypeInfoBuilder()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver)}
 * @utbot.returnsFrom {@code return new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NONE, null);}
 *  */
    @Test
    public void testNoTypeInfoBuilder_StdTypeResolverBuilderInit() {
        StdTypeResolverBuilder actual = StdTypeResolverBuilder.noTypeInfoBuilder();
        
        StdTypeResolverBuilder expected = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        expected._idType = _idType;
        expected._typeIdVisible = false;
        
        JsonTypeInfo.Id expected_idType = expected._idType;
        JsonTypeInfo.Id actual_idType = actual._idType;
        assertEquals(expected_idType, actual_idType);
        
        JsonTypeInfo.As actual_includeAs = actual._includeAs;
        assertNull(actual_includeAs);
        
        String actual_typeProperty = actual._typeProperty;
        assertNull(actual_typeProperty);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Class actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        TypeIdResolver actual_customIdResolver = actual._customIdResolver;
        assertNull(actual_customIdResolver);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.executesCondition {@code (_customIdResolver != null): True}
 * @utbot.returnsFrom {@code return _customIdResolver;}
 *  */
    @Test
    public void testIdResolver__customIdResolverNotEqualsNull() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        MinimalClassNameIdResolver _customIdResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        
        MinimalClassNameIdResolver actual = ((MinimalClassNameIdResolver) stdTypeResolverBuilder.idResolver(null, null, null, false, false));
        
        String actual_basePackageName = actual._basePackageName;
        assertNull(actual_basePackageName);
        
        String actual_basePackagePrefix = actual._basePackagePrefix;
        assertNull(actual_basePackagePrefix);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection, boolean, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_customIdResolver != null): False},
    ///     {@code (_idType == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.annotation.JsonTypeInfo.Id#ordinal()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        stdTypeResolverBuilder._idType = _idType;
        
        TypeIdResolver actual = stdTypeResolverBuilder.idResolver(null, null, null, false, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_1() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        stdTypeResolverBuilder._idType = _idType;
        
        TypeIdResolver actual = stdTypeResolverBuilder.idResolver(null, null, null, false, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_2() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.CLASS;
        stdTypeResolverBuilder._idType = _idType;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        ClassNameIdResolver actual = ((ClassNameIdResolver) stdTypeResolverBuilder.idResolver(deserializationConfig, null, null, false, false));
        
        ClassNameIdResolver expected = new ClassNameIdResolver(null, null);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_5() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.MINIMAL_CLASS;
        stdTypeResolverBuilder._idType = _idType;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MinimalClassNameIdResolver actual = ((MinimalClassNameIdResolver) stdTypeResolverBuilder.idResolver(deserializationConfig, referenceType, null, false, false));
        
        MinimalClassNameIdResolver expected = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        String _basePackageName = "java.lang";
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName", _basePackageName);
        String _basePackagePrefix = "java.lang.";
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix", _basePackagePrefix);
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory", _typeFactory);
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", referenceType);
        
        String expected_basePackageName = expected._basePackageName;
        String actual_basePackageName = actual._basePackageName;
        assertEquals(expected_basePackageName, actual_basePackageName);
        
        String expected_basePackagePrefix = expected._basePackagePrefix;
        String actual_basePackagePrefix = actual._basePackagePrefix;
        assertEquals(expected_basePackagePrefix, actual_basePackagePrefix);
        
        TypeFactory expected_typeFactory = expected._typeFactory;
        TypeFactory actual_typeFactory = actual._typeFactory;
        LRUMap actual_typeFactory_typeCache = ((LRUMap) getFieldValue(actual_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache"));
        assertNull(actual_typeFactory_typeCache);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_typeFactory_modifiers = ((com.fasterxml.jackson.databind.type.TypeModifier[]) getFieldValue(actual_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_modifiers"));
        assertNull(actual_typeFactory_modifiers);
        
        TypeParser actual_typeFactory_parser = ((TypeParser) getFieldValue(actual_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser"));
        assertNull(actual_typeFactory_parser);
        
        ClassLoader actual_typeFactory_classLoader = ((ClassLoader) getFieldValue(actual_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader"));
        assertNull(actual_typeFactory_classLoader);
        
        JavaType expected_baseType = expected._baseType;
        JavaType actual_baseType = actual._baseType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_baseType, actual_baseType);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_3() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        TypeNameIdResolver actual = ((TypeNameIdResolver) stdTypeResolverBuilder.idResolver(serializationConfig, null, null, true, false));
        
        TypeNameIdResolver expected = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_config", serializationConfig);
        HashMap _typeToId = new HashMap();
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_typeToId", _typeToId);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        PrettyPrinter actual_config_defaultPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_defaultPrettyPrinter"));
        assertNull(actual_config_defaultPrettyPrinter);
        
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        int expected_config_formatWriteFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        int actual_config_formatWriteFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        assertEquals(expected_config_formatWriteFeatures, actual_config_formatWriteFeatures);
        
        int expected_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        int actual_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        assertEquals(expected_config_formatWriteFeaturesToChange, actual_config_formatWriteFeaturesToChange);
        
        JsonInclude.Value actual_config_serializationInclusion = ((JsonInclude.Value) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_config_serializationInclusion);
        
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
        
        Map expected_typeToId = expected._typeToId;
        Map actual_typeToId = actual._typeToId;
        assertTrue(deepEquals(expected_typeToId, actual_typeToId));
        
        Map actual_idToType = actual._idToType;
        assertNull(actual_idToType);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_6() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        TypeNameIdResolver actual = ((TypeNameIdResolver) stdTypeResolverBuilder.idResolver(serializationConfig, null, null, false, true));
        
        TypeNameIdResolver expected = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_config", serializationConfig);
        TreeMap _typeToId = new TreeMap();
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_typeToId", _typeToId);
        HashMap _idToType = new HashMap();
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        PrettyPrinter actual_config_defaultPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_defaultPrettyPrinter"));
        assertNull(actual_config_defaultPrettyPrinter);
        
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        int expected_config_formatWriteFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        int actual_config_formatWriteFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        assertEquals(expected_config_formatWriteFeatures, actual_config_formatWriteFeatures);
        
        int expected_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        int actual_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        assertEquals(expected_config_formatWriteFeaturesToChange, actual_config_formatWriteFeaturesToChange);
        
        JsonInclude.Value actual_config_serializationInclusion = ((JsonInclude.Value) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_config_serializationInclusion);
        
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
        
        Map expected_typeToId = expected._typeToId;
        Map actual_typeToId = actual._typeToId;
        assertTrue(deepEquals(expected_typeToId, actual_typeToId));
        
        Map expected_idToType = expected._idToType;
        Map actual_idToType = actual._idToType;
        assertTrue(deepEquals(expected_idToType, actual_idToType));
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_7() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        HashSet hashSet = new HashSet();
        
        TypeNameIdResolver actual = ((TypeNameIdResolver) stdTypeResolverBuilder.idResolver(serializationConfig, null, hashSet, false, true));
        
        TypeNameIdResolver expected = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_config", serializationConfig);
        TreeMap _typeToId = new TreeMap();
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_typeToId", _typeToId);
        HashMap _idToType = new HashMap();
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        PrettyPrinter actual_config_defaultPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_defaultPrettyPrinter"));
        assertNull(actual_config_defaultPrettyPrinter);
        
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        int expected_config_formatWriteFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        int actual_config_formatWriteFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        assertEquals(expected_config_formatWriteFeatures, actual_config_formatWriteFeatures);
        
        int expected_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        int actual_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        assertEquals(expected_config_formatWriteFeaturesToChange, actual_config_formatWriteFeaturesToChange);
        
        JsonInclude.Value actual_config_serializationInclusion = ((JsonInclude.Value) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_config_serializationInclusion);
        
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
        
        Map expected_typeToId = expected._typeToId;
        Map actual_typeToId = actual._typeToId;
        assertTrue(deepEquals(expected_typeToId, actual_typeToId));
        
        Map expected_idToType = expected._idToType;
        Map actual_idToType = actual._idToType;
        assertTrue(deepEquals(expected_idToType, actual_idToType));
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 *  */
    @Test
    public void testIdResolver_4() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        
        TypeNameIdResolver actual = ((TypeNameIdResolver) stdTypeResolverBuilder.idResolver(serializationConfig, null, arrayList, true, false));
        
        TypeNameIdResolver expected = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_config", serializationConfig);
        HashMap _typeToId = new HashMap();
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_typeToId", _typeToId);
        setField(expected, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory", _typeFactory);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        FilterProvider actual_config_filterProvider = ((FilterProvider) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider"));
        assertNull(actual_config_filterProvider);
        
        PrettyPrinter actual_config_defaultPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_defaultPrettyPrinter"));
        assertNull(actual_config_defaultPrettyPrinter);
        
        int expected_config_serFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        int actual_config_serFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures"));
        assertEquals(expected_config_serFeatures, actual_config_serFeatures);
        
        int expected_config_generatorFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        int actual_config_generatorFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeatures"));
        assertEquals(expected_config_generatorFeatures, actual_config_generatorFeatures);
        
        int expected_config_generatorFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        int actual_config_generatorFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_generatorFeaturesToChange"));
        assertEquals(expected_config_generatorFeaturesToChange, actual_config_generatorFeaturesToChange);
        
        int expected_config_formatWriteFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        int actual_config_formatWriteFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeatures"));
        assertEquals(expected_config_formatWriteFeatures, actual_config_formatWriteFeatures);
        
        int expected_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        int actual_config_formatWriteFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_formatWriteFeaturesToChange"));
        assertEquals(expected_config_formatWriteFeaturesToChange, actual_config_formatWriteFeaturesToChange);
        
        JsonInclude.Value actual_config_serializationInclusion = ((JsonInclude.Value) getFieldValue(actual_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serializationInclusion"));
        assertNull(actual_config_serializationInclusion);
        
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
        
        AnnotationIntrospector actual_config_base_annotationIntrospector = ((AnnotationIntrospector) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector"));
        assertNull(actual_config_base_annotationIntrospector);
        
        VisibilityChecker actual_config_base_visibilityChecker = ((VisibilityChecker) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_visibilityChecker"));
        assertNull(actual_config_base_visibilityChecker);
        
        PropertyNamingStrategy actual_config_base_propertyNamingStrategy = ((PropertyNamingStrategy) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_propertyNamingStrategy"));
        assertNull(actual_config_base_propertyNamingStrategy);
        
        TypeFactory expected_config_base_typeFactory = ((TypeFactory) getFieldValue(expected_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory"));
        TypeFactory actual_config_base_typeFactory = ((TypeFactory) getFieldValue(actual_config_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory"));
        LRUMap actual_config_base_typeFactory_typeCache = ((LRUMap) getFieldValue(actual_config_base_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache"));
        assertNull(actual_config_base_typeFactory_typeCache);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_config_base_typeFactory_modifiers = ((com.fasterxml.jackson.databind.type.TypeModifier[]) getFieldValue(actual_config_base_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_modifiers"));
        assertNull(actual_config_base_typeFactory_modifiers);
        
        TypeParser actual_config_base_typeFactory_parser = ((TypeParser) getFieldValue(actual_config_base_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser"));
        assertNull(actual_config_base_typeFactory_parser);
        
        ClassLoader actual_config_base_typeFactory_classLoader = ((ClassLoader) getFieldValue(actual_config_base_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader"));
        assertNull(actual_config_base_typeFactory_classLoader);
        
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
        
        Map expected_typeToId = expected._typeToId;
        Map actual_typeToId = actual._typeToId;
        assertTrue(deepEquals(expected_typeToId, actual_typeToId));
        
        Map actual_idToType = actual._idToType;
        assertNull(actual_idToType);
        
        TypeFactory expected_typeFactory = expected._typeFactory;
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertTrue(deepEquals(expected_typeFactory, actual_typeFactory));
        assertTrue(deepEquals(expected_typeFactory, actual_typeFactory));
        assertTrue(deepEquals(expected_typeFactory, actual_typeFactory));
        assertTrue(deepEquals(expected_typeFactory, actual_typeFactory));
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.executesCondition {@code (_idType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _idType == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIdResolver_ThrowIllegalStateException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        stdTypeResolverBuilder.idResolver(null, null, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.executesCondition {@code (_idType == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: switch(_idType)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIdResolver_ThrowIllegalStateException_1() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.CUSTOM;
        stdTypeResolverBuilder._idType = _idType;
        
        stdTypeResolverBuilder.idResolver(null, null, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.executesCondition {@code (_idType == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return TypeNameIdResolver.construct(config, baseType, subtypes, forSer, forDeser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIdResolver_ThrowIllegalArgumentException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        
        stdTypeResolverBuilder.idResolver(null, null, null, false, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new MinimalClassNameIdResolver(baseType, config.getTypeFactory());
 *  */
    @Test
    public void testIdResolver_ThrowNullPointerException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.MINIMAL_CLASS;
        stdTypeResolverBuilder._idType = _idType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:219) */
        stdTypeResolverBuilder.idResolver(null, null, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ClassNameIdResolver(baseType, config.getTypeFactory());
 *  */
    @Test
    public void testIdResolver_ThrowNullPointerException_1() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.CLASS;
        stdTypeResolverBuilder._idType = _idType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:217) */
        stdTypeResolverBuilder.idResolver(null, null, null, false, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection, boolean, boolean)
    
    @Test
    public void testIdResolver1() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        hashSet.add(namedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:278)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:290)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:71)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(deserializationConfig, arrayType, hashSet, false, true);
    }
    
    @Test
    public void testIdResolver2() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        hashSet.add(namedType);
        hashSet.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver._defaultTypeId(TypeNameIdResolver.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:58)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(serializationConfig, arrayType, hashSet, false, true);
    }
    
    @Test
    public void testIdResolver3() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        hashSet.add(namedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:278)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.<init>(TypeNameIdResolver.java:29)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:75)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(serializationConfig, mapType, hashSet, true, false);
    }
    
    @Test
    public void testIdResolver4() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        hashSet.add(namedType);
        hashSet.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver._defaultTypeId(TypeNameIdResolver.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:58)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(serializationConfig, mapType, hashSet, true, false);
    }
    
    @Test
    public void testIdResolver5() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ArrayList arrayList = new ArrayList();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        arrayList.add(namedType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:57)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(deserializationConfig, resolvedRecursiveType, arrayList, true, false);
    }
    
    @Test
    public void testIdResolver6() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayList arrayList = new ArrayList();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        arrayList.add(namedType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:290)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:71)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(deserializationConfig, collectionLikeType, arrayList, false, true);
    }
    
    @Test
    public void testIdResolver7() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        arrayList.add(namedType);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:57)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221) */
        stdTypeResolverBuilder.idResolver(serializationConfig, null, arrayList, false, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.isTypeIdVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTypeIdVisible()
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#isTypeIdVisible()}
 * @utbot.returnsFrom {@code return _typeIdVisible;}
 *  */
    @Test
    public void testIsTypeIdVisible_Return_typeIdVisible() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        stdTypeResolverBuilder._typeIdVisible = false;
        
        boolean actual = stdTypeResolverBuilder.isTypeIdVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.executesCondition {@code (_idType == JsonTypeInfo.Id.NONE): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testBuildTypeDeserializer__idTypeEqualsJsonTypeInfoIdNONE() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        stdTypeResolverBuilder._idType = _idType;
        
        TypeDeserializer actual = stdTypeResolverBuilder.buildTypeDeserializer(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.executesCondition {@code (_idType == JsonTypeInfo.Id.NONE): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TypeIdResolver idRes = idResolver(config, baseType, subtypes, false, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildTypeDeserializer_ThrowIllegalStateException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        stdTypeResolverBuilder.buildTypeDeserializer(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.executesCondition {@code (_defaultImpl): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultImpl = config.getTypeFactory().constructType(_defaultImpl);
 *  */
    @Test
    public void testBuildTypeDeserializer_ThrowNullPointerException() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        Class _defaultImpl = Object.class;
        stdTypeResolverBuilder._defaultImpl = _defaultImpl;
        TypeNameIdResolver _customIdResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer(StdTypeResolverBuilder.java:122) */
        stdTypeResolverBuilder.buildTypeDeserializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.executesCondition {@code (_defaultImpl): True}
 * @utbot.executesCondition {@code (_defaultImpl): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getTypeFactory()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defaultImpl = config.getTypeFactory().constructType(_defaultImpl);
 *  */
    @Test
    public void testBuildTypeDeserializer_ThrowNullPointerException_1() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        Class _defaultImpl = Object.class;
        stdTypeResolverBuilder._defaultImpl = _defaultImpl;
        TypeNameIdResolver _customIdResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer(StdTypeResolverBuilder.java:123) */
        stdTypeResolverBuilder.buildTypeDeserializer(deserializationConfig, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildTypeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    @Test
    public void testBuildTypeDeserializer1() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        TypeNameIdResolver _customIdResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer(StdTypeResolverBuilder.java:128) */
        stdTypeResolverBuilder.buildTypeDeserializer(null, null, null);
    }
    
    @Test
    public void testBuildTypeDeserializer2() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        Class _defaultImpl = Object.class;
        stdTypeResolverBuilder._defaultImpl = _defaultImpl;
        TypeNameIdResolver _customIdResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:345)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer(StdTypeResolverBuilder.java:123) */
        stdTypeResolverBuilder.buildTypeDeserializer(deserializationConfig, null, null);
    }
    
    @Test
    public void testBuildTypeDeserializer3() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        Class _defaultImpl = Object.class;
        stdTypeResolverBuilder._defaultImpl = _defaultImpl;
        TypeNameIdResolver _customIdResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        DeserializationConfig deserializationConfig = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(deserializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _defaultImpl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeDeserializer(StdTypeResolverBuilder.java:128) */
        stdTypeResolverBuilder.buildTypeDeserializer(deserializationConfig, collectionType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.executesCondition {@code (_idType == JsonTypeInfo.Id.NONE): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testBuildTypeSerializer__idTypeEqualsJsonTypeInfoIdNONE() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NONE;
        stdTypeResolverBuilder._idType = _idType;
        
        TypeSerializer actual = stdTypeResolverBuilder.buildTypeSerializer(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.executesCondition {@code (_idType == JsonTypeInfo.Id.NONE): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.JsonTypeInfo.As#ordinal()}
 *  */
    @Test
    public void testBuildTypeSerializer__idTypeNotEqualsJsonTypeInfoIdNONE() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.MINIMAL_CLASS;
        stdTypeResolverBuilder._idType = _idType;
        JsonTypeInfo.As _includeAs = JsonTypeInfo.As.EXTERNAL_PROPERTY;
        stdTypeResolverBuilder._includeAs = _includeAs;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        AsExternalTypeSerializer actual = ((AsExternalTypeSerializer) stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, mapType, null));
        
        MinimalClassNameIdResolver minimalClassNameIdResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        String _basePackageName = "java.lang";
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName", _basePackageName);
        String _basePackagePrefix = "java.lang.";
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix", _basePackagePrefix);
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory", _typeFactory);
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", mapType);
        Class asExternalTypeSerializerClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer");
        Class minimalClassNameIdResolverType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        Class beanPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringType = Class.forName("java.lang.String");
        Constructor asExternalTypeSerializerConstructor = asExternalTypeSerializerClazz.getDeclaredConstructor(minimalClassNameIdResolverType, beanPropertyType, stringType);
        asExternalTypeSerializerConstructor.setAccessible(true);
        java.lang.Object[] asExternalTypeSerializerConstructorArguments = new java.lang.Object[3];
        asExternalTypeSerializerConstructorArguments[0] = minimalClassNameIdResolver;
        asExternalTypeSerializerConstructorArguments[1] = ((Object) null);
        asExternalTypeSerializerConstructorArguments[2] = ((Object) null);
        AsExternalTypeSerializer expected = ((AsExternalTypeSerializer) asExternalTypeSerializerConstructor.newInstance(asExternalTypeSerializerConstructorArguments));
        
        String actual_typePropertyName = actual._typePropertyName;
        assertNull(actual_typePropertyName);
        
        TypeIdResolver expected_idResolver = expected._idResolver;
        TypeIdResolver actual_idResolver = actual._idResolver;
        String expected_idResolver_basePackageName = ((String) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName"));
        String actual_idResolver_basePackageName = ((String) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName"));
        assertEquals(expected_idResolver_basePackageName, actual_idResolver_basePackageName);
        
        String expected_idResolver_basePackagePrefix = ((String) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix"));
        String actual_idResolver_basePackagePrefix = ((String) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix"));
        assertEquals(expected_idResolver_basePackagePrefix, actual_idResolver_basePackagePrefix);
        
        TypeFactory expected_idResolver_typeFactory = ((TypeFactory) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory"));
        TypeFactory actual_idResolver_typeFactory = ((TypeFactory) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory"));
        LRUMap actual_idResolver_typeFactory_typeCache = ((LRUMap) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache"));
        assertNull(actual_idResolver_typeFactory_typeCache);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_idResolver_typeFactory_modifiers = ((com.fasterxml.jackson.databind.type.TypeModifier[]) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_modifiers"));
        assertNull(actual_idResolver_typeFactory_modifiers);
        
        TypeParser actual_idResolver_typeFactory_parser = ((TypeParser) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser"));
        assertNull(actual_idResolver_typeFactory_parser);
        
        ClassLoader actual_idResolver_typeFactory_classLoader = ((ClassLoader) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader"));
        assertNull(actual_idResolver_typeFactory_classLoader);
        
        JavaType expected_idResolver_baseType = ((JavaType) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType"));
        JavaType actual_idResolver_baseType = ((JavaType) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_idResolver_baseType, actual_idResolver_baseType);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TypeIdResolver idRes = idResolver(config, baseType, subtypes, true, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildTypeSerializer_ThrowIllegalStateException() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        
        stdTypeResolverBuilder.buildTypeSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TypeIdResolver idRes = idResolver(config, baseType, subtypes, true, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildTypeSerializer_ThrowIllegalStateException_1() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.CUSTOM;
        stdTypeResolverBuilder._idType = _idType;
        
        stdTypeResolverBuilder.buildTypeSerializer(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_includeAs)
 *  */
    @Test
    public void testBuildTypeSerializer_ThrowNullPointerException() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        MinimalClassNameIdResolver _customIdResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        stdTypeResolverBuilder._customIdResolver = _customIdResolver;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:75) */
        stdTypeResolverBuilder.buildTypeSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeIdResolver idRes = idResolver(config, baseType, subtypes, true, false);
 *  */
    @Test
    public void testBuildTypeSerializer_ThrowNullPointerException_1() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.CLASS;
        stdTypeResolverBuilder._idType = _idType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:217)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:74) */
        stdTypeResolverBuilder.buildTypeSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeIdResolver idRes = idResolver(config, baseType, subtypes, true, false);
 *  */
    @Test
    public void testBuildTypeSerializer_ThrowNullPointerException_2() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.MINIMAL_CLASS;
        stdTypeResolverBuilder._idType = _idType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:219)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:74) */
        stdTypeResolverBuilder.buildTypeSerializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_includeAs)
 *  */
    @Test
    public void testBuildTypeSerializer_ThrowNullPointerException_3() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.CLASS;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:75) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_includeAs)
 *  */
    @Test
    public void testBuildTypeSerializer_ThrowNullPointerException_4() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:75) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdTypeResolverBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder#buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_includeAs)
 *  */
    @Test
    public void testBuildTypeSerializer_ThrowNullPointerException_5() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:75) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, null, arrayList);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    @Test
    public void testBuildTypeSerializer1() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.MINIMAL_CLASS;
        stdTypeResolverBuilder._idType = _idType;
        JsonTypeInfo.As _includeAs = JsonTypeInfo.As.EXISTING_PROPERTY;
        stdTypeResolverBuilder._includeAs = _includeAs;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        AsExistingPropertyTypeSerializer actual = ((AsExistingPropertyTypeSerializer) stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, collectionType, null));
        
        MinimalClassNameIdResolver minimalClassNameIdResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        String _basePackageName = "java.lang";
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName", _basePackageName);
        String _basePackagePrefix = "java.lang.";
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix", _basePackagePrefix);
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory", _typeFactory);
        setField(minimalClassNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", collectionType);
        Class asExistingPropertyTypeSerializerClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer");
        Class minimalClassNameIdResolverType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        Class beanPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringType = Class.forName("java.lang.String");
        Constructor asExistingPropertyTypeSerializerConstructor = asExistingPropertyTypeSerializerClazz.getDeclaredConstructor(minimalClassNameIdResolverType, beanPropertyType, stringType);
        asExistingPropertyTypeSerializerConstructor.setAccessible(true);
        java.lang.Object[] asExistingPropertyTypeSerializerConstructorArguments = new java.lang.Object[3];
        asExistingPropertyTypeSerializerConstructorArguments[0] = minimalClassNameIdResolver;
        asExistingPropertyTypeSerializerConstructorArguments[1] = ((Object) null);
        asExistingPropertyTypeSerializerConstructorArguments[2] = ((Object) null);
        AsExistingPropertyTypeSerializer expected = ((AsExistingPropertyTypeSerializer) asExistingPropertyTypeSerializerConstructor.newInstance(asExistingPropertyTypeSerializerConstructorArguments));
        
        String actual_typePropertyName = actual._typePropertyName;
        assertNull(actual_typePropertyName);
        
        TypeIdResolver expected_idResolver = expected._idResolver;
        TypeIdResolver actual_idResolver = actual._idResolver;
        String expected_idResolver_basePackageName = ((String) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName"));
        String actual_idResolver_basePackageName = ((String) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackageName"));
        assertEquals(expected_idResolver_basePackageName, actual_idResolver_basePackageName);
        
        String expected_idResolver_basePackagePrefix = ((String) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix"));
        String actual_idResolver_basePackagePrefix = ((String) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver", "_basePackagePrefix"));
        assertEquals(expected_idResolver_basePackagePrefix, actual_idResolver_basePackagePrefix);
        
        TypeFactory expected_idResolver_typeFactory = ((TypeFactory) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory"));
        TypeFactory actual_idResolver_typeFactory = ((TypeFactory) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_typeFactory"));
        LRUMap actual_idResolver_typeFactory_typeCache = ((LRUMap) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache"));
        assertNull(actual_idResolver_typeFactory_typeCache);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_idResolver_typeFactory_modifiers = ((com.fasterxml.jackson.databind.type.TypeModifier[]) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_modifiers"));
        assertNull(actual_idResolver_typeFactory_modifiers);
        
        TypeParser actual_idResolver_typeFactory_parser = ((TypeParser) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser"));
        assertNull(actual_idResolver_typeFactory_parser);
        
        ClassLoader actual_idResolver_typeFactory_classLoader = ((ClassLoader) getFieldValue(actual_idResolver_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader"));
        assertNull(actual_idResolver_typeFactory_classLoader);
        
        JavaType expected_idResolver_baseType = ((JavaType) getFieldValue(expected_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType"));
        JavaType actual_idResolver_baseType = ((JavaType) getFieldValue(actual_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_idResolver_baseType, actual_idResolver_baseType);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildTypeSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, java.util.Collection)
    
    @Test
    public void testBuildTypeSerializer2() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.MINIMAL_CLASS;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(serializationConfig, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:75) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, collectionType, null);
    }
    
    @Test
    public void testBuildTypeSerializer3() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        String _name = "";
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_name", _name);
        hashSet.add(namedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:278)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.<init>(TypeNameIdResolver.java:29)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:75)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:74) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, collectionType, hashSet);
    }
    
    @Test
    public void testBuildTypeSerializer4() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        hashSet.add(namedType);
        hashSet.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:57)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:74) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, collectionType, hashSet);
    }
    
    @Test
    public void testBuildTypeSerializer5() throws Exception  {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        JsonTypeInfo.Id _idType = JsonTypeInfo.Id.NAME;
        stdTypeResolverBuilder._idType = _idType;
        SerializationConfig serializationConfig = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        HashSet hashSet = new HashSet();
        NamedType namedType = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        Class _class = Object.class;
        setField(namedType, "com.fasterxml.jackson.databind.jsontype.NamedType", "_class", _class);
        hashSet.add(namedType);
        NamedType namedType1 = ((NamedType) createInstance("com.fasterxml.jackson.databind.jsontype.NamedType"));
        hashSet.add(namedType1);
        hashSet.add(namedType1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver._defaultTypeId(TypeNameIdResolver.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.construct(TypeNameIdResolver.java:58)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(StdTypeResolverBuilder.java:221)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.buildTypeSerializer(StdTypeResolverBuilder.java:74) */
        stdTypeResolverBuilder.buildTypeSerializer(serializationConfig, collectionType, hashSet);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1079403593914900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1079403593914900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1079403593924700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079403593914900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079403593924700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1079403594545200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1079403594545200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1079403594548800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079403594545200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079403594548800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

