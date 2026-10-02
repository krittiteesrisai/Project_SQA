package org.mockito.internal.configuration.injection;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter;
import java.util.LinkedHashSet;
import java.lang.reflect.Field;
import org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_mockito_internal_configuration_injection_PropertyAndSetterInjectionTest {
    ///region Test suites for executable org.mockito.internal.configuration.injection.PropertyAndSetterInjection.orderedInstanceFieldsFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method orderedInstanceFieldsFrom(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#orderedInstanceFieldsFrom(java.lang.Class)}
 *  */
    @Test
    public void testOrderedInstanceFieldsFrom() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#orderedInstanceFieldsFrom(java.lang.Class)}
 *  */
    @Test
    public void testOrderedInstanceFieldsFrom_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#orderedInstanceFieldsFrom(java.lang.Class)}
 *  */
    @Test
    public void testOrderedInstanceFieldsFrom_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method orderedInstanceFieldsFrom(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#orderedInstanceFieldsFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredFields()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Field> declaredFields = Arrays.asList(awaitingInjectionClazz.getDeclaredFields());
 *  */
    @Test
    public void testOrderedInstanceFieldsFrom_ThrowNullPointerException() throws Throwable  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        
        /* This test fails because method [org.mockito.internal.configuration.injection.PropertyAndSetterInjection.orderedInstanceFieldsFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.PropertyAndSetterInjection.orderedInstanceFieldsFrom(PropertyAndSetterInjection.java:141) */
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class classType = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", classType);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = ((Object) null);
        try {
            orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method orderedInstanceFieldsFrom(java.lang.Class)
    
    @Test
    public void testOrderedInstanceFieldsFrom1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testOrderedInstanceFieldsFrom8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        Class class1 = Object.class;
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class class1Type = Class.forName("java.lang.Class");
        Method orderedInstanceFieldsFromMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("orderedInstanceFieldsFrom", class1Type);
        orderedInstanceFieldsFromMethod.setAccessible(true);
        java.lang.Object[] orderedInstanceFieldsFromMethodArguments = new java.lang.Object[1];
        orderedInstanceFieldsFromMethodArguments[0] = class1;
        ArrayList actual = ((ArrayList) orderedInstanceFieldsFromMethod.invoke(propertyAndSetterInjection, orderedInstanceFieldsFromMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidatesOnFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method injectMockCandidatesOnFields(java.util.Set, java.lang.Object, boolean, java.util.List)
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#injectMockCandidatesOnFields(java.util.Set,java.lang.Object,boolean,java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return injectionOccurred;}
 *  */
    @Test
    public void testInjectMockCandidatesOnFields_ReturnInjectionOccurred() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        ArrayList arrayList = new ArrayList();
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class setType = Class.forName("java.util.Set");
        Class objectType = Class.forName("java.lang.Object");
        Class booleanType = boolean.class;
        Class arrayListType = Class.forName("java.util.List");
        Method injectMockCandidatesOnFieldsMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("injectMockCandidatesOnFields", setType, objectType, booleanType, arrayListType);
        injectMockCandidatesOnFieldsMethod.setAccessible(true);
        java.lang.Object[] injectMockCandidatesOnFieldsMethodArguments = new java.lang.Object[4];
        injectMockCandidatesOnFieldsMethodArguments[0] = ((Object) null);
        injectMockCandidatesOnFieldsMethodArguments[1] = ((Object) null);
        injectMockCandidatesOnFieldsMethodArguments[2] = false;
        injectMockCandidatesOnFieldsMethodArguments[3] = arrayList;
        boolean actual = ((Boolean) injectMockCandidatesOnFieldsMethod.invoke(propertyAndSetterInjection, injectMockCandidatesOnFieldsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method injectMockCandidatesOnFields(java.util.Set, java.lang.Object, boolean, java.util.List)
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#injectMockCandidatesOnFields(java.util.Set,java.lang.Object,boolean,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<Field> it = orderedInstanceFields.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testInjectMockCandidatesOnFields_ThrowNullPointerException_1() throws Throwable  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        
        /* This test fails because method [org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidatesOnFields] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidatesOnFields(PropertyAndSetterInjection.java:123) */
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class setType = Class.forName("java.util.Set");
        Class objectType = Class.forName("java.lang.Object");
        Class booleanType = boolean.class;
        Class listType = Class.forName("java.util.List");
        Method injectMockCandidatesOnFieldsMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("injectMockCandidatesOnFields", setType, objectType, booleanType, listType);
        injectMockCandidatesOnFieldsMethod.setAccessible(true);
        java.lang.Object[] injectMockCandidatesOnFieldsMethodArguments = new java.lang.Object[4];
        injectMockCandidatesOnFieldsMethodArguments[0] = ((Object) null);
        injectMockCandidatesOnFieldsMethodArguments[1] = ((Object) null);
        injectMockCandidatesOnFieldsMethodArguments[2] = false;
        injectMockCandidatesOnFieldsMethodArguments[3] = ((Object) null);
        try {
            injectMockCandidatesOnFieldsMethod.invoke(propertyAndSetterInjection, injectMockCandidatesOnFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyAndSetterInjection}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#injectMockCandidatesOnFields(java.util.Set,java.lang.Object,boolean,java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object injected = mockCandidateFilter.filterCandidate(mocks, field, instance).thenInject();
 *  */
    @Test
    public void testInjectMockCandidatesOnFields_ThrowNullPointerException() throws Throwable  {
        PropertyAndSetterInjection propertyAndSetterInjection = ((PropertyAndSetterInjection) createInstance("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidatesOnFields] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidatesOnFields(PropertyAndSetterInjection.java:127) */
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class setType = Class.forName("java.util.Set");
        Class objectType = Class.forName("java.lang.Object");
        Class booleanType = boolean.class;
        Class arrayListType = Class.forName("java.util.List");
        Method injectMockCandidatesOnFieldsMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("injectMockCandidatesOnFields", setType, objectType, booleanType, arrayListType);
        injectMockCandidatesOnFieldsMethod.setAccessible(true);
        java.lang.Object[] injectMockCandidatesOnFieldsMethodArguments = new java.lang.Object[4];
        injectMockCandidatesOnFieldsMethodArguments[0] = ((Object) null);
        injectMockCandidatesOnFieldsMethodArguments[1] = ((Object) null);
        injectMockCandidatesOnFieldsMethodArguments[2] = false;
        injectMockCandidatesOnFieldsMethodArguments[3] = arrayList;
        try {
            injectMockCandidatesOnFieldsMethod.invoke(propertyAndSetterInjection, injectMockCandidatesOnFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method injectMockCandidatesOnFields(java.util.Set, java.lang.Object, boolean, java.util.List)
    
    @Test
    public void testInjectMockCandidatesOnFieldsByFuzzer() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        Object object3 = new Object();
        ArrayList arrayList = new ArrayList();
        
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class hashSetType = Class.forName("java.util.Set");
        Class object3Type = Class.forName("java.lang.Object");
        Class booleanType = boolean.class;
        Class arrayListType = Class.forName("java.util.List");
        Method injectMockCandidatesOnFieldsMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("injectMockCandidatesOnFields", hashSetType, object3Type, booleanType, arrayListType);
        injectMockCandidatesOnFieldsMethod.setAccessible(true);
        java.lang.Object[] injectMockCandidatesOnFieldsMethodArguments = new java.lang.Object[4];
        injectMockCandidatesOnFieldsMethodArguments[0] = hashSet;
        injectMockCandidatesOnFieldsMethodArguments[1] = object3;
        injectMockCandidatesOnFieldsMethodArguments[2] = false;
        injectMockCandidatesOnFieldsMethodArguments[3] = arrayList;
        boolean actual = ((Boolean) injectMockCandidatesOnFieldsMethod.invoke(propertyAndSetterInjection, injectMockCandidatesOnFieldsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for injectMockCandidatesOnFields
    
    public void testInjectMockCandidatesOnFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field type is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.configuration.injection.PropertyAndSetterInjection.initializeInjectMocksField
    
    ///region FUZZER: ERROR SUITE for method initializeInjectMocksField(java.lang.reflect.Field, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection}
     * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#initializeInjectMocksField(java.lang.reflect.Field,java.lang.Object)}
     */
    @Test
    public void testInitializeInjectMocksFieldThrowsNPE() throws Throwable  {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        
        /* This test fails because method [org.mockito.internal.configuration.injection.PropertyAndSetterInjection.initializeInjectMocksField] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.PropertyAndSetterInjection.initializeInjectMocksField(PropertyAndSetterInjection.java:98) */
        Class propertyAndSetterInjectionClazz = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class fieldType = Class.forName("java.lang.reflect.Field");
        Class objectType = Class.forName("java.lang.Object");
        Method initializeInjectMocksFieldMethod = propertyAndSetterInjectionClazz.getDeclaredMethod("initializeInjectMocksField", fieldType, objectType);
        initializeInjectMocksFieldMethod.setAccessible(true);
        java.lang.Object[] initializeInjectMocksFieldMethodArguments = new java.lang.Object[2];
        initializeInjectMocksFieldMethodArguments[0] = ((Object) null);
        initializeInjectMocksFieldMethodArguments[1] = ((Object) null);
        try {
            initializeInjectMocksFieldMethod.invoke(propertyAndSetterInjection, initializeInjectMocksFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidates
    
    ///region Errors report for injectMockCandidates
    
    public void testInjectMockCandidates_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 27 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.configuration.injection.PropertyAndSetterInjection.processInjection
    
    ///region FUZZER: ERROR SUITE for method processInjection(java.lang.reflect.Field, java.lang.Object, java.util.Set)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection}
     * @utbot.methodUnderTest {@link org.mockito.internal.configuration.injection.PropertyAndSetterInjection#processInjection(java.lang.reflect.Field,java.lang.Object,java.util.Set)}
     */
    @Test
    public void testProcessInjectionThrowsNPE() {
        PropertyAndSetterInjection propertyAndSetterInjection = new PropertyAndSetterInjection();
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        
        /* This test fails because method [org.mockito.internal.configuration.injection.PropertyAndSetterInjection.processInjection] produces [java.lang.NullPointerException]
            org.mockito.internal.configuration.injection.PropertyAndSetterInjection.initializeInjectMocksField(PropertyAndSetterInjection.java:98)
            org.mockito.internal.configuration.injection.PropertyAndSetterInjection.processInjection(PropertyAndSetterInjection.java:73) */
        propertyAndSetterInjection.processInjection(null, null, hashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1124085888741200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1124085888741200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1124085888757300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1124085888741200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1124085888757300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

