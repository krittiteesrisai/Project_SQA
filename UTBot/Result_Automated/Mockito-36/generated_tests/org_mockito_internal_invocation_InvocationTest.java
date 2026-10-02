package org.mockito.internal.invocation;

import org.junit.Test;
import org.mockito.internal.debugging.Location;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod;
import org.mockito.internal.creation.SerializableMockitoMethodProxy;
import org.mockito.internal.creation.DelegatingMockitoMethodProxy;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod;
import java.util.ArrayList;
import org.mockito.internal.matchers.Equals;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class org_mockito_internal_invocation_InvocationTest {
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (!o.getClass().equals(this.getClass())): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOGetClassEquals() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] byteArray = {};
        
        boolean actual = invocation.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        boolean actual = invocation.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(org.mockito.internal.reporting.PrintSettings)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testToString_ThrowIllegalAccessError() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString(null);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: return toString(argumentsToMatchers(), printSettings);
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testToString_ThrowIllegalAccessError_1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(org.mockito.internal.reporting.PrintSettings)
    
    @Test(expected = IllegalAccessError.class)
    public void testToString1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[2] = object;
        Class class1 = Object.class;
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        arguments[10] = ((Object) class1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString(null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString2() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Class class1 = Object.class;
        arguments[2] = ((Object) class1);
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString(null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString3() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString(null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString4() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString(null);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 37 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#toString()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#argumentsToMatchers()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#toString(java.util.List,org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testToString_ThrowIllegalAccessError1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = IllegalAccessError.class)
    public void testToString5() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString();
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString6() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[2] = object;
        Class class1 = Object.class;
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        arguments[10] = ((Object) class1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString();
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString7() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        arguments[2] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString();
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString8() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Class class1 = Object.class;
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        arguments[10] = ((Object) class1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString();
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testToString9() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = new java.lang.Object[1];
        arguments[0] = mock;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        invocation.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(java.util.List, org.mockito.internal.reporting.PrintSettings)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#toString(java.util.List,org.mockito.internal.reporting.PrintSettings)}
 * @utbot.invokes org.mockito.internal.invocation.Invocation#qualifiedMethodName()
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: String method = qualifiedMethodName();
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testToString_ThrowIllegalAccessError2() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        
        invocation.toString(null, null);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 37 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.hashCode
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#hashCode()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: throw new RuntimeException("hashCode() is not implemented");
 *  */
    @Test(expected = RuntimeException.class)
    public void testHashCode_ThrowRuntimeException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        invocation.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMethod()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.returnsFrom {@code return method;}
 *  */
    @Test
    public void testGetMethod_ReturnMethod() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        SerializableMockitoMethod actual = ((SerializableMockitoMethod) invocation.getMethod());
        
        // org.mockito.internal.invocation.SerializableMockitoMethod has overridden equals method
        assertEquals(method, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocation()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getLocation()}
 * @utbot.returnsFrom {@code return location;}
 *  */
    @Test
    public void testGetLocation_ReturnLocation() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        Location actual = invocation.getLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.isVoid
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVoid()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.returnsFrom {@code return this.method.getReturnType() == Void.TYPE;}
 *  */
    @Test
    public void testIsVoid_ThisMethodGetReturnTypeEqualsVoidTYPE() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        MockitoMethod invocationMethod = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        Class initialInvocationMethodReturnType = ((Class) getFieldValue(invocationMethod, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType"));
        
        boolean actual = invocation.isVoid();
        
        assertFalse(actual);
        
        MockitoMethod invocationMethod1 = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        Class finalInvocationMethodReturnType = ((Class) getFieldValue(invocationMethod1, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType"));
        
        assertFalse(initialInvocationMethodReturnType == finalInvocationMethodReturnType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isVoid()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isVoid()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.method.getReturnType() == Void.TYPE;
 *  */
    @Test
    public void testIsVoid_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isVoid] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isVoid(Invocation.java:174) */
        invocation.isVoid();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getMethodName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMethodName()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getMethodName()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getName()}
 * @utbot.returnsFrom {@code return method.getName();}
 *  */
    @Test
    public void testGetMethodName_MockitoMethodGetName() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        String actual = invocation.getMethodName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMethodName()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getMethodName()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getName();
 *  */
    @Test
    public void testGetMethodName_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.getMethodName] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.getMethodName(Invocation.java:182) */
        invocation.getMethodName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArguments()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getArguments()}
 * @utbot.returnsFrom {@code return arguments;}
 *  */
    @Test
    public void testGetArguments_ReturnArguments() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        java.lang.Object[] actual = invocation.getArguments();
        
        int argumentsSize = arguments.length;
        assertEquals(argumentsSize, actual.length);
        assertTrue(deepEquals(arguments, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getSequenceNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSequenceNumber()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getSequenceNumber()}
 * @utbot.returnsFrom {@code return sequenceNumber;}
 *  */
    @Test
    public void testGetSequenceNumber_IntegerValueOf() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "sequenceNumber", -255);
        
        Integer actual = invocation.getSequenceNumber();
        
        Integer expected = -255;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.isVerifiedInOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVerifiedInOrder()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isVerifiedInOrder()}
 * @utbot.returnsFrom {@code return verifiedInOrder;}
 *  */
    @Test
    public void testIsVerifiedInOrder_ReturnVerifiedInOrder() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        boolean actual = invocation.isVerifiedInOrder();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.isValidReturnType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValidReturnType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidReturnType(java.lang.Class)}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: method.getReturnType().isPrimitive()
 *  */
    @Test
    public void testIsValidReturnType_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidReturnType] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isValidReturnType(Invocation.java:166) */
        invocation.isValidReturnType(null);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidReturnType(java.lang.Class)}
 * @utbot.executesCondition {@code (method.getReturnType().isPrimitive()): False}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.returnsFrom {@code return method.getReturnType().isAssignableFrom(clazz);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getReturnType().isAssignableFrom(clazz);
 *  */
    @Test
    public void testIsValidReturnType_ThrowNullPointerException_2() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidReturnType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            org.mockito.internal.invocation.Invocation.isValidReturnType(Invocation.java:169) */
        invocation.isValidReturnType(null);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidReturnType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: method.getReturnType().isPrimitive()
 *  */
    @Test
    public void testIsValidReturnType_ThrowNullPointerException_1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidReturnType] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isValidReturnType(Invocation.java:166) */
        invocation.isValidReturnType(null);
    }
    ///endregion
    
    ///region Errors report for isValidReturnType
    
    public void testIsValidReturnType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.isValidException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidException(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidException(java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Class<?> exception: exceptions)} once
 *  */
    @Test
    public void testIsValidException_ExceptionIsAssignableFrom() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        java.lang.Class[] exceptionTypes = new java.lang.Class[1];
        Class class1 = Object.class;
        exceptionTypes[0] = class1;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "exceptionTypes", exceptionTypes);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        MockitoMethod invocationMethod = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        java.lang.Class[] invocationMethodMethodExceptionTypes = ((java.lang.Class[]) getFieldValue(invocationMethod, "org.mockito.internal.invocation.SerializableMockitoMethod", "exceptionTypes"));
        Class initialInvocationMethodExceptionTypes0 = ((Class) get(invocationMethodMethodExceptionTypes, 0));
        
        boolean actual = invocation.isValidException(cloneNotSupportedException);
        
        assertTrue(actual);
        
        MockitoMethod invocationMethod1 = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        java.lang.Class[] invocationMethod1MethodExceptionTypes = ((java.lang.Class[]) getFieldValue(invocationMethod1, "org.mockito.internal.invocation.SerializableMockitoMethod", "exceptionTypes"));
        Class finalInvocationMethodExceptionTypes0 = ((Class) get(invocationMethod1MethodExceptionTypes, 0));
        
        assertFalse(initialInvocationMethodExceptionTypes0 == finalInvocationMethodExceptionTypes0);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidException(java.lang.Throwable)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidException_ReturnFalse() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        java.lang.Class[] exceptionTypes = {};
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "exceptionTypes", exceptionTypes);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        boolean actual = invocation.isValidException(cloneNotSupportedException);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValidException(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidException(java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Class<?> exception: exceptions)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: exception.isAssignableFrom(throwableClass)
 *  */
    @Test
    public void testIsValidException_ThrowNullPointerException_3() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        java.lang.Class[] exceptionTypes = {null};
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "exceptionTypes", exceptionTypes);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidException] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isValidException(Invocation.java:157) */
        invocation.isValidException(cloneNotSupportedException);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidException(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?>[] exceptions = this.getMethod().getExceptionTypes();
 *  */
    @Test
    public void testIsValidException_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidException] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isValidException(Invocation.java:154) */
        invocation.isValidException(null);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidException(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Class<?> exception: exceptions)
 *  */
    @Test
    public void testIsValidException_ThrowNullPointerException_1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidException] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isValidException(Invocation.java:156) */
        invocation.isValidException(cloneNotSupportedException);
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isValidException(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> throwableClass = throwable.getClass();
 *  */
    @Test
    public void testIsValidException_ThrowNullPointerException_2() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.isValidException] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.isValidException(Invocation.java:155) */
        invocation.isValidException(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.returnsPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method returnsPrimitive()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#returnsPrimitive()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.returnsFrom {@code return method.getReturnType().isPrimitive();}
 *  */
    @Test
    public void testReturnsPrimitive_MockitoMethodGetReturnType() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        MockitoMethod invocationMethod = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        Class initialInvocationMethodReturnType = ((Class) getFieldValue(invocationMethod, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType"));
        
        boolean actual = invocation.returnsPrimitive();
        
        assertFalse(actual);
        
        MockitoMethod invocationMethod1 = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        Class finalInvocationMethodReturnType = ((Class) getFieldValue(invocationMethod1, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType"));
        
        assertFalse(initialInvocationMethodReturnType == finalInvocationMethodReturnType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method returnsPrimitive()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#returnsPrimitive()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getReturnType().isPrimitive();
 *  */
    @Test
    public void testReturnsPrimitive_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.returnsPrimitive] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.returnsPrimitive(Invocation.java:186) */
        invocation.returnsPrimitive();
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#returnsPrimitive()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getReturnType().isPrimitive();
 *  */
    @Test
    public void testReturnsPrimitive_ThrowNullPointerException_1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.returnsPrimitive] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.returnsPrimitive(Invocation.java:186) */
        invocation.returnsPrimitive();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getMock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMock()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getMock()}
 * @utbot.returnsFrom {@code return mock;}
 *  */
    @Test
    public void testGetMock_ReturnMock() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        Object actual = invocation.getMock();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.expandVarArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expandVarArgs(boolean, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.executesCondition {@code (!isVarArgs): False}
 * @utbot.executesCondition {@code (args == null): False}
 * @utbot.returnsFrom {@code return args == null ? new Object[0] : args;}
 *  */
    @Test
    public void testExpandVarArgs_ArgsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Object[] objectArray = {null};
        
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = false;
        expandVarArgsMethodArguments[1] = ((Object) objectArray);
        java.lang.Object[] actual = ((java.lang.Object[]) expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments));
        
        int objectArraySize = objectArray.length;
        assertEquals(objectArraySize, actual.length);
        assertTrue(deepEquals(objectArray, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.executesCondition {@code (!isVarArgs): True}
 * @utbot.executesCondition {@code (args[args.length - 1] != null): True}
 * @utbot.executesCondition {@code (!args[args.length - 1].getClass().isArray()): True}
 * @utbot.executesCondition {@code (args == null): False}
 * @utbot.returnsFrom {@code return args == null ? new Object[0] : args;}
 *  */
    @Test
    public void testExpandVarArgs_NotArgsargsLength1GetClassIsArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = true;
        expandVarArgsMethodArguments[1] = ((Object) objectArray);
        java.lang.Object[] actual = ((java.lang.Object[]) expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments));
        
        int objectArraySize = objectArray.length;
        assertEquals(objectArraySize, actual.length);
        assertTrue(deepEquals(objectArray, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.executesCondition {@code (!isVarArgs): True}
 * @utbot.executesCondition {@code (args[args.length - 1] != null): True}
 * @utbot.executesCondition {@code (!args[args.length - 1].getClass().isArray()): False}
 * @utbot.executesCondition {@code (args[nonVarArgsCount] == null): False}
 * @utbot.invokes {@link org.mockito.internal.matchers.ArrayEquals#createObjectArray(java.lang.Object)}
 *  */
    @Test
    public void testExpandVarArgs_NonVarArgsCountOfArgsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        byte[] byteArray = {};
        objectArray[0] = ((Object) byteArray);
        
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = true;
        expandVarArgsMethodArguments[1] = ((Object) objectArray);
        java.lang.Object[] actual = ((java.lang.Object[]) expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments));
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.executesCondition {@code (!isVarArgs): True}
 * @utbot.executesCondition {@code (args[args.length - 1] != null): False}
 * @utbot.executesCondition {@code (args[nonVarArgsCount] == null): True}
 * @utbot.returnsFrom {@code return newArgs;}
 *  */
    @Test
    public void testExpandVarArgs_NonVarArgsCountOfArgsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Object[] objectArray = {null};
        
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = true;
        expandVarArgsMethodArguments[1] = ((Object) objectArray);
        java.lang.Object[] actual = ((java.lang.Object[]) expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments));
        
        java.lang.Object[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.executesCondition {@code (!isVarArgs): False}
 * @utbot.executesCondition {@code (args == null): True}
 * @utbot.returnsFrom {@code return args == null ? new Object[0] : args;}
 *  */
    @Test
    public void testExpandVarArgs_ArgsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = false;
        expandVarArgsMethodArguments[1] = ((Object) null);
        java.lang.Object[] actual = ((java.lang.Object[]) expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments));
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expandVarArgs(boolean, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isVarArgs || args[args.length - 1] != null && !args[args.length - 1].getClass().isArray()
 *  */
    @Test
    public void testExpandVarArgs_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.expandVarArgs] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.mockito.internal.invocation.Invocation.expandVarArgs(Invocation.java:57) */
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = true;
        expandVarArgsMethodArguments[1] = ((Object) objectArray);
        try {
            expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#expandVarArgs(boolean,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isVarArgs || args[args.length - 1] != null && !args[args.length - 1].getClass().isArray()
 *  */
    @Test
    public void testExpandVarArgs_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.mockito.internal.invocation.Invocation.expandVarArgs] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.expandVarArgs(Invocation.java:57) */
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class booleanType = boolean.class;
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method expandVarArgsMethod = invocationClazz.getDeclaredMethod("expandVarArgs", booleanType, objectArrayType);
        expandVarArgsMethod.setAccessible(true);
        java.lang.Object[] expandVarArgsMethodArguments = new java.lang.Object[2];
        expandVarArgsMethodArguments[0] = true;
        expandVarArgsMethodArguments[1] = ((Object) null);
        try {
            expandVarArgsMethod.invoke(null, expandVarArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for expandVarArgs
    
    public void testExpandVarArgs_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.equalArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalArguments([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#equalArguments(java.lang.Object[])}
 * @utbot.invokes {@link java.util.Arrays#equals(java.lang.Object[],java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.equals(arguments, this.arguments);}
 *  */
    @Test
    public void testEqualArguments_ArraysEquals() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        java.lang.Object[] objectArray = {null};
        
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method equalArgumentsMethod = invocationClazz.getDeclaredMethod("equalArguments", objectArrayType);
        equalArgumentsMethod.setAccessible(true);
        java.lang.Object[] equalArgumentsMethodArguments = new java.lang.Object[1];
        equalArgumentsMethodArguments[0] = ((Object) objectArray);
        boolean actual = ((Boolean) equalArgumentsMethod.invoke(invocation, equalArgumentsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.isVerified
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVerified()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isVerified()}
 * @utbot.returnsFrom {@code return verified;}
 *  */
    @Test
    public void testIsVerified_ReturnVerified() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        boolean actual = invocation.isVerified();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.isToString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isToString(org.mockito.invocation.InvocationOnMock)
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#isToString(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: return new ObjectMethodsGuru().isToString(invocation.getMethod());
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testIsToString_ThrowIllegalAccessError() {
        Invocation.isToString(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getArgumentsCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgumentsCount()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getArgumentsCount()}
 * @utbot.returnsFrom {@code return arguments.length;}
 *  */
    @Test
    public void testGetArgumentsCount_ReturnArgumentsLength() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        int actual = invocation.getArgumentsCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getArgumentsCount()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getArgumentsCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return arguments.length;
 *  */
    @Test
    public void testGetArgumentsCount_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.getArgumentsCount] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.getArgumentsCount(Invocation.java:194) */
        invocation.getArgumentsCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.markVerified
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markVerified()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#markVerified()}
 *  */
    @Test
    public void testMarkVerified() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        invocation.markVerified();
        
        boolean finalInvocationVerified = ((Boolean) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "verified"));
        
        assertTrue(finalInvocationVerified);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.callRealMethod
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method callRealMethod()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#callRealMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.realmethod.RealMethod#invoke(java.lang.Object,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return realMethod.invoke(mock, rawArguments);
 *  */
    @Test
    public void testCallRealMethod_ThrowNullPointerException() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] rawArguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "rawArguments", rawArguments);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.callRealMethod] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.callRealMethod(Invocation.java:202) */
        invocation.callRealMethod();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method callRealMethod()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#callRealMethod()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return realMethod.invoke(mock, rawArguments);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCallRealMethod_ThrowIllegalArgumentException() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] rawArguments = {null, null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "rawArguments", rawArguments);
        CGLIBProxyRealMethod realMethod = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        Class c1 = Object.class;
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "c1", c1);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "c2", c1);
        String desc = "(";
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "desc", desc);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "name", desc);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "superName", desc);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#callRealMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return realMethod.invoke(mock, rawArguments);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCallRealMethod_ThrowNullPointerException_1() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        CGLIBProxyRealMethod realMethod = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        DelegatingMockitoMethodProxy methodProxy = ((DelegatingMockitoMethodProxy) createInstance("org.mockito.internal.creation.DelegatingMockitoMethodProxy"));
        MethodProxy methodProxy1 = ((MethodProxy) createInstance("org.mockito.cglib.proxy.MethodProxy"));
        Object initLock = createInstance("java.lang.Object");
        setField(methodProxy1, "org.mockito.cglib.proxy.MethodProxy", "initLock", initLock);
        setField(methodProxy, "org.mockito.internal.creation.DelegatingMockitoMethodProxy", "methodProxy", methodProxy1);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#callRealMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return realMethod.invoke(mock, rawArguments);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCallRealMethod_ThrowNullPointerException_2() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        CGLIBProxyRealMethod realMethod = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        MethodProxy methodProxy1 = ((MethodProxy) createInstance("org.mockito.cglib.proxy.MethodProxy"));
        Object initLock = createInstance("java.lang.Object");
        setField(methodProxy1, "org.mockito.cglib.proxy.MethodProxy", "initLock", initLock);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "methodProxy", methodProxy1);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method callRealMethod()
    
    @Test
    public void testCallRealMethod1() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        CGLIBProxyRealMethod realMethod = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        MethodProxy methodProxy1 = ((MethodProxy) createInstance("org.mockito.cglib.proxy.MethodProxy"));
        Object createInfo = createInstance("org.mockito.cglib.proxy.MethodProxy$CreateInfo");
        setField(methodProxy1, "org.mockito.cglib.proxy.MethodProxy", "createInfo", createInfo);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "methodProxy", methodProxy1);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.callRealMethod] produces [java.lang.NullPointerException]
            org.mockito.cglib.proxy.MethodProxy.init(MethodProxy.java:68)
            org.mockito.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:214)
            org.mockito.internal.creation.AbstractMockitoMethodProxy.invokeSuper(AbstractMockitoMethodProxy.java:11)
            org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod.invoke(CGLIBProxyRealMethod.java:20)
            org.mockito.internal.invocation.Invocation.callRealMethod(Invocation.java:202) */
        invocation.callRealMethod();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method callRealMethod()
    
    @Test(expected = IllegalArgumentException.class)
    public void testCallRealMethod2() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        FilteredCGLIBProxyRealMethod realMethod = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        FilteredCGLIBProxyRealMethod realMethod1 = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        CGLIBProxyRealMethod realMethod2 = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        String name = "(\u0000\u0000";
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "name", name);
        setField(realMethod2, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(realMethod1, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod2);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    
    @Test(expected = NullPointerException.class)
    public void testCallRealMethod3() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        FilteredCGLIBProxyRealMethod realMethod = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        CGLIBProxyRealMethod realMethod1 = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        MethodProxy methodProxy1 = ((MethodProxy) createInstance("org.mockito.cglib.proxy.MethodProxy"));
        Object createInfo = createInstance("org.mockito.cglib.proxy.MethodProxy$CreateInfo");
        setField(methodProxy1, "org.mockito.cglib.proxy.MethodProxy", "createInfo", createInfo);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "methodProxy", methodProxy1);
        setField(realMethod1, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    
    @Test(expected = NullPointerException.class)
    public void testCallRealMethod4() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        FilteredCGLIBProxyRealMethod realMethod = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        FilteredCGLIBProxyRealMethod realMethod1 = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        CGLIBProxyRealMethod realMethod2 = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        MethodProxy methodProxy1 = ((MethodProxy) createInstance("org.mockito.cglib.proxy.MethodProxy"));
        Object createInfo = createInstance("org.mockito.cglib.proxy.MethodProxy$CreateInfo");
        setField(methodProxy1, "org.mockito.cglib.proxy.MethodProxy", "createInfo", createInfo);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "methodProxy", methodProxy1);
        setField(realMethod2, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(realMethod1, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod2);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    
    @Test(expected = NullPointerException.class)
    public void testCallRealMethod5() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        FilteredCGLIBProxyRealMethod realMethod = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        FilteredCGLIBProxyRealMethod realMethod1 = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        FilteredCGLIBProxyRealMethod realMethod2 = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        CGLIBProxyRealMethod realMethod3 = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        MethodProxy methodProxy1 = ((MethodProxy) createInstance("org.mockito.cglib.proxy.MethodProxy"));
        Object createInfo = createInstance("org.mockito.cglib.proxy.MethodProxy$CreateInfo");
        setField(methodProxy1, "org.mockito.cglib.proxy.MethodProxy", "createInfo", createInfo);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "methodProxy", methodProxy1);
        setField(realMethod3, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(realMethod2, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod3);
        setField(realMethod1, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod2);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    
    @Test(expected = NullPointerException.class)
    public void testCallRealMethod6() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        FilteredCGLIBProxyRealMethod realMethod = ((FilteredCGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod"));
        CGLIBProxyRealMethod realMethod1 = ((CGLIBProxyRealMethod) createInstance("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod"));
        SerializableMockitoMethodProxy methodProxy = ((SerializableMockitoMethodProxy) createInstance("org.mockito.internal.creation.SerializableMockitoMethodProxy"));
        String name = "";
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "name", name);
        setField(methodProxy, "org.mockito.internal.creation.SerializableMockitoMethodProxy", "superName", name);
        setField(realMethod1, "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", "methodProxy", methodProxy);
        setField(realMethod, "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod", "realMethod", realMethod1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "realMethod", realMethod);
        
        invocation.callRealMethod();
    }
    ///endregion
    
    ///region Errors report for callRealMethod
    
    public void testCallRealMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 7 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.getRawArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRawArguments()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#getRawArguments()}
 * @utbot.returnsFrom {@code return this.rawArguments;}
 *  */
    @Test
    public void testGetRawArguments_ReturnThisRawArguments() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] rawArguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "rawArguments", rawArguments);
        
        java.lang.Object[] actual = invocation.getRawArguments();
        
        int rawArgumentsSize = rawArguments.length;
        assertEquals(rawArgumentsSize, actual.length);
        assertTrue(deepEquals(rawArguments, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.argumentsToMatchers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method argumentsToMatchers()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#argumentsToMatchers()}
 * @utbot.returnsFrom {@code return matchers;}
 *  */
    @Test
    public void testArgumentsToMatchers_ReturnMatchers() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        ArrayList actual = ((ArrayList) invocation.argumentsToMatchers());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#argumentsToMatchers()}
 * @utbot.iterates iterate the loop {@code for(Object arg: arguments)} once
 * @utbot.returnsFrom {@code return matchers;}
 *  */
    @Test
    public void testArgumentsToMatchers_ArgEqualsNull() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        ArrayList actual = ((ArrayList) invocation.argumentsToMatchers());
        
        ArrayList expected = new ArrayList();
        Equals equals = new Equals(null);
        expected.add(equals);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#argumentsToMatchers()}
 * @utbot.iterates iterate the loop {@code for(Object arg: arguments)} once
 * @utbot.returnsFrom {@code return matchers;}
 *  */
    @Test
    public void testArgumentsToMatchers_ArgGetClassIsArray() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        ArrayList actual = ((ArrayList) invocation.argumentsToMatchers());
        
        ArrayList expected = new ArrayList();
        Equals equals = new Equals(null);
        expected.add(equals);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method argumentsToMatchers()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#argumentsToMatchers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Matcher> matchers = new ArrayList<Matcher>(arguments.length);
 *  */
    @Test
    public void testArgumentsToMatchers_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.argumentsToMatchers] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.argumentsToMatchers(Invocation.java:138) */
        invocation.argumentsToMatchers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.printMethodReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printMethodReturnType()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#printMethodReturnType()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.returnsFrom {@code return method.getReturnType().getSimpleName();}
 *  */
    @Test
    public void testPrintMethodReturnType_ClassGetSimpleName() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        Class returnType = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType", returnType);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        MockitoMethod invocationMethod = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        Class initialInvocationMethodReturnType = ((Class) getFieldValue(invocationMethod, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType"));
        
        String actual = invocation.printMethodReturnType();
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        MockitoMethod invocationMethod1 = ((MockitoMethod) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "method"));
        Class finalInvocationMethodReturnType = ((Class) getFieldValue(invocationMethod1, "org.mockito.internal.invocation.SerializableMockitoMethod", "returnType"));
        
        assertFalse(initialInvocationMethodReturnType == finalInvocationMethodReturnType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printMethodReturnType()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#printMethodReturnType()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getReturnType().getSimpleName();
 *  */
    @Test
    public void testPrintMethodReturnType_ThrowNullPointerException() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.printMethodReturnType] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.printMethodReturnType(Invocation.java:178) */
        invocation.printMethodReturnType();
    }
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#printMethodReturnType()}
 * @utbot.invokes {@link org.mockito.internal.invocation.MockitoMethod#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getReturnType().getSimpleName();
 *  */
    @Test
    public void testPrintMethodReturnType_ThrowNullPointerException_1() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMockitoMethod method = ((SerializableMockitoMethod) createInstance("org.mockito.internal.invocation.SerializableMockitoMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        
        /* This test fails because method [org.mockito.internal.invocation.Invocation.printMethodReturnType] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.printMethodReturnType(Invocation.java:178) */
        invocation.printMethodReturnType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.markVerifiedInOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markVerifiedInOrder()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#markVerifiedInOrder()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#markVerified()}
 *  */
    @Test
    public void testMarkVerifiedInOrder_InvocationMarkVerified() throws Exception  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        
        invocation.markVerifiedInOrder();
        
        boolean finalInvocationVerified = ((Boolean) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "verified"));
        boolean finalInvocationVerifiedInOrder = ((Boolean) getFieldValue(invocation, "org.mockito.internal.invocation.Invocation", "verifiedInOrder"));
        
        assertTrue(finalInvocationVerified);
        
        assertTrue(finalInvocationVerifiedInOrder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.Invocation.qualifiedMethodName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method qualifiedMethodName()
    
    /**
    @utbot.classUnderTest {@link Invocation}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.Invocation#qualifiedMethodName()}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#getMockName(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: return new MockUtil().getMockName(mock) + "." + method.getName();
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testQualifiedMethodName_ThrowIllegalAccessError() throws Throwable  {
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        short[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        
        Class invocationClazz = Class.forName("org.mockito.internal.invocation.Invocation");
        Method qualifiedMethodNameMethod = invocationClazz.getDeclaredMethod("qualifiedMethodName");
        qualifiedMethodNameMethod.setAccessible(true);
        java.lang.Object[] qualifiedMethodNameMethodArguments = new java.lang.Object[0];
        try {
            qualifiedMethodNameMethod.invoke(invocation, qualifiedMethodNameMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1129306473112700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1129306473112700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1129306473121800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1129306473112700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1129306473121800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1129306473527800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1129306473527800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1129306473529800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1129306473527800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1129306473529800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

