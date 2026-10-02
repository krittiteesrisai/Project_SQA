package org.mockito.internal.creation.bytebuddy;

import org.junit.Test;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.mock.SerializableMode;
import org.mockito.internal.creation.MockSettingsImpl;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_creation_bytebuddy_ByteBuddyMockMakerTest {
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.getHandler
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#getHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (!(mock instanceof MockMethodInterceptor.MockAccess)): True}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testGetHandler_ThrowNullPointerException() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.getHandler] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.getHandler(ByteBuddyMockMaker.java:58) */
        byteBuddyMockMaker.getHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.asInternalMockHandler
    
    ///region Errors report for asInternalMockHandler
    
    public void testAsInternalMockHandler_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.ensureMockIsAssignableToMockedType
    
    ///region Errors report for ensureMockIsAssignableToMockedType
    
    public void testEnsureMockIsAssignableToMockedType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.initializeClassInstantiator
    
    ///region Errors report for initializeClassInstantiator
    
    public void testInitializeClassInstantiator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.describeClass
    
    ///region Errors report for describeClass
    
    public void testDescribeClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.describeClass
    
    ///region Errors report for describeClass
    
    public void testDescribeClass_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createMock(org.mockito.mock.MockCreationSettings, org.mockito.invocation.MockHandler)
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#createMock(org.mockito.mock.MockCreationSettings,org.mockito.invocation.MockHandler)}
 * @utbot.invokes {@link org.mockito.mock.MockCreationSettings#getSerializableMode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: settings.getSerializableMode() == SerializableMode.ACROSS_CLASSLOADERS
 *  */
    @Test
    public void testCreateMock_ThrowNullPointerException() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:42) */
        byteBuddyMockMaker.createMock(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#createMock(org.mockito.mock.MockCreationSettings,org.mockito.invocation.MockHandler)}
 * @utbot.executesCondition {@code (settings.getSerializableMode() == SerializableMode.ACROSS_CLASSLOADERS): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: settings.getSerializableMode() == SerializableMode.ACROSS_CLASSLOADERS
 *  */
    @Test
    public void testCreateMock_ThrowNullPointerException_1() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        CreationSettings creationSettings = ((CreationSettings) createInstance("org.mockito.internal.creation.settings.CreationSettings"));
        SerializableMode serializableMode = SerializableMode.ACROSS_CLASSLOADERS;
        setField(creationSettings, "org.mockito.internal.creation.settings.CreationSettings", "serializableMode", serializableMode);
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:42) */
        byteBuddyMockMaker.createMock(creationSettings, null);
    }
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#createMock(org.mockito.mock.MockCreationSettings,org.mockito.invocation.MockHandler)}
 * @utbot.executesCondition {@code (settings.getSerializableMode() == SerializableMode.ACROSS_CLASSLOADERS): False}
 * @utbot.invokes {@link org.mockito.mock.MockCreationSettings#getTypeToMock()}
 * @utbot.invokes {@link org.mockito.mock.MockCreationSettings#getExtraInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<? extends T> mockedProxyType = cachingMockBytecodeGenerator.get(settings.getTypeToMock(), settings.getExtraInterfaces());
 *  */
    @Test
    public void testCreateMock_ThrowNullPointerException_2() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
        Class typeToMock = Object.class;
        setField(mockSettingsImpl, "org.mockito.internal.creation.settings.CreationSettings", "typeToMock", typeToMock);
        SerializableMode serializableMode = SerializableMode.ACROSS_CLASSLOADERS;
        setField(mockSettingsImpl, "org.mockito.internal.creation.settings.CreationSettings", "serializableMode", serializableMode);
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock] produces [java.lang.NullPointerException] */
        byteBuddyMockMaker.createMock(mockSettingsImpl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createMock(org.mockito.mock.MockCreationSettings, org.mockito.invocation.MockHandler)
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#createMock(org.mockito.mock.MockCreationSettings,org.mockito.invocation.MockHandler)}
 * @utbot.executesCondition {@code (settings.getSerializableMode() == SerializableMode.ACROSS_CLASSLOADERS): False}
 * @utbot.invokes {@link org.mockito.mock.MockCreationSettings#getSerializableMode()}
 * @utbot.invokes {@link org.mockito.mock.MockCreationSettings#getTypeToMock()}
 * @utbot.invokes {@link org.mockito.mock.MockCreationSettings#getExtraInterfaces()}
 * @utbot.invokes {@link org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator#get(java.lang.Class,java.util.Set)}
 * @utbot.throwsException {@link java.lang.Error} in: Class<? extends T> mockedProxyType = cachingMockBytecodeGenerator.get(settings.getTypeToMock(), settings.getExtraInterfaces());
 *  */
    @Test(expected = Error.class)
    public void testCreateMock_ThrowError() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        CachingMockBytecodeGenerator cachingMockBytecodeGenerator = ((CachingMockBytecodeGenerator) createInstance("org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator"));
        ReentrantLock avoidingClassLeakCacheLock = ((ReentrantLock) createInstance("java.util.concurrent.locks.ReentrantLock"));
        Object sync = createInstance("java.util.concurrent.locks.ReentrantLock$FairSync");
        setField(sync, "java.util.concurrent.locks.AbstractQueuedSynchronizer", "state", -2);
        Thread exclusiveOwnerThread = new Thread();
        setField(sync, "java.util.concurrent.locks.AbstractOwnableSynchronizer", "exclusiveOwnerThread", exclusiveOwnerThread);
        setField(avoidingClassLeakCacheLock, "java.util.concurrent.locks.ReentrantLock", "sync", sync);
        setField(cachingMockBytecodeGenerator, "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator", "avoidingClassLeakCacheLock", avoidingClassLeakCacheLock);
        setField(byteBuddyMockMaker, "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker", "cachingMockBytecodeGenerator", cachingMockBytecodeGenerator);
        MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
        Class typeToMock = Object.class;
        setField(mockSettingsImpl, "org.mockito.internal.creation.settings.CreationSettings", "typeToMock", typeToMock);
        SerializableMode serializableMode = SerializableMode.NONE;
        setField(mockSettingsImpl, "org.mockito.internal.creation.settings.CreationSettings", "serializableMode", serializableMode);
        
        byteBuddyMockMaker.createMock(mockSettingsImpl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetMock(java.lang.Object, org.mockito.invocation.MockHandler, org.mockito.mock.MockCreationSettings)
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#resetMock(java.lang.Object,org.mockito.invocation.MockHandler,org.mockito.mock.MockCreationSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new MockMethodInterceptor(asInternalMockHandler(newHandler), settings)
 *  */
    @Test
    public void testResetMock_ThrowNullPointerException() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        byte[] byteArray = {};
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock(ByteBuddyMockMaker.java:63) */
        byteBuddyMockMaker.resetMock(byteArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#resetMock(java.lang.Object,org.mockito.invocation.MockHandler,org.mockito.mock.MockCreationSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ((MockMethodInterceptor.MockAccess) mock).setMockitoInterceptor(new MockMethodInterceptor(asInternalMockHandler(newHandler), settings));
 *  */
    @Test
    public void testResetMock_ThrowNullPointerException_1() throws Throwable  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        Object invocationNotifierHandler = createInstance("org.mockito.internal.handler.InvocationNotifierHandler");
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock(ByteBuddyMockMaker.java:63) */
        Class byteBuddyMockMakerClazz = Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        Class objectType = Class.forName("java.lang.Object");
        Class invocationNotifierHandlerType = Class.forName("org.mockito.invocation.MockHandler");
        Class mockCreationSettingsType = Class.forName("org.mockito.mock.MockCreationSettings");
        Method resetMockMethod = byteBuddyMockMakerClazz.getDeclaredMethod("resetMock", objectType, invocationNotifierHandlerType, mockCreationSettingsType);
        resetMockMethod.setAccessible(true);
        java.lang.Object[] resetMockMethodArguments = new java.lang.Object[3];
        resetMockMethodArguments[0] = ((Object) null);
        resetMockMethodArguments[1] = invocationNotifierHandler;
        resetMockMethodArguments[2] = ((Object) null);
        try {
            resetMockMethod.invoke(byteBuddyMockMaker, resetMockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ByteBuddyMockMaker}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker#resetMock(java.lang.Object,org.mockito.invocation.MockHandler,org.mockito.mock.MockCreationSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new MockMethodInterceptor(asInternalMockHandler(newHandler), settings)
 *  */
    @Test
    public void testResetMock_ThrowNullPointerException_2() throws Exception  {
        ByteBuddyMockMaker byteBuddyMockMaker = ((ByteBuddyMockMaker) createInstance("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        
        /* This test fails because method [org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.resetMock(ByteBuddyMockMaker.java:63) */
        byteBuddyMockMaker.resetMock(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1124814130342500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1124814130342500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1124814130354000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1124814130342500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1124814130354000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

