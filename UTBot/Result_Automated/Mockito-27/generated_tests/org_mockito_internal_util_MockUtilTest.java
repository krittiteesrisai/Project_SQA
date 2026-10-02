package org.mockito.internal.util;

import org.junit.Test;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.objenesis.ObjenesisStd;
import org.objenesis.strategy.StdInstantiatorStrategy;
import java.util.HashMap;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.exceptions.base.MockitoException;
import java.lang.reflect.Method;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.InvocationNotifierHandler;
import org.mockito.internal.MockHandler;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import java.util.LinkedList;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import java.util.ArrayList;
import org.mockito.internal.verification.RegisteredInvocations;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.creation.cglib.CGLIBHacker;
import org.mockito.internal.MockitoInvocationHandler;
import java.util.List;
import org.mockito.internal.progress.MockingProgress;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_mockito_internal_util_MockUtilTest {
    ///region Test suites for executable org.mockito.internal.util.MockUtil.isMockitoMock
    
    ///region Errors report for isMockitoMock
    
    public void testIsMockitoMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
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
        // 4 occurrences of:
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
        // 4 occurrences of:
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
        // 4 occurrences of:
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
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.resetMock
    
    ///region Errors report for resetMock
    
    public void testResetMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.createMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createMock(java.lang.Class, org.mockito.internal.creation.MockSettingsImpl)
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {null};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            short[] spiedInstance = {};
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {null, null};
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = new java.lang.Class[2];
            extraInterfaces[1] = class1;
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = new MockSettingsImpl();
            
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
 * @utbot.executesCondition {@code (null): False}
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
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
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: creationValidator.validateMockedType(classToMock, settings.getSpiedInstance());
 *  */
    @Test(expected = MockitoException.class)
    public void testCreateMock_ThrowMockitoException_5() throws Exception  {
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
            MockCreationValidator mockCreationValidator = new MockCreationValidator();
            MockUtil mockUtil = new MockUtil(mockCreationValidator);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            short[] spiedInstance = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", spiedInstance);
            
            mockUtil.createMock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.MockUtil.newMethodInterceptorFilter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newMethodInterceptorFilter(org.mockito.internal.creation.MockSettingsImpl)
    
    /**
    @utbot.classUnderTest {@link MockUtil}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.MockUtil#newMethodInterceptorFilter(org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.returnsFrom {@code return new MethodInterceptorFilter(invocationNotifierHandler, settings);}
 *  */
    @Test
    public void testNewMethodInterceptorFilter_Return() throws Exception  {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
        
        Class mockUtilClazz = Class.forName("org.mockito.internal.util.MockUtil");
        Class mockSettingsImplType = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Method newMethodInterceptorFilterMethod = mockUtilClazz.getDeclaredMethod("newMethodInterceptorFilter", mockSettingsImplType);
        newMethodInterceptorFilterMethod.setAccessible(true);
        java.lang.Object[] newMethodInterceptorFilterMethodArguments = new java.lang.Object[1];
        newMethodInterceptorFilterMethodArguments[0] = mockSettingsImpl;
        MethodInterceptorFilter actual = ((MethodInterceptorFilter) newMethodInterceptorFilterMethod.invoke(mockUtil, newMethodInterceptorFilterMethodArguments));
        
        MethodInterceptorFilter expected = ((MethodInterceptorFilter) createInstance("org.mockito.internal.creation.MethodInterceptorFilter"));
        InvocationNotifierHandler handler = ((InvocationNotifierHandler) createInstance("org.mockito.internal.InvocationNotifierHandler"));
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        LinkedList stubbed = new LinkedList();
        setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "stubbed", stubbed);
        ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress);
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        RegisteredInvocations registeredInvocations = ((RegisteredInvocations) createInstance("org.mockito.internal.verification.RegisteredInvocations"));
        ArrayList invocations = new ArrayList();
        setField(registeredInvocations, "org.mockito.internal.verification.RegisteredInvocations", "invocations", invocations);
        setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "registeredInvocations", registeredInvocations);
        setField(mockHandler, "org.mockito.internal.MockHandler", "invocationContainerImpl", invocationContainerImpl);
        MatchersBinder matchersBinder = ((MatchersBinder) createInstance("org.mockito.internal.invocation.MatchersBinder"));
        setField(mockHandler, "org.mockito.internal.MockHandler", "matchersBinder", matchersBinder);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockSettings", mockSettingsImpl);
        setField(handler, "org.mockito.internal.InvocationNotifierHandler", "mockHandler", mockHandler);
        setField(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "handler", handler);
        CGLIBHacker cglibHacker = ((CGLIBHacker) createInstance("org.mockito.internal.creation.cglib.CGLIBHacker"));
        setField(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "cglibHacker", cglibHacker);
        ObjectMethodsGuru objectMethodsGuru = ((ObjectMethodsGuru) createInstance("org.mockito.internal.util.ObjectMethodsGuru"));
        setField(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "objectMethodsGuru", objectMethodsGuru);
        setField(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "mockSettings", mockSettingsImpl);
        
        MockitoInvocationHandler expectedHandler = expected.getHandler();
        MockitoInvocationHandler actualHandler = actual.getHandler();
        List actualHandlerInvocationListeners = ((List) getFieldValue(actualHandler, "org.mockito.internal.InvocationNotifierHandler", "invocationListeners"));
        assertNull(actualHandlerInvocationListeners);
        
        MockHandler expectedHandlerMockHandler = ((MockHandler) getFieldValue(expectedHandler, "org.mockito.internal.InvocationNotifierHandler", "mockHandler"));
        MockHandler actualHandlerMockHandler = ((MockHandler) getFieldValue(actualHandler, "org.mockito.internal.InvocationNotifierHandler", "mockHandler"));
        InvocationContainerImpl expectedHandlerMockHandlerInvocationContainerImpl = ((InvocationContainerImpl) getFieldValue(expectedHandlerMockHandler, "org.mockito.internal.MockHandler", "invocationContainerImpl"));
        InvocationContainerImpl actualHandlerMockHandlerInvocationContainerImpl = ((InvocationContainerImpl) getFieldValue(actualHandlerMockHandler, "org.mockito.internal.MockHandler", "invocationContainerImpl"));
        LinkedList expectedHandlerMockHandlerInvocationContainerImplStubbed = ((LinkedList) getFieldValue(expectedHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "stubbed"));
        LinkedList actualHandlerMockHandlerInvocationContainerImplStubbed = ((LinkedList) getFieldValue(actualHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "stubbed"));
        assertTrue(deepEquals(expectedHandlerMockHandlerInvocationContainerImplStubbed, actualHandlerMockHandlerInvocationContainerImplStubbed));
        
        MockingProgress expectedHandlerMockHandlerInvocationContainerImplMockingProgress = ((MockingProgress) getFieldValue(expectedHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress"));
        MockingProgress actualHandlerMockHandlerInvocationContainerImplMockingProgress = ((MockingProgress) getFieldValue(actualHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress"));
        
        List expectedHandlerMockHandlerInvocationContainerImplAnswersForStubbing = ((List) getFieldValue(expectedHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "answersForStubbing"));
        List actualHandlerMockHandlerInvocationContainerImplAnswersForStubbing = ((List) getFieldValue(actualHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "answersForStubbing"));
        assertTrue(deepEquals(expectedHandlerMockHandlerInvocationContainerImplAnswersForStubbing, actualHandlerMockHandlerInvocationContainerImplAnswersForStubbing));
        
        RegisteredInvocations expectedHandlerMockHandlerInvocationContainerImplRegisteredInvocations = ((RegisteredInvocations) getFieldValue(expectedHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "registeredInvocations"));
        RegisteredInvocations actualHandlerMockHandlerInvocationContainerImplRegisteredInvocations = ((RegisteredInvocations) getFieldValue(actualHandlerMockHandlerInvocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "registeredInvocations"));
        List expectedHandlerMockHandlerInvocationContainerImplRegisteredInvocationsInvocations = ((List) getFieldValue(expectedHandlerMockHandlerInvocationContainerImplRegisteredInvocations, "org.mockito.internal.verification.RegisteredInvocations", "invocations"));
        List actualHandlerMockHandlerInvocationContainerImplRegisteredInvocationsInvocations = ((List) getFieldValue(actualHandlerMockHandlerInvocationContainerImplRegisteredInvocations, "org.mockito.internal.verification.RegisteredInvocations", "invocations"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedHandlerMockHandlerInvocationContainerImplRegisteredInvocationsInvocations, actualHandlerMockHandlerInvocationContainerImplRegisteredInvocationsInvocations));
        
        MatchersBinder expectedHandlerMockHandlerMatchersBinder = ((MatchersBinder) getFieldValue(expectedHandlerMockHandler, "org.mockito.internal.MockHandler", "matchersBinder"));
        MatchersBinder actualHandlerMockHandlerMatchersBinder = ((MatchersBinder) getFieldValue(actualHandlerMockHandler, "org.mockito.internal.MockHandler", "matchersBinder"));
        
        MockingProgress expectedHandlerMockHandlerMockingProgress = ((MockingProgress) getFieldValue(expectedHandlerMockHandler, "org.mockito.internal.MockHandler", "mockingProgress"));
        MockingProgress actualHandlerMockHandlerMockingProgress = ((MockingProgress) getFieldValue(actualHandlerMockHandler, "org.mockito.internal.MockHandler", "mockingProgress"));
        
        MockSettingsImpl expectedHandlerMockHandlerMockSettings = expectedHandlerMockHandler.getMockSettings();
        MockSettingsImpl actualHandlerMockHandlerMockSettings = actualHandlerMockHandler.getMockSettings();
        List actualHandlerMockHandlerMockSettingsInvocationListeners = actualHandlerMockHandlerMockSettings.getInvocationListeners();
        assertNull(actualHandlerMockHandlerMockSettingsInvocationListeners);
        
        CGLIBHacker expectedCglibHacker = ((CGLIBHacker) getFieldValue(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "cglibHacker"));
        CGLIBHacker actualCglibHacker = ((CGLIBHacker) getFieldValue(actual, "org.mockito.internal.creation.MethodInterceptorFilter", "cglibHacker"));
        
        ObjectMethodsGuru expectedObjectMethodsGuru = ((ObjectMethodsGuru) getFieldValue(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "objectMethodsGuru"));
        ObjectMethodsGuru actualObjectMethodsGuru = ((ObjectMethodsGuru) getFieldValue(actual, "org.mockito.internal.creation.MethodInterceptorFilter", "objectMethodsGuru"));
        
        MockSettingsImpl expectedMockSettings = ((MockSettingsImpl) getFieldValue(expected, "org.mockito.internal.creation.MethodInterceptorFilter", "mockSettings"));
        MockSettingsImpl actualMockSettings = ((MockSettingsImpl) getFieldValue(actual, "org.mockito.internal.creation.MethodInterceptorFilter", "mockSettings"));
        assertTrue(deepEquals(expectedMockSettings, actualMockSettings));
        
    }
    ///endregion
    
    ///region Errors report for newMethodInterceptorFilter
    
    public void testNewMethodInterceptorFilter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1127313168301000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1127313168301000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1127313168307100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1127313168301000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1127313168307100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1127313168790400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1127313168790400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1127313168792200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1127313168790400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1127313168792200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1127313169565400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1127313169565400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1127313169566900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1127313169565400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1127313169566900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

