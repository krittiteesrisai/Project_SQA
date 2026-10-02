package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import java.lang.reflect.Method;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import sun.reflect.generics.tree.FieldTypeSignature;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.concurrent.ConcurrentHashMap;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import java.security.SecureClassLoader;
import java.util.HashMap;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_type_TypeFactoryTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructCollectionType(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollectionType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        typeFactory.constructCollectionType(class1, ((JavaType) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType
    
    ///region OTHER: ERROR SUITE for method constructCollectionType(java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructCollectionType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120)
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:1199)
            com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType(TypeFactory.java:702) */
        typeFactory.constructCollectionType(((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        typeFactory.constructType(((Type) null), class1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((contextType == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _fromAny(null, type, bindings);}
 *  */
    @Test
    public void testConstructType_ContextTypeNotEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class resolvedRecursiveTypeType = Class.forName("java.lang.reflect.Type");
        Class referenceTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", resolvedRecursiveTypeType, referenceTypeType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
        constructTypeMethodArguments[0] = resolvedRecursiveType;
        constructTypeMethodArguments[1] = referenceType;
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((contextType == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _fromAny(null, type, bindings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        typeFactory.constructType(((Type) null), referenceType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((contextType == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(null, type, bindings);
 *  */
    @Test
    public void testConstructType_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory.constructType(((Type) wildcardTypeImpl), referenceType);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testConstructType3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        SimpleType actual = ((SimpleType) typeFactory.constructType(((Type) class1), mapLikeType));
        
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
    
    @Test
    public void testConstructType4() throws Exception  {
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
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            Class class1 = Object.class;
            
            SimpleType actual = ((SimpleType) typeFactory.constructType(((Type) class1), ((JavaType) null)));
            
            SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names1 = {};
            setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names1);
            com.fasterxml.jackson.databind.JavaType[] _types1 = {};
            setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types1);
            setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testConstructType5() throws Exception  {
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
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            
            Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
            Class resolvedRecursiveTypeType = Class.forName("java.lang.reflect.Type");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", resolvedRecursiveTypeType, javaTypeType);
            constructTypeMethod.setAccessible(true);
            java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
            constructTypeMethodArguments[0] = resolvedRecursiveType;
            constructTypeMethodArguments[1] = ((Object) null);
            ResolvedRecursiveType actual = ((ResolvedRecursiveType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
            
            // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
            assertEquals(resolvedRecursiveType, actual);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType6() throws Exception  {
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
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            
            typeFactory.constructType(((Type) null), ((JavaType) null));
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region Errors report for constructType
    
    public void testConstructType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType7() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(com.fasterxml.jackson.core.type.TypeReference)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(com.fasterxml.jackson.core.type.TypeReference)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.type.TypeReference#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testConstructType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:627) */
        typeFactory.constructType(((TypeReference) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _fromAny(null, type, bindings);}
 *  */
    @Test
    public void testConstructType_TypeFactory_fromAny() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class resolvedRecursiveTypeType = Class.forName("java.lang.reflect.Type");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", resolvedRecursiveTypeType, typeBindingsType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
        constructTypeMethodArguments[0] = resolvedRecursiveType;
        constructTypeMethodArguments[1] = ((Object) null);
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _fromAny(null, type, bindings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_ThrowIllegalArgumentException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null), ((TypeBindings) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(null, type, bindings);
 *  */
    @Test
    public void testConstructType_ThrowIndexOutOfBoundsException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory.constructType(((Type) wildcardTypeImpl), ((TypeBindings) null));
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testConstructType_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory.constructType(((Type) wildcardTypeImpl), ((TypeBindings) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void testConstructType8() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) typeFactory.constructType(((Type) class1), ((TypeBindings) null)));
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method defaultInstance()
    
    @Test
    public void testDefaultInstance1() throws Exception  {
        TypeFactory actual = TypeFactory.defaultInstance();
        
        TypeFactory expected = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries", 200);
        ConcurrentHashMap _map = new ConcurrentHashMap();
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_parser, "com.fasterxml.jackson.databind.type.TypeParser", "_factory", expected);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        
        LRUMap expected_typeCache = expected._typeCache;
        LRUMap actual_typeCache = actual._typeCache;
        int expected_typeCache_maxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_typeCache_maxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(expected_typeCache_maxEntries, actual_typeCache_maxEntries);
        
        ConcurrentHashMap expected_typeCache_map = ((ConcurrentHashMap) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        ConcurrentHashMap actual_typeCache_map = ((ConcurrentHashMap) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertTrue(deepEquals(expected_typeCache_map, actual_typeCache_map));
        
        int expected_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(expected_typeCache_jdkSerializeMaxEntries, actual_typeCache_jdkSerializeMaxEntries);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_modifiers = actual._modifiers;
        assertNull(actual_modifiers);
        
        TypeParser expected_parser = expected._parser;
        TypeParser actual_parser = actual._parser;
        TypeFactory expected_parser_factory = expected_parser._factory;
        TypeFactory actual_parser_factory = actual_parser._factory;
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        ClassLoader actual_parser_factory_classLoader = actual_parser_factory._classLoader;
        assertNull(actual_parser_factory_classLoader);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructArrayType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructArrayType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ArrayType.construct(_fromAny(null, elementType, null), null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructArrayType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructArrayType(((Class) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructArrayType(java.lang.Class)
    
    @Test
    public void testConstructArrayType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        ArrayType actual = typeFactory.constructArrayType(class1);
        
        ArrayType expected = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(_componentType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        java.lang.Object[] _emptyArray = {};
        setField(expected, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = java.lang.Object[].class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1678709610);
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructArrayType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructArrayType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.ArrayType#construct(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return ArrayType.construct(elementType, null);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ArrayType.construct(elementType, null);
 *  */
    @Test
    public void testConstructArrayType_ThrowNullPointerException() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType] produces [java.lang.NullPointerException]
                java.base/java.lang.reflect.Array.newArray(Native Method)
                java.base/java.lang.reflect.Array.newInstance(Array.java:78)
                com.fasterxml.jackson.databind.type.ArrayType.construct(ArrayType.java:47)
                com.fasterxml.jackson.databind.type.ArrayType.construct(ArrayType.java:41)
                com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType(TypeFactory.java:691) */
            typeFactory.constructArrayType(mapType);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapType
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructMapType(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructMapType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        typeFactory.constructMapType(class1, referenceType, ((JavaType) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapType
    
    ///region OTHER: ERROR SUITE for method constructMapType(java.lang.Class, java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructMapType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructMapType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120)
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:1199)
            com.fasterxml.jackson.databind.type.TypeFactory.constructMapType(TypeFactory.java:755) */
        typeFactory.constructMapType(class1, ((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.rawClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rawClass(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#rawClass(java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (t instanceof Class<?>): True}
 * @utbot.returnsFrom {@code return (Class<?>) t;}
 *  */
    @Test
    public void testRawClass_TInstanceOfClass() {
        Class class1 = Object.class;
        
        Class actual = TypeFactory.rawClass(class1);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method rawClass(java.lang.reflect.Type)
    
    @Test(expected = IllegalArgumentException.class)
    public void testRawClass1() {
        TypeFactory.rawClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromWellKnownInterface
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_fromWellKnownInterface_ReturnNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        JavaType actual = typeFactory._fromWellKnownInterface(null, null, null, null, javaTypeArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_fromWellKnownInterface_ReturnNull_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = new com.fasterxml.jackson.databind.JavaType[1];
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        javaTypeArray[0] = ((JavaType) simpleType);
        
        JavaType actual = typeFactory._fromWellKnownInterface(null, null, null, null, javaTypeArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 *  */
    @Test
    public void test_fromWellKnownInterface_ReturnResult_3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = new com.fasterxml.jackson.databind.JavaType[1];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", referenceType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", 4);
        byte[] _valueHandler = {};
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        javaTypeArray[0] = ((JavaType) referenceType);
        
        ReferenceType actual = ((ReferenceType) typeFactory._fromWellKnownInterface(null, class1, null, null, javaTypeArray));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", referenceType);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", expected);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", javaTypeArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877015);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 *  */
    @Test
    public void test_fromWellKnownInterface_ReturnResult() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = new com.fasterxml.jackson.databind.JavaType[1];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        javaTypeArray[0] = ((JavaType) mapType);
        
        MapType actual = ((MapType) typeFactory._fromWellKnownInterface(null, class1, typeBindings, null, javaTypeArray));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", javaTypeArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        int expected_superInterfacesSize = expected_superInterfaces.length;
        assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
        assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 *  */
    @Test
    public void test_fromWellKnownInterface_ReturnResult_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        javaTypeArray[0] = ((JavaType) mapLikeType);
        
        MapLikeType actual = ((MapLikeType) typeFactory._fromWellKnownInterface(null, class1, typeBindings, null, javaTypeArray));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", javaTypeArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void test_fromWellKnownInterface_IterateForLoop() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            Class class1 = Object.class;
            com.fasterxml.jackson.databind.JavaType[] javaTypeArray = new com.fasterxml.jackson.databind.JavaType[2];
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            javaTypeArray[0] = ((JavaType) mapType);
            
            MapType actual = ((MapType) typeFactory._fromWellKnownInterface(null, class1, null, null, javaTypeArray));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", javaTypeArray);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            int expected_superInterfacesSize = expected_superInterfaces.length;
            assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
            assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
            JavaType finalJavaTypeArray1 = javaTypeArray[1];
            
            assertNull(finalJavaTypeArray1);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 *  */
    @Test
    public void test_fromWellKnownInterface_ReturnResult_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = new com.fasterxml.jackson.databind.JavaType[1];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", 4);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        ReferenceType _anchorType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        javaTypeArray[0] = ((JavaType) referenceType);
        
        ReferenceType actual = ((ReferenceType) typeFactory._fromWellKnownInterface(null, class1, null, null, javaTypeArray));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", javaTypeArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877015);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < intCount; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType result = superInterfaces[i].refine(rawType, bindings, superClass, superInterfaces);
 *  */
    @Test
    public void test_fromWellKnownInterface_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWellKnownInterface] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromWellKnownInterface(TypeFactory.java:1342) */
        typeFactory._fromWellKnownInterface(null, null, null, null, javaTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownInterface(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int intCount = superInterfaces.length;
 *  */
    @Test
    public void test_fromWellKnownInterface_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWellKnownInterface] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromWellKnownInterface(TypeFactory.java:1339) */
        typeFactory._fromWellKnownInterface(null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructReferenceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructReferenceType(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructReferenceType(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.ReferenceType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return // no bindings
 * ReferenceType.construct(// no bindings
 * rawType, null, // or super-class, interfaces?
 * null, null, referredType);}
 *  */
    @Test
    public void testConstructReferenceType_ReferenceTypeConstruct() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            Class class1 = Object.class;
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            
            ReferenceType actual = ((ReferenceType) typeFactory.constructReferenceType(class1, referenceType));
            
            ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", referenceType);
            setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", expected);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            
            // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (rawBase == subclass): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 *  */
    @Test
    public void testConstructSpecializedType_RawBaseEqualsSubclass() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = ((ReferenceType) typeFactory.constructSpecializedType(referenceType, null));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Class<?> rawBase = baseType.getRawClass();
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:345) */
        typeFactory.constructSpecializedType(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (rawBase == subclass): False}
 * @utbot.executesCondition {@code (rawBase): False}
 * @utbot.executesCondition {@code (!rawBase.isAssignableFrom(subclass)): True}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rawBase.isAssignableFrom(subclass)
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120)
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:1199)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:355) */
        typeFactory.constructSpecializedType(mapType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (rawBase == subclass): False}
 * @utbot.executesCondition {@code (rawBase): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rawBase.isAssignableFrom(subclass)
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:358) */
        typeFactory.constructSpecializedType(referenceType, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructGeneralizedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructGeneralizedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (rawBase == superClass): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return baseType;}
 *  */
    @Test
    public void testConstructGeneralizedType_RawBaseEqualsSuperClass() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = ((ReferenceType) typeFactory.constructGeneralizedType(referenceType, null));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructGeneralizedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructGeneralizedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Class<?> rawBase = baseType.getRawClass();
 *  */
    @Test
    public void testConstructGeneralizedType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType(TypeFactory.java:512) */
        typeFactory.constructGeneralizedType(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructGeneralizedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (rawBase == superClass): False}
 * @utbot.executesCondition {@code (superType == null): False}
 * @utbot.returnsFrom {@code return superType;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return superType;
 *  */
    @Test
    public void testConstructGeneralizedType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = new com.fasterxml.jackson.databind.JavaType[1];
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _superInterfaces[0] = ((JavaType) referenceType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType(TypeFactory.java:519) */
        typeFactory.constructGeneralizedType(referenceType, _class);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructGeneralizedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (rawBase == superClass): False}
 * @utbot.executesCondition {@code (superType == null): True}
 * @utbot.executesCondition {@code (!superClass.isAssignableFrom(rawBase)): False}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: superType == null
 *  */
    @Test
    public void testConstructGeneralizedType_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.TypeFactory.constructGeneralizedType(TypeFactory.java:519) */
        typeFactory.constructGeneralizedType(mapType, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructSimpleType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructSimpleType(class1, class1, javaTypeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        typeFactory.constructSimpleType(class1, class1, javaTypeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        typeFactory.constructSimpleType(class1, class1, javaTypeArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructSimpleType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void testConstructSimpleType4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:99)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:809)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:823) */
        typeFactory.constructSimpleType(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructSimpleType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _fromClass(null, rawType, TypeBindings.create(rawType, parameterTypes));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        typeFactory.constructSimpleType(class1, javaTypeArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructSimpleType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void testConstructSimpleType5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructSimpleType(class1, javaTypeArray));
        
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructSimpleType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        typeFactory.constructSimpleType(class1, javaTypeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType7() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructSimpleType(class1, javaTypeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findWellKnownSimple(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findWellKnownSimple(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: clz.isPrimitive()
 *  */
    @Test
    public void test_findWellKnownSimple_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120) */
        typeFactory._findWellKnownSimple(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _findWellKnownSimple(java.lang.Class)
    
    @Test
    public void test_findWellKnownSimple1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) typeFactory._findWellKnownSimple(class1));
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructCollectionLikeType(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testConstructCollectionLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -3);
        
        CollectionLikeType actual = typeFactory.constructCollectionLikeType(class1, mapType);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType
    
    ///region OTHER: ERROR SUITE for method constructCollectionLikeType(java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructCollectionLikeType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120)
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:1199)
            com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType(TypeFactory.java:726) */
        typeFactory.constructCollectionLikeType(((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapType
    
    ///region OTHER: ERROR SUITE for method constructRawMapType(java.lang.Class)
    
    @Test
    public void testConstructRawMapType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash.paramsFor2(TypeBindings.java:422)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:135)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:97)
            com.fasterxml.jackson.databind.type.TypeFactory.constructMapType(TypeFactory.java:769)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapType(TypeFactory.java:988) */
        typeFactory.constructRawMapType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.uncheckedSimpleType
    
    ///region OTHER: ERROR SUITE for method uncheckedSimpleType(java.lang.Class)
    
    @Test
    public void testUncheckedSimpleType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.uncheckedSimpleType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120)
            com.fasterxml.jackson.databind.type.TypeFactory._constructSimple(TypeFactory.java:1082)
            com.fasterxml.jackson.databind.type.TypeFactory.uncheckedSimpleType(TypeFactory.java:850) */
        typeFactory.uncheckedSimpleType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructMapLikeType(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructMapLikeType(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#createIfNeeded(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 *  */
    @Test
    public void testConstructMapLikeType_TypeBindingsCreateIfNeeded() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        MapLikeType actual = typeFactory.constructMapLikeType(class1, ((JavaType) null), ((JavaType) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType
    
    ///region OTHER: ERROR SUITE for method constructMapLikeType(java.lang.Class, java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructMapLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findWellKnownSimple(TypeFactory.java:1120)
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:1199)
            com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType(TypeFactory.java:782) */
        typeFactory.constructMapLikeType(((Class) null), ((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructFromCanonical
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructFromCanonical(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructFromCanonical(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeParser#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parser.parse(canonical);
 *  */
    @Test
    public void testConstructFromCanonical_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructFromCanonical] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructFromCanonical(TypeFactory.java:543) */
        typeFactory.constructFromCanonical(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructFromCanonical(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        String string = "\u0001";
        
        typeFactory.constructFromCanonical(string);
    }
    
    @Test(expected = NullPointerException.class)
    public void testConstructFromCanonical2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        typeFactory.constructFromCanonical(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionType
    
    ///region OTHER: ERROR SUITE for method constructRawCollectionType(java.lang.Class)
    
    @Test
    public void testConstructRawCollectionType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash.paramsFor1(TypeBindings.java:408)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:122)
            com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType(TypeFactory.java:715)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionType(TypeFactory.java:958) */
        typeFactory.constructRawCollectionType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionLikeType
    
    ///region OTHER: ERROR SUITE for method constructRawCollectionLikeType(java.lang.Class)
    
    @Test
    public void testConstructRawCollectionLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(TypeBindings.java:152)
            com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType(TypeFactory.java:737)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionLikeType(TypeFactory.java:973) */
        typeFactory.constructRawCollectionLikeType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapLikeType
    
    ///region OTHER: ERROR SUITE for method constructRawMapLikeType(java.lang.Class)
    
    @Test
    public void testConstructRawMapLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(TypeBindings.java:172)
            com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType(TypeFactory.java:796)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapLikeType(TypeFactory.java:1003) */
        typeFactory.constructRawMapLikeType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructParametricType(java.lang.Class, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametricType(java.lang.Class,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = parameterClasses.length;
 *  */
    @Test
    public void testConstructParametricType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:881) */
        typeFactory.constructParametricType(((Class) null), ((java.lang.Class[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructParametricType(java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametricType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        java.lang.Class[] classArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametricType(class1, classArray));
        
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
    
    ///region OTHER: ERROR SUITE for method constructParametricType(java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametricType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash.paramsFor1(TypeBindings.java:408)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:122)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:95)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:918)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:886) */
        typeFactory.constructParametricType(((Class) null), classArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructParametricType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametricType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _fromClass(null, rawType, TypeBindings.create(rawType, parameterTypes));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        typeFactory.constructParametricType(class1, javaTypeArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructParametricType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void testConstructParametricType3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametricType(class1, javaTypeArray));
        
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
    
    @Test
    public void testConstructParametricType4() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        com.fasterxml.jackson.databind.JavaType[] prevNO_TYPES = ((com.fasterxml.jackson.databind.JavaType[]) getStaticFieldValue(typeBindingsClazz, "NO_TYPES"));
        try {
            com.fasterxml.jackson.databind.JavaType[] noTypes = {};
            setStaticField(typeBindingsClazz, "NO_TYPES", noTypes);
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            Class class1 = Object.class;
            
            SimpleType actual = ((SimpleType) typeFactory.constructParametricType(class1, ((com.fasterxml.jackson.databind.JavaType[]) null)));
            
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
            
        } finally {
            setStaticField(TypeBindings.class, "NO_TYPES", prevNO_TYPES);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructParametricType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        typeFactory.constructParametricType(class1, javaTypeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructParametricType(class1, javaTypeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._bindingsForSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _bindingsForSubtype(com.fasterxml.jackson.databind.JavaType, int, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_bindingsForSubtype(com.fasterxml.jackson.databind.JavaType,int,java.lang.Class)}
 * @utbot.executesCondition {@code (baseCount == typeParamCount): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#containedTypeCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#emptyBindings()}
 * @utbot.returnsFrom {@code return TypeBindings.emptyBindings();}
 *  */
    @Test
    public void test_bindingsForSubtype_BaseCountNotEqualsTypeParamCount() throws Exception  {
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
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            com.fasterxml.jackson.databind.JavaType[] _types1 = {null, null};
            setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types1);
            setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            
            Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
            Class referenceTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class intType = int.class;
            Class classType = Class.forName("java.lang.Class");
            Method _bindingsForSubtypeMethod = typeFactoryClazz.getDeclaredMethod("_bindingsForSubtype", referenceTypeType, intType, classType);
            _bindingsForSubtypeMethod.setAccessible(true);
            java.lang.Object[] _bindingsForSubtypeMethodArguments = new java.lang.Object[3];
            _bindingsForSubtypeMethodArguments[0] = referenceType;
            _bindingsForSubtypeMethodArguments[1] = -3;
            _bindingsForSubtypeMethodArguments[2] = ((Object) null);
            TypeBindings actual = ((TypeBindings) _bindingsForSubtypeMethod.invoke(typeFactory, _bindingsForSubtypeMethodArguments));
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(empty, actual);
            
            TypeBindings typeBindings = referenceType._bindings;
            com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
            JavaType finalReferenceType_bindings_types0 = ((JavaType) get(typeBindings_bindings_types, 0));
            TypeBindings typeBindings1 = referenceType._bindings;
            com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
            JavaType finalReferenceType_bindings_types1 = ((JavaType) get(typeBindings1_bindings_types, 1));
            
            assertNull(finalReferenceType_bindings_types0);
            
            assertNull(finalReferenceType_bindings_types1);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _bindingsForSubtype(com.fasterxml.jackson.databind.JavaType, int, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_bindingsForSubtype(com.fasterxml.jackson.databind.JavaType,int,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#containedTypeCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int baseCount = baseType.containedTypeCount();
 *  */
    @Test
    public void test_bindingsForSubtype_ThrowNullPointerException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._bindingsForSubtype] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._bindingsForSubtype(TypeFactory.java:480) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method _bindingsForSubtypeMethod = typeFactoryClazz.getDeclaredMethod("_bindingsForSubtype", javaTypeType, intType, classType);
        _bindingsForSubtypeMethod.setAccessible(true);
        java.lang.Object[] _bindingsForSubtypeMethodArguments = new java.lang.Object[3];
        _bindingsForSubtypeMethodArguments[0] = ((Object) null);
        _bindingsForSubtypeMethodArguments[1] = -255;
        _bindingsForSubtypeMethodArguments[2] = ((Object) null);
        try {
            _bindingsForSubtypeMethod.invoke(typeFactory, _bindingsForSubtypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _bindingsForSubtype(com.fasterxml.jackson.databind.JavaType, int, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_bindingsForSubtype(com.fasterxml.jackson.databind.JavaType,int,java.lang.Class)}
 * @utbot.executesCondition {@code (baseCount == typeParamCount): True}
 * @utbot.executesCondition {@code (typeParamCount == 1): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#containedTypeCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#containedType(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return TypeBindings.create(subclass, baseType.containedType(0));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_bindingsForSubtype_ThrowIllegalArgumentException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class class1 = Object.class;
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class referenceTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class intType = int.class;
        Class class1Type = Class.forName("java.lang.Class");
        Method _bindingsForSubtypeMethod = typeFactoryClazz.getDeclaredMethod("_bindingsForSubtype", referenceTypeType, intType, class1Type);
        _bindingsForSubtypeMethod.setAccessible(true);
        java.lang.Object[] _bindingsForSubtypeMethodArguments = new java.lang.Object[3];
        _bindingsForSubtypeMethodArguments[0] = referenceType;
        _bindingsForSubtypeMethodArguments[1] = 1;
        _bindingsForSubtypeMethodArguments[2] = class1;
        try {
            _bindingsForSubtypeMethod.invoke(typeFactory, _bindingsForSubtypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _bindingsForSubtype(com.fasterxml.jackson.databind.JavaType, int, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_bindingsForSubtype1() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null, null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class class1 = Object.class;
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class resolvedRecursiveTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class intType = int.class;
        Class class1Type = Class.forName("java.lang.Class");
        Method _bindingsForSubtypeMethod = typeFactoryClazz.getDeclaredMethod("_bindingsForSubtype", resolvedRecursiveTypeType, intType, class1Type);
        _bindingsForSubtypeMethod.setAccessible(true);
        java.lang.Object[] _bindingsForSubtypeMethodArguments = new java.lang.Object[3];
        _bindingsForSubtypeMethodArguments[0] = resolvedRecursiveType;
        _bindingsForSubtypeMethodArguments[1] = 2;
        _bindingsForSubtypeMethodArguments[2] = class1;
        try {
            _bindingsForSubtypeMethod.invoke(typeFactory, _bindingsForSubtypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_bindingsForSubtype2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null, null, null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class class1 = Object.class;
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class resolvedRecursiveTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class intType = int.class;
        Class class1Type = Class.forName("java.lang.Class");
        Method _bindingsForSubtypeMethod = typeFactoryClazz.getDeclaredMethod("_bindingsForSubtype", resolvedRecursiveTypeType, intType, class1Type);
        _bindingsForSubtypeMethod.setAccessible(true);
        java.lang.Object[] _bindingsForSubtypeMethodArguments = new java.lang.Object[3];
        _bindingsForSubtypeMethodArguments[0] = resolvedRecursiveType;
        _bindingsForSubtypeMethodArguments[1] = 3;
        _bindingsForSubtypeMethodArguments[2] = class1;
        try {
            _bindingsForSubtypeMethod.invoke(typeFactory, _bindingsForSubtypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructParametrizedType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        typeFactory.constructParametrizedType(class1, class1, javaTypeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructParametrizedType(class1, class1, javaTypeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        typeFactory.constructParametrizedType(class1, class1, javaTypeArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructParametrizedType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void testConstructParametrizedType4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:99)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:918)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:927) */
        typeFactory.constructParametrizedType(((Class) null), ((Class) null), ((com.fasterxml.jackson.databind.JavaType[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructParametrizedType(java.lang.Class, java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametrizedType5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        java.lang.Class[] classArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametrizedType(class1, class1, classArray));
        
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
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructParametrizedType(java.lang.Class, java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametrizedType6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash.paramsFor1(TypeBindings.java:408)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:122)
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:95)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:918)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:886)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:936) */
        typeFactory.constructParametrizedType(((Class) null), ((Class) null), classArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._resolveSuperInterfaces
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _resolveSuperInterfaces(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void test_resolveSuperInterfaces1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory._resolveSuperInterfaces(null, class1, typeBindings);
        
        com.fasterxml.jackson.databind.JavaType[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromWellKnownClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fromWellKnownClass(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWellKnownClass(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (bindings == null): False}
 * @utbot.executesCondition {@code (rawType): False}
 * @utbot.executesCondition {@code (rawType): False}
 * @utbot.executesCondition {@code (rawType): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_fromWellKnownClass_NotRawType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        JavaType actual = typeFactory._fromWellKnownClass(null, null, typeBindings, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _fromWellKnownClass(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void test_fromWellKnownClass1() throws Exception  {
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
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            Class class1 = Object.class;
            
            JavaType actual = typeFactory._fromWellKnownClass(null, class1, null, null, null);
            
            assertNull(actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.withClassLoader
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withClassLoader(java.lang.ClassLoader)
    
    @Test
    public void testWithClassLoader1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        ClassLoader anonymousClassLoader = ((ClassLoader) createInstance("java.lang.Module$2"));
        
        TypeFactory actual = typeFactory.withClassLoader(anonymousClassLoader);
        
        TypeFactory expected = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        TypeParser _parser1 = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_parser1, "com.fasterxml.jackson.databind.type.TypeParser", "_factory", expected);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", anonymousClassLoader);
        
        LRUMap expected_typeCache = expected._typeCache;
        LRUMap actual_typeCache = actual._typeCache;
        int expected_typeCache_maxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_typeCache_maxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(expected_typeCache_maxEntries, actual_typeCache_maxEntries);
        
        ConcurrentHashMap actual_typeCache_map = ((ConcurrentHashMap) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertNull(actual_typeCache_map);
        
        int expected_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(expected_typeCache_jdkSerializeMaxEntries, actual_typeCache_jdkSerializeMaxEntries);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_modifiers = actual._modifiers;
        assertNull(actual_modifiers);
        
        TypeParser expected_parser = expected._parser;
        TypeParser actual_parser = actual._parser;
        TypeFactory expected_parser_factory = expected_parser._factory;
        TypeFactory actual_parser_factory = actual_parser._factory;
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        ClassLoader expected_parser_factory_classLoader = expected_parser_factory._classLoader;
        ClassLoader actual_parser_factory_classLoader = actual_parser_factory._classLoader;
        byte[] actual_parser_factory_classLoaderVal$bytes = ((byte[]) getFieldValue(actual_parser_factory_classLoader, "java.lang.Module$2", "val$bytes"));
        assertNull(actual_parser_factory_classLoaderVal$bytes);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withClassLoader(java.lang.ClassLoader)
    
    @Test
    public void testWithClassLoader2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.withClassLoader] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.<init>(TypeFactory.java:169)
            com.fasterxml.jackson.databind.type.TypeFactory.withClassLoader(TypeFactory.java:192) */
        typeFactory.withClassLoader(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.classForName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method classForName(java.lang.String, boolean, java.lang.ClassLoader)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#classForName(java.lang.String,boolean,java.lang.ClassLoader)}
 * @utbot.invokes {@link java.lang.Class#forName(java.lang.String,boolean,java.lang.ClassLoader)}
 * @utbot.returnsFrom {@code return Class.forName(name, true, loader);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Class.forName(name, true, loader);
 *  */
    @Test
    public void testClassForName_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.classForName] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.forName0(Native Method)
            java.base/java.lang.Class.forName(Class.java:467)
            com.fasterxml.jackson.databind.type.TypeFactory.classForName(TypeFactory.java:308) */
        typeFactory.classForName(null, false, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.classForName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method classForName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#classForName(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#forName(java.lang.String)}
 * @utbot.returnsFrom {@code return Class.forName(name);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Class.forName(name);
 *  */
    @Test
    public void testClassForName_ThrowNullPointerException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.classForName] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.forName0(Native Method)
            java.base/java.lang.Class.forName(Class.java:375)
            com.fasterxml.jackson.databind.type.TypeFactory.classForName(TypeFactory.java:312) */
        typeFactory.classForName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._findPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findPrimitive(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findPrimitive(java.lang.String)}
 * @utbot.executesCondition {@code ("int".equals(className)): True}
 * @utbot.returnsFrom {@code return Integer.TYPE;}
 *  */
    @Test
    public void test_findPrimitive_intEquals() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "int";
        
        Class actual = typeFactory._findPrimitive(string);
        
        Class expected = int.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findPrimitive(java.lang.String)}
 * @utbot.executesCondition {@code ("int".equals(className)): False}
 * @utbot.executesCondition {@code ("long".equals(className)): True}
 * @utbot.returnsFrom {@code return Long.TYPE;}
 *  */
    @Test
    public void test_findPrimitive_longEquals() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "long";
        
        Class actual = typeFactory._findPrimitive(string);
        
        Class expected = long.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findPrimitive(java.lang.String)}
 * @utbot.executesCondition {@code ("int".equals(className)): False}
 * @utbot.executesCondition {@code ("long".equals(className)): False}
 * @utbot.executesCondition {@code ("float".equals(className)): True}
 * @utbot.returnsFrom {@code return Float.TYPE;}
 *  */
    @Test
    public void test_findPrimitive_floatEquals() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "float";
        
        Class actual = typeFactory._findPrimitive(string);
        
        Class expected = float.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findPrimitive(java.lang.String)}
 * @utbot.executesCondition {@code ("int".equals(className)): False}
 * @utbot.executesCondition {@code ("long".equals(className)): False}
 * @utbot.executesCondition {@code ("float".equals(className)): False}
 * @utbot.executesCondition {@code ("double".equals(className)): False}
 * @utbot.executesCondition {@code ("boolean".equals(className)): True}
 * @utbot.returnsFrom {@code return Boolean.TYPE;}
 *  */
    @Test
    public void test_findPrimitive_booleanEquals() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "boolean";
        
        Class actual = typeFactory._findPrimitive(string);
        
        Class expected = boolean.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findPrimitive(java.lang.String)}
 * @utbot.executesCondition {@code ("int".equals(className)): False}
 * @utbot.executesCondition {@code ("long".equals(className)): False}
 * @utbot.executesCondition {@code ("float".equals(className)): False}
 * @utbot.executesCondition {@code ("double".equals(className)): True}
 * @utbot.returnsFrom {@code return Double.TYPE;}
 *  */
    @Test
    public void test_findPrimitive_doubleEquals() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "double";
        
        Class actual = typeFactory._findPrimitive(string);
        
        Class expected = double.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findPrimitive(java.lang.String)}
 * @utbot.executesCondition {@code ("int".equals(className)): False}
 * @utbot.executesCondition {@code ("long".equals(className)): False}
 * @utbot.executesCondition {@code ("float".equals(className)): False}
 * @utbot.executesCondition {@code ("double".equals(className)): False}
 * @utbot.executesCondition {@code ("boolean".equals(className)): False}
 * @utbot.executesCondition {@code ("byte".equals(className)): False}
 * @utbot.executesCondition {@code ("char".equals(className)): False}
 * @utbot.executesCondition {@code ("short".equals(className)): False}
 * @utbot.executesCondition {@code ("void".equals(className)): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findPrimitive_NotvoidEquals() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        Class actual = typeFactory._findPrimitive(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.withModifier
    
    ///region OTHER: ERROR SUITE for method withModifier(com.fasterxml.jackson.databind.type.TypeModifier)
    
    @Test
    public void testWithModifier1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.withModifier] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.<init>(TypeFactory.java:169)
            com.fasterxml.jackson.databind.type.TypeFactory.withModifier(TypeFactory.java:188) */
        typeFactory.withModifier(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.unknownType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unknownType()
    
    @Test
    public void testUnknownType1() throws Exception  {
        SimpleType actual = ((SimpleType) TypeFactory.unknownType());
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.withCache
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withCache(com.fasterxml.jackson.databind.util.LRUMap)
    
    @Test
    public void testWithCache1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        LRUMap lRUMap = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        
        TypeFactory actual = typeFactory.withCache(lRUMap);
        
        TypeFactory expected = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", lRUMap);
        TypeParser _parser1 = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_parser1, "com.fasterxml.jackson.databind.type.TypeParser", "_factory", expected);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser1);
        
        LRUMap expected_typeCache = expected._typeCache;
        LRUMap actual_typeCache = actual._typeCache;
        int expected_typeCache_maxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_typeCache_maxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(expected_typeCache_maxEntries, actual_typeCache_maxEntries);
        
        ConcurrentHashMap actual_typeCache_map = ((ConcurrentHashMap) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertNull(actual_typeCache_map);
        
        int expected_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(expected_typeCache_jdkSerializeMaxEntries, actual_typeCache_jdkSerializeMaxEntries);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_modifiers = actual._modifiers;
        assertNull(actual_modifiers);
        
        TypeParser expected_parser = expected._parser;
        TypeParser actual_parser = actual._parser;
        TypeFactory expected_parser_factory = expected_parser._factory;
        TypeFactory actual_parser_factory = actual_parser._factory;
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        ClassLoader actual_parser_factory_classLoader = actual_parser_factory._classLoader;
        assertNull(actual_parser_factory_classLoader);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withCache(com.fasterxml.jackson.databind.util.LRUMap)
    
    @Test
    public void testWithCache2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.withCache] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.<init>(TypeFactory.java:169)
            com.fasterxml.jackson.databind.type.TypeFactory.withCache(TypeFactory.java:203) */
        typeFactory.withCache(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findTypeParameters(java.lang.Class, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindTypeParameters1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.findTypeParameters(((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters
    
    ///region OTHER: ERROR SUITE for method findTypeParameters(java.lang.Class, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void testFindTypeParameters2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase.findSuperType(TypeBase.java:130)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:557)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:569) */
        typeFactory.findTypeParameters(class1, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#findSuperType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#typeParameterArray()}
 * @utbot.returnsFrom {@code return match.getBindings().typeParameterArray();}
 *  */
    @Test
    public void testFindTypeParameters_TypeBindingsTypeParameterArray() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(referenceType, ((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType match = type.findSuperType(expType);
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:557) */
        typeFactory.findTypeParameters(((JavaType) null), ((Class) null));
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#findSuperType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getBindings()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#typeParameterArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return match.getBindings().typeParameterArray();
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:561) */
        typeFactory.findTypeParameters(referenceType, ((Class) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    @Test
    public void testFindTypeParameters3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _superInterfaces[0] = ((JavaType) mapLikeType);
        _superInterfaces[1] = ((JavaType) mapLikeType);
        _superInterfaces[2] = ((JavaType) mapLikeType);
        _superInterfaces[3] = ((JavaType) mapLikeType);
        _superInterfaces[4] = ((JavaType) mapLikeType);
        _superInterfaces[5] = ((JavaType) mapLikeType);
        _superInterfaces[6] = ((JavaType) mapLikeType);
        _superInterfaces[7] = ((JavaType) mapLikeType);
        _superInterfaces[8] = ((JavaType) mapLikeType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        
        JavaType javaType = collectionLikeType._superInterfaces[0];
        Class initialCollectionLikeType_superInterfaces0_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(collectionLikeType, _class);
        
        com.fasterxml.jackson.databind.JavaType[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        JavaType javaType1 = collectionLikeType._superInterfaces[0];
        Class finalCollectionLikeType_superInterfaces0_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialCollectionLikeType_superInterfaces0_class == finalCollectionLikeType_superInterfaces0_class);
        
    }
    
    @Test
    public void testFindTypeParameters4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        Class class1 = Object.class;
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(collectionLikeType, class1);
        
        com.fasterxml.jackson.databind.JavaType[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    @Test(expected = StackOverflowError.class)
    public void testFindTypeParameters5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_superClass, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {};
        setField(_superClass, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        Class class1 = Object.class;
        
        typeFactory.findTypeParameters(collectionLikeType, class1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindTypeParameters6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_superClass, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        Class class1 = Object.class;
        
        typeFactory.findTypeParameters(collectionLikeType, class1);
    }
    
    @Test
    public void testFindTypeParameters7() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_superClass, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:561) */
        typeFactory.findTypeParameters(collectionLikeType, _class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method moreSpecificType(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type1 == null): True}
 *  */
    @Test
    public void testMoreSpecificType_Type1EqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        JavaType actual = typeFactory.moreSpecificType(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type1 == null): False}
 * @utbot.executesCondition {@code (type2 == null): True}
 *  */
    @Test
    public void testMoreSpecificType_Type2EqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = new MapType(null, null, null);
        
        MapType actual = ((MapType) typeFactory.moreSpecificType(mapType, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type1 == null): False}
 * @utbot.executesCondition {@code (type2 == null): False}
 * @utbot.executesCondition {@code (raw1 == raw2): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 *  */
    @Test
    public void testMoreSpecificType_Raw1EqualsRaw2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = ((ReferenceType) typeFactory.moreSpecificType(referenceType, referenceType));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method moreSpecificType(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: raw1.isAssignableFrom(raw2)
 *  */
    @Test
    public void testMoreSpecificType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType(TypeFactory.java:604) */
        typeFactory.moreSpecificType(mapLikeType, mapLikeType1);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (raw1.isAssignableFrom(raw2)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type1;
 *  */
    @Test
    public void testMoreSpecificType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType(TypeFactory.java:604) */
        typeFactory.moreSpecificType(referenceType, referenceType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._constructSimple
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructSimple(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructSimple(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: bindings.isEmpty()
 *  */
    @Test
    public void test_constructSimple_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._constructSimple] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._constructSimple(TypeFactory.java:1081) */
        typeFactory._constructSimple(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _constructSimple(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void test_constructSimple1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null, null, null, null, null, null, null, null, null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        SimpleType actual = ((SimpleType) typeFactory._constructSimple(class1, typeBindings, null, javaTypeArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", javaTypeArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types0 = ((JavaType) get(typeBindings_types, 0));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types1 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types1 = ((JavaType) get(typeBindings_types1, 1));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types2 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types2 = ((JavaType) get(typeBindings_types2, 2));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types3 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types3 = ((JavaType) get(typeBindings_types3, 3));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types4 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types4 = ((JavaType) get(typeBindings_types4, 4));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types5 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types5 = ((JavaType) get(typeBindings_types5, 5));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types6 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types6 = ((JavaType) get(typeBindings_types6, 6));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types7 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types7 = ((JavaType) get(typeBindings_types7, 7));
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types8 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types8 = ((JavaType) get(typeBindings_types8, 8));
        
        JavaType finalJavaTypeArray0 = javaTypeArray[0];
        JavaType finalJavaTypeArray1 = javaTypeArray[1];
        JavaType finalJavaTypeArray2 = javaTypeArray[2];
        JavaType finalJavaTypeArray3 = javaTypeArray[3];
        JavaType finalJavaTypeArray4 = javaTypeArray[4];
        JavaType finalJavaTypeArray5 = javaTypeArray[5];
        JavaType finalJavaTypeArray6 = javaTypeArray[6];
        JavaType finalJavaTypeArray7 = javaTypeArray[7];
        JavaType finalJavaTypeArray8 = javaTypeArray[8];
        
        assertNull(finalTypeBindings_types0);
        
        assertNull(finalTypeBindings_types1);
        
        assertNull(finalTypeBindings_types2);
        
        assertNull(finalTypeBindings_types3);
        
        assertNull(finalTypeBindings_types4);
        
        assertNull(finalTypeBindings_types5);
        
        assertNull(finalTypeBindings_types6);
        
        assertNull(finalTypeBindings_types7);
        
        assertNull(finalTypeBindings_types8);
        
        assertNull(finalJavaTypeArray0);
        
        assertNull(finalJavaTypeArray1);
        
        assertNull(finalJavaTypeArray2);
        
        assertNull(finalJavaTypeArray3);
        
        assertNull(finalJavaTypeArray4);
        
        assertNull(finalJavaTypeArray5);
        
        assertNull(finalJavaTypeArray6);
        
        assertNull(finalJavaTypeArray7);
        
        assertNull(finalJavaTypeArray8);
    }
    
    @Test
    public void test_constructSimple2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        SimpleType actual = ((SimpleType) typeFactory._constructSimple(class1, typeBindings, null, javaTypeArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types1 = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types1);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
        JavaType finalJavaTypeArray0 = javaTypeArray[0];
        JavaType finalJavaTypeArray1 = javaTypeArray[1];
        JavaType finalJavaTypeArray2 = javaTypeArray[2];
        JavaType finalJavaTypeArray3 = javaTypeArray[3];
        JavaType finalJavaTypeArray4 = javaTypeArray[4];
        JavaType finalJavaTypeArray5 = javaTypeArray[5];
        JavaType finalJavaTypeArray6 = javaTypeArray[6];
        JavaType finalJavaTypeArray7 = javaTypeArray[7];
        JavaType finalJavaTypeArray8 = javaTypeArray[8];
        
        assertNull(finalJavaTypeArray0);
        
        assertNull(finalJavaTypeArray1);
        
        assertNull(finalJavaTypeArray2);
        
        assertNull(finalJavaTypeArray3);
        
        assertNull(finalJavaTypeArray4);
        
        assertNull(finalJavaTypeArray5);
        
        assertNull(finalJavaTypeArray6);
        
        assertNull(finalJavaTypeArray7);
        
        assertNull(finalJavaTypeArray8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._unknownType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _unknownType()
    
    @Test
    public void test_unknownType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        SimpleType actual = ((SimpleType) typeFactory._unknownType());
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromClass
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _fromClass(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void test_fromClass1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) typeFactory._fromClass(null, class1, null));
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._mapType
    
    ///region OTHER: ERROR SUITE for method _mapType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void test_mapType1() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._mapType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._mapType(TypeFactory.java:1021) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _mapTypeMethod = typeFactoryClazz.getDeclaredMethod("_mapType", class1Type, typeBindingsType, javaTypeType, javaTypeArrayType);
        _mapTypeMethod.setAccessible(true);
        java.lang.Object[] _mapTypeMethodArguments = new java.lang.Object[4];
        _mapTypeMethodArguments[0] = class1;
        _mapTypeMethodArguments[1] = ((Object) null);
        _mapTypeMethodArguments[2] = ((Object) null);
        _mapTypeMethodArguments[3] = ((Object) null);
        try {
            _mapTypeMethod.invoke(typeFactory, _mapTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._collectionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _collectionType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_collectionType(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<JavaType> typeParams = bindings.getTypeParameters();
 *  */
    @Test
    public void test_collectionType_ThrowNullPointerException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._collectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._collectionType(TypeFactory.java:1041) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classType = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _collectionTypeMethod = typeFactoryClazz.getDeclaredMethod("_collectionType", classType, typeBindingsType, javaTypeType, javaTypeArrayType);
        _collectionTypeMethod.setAccessible(true);
        java.lang.Object[] _collectionTypeMethodArguments = new java.lang.Object[4];
        _collectionTypeMethodArguments[0] = ((Object) null);
        _collectionTypeMethodArguments[1] = ((Object) null);
        _collectionTypeMethodArguments[2] = ((Object) null);
        _collectionTypeMethodArguments[3] = ((Object) null);
        try {
            _collectionTypeMethod.invoke(typeFactory, _collectionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _collectionType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void test_collectionType1() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._collectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:34)
            com.fasterxml.jackson.databind.type.CollectionType.<init>(CollectionType.java:25)
            com.fasterxml.jackson.databind.type.CollectionType.construct(CollectionType.java:40)
            com.fasterxml.jackson.databind.type.TypeFactory._collectionType(TypeFactory.java:1051) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classType = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _collectionTypeMethod = typeFactoryClazz.getDeclaredMethod("_collectionType", classType, typeBindingsType, javaTypeType, javaTypeArrayType);
        _collectionTypeMethod.setAccessible(true);
        java.lang.Object[] _collectionTypeMethodArguments = new java.lang.Object[4];
        _collectionTypeMethodArguments[0] = ((Object) null);
        _collectionTypeMethodArguments[1] = typeBindings;
        _collectionTypeMethodArguments[2] = ((Object) null);
        _collectionTypeMethodArguments[3] = ((Object) null);
        try {
            _collectionTypeMethod.invoke(typeFactory, _collectionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _collectionType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_collectionType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null, null, null, null, null, null, null, null, null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _collectionTypeMethod = typeFactoryClazz.getDeclaredMethod("_collectionType", class1Type, typeBindingsType, javaTypeType, javaTypeArrayType);
        _collectionTypeMethod.setAccessible(true);
        java.lang.Object[] _collectionTypeMethodArguments = new java.lang.Object[4];
        _collectionTypeMethodArguments[0] = class1;
        _collectionTypeMethodArguments[1] = typeBindings;
        _collectionTypeMethodArguments[2] = ((Object) null);
        _collectionTypeMethodArguments[3] = ((Object) javaTypeArray);
        try {
            _collectionTypeMethod.invoke(typeFactory, _collectionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._referenceType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _referenceType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_referenceType(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<JavaType> typeParams = bindings.getTypeParameters();
 *  */
    @Test
    public void test_referenceType_ThrowNullPointerException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._referenceType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._referenceType(TypeFactory.java:1057) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classType = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _referenceTypeMethod = typeFactoryClazz.getDeclaredMethod("_referenceType", classType, typeBindingsType, javaTypeType, javaTypeArrayType);
        _referenceTypeMethod.setAccessible(true);
        java.lang.Object[] _referenceTypeMethodArguments = new java.lang.Object[4];
        _referenceTypeMethodArguments[0] = ((Object) null);
        _referenceTypeMethodArguments[1] = ((Object) null);
        _referenceTypeMethodArguments[2] = ((Object) null);
        _referenceTypeMethodArguments[3] = ((Object) null);
        try {
            _referenceTypeMethod.invoke(typeFactory, _referenceTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _referenceType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void test_referenceType1() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._referenceType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:34)
            com.fasterxml.jackson.databind.type.ReferenceType.construct(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeFactory._referenceType(TypeFactory.java:1067) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classType = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _referenceTypeMethod = typeFactoryClazz.getDeclaredMethod("_referenceType", classType, typeBindingsType, javaTypeType, javaTypeArrayType);
        _referenceTypeMethod.setAccessible(true);
        java.lang.Object[] _referenceTypeMethodArguments = new java.lang.Object[4];
        _referenceTypeMethodArguments[0] = ((Object) null);
        _referenceTypeMethodArguments[1] = typeBindings;
        _referenceTypeMethodArguments[2] = ((Object) null);
        _referenceTypeMethodArguments[3] = ((Object) null);
        try {
            _referenceTypeMethod.invoke(typeFactory, _referenceTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _referenceType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_referenceType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null, null, null, null, null, null, null, null, null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null, null, null, null, null, null, null};
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class javaTypeArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.JavaType;");
        Method _referenceTypeMethod = typeFactoryClazz.getDeclaredMethod("_referenceType", class1Type, typeBindingsType, javaTypeType, javaTypeArrayType);
        _referenceTypeMethod.setAccessible(true);
        java.lang.Object[] _referenceTypeMethodArguments = new java.lang.Object[4];
        _referenceTypeMethodArguments[0] = class1;
        _referenceTypeMethodArguments[1] = typeBindings;
        _referenceTypeMethodArguments[2] = ((Object) null);
        _referenceTypeMethodArguments[3] = ((Object) javaTypeArray);
        try {
            _referenceTypeMethod.invoke(typeFactory, _referenceTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._resolveSuperClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolveSuperClass(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_resolveSuperClass(com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#getGenericSuperclass(java.lang.Class)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_resolveSuperClass_ParentEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        JavaType actual = typeFactory._resolveSuperClass(null, class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _resolveSuperClass(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void test_resolveSuperClass1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        JavaType actual = typeFactory._resolveSuperClass(null, class1, typeBindings);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region Errors report for _resolveSuperClass
    
    public void test_resolveSuperClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._newSimpleType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _newSimpleType(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_newSimpleType(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new SimpleType(raw, bindings, superClass, superInterfaces);}
 *  */
    @Test
    public void test_newSimpleType_Return() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        SimpleType actual = ((SimpleType) typeFactory._newSimpleType(class1, typeBindings, null, null));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_newSimpleType(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new SimpleType(raw, bindings, superClass, superInterfaces);}
 *  */
    @Test
    public void test_newSimpleType_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            Class class1 = Object.class;
            
            SimpleType actual = ((SimpleType) typeFactory._newSimpleType(class1, null, null, null));
            
            SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fromAny(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (type instanceof Class<?>): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): False}
 * @utbot.executesCondition {@code (type instanceof JavaType): True}
 * @utbot.returnsFrom {@code return (JavaType) type;}
 *  */
    @Test
    public void test_fromAny_TypeInstanceOfJavaType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classStackType = Class.forName("com.fasterxml.jackson.databind.type.ClassStack");
        Class collectionLikeTypeType = Class.forName("java.lang.reflect.Type");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Method _fromAnyMethod = typeFactoryClazz.getDeclaredMethod("_fromAny", classStackType, collectionLikeTypeType, typeBindingsType);
        _fromAnyMethod.setAccessible(true);
        java.lang.Object[] _fromAnyMethodArguments = new java.lang.Object[3];
        _fromAnyMethodArguments[0] = ((Object) null);
        _fromAnyMethodArguments[1] = collectionLikeType;
        _fromAnyMethodArguments[2] = ((Object) null);
        CollectionLikeType actual = ((CollectionLikeType) _fromAnyMethod.invoke(typeFactory, _fromAnyMethodArguments));
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(collectionLikeType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromAny(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (type instanceof Class<?>): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): False}
 * @utbot.executesCondition {@code (type instanceof JavaType): False}
 * @utbot.executesCondition {@code (type instanceof GenericArrayType): False}
 * @utbot.executesCondition {@code (type instanceof TypeVariable<?>): False}
 * @utbot.executesCondition {@code (type instanceof WildcardType): False}
 * @utbot.executesCondition {@code ((type == null)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: type instanceof WildcardType
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromAny_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory._fromAny(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromAny(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: resultType = _fromWildcard(context, (WildcardType) type, bindings);
 *  */
    @Test
    public void test_fromAny_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromAny] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromAny(null, wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: resultType = _fromWildcard(context, (WildcardType) type, bindings);
 *  */
    @Test
    public void test_fromAny_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromAny] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromAny(null, wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: resultType = _fromWildcard(context, (WildcardType) type, bindings);
 *  */
    @Test
    public void test_fromAny_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromAny] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._fromAny(null, wildcardTypeImpl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _fromAny(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void test_fromAny1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) typeFactory._fromAny(null, class1, null));
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fromWildcard(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.WildcardType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.WildcardType#getUpperBounds()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _fromAny(context, type.getUpperBounds()[0], bindings);}
 *  */
    @Test
    public void test_fromWildcard_TypeFactory_fromAny() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = new java.lang.Object[1];
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        upperBounds[0] = ((Object) arrayType);
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        ArrayType actual = ((ArrayType) typeFactory._fromWildcard(null, wildcardTypeImpl, null));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromWildcard(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.WildcardType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(context, type.getUpperBounds()[0], bindings);
 *  */
    @Test
    public void test_fromWildcard_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromWildcard(null, wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(context, type.getUpperBounds()[0], bindings);
 *  */
    @Test
    public void test_fromWildcard_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromWildcard(null, wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _fromAny(context, type.getUpperBounds()[0], bindings);
 *  */
    @Test
    public void test_fromWildcard_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._fromWildcard(null, wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.WildcardType#getUpperBounds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _fromAny(context, type.getUpperBounds()[0], bindings);
 *  */
    @Test
    public void test_fromWildcard_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard(TypeFactory.java:1424) */
        typeFactory._fromWildcard(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromWildcard(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.WildcardType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.WildcardType#getUpperBounds()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _fromAny(context, type.getUpperBounds()[0], bindings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromWildcard_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {null};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        typeFactory._fromWildcard(null, wildcardTypeImpl, null);
    }
    ///endregion
    
    ///region Errors report for _fromWildcard
    
    public void test_fromWildcard_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromVariable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fromVariable(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.TypeVariable, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void test_fromVariable_ReturnType_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        _names[0] = name;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _types[0] = ((JavaType) resolvedRecursiveType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) typeFactory._fromVariable(null, typeVariableImpl, typeBindings));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void test_fromVariable_ReturnType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        _names[0] = name;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        _types[0] = ((JavaType) resolvedRecursiveType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        ReferenceType actual = ((ReferenceType) typeFactory._fromVariable(null, typeVariableImpl, typeBindings));
        
        ReferenceType expected = new ReferenceType(null, null);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void test_fromVariable_ReturnType_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        _names[0] = name;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _types[0] = ((JavaType) mapLikeType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        MapLikeType actual = ((MapLikeType) typeFactory._fromVariable(null, typeVariableImpl, typeBindings));
        
        MapLikeType expected = new MapLikeType(null, null, null);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#hasUnbound(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getBounds()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _fromAny(context, bounds[0], bindings);}
 *  */
    @Test
    public void test_fromVariable_TypeFactory_fromAny() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] bounds = new java.lang.Object[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        bounds[0] = ((Object) collectionLikeType);
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        CollectionLikeType actual = ((CollectionLikeType) typeFactory._fromVariable(null, typeVariableImpl, typeBindings));
        
        CollectionLikeType expected = new CollectionLikeType(null, null);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromVariable(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.TypeVariable, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: JavaType type = bindings.findBoundType(name);
 *  */
    @Test
    public void test_fromVariable_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        _names[0] = name;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(context, bounds[0], bindings);
 *  */
    @Test
    public void test_fromVariable_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] bounds = {};
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _names);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(context, bounds[0], bindings);
 *  */
    @Test
    public void test_fromVariable_ThrowIndexOutOfBoundsException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] bounds = {};
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _fromAny(context, bounds[0], bindings);
 *  */
    @Test
    public void test_fromVariable_ThrowIndexOutOfBoundsException_3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] bounds = new java.lang.Object[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        bounds[0] = ((Object) wildcardTypeImpl);
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Type[] bounds = var.getBounds();
 *  */
    @Test
    public void test_fromVariable_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] bounds = {};
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String name = var.getName();
 *  */
    @Test
    public void test_fromVariable_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromVariable(TypeFactory.java:1401) */
        typeFactory._fromVariable(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = bindings.findBoundType(name);
 *  */
    @Test
    public void test_fromVariable_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.NullPointerException] */
        typeFactory._fromVariable(null, typeVariableImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bindings = bindings.withUnboundVariable(name);
 *  */
    @Test
    public void test_fromVariable_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "\u0000";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.NullPointerException] */
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromVariable(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.TypeVariable, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bindings = bindings.withUnboundVariable(name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromVariable_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _names);
        
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getBounds()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _fromAny(context, bounds[0], bindings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromVariable_ThrowIllegalArgumentException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        java.lang.Object[] bounds = {null};
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        typeFactory._fromVariable(null, typeVariableImpl, typeBindings);
    }
    ///endregion
    
    ///region Errors report for _fromVariable
    
    public void test_fromVariable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromParamType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromParamType(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.ParameterizedType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromParamType(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.ParameterizedType#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawType = (Class<?>) ptype.getRawType();
 *  */
    @Test
    public void test_fromParamType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromParamType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromParamType(TypeFactory.java:1358) */
        typeFactory._fromParamType(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromArrayType(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.GenericArrayType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromArrayType(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.GenericArrayType#getGenericComponentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_fromArrayType_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        WildcardTypeImpl genericComponentType = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(genericComponentType, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        setField(genericArrayTypeImpl, "sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", "genericComponentType", genericComponentType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._fromArrayType(null, genericArrayTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromArrayType(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType elementType = _fromAny(context, type.getGenericComponentType(), bindings);
 *  */
    @Test
    public void test_fromArrayType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType(TypeFactory.java:1394) */
        typeFactory._fromArrayType(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromArrayType(com.fasterxml.jackson.databind.type.ClassStack, java.lang.reflect.GenericArrayType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromArrayType(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.GenericArrayType#getGenericComponentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromAny(com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType elementType = _fromAny(context, type.getGenericComponentType(), bindings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromArrayType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        
        typeFactory._fromArrayType(null, genericArrayTypeImpl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.getClassLoader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassLoader()
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#getClassLoader()}
 * @utbot.returnsFrom {@code return _classLoader;}
 *  */
    @Test
    public void testGetClassLoader_Return_classLoader() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        ClassLoader actual = typeFactory.getClassLoader();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.returnsFrom {@code return prim;}
 *  */
    @Test
    public void testFindClass_ReturnPrim() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "int";
        
        Class actual = typeFactory.findClass(string);
        
        Class expected = int.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.returnsFrom {@code return prim;}
 *  */
    @Test
    public void testFindClass_ReturnPrim_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "long";
        
        Class actual = typeFactory.findClass(string);
        
        Class expected = long.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: className.indexOf('.') < 0
 *  */
    @Test
    public void testFindClass_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.findClass(TypeFactory.java:274) */
        typeFactory.findClass(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method findClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.executesCondition {@code (loader == null): False}
 * @utbot.returnsFrom {@code return classForName(className, true, loader);}
 * @utbot.throwsException {@link java.lang.ClassNotFoundException} in: return classForName(className, true, loader);
 *  */
    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_ThrowClassNotFoundException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SecureClassLoader _classLoader = ((SecureClassLoader) createInstance("java.security.SecureClassLoader"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        String string = ".";
        
        typeFactory.findClass(string);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findClass(java.lang.String)}
 * @utbot.executesCondition {@code (loader == null): True}
 * @utbot.invokes {@link java.lang.Thread#currentThread()}
 * @utbot.invokes {@link java.lang.Thread#getContextClassLoader()}
 * @utbot.returnsFrom {@code return classForName(className, true, loader);}
 * @utbot.throwsException {@link java.lang.ClassNotFoundException} in: return classForName(className, true, loader);
 *  */
    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_ThrowClassNotFoundException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = ".";
        
        typeFactory.findClass(string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method findClass(java.lang.String)
    
    @Test(expected = ClassNotFoundException.class)
    public void testFindClass1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        String string = "\u0000\u0000\u0000\u0000\u0000";
        
        typeFactory.findClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.clearCache
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCache()
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        _map.put(character, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Long long1 = 0L;
        Object object = createInstance("java.lang.Object");
        _map.put(long1, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Integer integer = 17891584;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        Integer integer1 = 0;
        Object object1 = createInstance("java.lang.Object");
        _map.put(integer1, object1);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Character character = '\u0111';
        Object object = createInstance("java.lang.Object");
        _map.put(character, object);
        Character character1 = '\u0000';
        Object object1 = createInstance("java.lang.Object");
        _map.put(character1, object1);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        _map.put(null, null);
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_7() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        _map.put(null, null);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_8() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        _map.put(character, object);
        _map.put(null, null);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearCache()
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.LRUMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeCache.clear();
 *  */
    @Test
    public void testClearCache_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.clearCache] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.clearCache(TypeFactory.java:224) */
        typeFactory.clearCache();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1078843313542699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1078843313542699.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1078843313548400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078843313542699.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078843313548400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1078843314261599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078843314261599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078843314262999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078843314261599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078843314262999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1078843315144500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078843315144500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078843315146700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078843315144500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078843315146700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1078843315817799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078843315817799.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078843315819399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078843315817799.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078843315819399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

