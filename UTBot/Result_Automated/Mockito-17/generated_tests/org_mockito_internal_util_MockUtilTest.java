package org.mockito.internal.util;

import org.junit.Test;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.objenesis.ObjenesisStd;
import org.objenesis.strategy.StdInstantiatorStrategy;
import java.util.HashMap;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.exceptions.base.MockitoException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_util_MockUtilTest {
    ///region Test suites for executable org.mockito.internal.util.MockUtil.createMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createMock(java.lang.Class, org.mockito.internal.creation.MockSettingsImpl)
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testCreateMock_ThrowClassCastException() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            byte[] spiedInstance = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", spiedInstance);
            
            /* This test fails because method [org.mockito.internal.util.MockUtil.createMock] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testCreateMock_ThrowClassCastException_1() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            
            /* This test fails because method [org.mockito.internal.util.MockUtil.createMock] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: creationValidator.validateType(classToMock);
 *  */
    @Test
    public void testCreateMock_ThrowNullPointerException() {
        MockUtil mockUtil = new MockUtil(null);
        
        /* This test fails because method [org.mockito.internal.util.MockUtil.createMock] produces [java.lang.NullPointerException] */
        mockUtil.createMock(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: creationValidator.validateExtraInterfaces(classToMock, settings.getExtraInterfaces());
 *  */
    @Test
    public void testCreateMock_ThrowNullPointerException_1() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            
            /* This test fails because method [org.mockito.internal.util.MockUtil.createMock] produces [java.lang.NullPointerException] */
            mockUtil.createMock(class1, null);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createMock(java.lang.Class, org.mockito.internal.creation.MockSettingsImpl)
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: creationValidator.validateType(classToMock);
 *  */
    @Test(expected = MockitoException.class)
    public void testCreateMock_ThrowMockitoException() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            
            mockUtil.createMock(class1, null);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: creationValidator.validateExtraInterfaces(classToMock, settings.getExtraInterfaces());
 *  */
    @Test(expected = MockitoException.class)
    public void testCreateMock_ThrowMockitoException_1() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = new java.lang.Class[1];
            extraInterfaces[0] = class1;
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: creationValidator.validateType(classToMock);
 *  */
    @Test(expected = MockitoException.class)
    public void testCreateMock_ThrowMockitoException_2() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            
            mockUtil.createMock(class1, null);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: creationValidator.validateExtraInterfaces(classToMock, settings.getExtraInterfaces());
 *  */
    @Test(expected = MockitoException.class)
    public void testCreateMock_ThrowMockitoException_3() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = new java.lang.Class[3];
            extraInterfaces[2] = class1;
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#mockedTypeIsInconsistentWithSpiedInstanceType(java.lang.Class,java.lang.Object)}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#mockedTypeIsInconsistentWithSpiedInstanceType(java.lang.Class,java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: creationValidator.validateMockedType(classToMock, settings.getSpiedInstance());
 *  */
    @Test(expected = MockitoException.class)
    public void testCreateMock_ThrowMockitoException_4() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            short[] spiedInstance = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", spiedInstance);
            
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.mockito.internal.creation.MockSettingsImpl#initiateMockName(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.InternalError} 
 *  */
    @Test(expected = InternalError.class)
    public void testCreateMock_ThrowInternalError() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            CreationValidator creationValidator = new CreationValidator();
            MockUtil mockUtil = new MockUtil(creationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.resetMock
    
    ///region Errors report for resetMock
    
    public void testResetMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 29 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.getInterceptor
    
    ///region Errors report for getInterceptor
    
    public void testGetInterceptor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.isMock
    
    ///region Errors report for isMock
    
    public void testIsMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 42 occurrences of:
        // Concrete execution failed
        
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.getMockHandler
    
    ///region Errors report for getMockHandler
    
    public void testGetMockHandler_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 42 occurrences of:
        // Concrete execution failed
        
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.getMockName
    
    ///region Errors report for getMockName
    
    public void testGetMockName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 30 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.isMockitoMock
    
    ///region Errors report for isMockitoMock
    
    public void testIsMockitoMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 39 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1122625597027800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1122625597027800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1122625597057400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122625597027800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122625597057400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1122625597756499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1122625597756499.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1122625597758299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122625597756499.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122625597758299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

