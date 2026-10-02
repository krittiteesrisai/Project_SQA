package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import jdk.internal.loader.BuiltinClassLoader;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_jsontype_impl_ClassNameIdResolverTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._idFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _idFrom(java.lang.Object, java.lang.Class, com.fasterxml.jackson.databind.type.TypeFactory)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_idFrom(java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory)}
 * @utbot.executesCondition {@code (Enum.class.isAssignableFrom(cls)): False}
 * @utbot.executesCondition {@code (str.startsWith("java.util")): False}
 * @utbot.executesCondition {@code (str.indexOf('$') >= 0): False}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void test_idFrom_StrIndexOfLessThanZero() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        Class class1 = Object.class;
        
        String actual = classNameIdResolver._idFrom(null, class1, null);
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _idFrom(java.lang.Object, java.lang.Class, com.fasterxml.jackson.databind.type.TypeFactory)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_idFrom(java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory)}
 * @utbot.executesCondition {@code (Enum.class.isAssignableFrom(cls)): True}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isEnum()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cls.isEnum()
 *  */
    @Test
    public void test_idFrom_ThrowNullPointerException() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._idFrom] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._idFrom(ClassNameIdResolver.java:89) */
        classNameIdResolver._idFrom(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.getMechanism
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMechanism()
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#getMechanism()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetMechanism_Return() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        JsonTypeInfo.Id actual = classNameIdResolver.getMechanism();
        
        JsonTypeInfo.Id expected = JsonTypeInfo.Id.CLASS;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _typeFromId(java.lang.String, com.fasterxml.jackson.databind.DatabindContext)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 * @utbot.returnsFrom {@code return tf.constructSpecializedType(_baseType, cls);}
 *  */
    @Test
    public void test_typeFromId_ReturnTfConstructSpecializedType() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(mapType, null);
        String string = ".";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BuiltinClassLoader _classLoader = ((BuiltinClassLoader) createInstance("jdk.internal.loader.BuiltinClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType javaType = classNameIdResolver._baseType;
        Class initialClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType actual = classNameIdResolver._typeFromId(string, impl);
        
        assertNull(actual);
        
        JavaType javaType1 = classNameIdResolver._baseType;
        Class finalClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialClassNameIdResolver_baseType_class == finalClassNameIdResolver_baseType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 *  */
    @Test
    public void test_typeFromId() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(mapType, null);
        String string = ".";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BuiltinClassLoader _classLoader = ((BuiltinClassLoader) createInstance("jdk.internal.loader.BuiltinClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType javaType = classNameIdResolver._baseType;
        Class initialClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType actual = classNameIdResolver._typeFromId(string, impl);
        
        assertNull(actual);
        
        JavaType javaType1 = classNameIdResolver._baseType;
        Class finalClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialClassNameIdResolver_baseType_class == finalClassNameIdResolver_baseType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _typeFromId(java.lang.String, com.fasterxml.jackson.databind.DatabindContext)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeFactory tf = ctxt.getTypeFactory();
 *  */
    @Test
    public void test_typeFromId_ThrowNullPointerException() throws IOException  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:51) */
        classNameIdResolver._typeFromId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: id.indexOf('<') > 0
 *  */
    @Test
    public void test_typeFromId_ThrowNullPointerException_1() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:52) */
        classNameIdResolver._typeFromId(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructFromCanonical(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = tf.constructFromCanonical(id);
 *  */
    @Test
    public void test_typeFromId_ThrowNullPointerException_2() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = " <";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:57) */
        classNameIdResolver._typeFromId(string, impl);
    }
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: id.indexOf('<') > 0
 *  */
    @Test
    public void test_typeFromId_ThrowNullPointerException_3() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:52) */
        classNameIdResolver._typeFromId(null, impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _typeFromId(java.lang.String, com.fasterxml.jackson.databind.DatabindContext)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DatabindContext#getTypeFactory()}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in:  catch (Exception e) {
 *     throw new IllegalArgumentException("Invalid type id '" + id + "' (for id type 'Id.class'): " + e.getMessage(), e);
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_typeFromId_ThrowIllegalArgumentException() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        classNameIdResolver._typeFromId(string, impl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _typeFromId(java.lang.String, com.fasterxml.jackson.databind.DatabindContext)
    
    @Test
    public void test_typeFromId1() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = ".\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType actual = classNameIdResolver._typeFromId(string, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void test_typeFromId2() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = "\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JavaType actual = classNameIdResolver._typeFromId(string, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void test_typeFromId3() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = "\u0000\u0000";
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        JavaType actual = classNameIdResolver._typeFromId(string, impl);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _typeFromId(java.lang.String, com.fasterxml.jackson.databind.DatabindContext)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_typeFromId4() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = "\u0000\u0000\u0000";
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        classNameIdResolver._typeFromId(string, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_typeFromId5() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = "\u0000<\u0000";
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        classNameIdResolver._typeFromId(string, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_typeFromId6() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        String string = "\u0001A<\u0000\u0000!\u0001\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        classNameIdResolver._typeFromId(string, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.registerSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerSubtype(java.lang.Class, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#registerSubtype(java.lang.Class,java.lang.String)}
 *  */
    @Test
    public void testRegisterSubtype() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        classNameIdResolver.registerSubtype(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method typeFromId(com.fasterxml.jackson.databind.DatabindContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#typeFromId(com.fasterxml.jackson.databind.DatabindContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_typeFromId(java.lang.String,com.fasterxml.jackson.databind.DatabindContext)}
 *  */
    @Test
    public void testTypeFromId_ClassNameIdResolver_typeFromId() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(mapType, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BuiltinClassLoader _classLoader = ((BuiltinClassLoader) createInstance("jdk.internal.loader.BuiltinClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = ". ";
        
        JavaType javaType = classNameIdResolver._baseType;
        Class initialClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType actual = classNameIdResolver.typeFromId(impl, string);
        
        assertNull(actual);
        
        JavaType javaType1 = classNameIdResolver._baseType;
        Class finalClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialClassNameIdResolver_baseType_class == finalClassNameIdResolver_baseType_class);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method typeFromId(com.fasterxml.jackson.databind.DatabindContext, java.lang.String)
    
    @Test
    public void testTypeFromId1() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000.";
        
        JavaType actual = classNameIdResolver.typeFromId(impl, string);
        
        assertNull(actual);
    }
    
    @Test
    public void testTypeFromId2() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "<.\u0000";
        
        JavaType actual = classNameIdResolver.typeFromId(impl, string);
        
        assertNull(actual);
    }
    
    @Test
    public void testTypeFromId3() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "";
        
        JavaType actual = classNameIdResolver.typeFromId(impl, string);
        
        assertNull(actual);
    }
    
    @Test
    public void testTypeFromId4() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "<\u0000";
        
        JavaType actual = classNameIdResolver.typeFromId(impl, string);
        
        assertNull(actual);
    }
    
    @Test
    public void testTypeFromId5() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(arrayType, null);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object _classLoader = createInstance("jdk.internal.reflect.DelegatingClassLoader");
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = ".";
        
        JavaType javaType = classNameIdResolver._baseType;
        Class initialClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType actual = classNameIdResolver.typeFromId(impl, string);
        
        assertNull(actual);
        
        JavaType javaType1 = classNameIdResolver._baseType;
        Class finalClassNameIdResolver_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialClassNameIdResolver_baseType_class == finalClassNameIdResolver_baseType_class);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method typeFromId(com.fasterxml.jackson.databind.DatabindContext, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromId6() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "\u0000\u0000\u0000\u0000\u0000";
        
        classNameIdResolver.typeFromId(impl, string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromId7() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        classNameIdResolver.typeFromId(impl, string);
    }
    
    @Test(expected = NullPointerException.class)
    public void testTypeFromId8() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "!\u0000<!\u0001\u0001\u0001";
        
        classNameIdResolver.typeFromId(impl, string);
    }
    
    @Test(expected = NullPointerException.class)
    public void testTypeFromId9() throws Exception  {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "\u0000\u0000\u0000\u0000<\u0000\u0000";
        
        classNameIdResolver.typeFromId(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.idFromValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method idFromValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#idFromValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_idFrom(java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory)}
 * @utbot.returnsFrom {@code return _idFrom(value, value.getClass(), _typeFactory);}
 *  */
    @Test
    public void testIdFromValue_ClassNameIdResolver_idFrom() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        short[] shortArray = {};
        
        String actual = classNameIdResolver.idFromValue(shortArray);
        
        String expected = "[S";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method idFromValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#idFromValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _idFrom(value, value.getClass(), _typeFactory);
 *  */
    @Test
    public void testIdFromValue_ThrowNullPointerException() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.idFromValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.idFromValue(ClassNameIdResolver.java:32) */
        classNameIdResolver.idFromValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.idFromValueAndType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method idFromValueAndType(java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#idFromValueAndType(java.lang.Object,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#_idFrom(java.lang.Object,java.lang.Class,com.fasterxml.jackson.databind.type.TypeFactory)}
 * @utbot.returnsFrom {@code return _idFrom(value, type, _typeFactory);}
 *  */
    @Test
    public void testIdFromValueAndType_ClassNameIdResolver_idFrom() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        Class class1 = Object.class;
        
        String actual = classNameIdResolver.idFromValueAndType(null, class1);
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.getDescForKnownTypeIds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDescForKnownTypeIds()
    
    /**
    @utbot.classUnderTest {@link ClassNameIdResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver#getDescForKnownTypeIds()}
 * @utbot.returnsFrom {@code return "class name used as type id";}
 *  */
    @Test
    public void testGetDescForKnownTypeIds_ReturnClassnameusedastypeid() {
        ClassNameIdResolver classNameIdResolver = new ClassNameIdResolver(null, null);
        
        String actual = classNameIdResolver.getDescForKnownTypeIds();
        
        String expected = "class name used as type id";
        
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1086365738624800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1086365738624800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1086365738629800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1086365738624800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1086365738629800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1086365739385600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1086365739385600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1086365739387500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1086365739385600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1086365739387500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

