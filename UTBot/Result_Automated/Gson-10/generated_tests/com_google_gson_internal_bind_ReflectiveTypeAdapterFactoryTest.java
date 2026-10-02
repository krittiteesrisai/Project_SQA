package com.google.gson.internal.bind;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Field;
import com.google.gson.internal.Excluder;
import java.util.LinkedHashMap;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import java.util.Map;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_google_gson_internal_bind_ReflectiveTypeAdapterFactoryTest {
    ///region Test suites for executable com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getFieldNames
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldNames(java.lang.reflect.Field)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getFieldNames(java.lang.reflect.Field)}
 * @utbot.invokes {@link java.lang.reflect.Field#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SerializedName annotation = f.getAnnotation(SerializedName.class);
 *  */
    @Test
    public void testGetFieldNames_ThrowNullPointerException() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getFieldNames] produces [java.lang.NullPointerException] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class fieldType = Class.forName("java.lang.reflect.Field");
        Method getFieldNamesMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getFieldNames", fieldType);
        getFieldNamesMethod.setAccessible(true);
        java.lang.Object[] getFieldNamesMethodArguments = new java.lang.Object[1];
        getFieldNamesMethodArguments[0] = ((Object) null);
        try {
            getFieldNamesMethod.invoke(reflectiveTypeAdapterFactory, getFieldNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method create(com.google.gson.Gson, com.google.gson.reflect.TypeToken)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#create(com.google.gson.Gson,com.google.gson.reflect.TypeToken)}
 * @utbot.executesCondition {@code (!Object.class.isAssignableFrom(raw)): True}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreate_NotObjectClassIsAssignableFrom() throws Exception  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        
        TypeAdapter actual = reflectiveTypeAdapterFactory.create(null, typeToken);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method create(com.google.gson.Gson, com.google.gson.reflect.TypeToken)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#create(com.google.gson.Gson,com.google.gson.reflect.TypeToken)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<? super T> raw = type.getRawType();
 *  */
    @Test
    public void testCreate_ThrowNullPointerException() {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create] produces [java.lang.NullPointerException] */
        reflectiveTypeAdapterFactory.create(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#create(com.google.gson.Gson,com.google.gson.reflect.TypeToken)}
 * @utbot.executesCondition {@code (!Object.class.isAssignableFrom(raw)): False}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.google.gson.internal.ConstructorConstructor#get(com.google.gson.reflect.TypeToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectConstructor<T> constructor = constructorConstructor.get(type);
 *  */
    @Test
    public void testCreate_ThrowNullPointerException_1() throws Exception  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create] produces [java.lang.NullPointerException] */
        reflectiveTypeAdapterFactory.create(null, typeToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField
    
    ///region Errors report for excludeField
    
    public void testExcludeField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field type is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField
    
    ///region Errors report for excludeField
    
    public void testExcludeField_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field type is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBoundFields(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): True}
 *  */
    @Test
    public void testGetBoundFields_RawIsInterface() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        Class class1 = Object.class;
        
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = ((Object) null);
        getBoundFieldsMethodArguments[2] = class1;
        LinkedHashMap actual = ((LinkedHashMap) getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 *  */
    @Test
    public void testGetBoundFields_NotRawIsInterface() throws Exception  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        Class class1 = Object.class;
        
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = class1;
        LinkedHashMap actual = ((LinkedHashMap) getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 *  */
    @Test
    public void testGetBoundFields_ClassGetDeclaredFields() throws Exception  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken anonymousTypeToken = ((TypeToken) createInstance("com.google.gson.Gson$1"));
        Class class1 = Object.class;
        
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class anonymousTypeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, anonymousTypeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = anonymousTypeToken;
        getBoundFieldsMethodArguments[2] = class1;
        LinkedHashMap actual = ((LinkedHashMap) getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBoundFields(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
 *  */
    @Test
    public void testGetBoundFields_ThrowClassCastException() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        GenericArrayTypeImpl type = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        setField(typeToken, "com.google.gson.reflect.TypeToken", "type", type);
        Class class1 = Object.class;
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
 *  */
    @Test
    public void testGetBoundFields_ThrowClassCastException_1() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        Class type = Object.class;
        setField(typeToken, "com.google.gson.reflect.TypeToken", "type", type);
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class typeType = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, typeType);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = type;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
 *  */
    @Test
    public void testGetBoundFields_ThrowClassCastException_2() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken anonymousTypeToken = ((TypeToken) createInstance("com.google.gson.Gson$1"));
        Class type = Object.class;
        setField(anonymousTypeToken, "com.google.gson.reflect.TypeToken", "type", type);
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class anonymousTypeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class typeType = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, anonymousTypeTokenType, typeType);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = anonymousTypeToken;
        getBoundFieldsMethodArguments[2] = type;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Field[] fields = raw.getDeclaredFields();
 *  */
    @Test
    public void testGetBoundFields_ThrowClassCastException_3() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Field[] fields = raw.getDeclaredFields();
 *  */
    @Test
    public void testGetBoundFields_ThrowClassCastException_4() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.executesCondition {@code (raw.isInterface()): False}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Type declaredType = type.getType();
 *  */
    @Test
    public void testGetBoundFields_ThrowNullPointerException() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        Class class1 = Object.class;
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.NullPointerException] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = ((Object) null);
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: raw.isInterface()
 *  */
    @Test
    public void testGetBoundFields_ThrowNullPointerException_1() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.NullPointerException] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class classType = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, classType);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = ((Object) null);
        getBoundFieldsMethodArguments[2] = ((Object) null);
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBoundFields(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Field[] fields = raw.getDeclaredFields();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetBoundFields_ThrowIllegalArgumentException() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken anonymousTypeToken = ((TypeToken) createInstance("com.google.gson.Gson$1"));
        Class class1 = Object.class;
        
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class anonymousTypeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, anonymousTypeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = anonymousTypeToken;
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.AssertionError} in: type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
 *  */
    @Test
    public void testGetBoundFields_ThrowAssertionError() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields] produces [java.lang.AssertionError] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#getBoundFields(com.google.gson.Gson,com.google.gson.reflect.TypeToken,java.lang.Class)}
 * @utbot.iterates iterate the loop {@code while(raw != Object.class)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetBoundFields_ThrowNullPointerException_2() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        Class class1 = Object.class;
        
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class class1Type = Class.forName("java.lang.Class");
        Method getBoundFieldsMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("getBoundFields", gsonType, typeTokenType, class1Type);
        getBoundFieldsMethod.setAccessible(true);
        java.lang.Object[] getBoundFieldsMethodArguments = new java.lang.Object[3];
        getBoundFieldsMethodArguments[0] = ((Object) null);
        getBoundFieldsMethodArguments[1] = typeToken;
        getBoundFieldsMethodArguments[2] = class1;
        try {
            getBoundFieldsMethod.invoke(reflectiveTypeAdapterFactory, getBoundFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getBoundFields
    
    public void testGetBoundFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.createBoundField
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBoundField(com.google.gson.Gson, java.lang.reflect.Field, java.lang.String, com.google.gson.reflect.TypeToken, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#createBoundField(com.google.gson.Gson,java.lang.reflect.Field,java.lang.String,com.google.gson.reflect.TypeToken,boolean,boolean)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean isPrimitive = Primitives.isPrimitive(fieldType.getRawType());
 *  */
    @Test
    public void testCreateBoundField_ThrowNullPointerException() throws Throwable  {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
        
        /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.createBoundField] produces [java.lang.NullPointerException] */
        Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class gsonType = Class.forName("com.google.gson.Gson");
        Class fieldType = Class.forName("java.lang.reflect.Field");
        Class stringType = Class.forName("java.lang.String");
        Class typeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
        Class booleanType = boolean.class;
        Method createBoundFieldMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("createBoundField", gsonType, fieldType, stringType, typeTokenType, booleanType, booleanType);
        createBoundFieldMethod.setAccessible(true);
        java.lang.Object[] createBoundFieldMethodArguments = new java.lang.Object[6];
        createBoundFieldMethodArguments[0] = ((Object) null);
        createBoundFieldMethodArguments[1] = ((Object) null);
        createBoundFieldMethodArguments[2] = ((Object) null);
        createBoundFieldMethodArguments[3] = ((Object) null);
        createBoundFieldMethodArguments[4] = false;
        createBoundFieldMethodArguments[5] = false;
        try {
            createBoundFieldMethod.invoke(reflectiveTypeAdapterFactory, createBoundFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReflectiveTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.ReflectiveTypeAdapterFactory#createBoundField(com.google.gson.Gson,java.lang.reflect.Field,java.lang.String,com.google.gson.reflect.TypeToken,boolean,boolean)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.invokes {@link com.google.gson.internal.Primitives#isPrimitive(java.lang.reflect.Type)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonAdapter annotation = field.getAnnotation(JsonAdapter.class);
 *  */
    @Test
    public void testCreateBoundField_ThrowNullPointerException_1() throws Throwable  {
        Class primitivesClazz = Class.forName("com.google.gson.internal.Primitives");
        Map prevPRIMITIVE_TO_WRAPPER_TYPE = ((Map) getStaticFieldValue(primitivesClazz, "PRIMITIVE_TO_WRAPPER_TYPE"));
        try {
            LinkedHashMap primitiveToWrapperType = new LinkedHashMap();
            primitiveToWrapperType.put(null, null);
            setStaticField(primitivesClazz, "PRIMITIVE_TO_WRAPPER_TYPE", primitiveToWrapperType);
            ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = new ReflectiveTypeAdapterFactory(null, null, null);
            TypeToken anonymousTypeToken = ((TypeToken) createInstance("com.google.gson.Gson$1"));
            
            /* This test fails because method [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.createBoundField] produces [java.lang.NullPointerException] */
            Class reflectiveTypeAdapterFactoryClazz = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
            Class gsonType = Class.forName("com.google.gson.Gson");
            Class fieldType = Class.forName("java.lang.reflect.Field");
            Class stringType = Class.forName("java.lang.String");
            Class anonymousTypeTokenType = Class.forName("com.google.gson.reflect.TypeToken");
            Class booleanType = boolean.class;
            Method createBoundFieldMethod = reflectiveTypeAdapterFactoryClazz.getDeclaredMethod("createBoundField", gsonType, fieldType, stringType, anonymousTypeTokenType, booleanType, booleanType);
            createBoundFieldMethod.setAccessible(true);
            java.lang.Object[] createBoundFieldMethodArguments = new java.lang.Object[6];
            createBoundFieldMethodArguments[0] = ((Object) null);
            createBoundFieldMethodArguments[1] = ((Object) null);
            createBoundFieldMethodArguments[2] = ((Object) null);
            createBoundFieldMethodArguments[3] = anonymousTypeToken;
            createBoundFieldMethodArguments[4] = false;
            createBoundFieldMethodArguments[5] = false;
            try {
                createBoundFieldMethod.invoke(reflectiveTypeAdapterFactory, createBoundFieldMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(com.google.gson.internal.Primitives.class, "PRIMITIVE_TO_WRAPPER_TYPE", prevPRIMITIVE_TO_WRAPPER_TYPE);
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1015859953003400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1015859953003400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1015859953016200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015859953003400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015859953016200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1015859961573600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1015859961573600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1015859961581200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015859961573600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015859961581200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1015859963534900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1015859963534900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1015859963541600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1015859963534900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1015859963541600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

