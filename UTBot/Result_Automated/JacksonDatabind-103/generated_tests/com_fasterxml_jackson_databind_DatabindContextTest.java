package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_DatabindContextTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#constructType(java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testConstructType_TypeEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JavaType actual = impl.constructType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for constructType
    
    public void testConstructType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportBadDefinition(java.lang.Class, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#reportBadDefinition(java.lang.Class,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DatabindContext#constructType(java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DatabindContext#reportBadDefinition(com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.InvalidDefinitionException} in: return reportBadDefinition(constructType(type), msg);
 *  */
    @Test(expected = InvalidDefinitionException.class)
    public void testReportBadDefinition_ThrowInvalidDefinitionException() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        impl.reportBadDefinition(((Class) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportBadDefinition(java.lang.Class, java.lang.String)
    
    @Test(expected = InvalidDefinitionException.class)
    public void testReportBadDefinition1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        impl.reportBadDefinition(((Class) null), ((String) null));
    }
    
    @Test(expected = InvalidDefinitionException.class)
    public void testReportBadDefinition2() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Class class1 = Object.class;
        
        impl.reportBadDefinition(class1, ((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportBadDefinition(java.lang.Class, java.lang.String)
    
    @Test
    public void testReportBadDefinition3() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.getTypeFactory(SerializerProvider.java:334)
            com.fasterxml.jackson.databind.DatabindContext.constructType(DatabindContext.java:149)
            com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:313) */
        impl.reportBadDefinition(class1, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> implClass = objectIdInfo.getGeneratorType();
 *  */
    @Test
    public void testObjectIdGeneratorInstance_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance(DatabindContext.java:230) */
        impl.objectIdGeneratorInstance(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HandlerInstantiator hi = config.getHandlerInstantiator();
 *  */
    @Test
    public void testObjectIdGeneratorInstance_ThrowNullPointerException_1() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance(DatabindContext.java:232) */
        impl.objectIdGeneratorInstance(null, objectIdInfo);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HandlerInstantiator hi = config.getHandlerInstantiator();
 *  */
    @Test
    public void testObjectIdGeneratorInstance_ThrowNullPointerException_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance(DatabindContext.java:232) */
        impl.objectIdGeneratorInstance(null, objectIdInfo);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    @Test
    public void testObjectIdGeneratorInstance1() throws Throwable  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object stdTypeConstructor = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _generator = Object.class;
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.annotation.ObjectIdGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.annotation.ObjectIdGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance(DatabindContext.java:235) */
        Class databindContextClazz = Class.forName("com.fasterxml.jackson.databind.DatabindContext");
        Class stdTypeConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class objectIdInfoType = Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Method objectIdGeneratorInstanceMethod = databindContextClazz.getDeclaredMethod("objectIdGeneratorInstance", stdTypeConstructorType, objectIdInfoType);
        objectIdGeneratorInstanceMethod.setAccessible(true);
        java.lang.Object[] objectIdGeneratorInstanceMethodArguments = new java.lang.Object[2];
        objectIdGeneratorInstanceMethodArguments[0] = stdTypeConstructor;
        objectIdGeneratorInstanceMethodArguments[1] = objectIdInfo;
        try {
            objectIdGeneratorInstanceMethod.invoke(impl, objectIdGeneratorInstanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testObjectIdGeneratorInstance2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _generator = Object.class;
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.annotation.ObjectIdGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.annotation.ObjectIdGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            com.fasterxml.jackson.databind.DatabindContext.objectIdGeneratorInstance(DatabindContext.java:235) */
        impl.objectIdGeneratorInstance(annotatedConstructor, objectIdInfo);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    @Test(expected = IllegalArgumentException.class)
    public void testObjectIdGeneratorInstance3() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AnnotatedClass annotatedClass = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _generator = Object.class;
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        
        impl.objectIdGeneratorInstance(annotatedClass, objectIdInfo);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testObjectIdGeneratorInstance4() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _generator = Object.class;
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_generator", _generator);
        
        impl.objectIdGeneratorInstance(annotatedConstructor, objectIdInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method objectIdResolverInstance(com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.introspect.ObjectIdInfo)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#objectIdResolverInstance(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<? extends ObjectIdResolver> implClass = objectIdInfo.getResolverType();
 *  */
    @Test
    public void testObjectIdResolverInstance_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance(DatabindContext.java:243) */
        impl.objectIdResolverInstance(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#objectIdResolverInstance(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HandlerInstantiator hi = config.getHandlerInstantiator();
 *  */
    @Test
    public void testObjectIdResolverInstance_ThrowNullPointerException_1() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance(DatabindContext.java:245) */
        impl.objectIdResolverInstance(null, objectIdInfo);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#objectIdResolverInstance(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HandlerInstantiator hi = config.getHandlerInstantiator();
 *  */
    @Test
    public void testObjectIdResolverInstance_ThrowNullPointerException_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.objectIdResolverInstance(DatabindContext.java:245) */
        impl.objectIdResolverInstance(null, objectIdInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (baseType.getRawClass() == subclass): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return baseType;}
 *  */
    @Test
    public void testConstructSpecializedType_BaseTypeGetRawClassEqualsSubclass() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) impl.constructSpecializedType(resolvedRecursiveType, null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: baseType.getRawClass() == subclass
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType(DatabindContext.java:158) */
        impl.constructSpecializedType(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (baseType.getRawClass() == subclass): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DatabindContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getConfig().constructSpecializedType(baseType, subclass);
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException_1() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType(DatabindContext.java:161) */
        impl.constructSpecializedType(resolvedRecursiveType, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    @Test
    public void testConstructSpecializedType1() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1180)
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:1259)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:353)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructSpecializedType(MapperConfig.java:297)
            com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType(DatabindContext.java:161) */
        impl.constructSpecializedType(resolvedRecursiveType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.resolveSubType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveSubType(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#resolveSubType(com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: subClass.indexOf('<') > 0
 *  */
    @Test
    public void testResolveSubType_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.resolveSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.resolveSubType(DatabindContext.java:176) */
        impl.resolveSubType(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#resolveSubType(com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = getTypeFactory().constructFromCanonical(subClass);
 *  */
    @Test
    public void testResolveSubType_ThrowNullPointerException_1() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = " <";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.resolveSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.resolveSubType(DatabindContext.java:181) */
        impl.resolveSubType(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#resolveSubType(com.fasterxml.jackson.databind.JavaType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = getTypeFactory().constructFromCanonical(subClass);
 *  */
    @Test
    public void testResolveSubType_ThrowNullPointerException_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = " <";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.resolveSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext.resolveSubType(DatabindContext.java:181) */
        impl.resolveSubType(null, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveSubType(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    @Test
    public void testResolveSubType1() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000\u0000";
        
        JavaType actual = impl.resolveSubType(null, string);
        
        assertNull(actual);
    }
    
    @Test
    public void testResolveSubType2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "<\u0000\u0000";
        
        JavaType actual = impl.resolveSubType(null, string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveSubType(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    @Test
    public void testResolveSubType3() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.resolveSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DeserializationContext.invalidTypeIdException(DeserializationContext.java:1633)
            com.fasterxml.jackson.databind.DatabindContext.resolveSubType(DatabindContext.java:192) */
        impl.resolveSubType(referenceType, string);
    }
    
    @Test
    public void testResolveSubType4() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.resolveSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:134)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DeserializationContext.invalidTypeIdException(DeserializationContext.java:1633)
            com.fasterxml.jackson.databind.DatabindContext.resolveSubType(DatabindContext.java:192) */
        impl.resolveSubType(collectionType, string);
    }
    
    @Test
    public void testResolveSubType5() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext.resolveSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:134)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.SerializerProvider.invalidTypeIdException(SerializerProvider.java:1229)
            com.fasterxml.jackson.databind.DatabindContext.resolveSubType(DatabindContext.java:192) */
        impl.resolveSubType(collectionType, string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method resolveSubType(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    @Test(expected = InvalidTypeIdException.class)
    public void testResolveSubType6() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        String string = "\u0000\u0000\u0000";
        
        impl.resolveSubType(null, string);
    }
    
    @Test(expected = InvalidTypeIdException.class)
    public void testResolveSubType7() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        PlaceholderForType placeholderForType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        String string = "\u0000";
        
        impl.resolveSubType(placeholderForType, string);
    }
    
    @Test(expected = InvalidTypeIdException.class)
    public void testResolveSubType8() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        PlaceholderForType placeholderForType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        String string = "\u0000";
        
        impl.resolveSubType(placeholderForType, string);
    }
    
    @Test(expected = InvalidTypeIdException.class)
    public void testResolveSubType9() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        impl.resolveSubType(null, string);
    }
    
    @Test(expected = InvalidTypeIdException.class)
    public void testResolveSubType10() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "<\u0000\u0000";
        
        impl.resolveSubType(null, string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method resolveSubType(com.fasterxml.jackson.databind.JavaType, java.lang.String)
    
    @Test(expected = NullPointerException.class)
    public void testResolveSubType11() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000\u0000<";
        
        impl.resolveSubType(null, string);
    }
    
    @Test(expected = NullPointerException.class)
    public void testResolveSubType12() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        String string = "\u0000<\u0000";
        
        impl.resolveSubType(null, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext._format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _format(java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.executesCondition {@code (msgArgs.length > 0): False}
 * @utbot.returnsFrom {@code return msg;}
 *  */
    @Test
    public void test_format_MsgArgsLengthLessOrEqualZero() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        java.lang.Object[] objectArray = {};
        
        String actual = impl._format(null, objectArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _format(java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: msgArgs.length > 0
 *  */
    @Test
    public void test_format_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext._format] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:326) */
        impl._format(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _format(java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void test_format1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = impl._format(string, objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _format(java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void test_format2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.DatabindContext._format] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DatabindContext._format(DatabindContext.java:327) */
        impl._format(null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext.converterInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#converterInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (converterDef == null): True}
 *  */
    @Test
    public void testConverterInstance_ConverterDefEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        Converter actual = impl.converterInstance(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#converterInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (converterDef == null): False}
 * @utbot.executesCondition {@code (converterDef instanceof Converter<?, ?>): True}
 * @utbot.returnsFrom {@code return (Converter<Object, Object>) converterDef;}
 *  */
    @Test
    public void testConverterInstance_ConverterDefInstanceOfConverter() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Object javaUtilCollectionsConverter = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        
        Object actual = impl.converterInstance(null, javaUtilCollectionsConverter);
        
        JavaType actual_inputType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType"));
        assertNull(actual_inputType);
        
        int javaUtilCollectionsConverter_kind = ((Integer) getFieldValue(javaUtilCollectionsConverter, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        int actual_kind = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        assertEquals(javaUtilCollectionsConverter_kind, actual_kind);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#converterInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(converterDef instanceof Class)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: converterDef.getClass().getName()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testConverterInstance_ThrowIllegalStateException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        byte[] byteArray = {};
        
        impl.converterInstance(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#converterInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(converterDef instanceof Class)): False}
 * @utbot.executesCondition {@code (converterClass): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return null;
 *  */
    @Test(expected = IllegalStateException.class)
    public void testConverterInstance_ThrowIllegalStateException_1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class class1 = Object.class;
        
        impl.converterInstance(null, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext._truncate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _truncate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_truncate(java.lang.String)}
 * @utbot.executesCondition {@code (desc == null): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void test_truncate_DescEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        String actual = impl._truncate(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_truncate(java.lang.String)}
 * @utbot.executesCondition {@code (desc == null): False}
 * @utbot.executesCondition {@code (desc.length() <= MAX_ERROR_STR_LEN): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return desc;}
 *  */
    @Test
    public void test_truncate_DescLengthLessOrEqualMAX_ERROR_STR_LEN() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "         ";
        
        String actual = impl._truncate(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext._desc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _desc(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_desc(java.lang.String)}
 * @utbot.executesCondition {@code (desc == null): True}
 * @utbot.returnsFrom {@code return "[N/A]";}
 *  */
    @Test
    public void test_desc_DescEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        String actual = impl._desc(null);
        
        String expected = "[N/A]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_desc(java.lang.String)}
 * @utbot.executesCondition {@code (desc == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DatabindContext#_truncate(java.lang.String)}
 * @utbot.returnsFrom {@code return _truncate(desc);}
 *  */
    @Test
    public void test_desc_DescNotEqualsNull() throws Exception  {
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "         ";
        
        String actual = impl._desc(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext._colonConcat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _colonConcat(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_colonConcat(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (extra == null): True}
 * @utbot.returnsFrom {@code return msgBase;}
 *  */
    @Test
    public void test_colonConcat_ExtraEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        String actual = impl._colonConcat(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_colonConcat(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (extra == null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return msgBase + ": " + extra;}
 *  */
    @Test
    public void test_colonConcat_ExtraNotEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        String string = "  ";
        
        String actual = impl._colonConcat(null, string);
        
        String expected = "null:   ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.DatabindContext._quotedString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _quotedString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DatabindContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.DatabindContext#_quotedString(java.lang.String)}
 * @utbot.executesCondition {@code (desc == null): True}
 * @utbot.returnsFrom {@code return "[N/A]";}
 *  */
    @Test
    public void test_quotedString_DescEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        String actual = impl._quotedString(null);
        
        String expected = "[N/A]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _quotedString(java.lang.String)
    
    @Test
    public void test_quotedString1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = impl._quotedString(string);
        
        String expected = "\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"";
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1090166906076700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1090166906076700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1090166906081100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090166906076700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090166906081100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1090166906465800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1090166906465800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1090166906474500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1090166906465800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1090166906474500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

