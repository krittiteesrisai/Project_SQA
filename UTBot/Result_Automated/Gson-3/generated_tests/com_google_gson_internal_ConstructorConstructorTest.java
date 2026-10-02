package com.google.gson.internal;

import org.junit.Test;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.lang.reflect.Constructor;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class com_google_gson_internal_ConstructorConstructorTest {
    ///region Test suites for executable com.google.gson.internal.ConstructorConstructor.get
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(com.google.gson.reflect.TypeToken)
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#get(com.google.gson.reflect.TypeToken)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Type type = typeToken.getType();
 *  */
    @Test
    public void testGet_ThrowNullPointerException() {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.get] produces [java.lang.NullPointerException] */
        constructorConstructor.get(null);
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#get(com.google.gson.reflect.TypeToken)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getType()}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final 
 *  */
    @Test
    public void testGet_ThrowNullPointerException_1() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.get] produces [java.lang.NullPointerException] */
        constructorConstructor.get(typeToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.ConstructorConstructor.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#toString()}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return instanceCreators.toString();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.toString] produces [java.lang.NullPointerException] */
        constructorConstructor.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newDefaultImplementationConstructor(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(rawType)): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_NotMapClassIsAssignableFrom() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedMap.class.isAssignableFrom(rawType)): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new TreeMap<Object, Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_SortedMapClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$9"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$9", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (EnumSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Set.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Queue.class.isAssignableFrom(rawType)): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new LinkedList<Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_QueueClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$7"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$7", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (EnumSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Set.class.isAssignableFrom(rawType)): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new LinkedHashSet<Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_SetClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$6"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$6", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (EnumSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Set.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Queue.class.isAssignableFrom(rawType)): False}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new ArrayList<Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_NotQueueClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$8"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$8", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedMap.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): False}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new LinkedTreeMap<String, Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_NotTypeNotInstanceOfParameterizedType() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$11"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$11", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedSet.class.isAssignableFrom(rawType)): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new TreeSet<Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_SortedSetClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$4"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$4", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedMap.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): True}
 * @utbot.executesCondition {@code (!(String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()))): False}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new LinkedTreeMap<String, Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_StringClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        Class class1 = Object.class;
        actualTypeArguments[0] = ((Type) class1);
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$11"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$11", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedMap.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): True}
 * @utbot.executesCondition {@code (!(String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()))): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new LinkedHashMap<Object, Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_NotStringClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        Class class1 = Object.class;
        typeArguments[0] = ((Type) class1);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$10"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$10", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedMap.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): True}
 * @utbot.executesCondition {@code (!(String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()))): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @Override
 *     public T construct() {
 *         return (T) new LinkedHashMap<Object, Object>();
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_NotStringClassIsAssignableFrom_1() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Constructor genericDeclaration = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "genericDeclaration", genericDeclaration);
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        actualTypeArguments[0] = ((Type) typeVariableImpl);
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$10"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$10", "this$0", this$0);
        
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(rawType)): True}
 * @utbot.executesCondition {@code (SortedSet.class.isAssignableFrom(rawType)): False}
 * @utbot.executesCondition {@code (EnumSet.class.isAssignableFrom(rawType)): True}
 * @utbot.returnsFrom {@code return new ObjectConstructor<T>() {
 * 
 *     @SuppressWarnings("rawtypes")
 *     @Override
 *     public T construct() {
 *         if (type instanceof ParameterizedType) {
 *             Type elementType = ((ParameterizedType) type).getActualTypeArguments()[0];
 *             if (elementType instanceof Class) {
 *                 return (T) EnumSet.noneOf((Class) elementType);
 *             } else {
 *                 throw new JsonIOException("Invalid EnumSet type: " + type.toString());
 *             }
 *         } else {
 *             throw new JsonIOException("Invalid EnumSet type: " + type.toString());
 *         }
 *     }
 * };}
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_EnumSetClassIsAssignableFrom() throws Exception  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class typeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", typeType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = ((Object) null);
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        ObjectConstructor actual = ((ObjectConstructor) newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments));
        
        ObjectConstructor expected = ((ObjectConstructor) createInstance("com.google.gson.internal.ConstructorConstructor$5"));
        ConstructorConstructor this$0 = ((ConstructorConstructor) createInstance("com.google.gson.internal.ConstructorConstructor"));
        setField(expected, "com.google.gson.internal.ConstructorConstructor$5", "this$0", this$0);
        
        Type actualVal$type = ((Type) getFieldValue(actual, "com.google.gson.internal.ConstructorConstructor$5", "val$type"));
        assertNull(actualVal$type);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newDefaultImplementationConstructor(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowIndexOutOfBoundsException() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = {};
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = {};
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowClassCastException() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        typeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowClassCastException_1() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        typeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowClassCastException_2() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        actualTypeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowClassCastException_3() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        WildcardTypeImpl genericComponentType = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(genericComponentType, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        setField(genericArrayTypeImpl, "sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", "genericComponentType", genericComponentType);
        typeArguments[0] = ((Type) genericArrayTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowClassCastException_4() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        Object genericArrayTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl");
        WildcardTypeImpl componentType = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(componentType, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        setField(genericArrayTypeImpl, "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", "componentType", componentType);
        actualTypeArguments[0] = ((Type) genericArrayTypeImpl);
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testNewDefaultImplementationConstructor_ThrowClassCastException_5() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        ParameterizedTypeImpl parameterizedTypeImpl1 = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments1 = {};
        setField(parameterizedTypeImpl1, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments1);
        WildcardTypeImpl ownerType = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(ownerType, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {};
        setField(ownerType, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        setField(parameterizedTypeImpl1, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "ownerType", ownerType);
        actualTypeArguments[0] = ((Type) parameterizedTypeImpl1);
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultImplementationConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newDefaultImplementationConstructor(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewDefaultImplementationConstructor_ThrowIllegalArgumentException() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {null};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        actualTypeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewDefaultImplementationConstructor_ThrowIllegalArgumentException_1() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {null, null};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        typeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewDefaultImplementationConstructor_ThrowIllegalArgumentException_2() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        typeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()
 *  */
    @Test(expected = NullPointerException.class)
    public void testNewDefaultImplementationConstructor_ThrowNullPointerException() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = {null};
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testNewDefaultImplementationConstructor_ThrowNullPointerException_1() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {null};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        java.lang.Object[] lowerBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", lowerBounds);
        typeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultImplementationConstructor(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testNewDefaultImplementationConstructor_ThrowNullPointerException_2() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Object parameterizedTypeImpl = createInstance("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl");
        java.lang.reflect.Type[] typeArguments = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {null};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "lowerBounds", upperBounds);
        typeArguments[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl", "typeArguments", typeArguments);
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class parameterizedTypeImplType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultImplementationConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultImplementationConstructor", parameterizedTypeImplType, classType);
        newDefaultImplementationConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultImplementationConstructorMethodArguments = new java.lang.Object[2];
        newDefaultImplementationConstructorMethodArguments[0] = parameterizedTypeImpl;
        newDefaultImplementationConstructorMethodArguments[1] = ((Object) null);
        try {
            newDefaultImplementationConstructorMethod.invoke(constructorConstructor, newDefaultImplementationConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for newDefaultImplementationConstructor
    
    public void testNewDefaultImplementationConstructor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.factory.CoreReflectionFactory.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.factory" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.ConstructorConstructor.newDefaultConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newDefaultConstructor(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultConstructor(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredConstructor(java.lang.Class[])}
 *  */
    @Test
    public void testNewDefaultConstructor_ClassGetDeclaredConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Class class1 = Object.class;
        
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class class1Type = Class.forName("java.lang.Class");
        Method newDefaultConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultConstructor", class1Type);
        newDefaultConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultConstructorMethodArguments = new java.lang.Object[1];
        newDefaultConstructorMethodArguments[0] = class1;
        ObjectConstructor actual = ((ObjectConstructor) newDefaultConstructorMethod.invoke(constructorConstructor, newDefaultConstructorMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newDefaultConstructor(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultConstructor(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredConstructor(java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Constructor<? super T> constructor = rawType.getDeclaredConstructor();
 *  */
    @Test
    public void testNewDefaultConstructor_ThrowClassCastException() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        Class class1 = Object.class;
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultConstructor] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class class1Type = Class.forName("java.lang.Class");
        Method newDefaultConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultConstructor", class1Type);
        newDefaultConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultConstructorMethodArguments = new java.lang.Object[1];
        newDefaultConstructorMethodArguments[0] = class1;
        try {
            newDefaultConstructorMethod.invoke(constructorConstructor, newDefaultConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorConstructor}
 * @utbot.methodUnderTest {@link com.google.gson.internal.ConstructorConstructor#newDefaultConstructor(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredConstructor(java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Constructor<? super T> constructor = rawType.getDeclaredConstructor();
 *  */
    @Test
    public void testNewDefaultConstructor_ThrowNullPointerException() throws Throwable  {
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(null);
        
        /* This test fails because method [com.google.gson.internal.ConstructorConstructor.newDefaultConstructor] produces [java.lang.NullPointerException] */
        Class constructorConstructorClazz = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class classType = Class.forName("java.lang.Class");
        Method newDefaultConstructorMethod = constructorConstructorClazz.getDeclaredMethod("newDefaultConstructor", classType);
        newDefaultConstructorMethod.setAccessible(true);
        java.lang.Object[] newDefaultConstructorMethodArguments = new java.lang.Object[1];
        newDefaultConstructorMethodArguments[0] = ((Object) null);
        try {
            newDefaultConstructorMethod.invoke(constructorConstructor, newDefaultConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1014482066704300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1014482066704300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1014482066719500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1014482066704300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1014482066719500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1014482067347600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1014482067347600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1014482067355000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1014482067347600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1014482067355000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

