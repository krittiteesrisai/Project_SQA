package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.Node;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_rhino_jstype_ArrowTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(2108600228, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        int actual = arrowType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        int actual = arrowType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        int actual = arrowType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        returnType.setOwnerFunction(ownerFunction);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        int actual = arrowType.hashCode();
        
        assertEquals(-534953605, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hashCode()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (parameters != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getJSType()} once,
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.iterates iterate the loop {@code while(param != null)} once
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParamTypeNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1995203366, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.iterates iterate the loop {@code while(param != null)} once
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParamTypeEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.iterates iterate the loop {@code while(param != null)} once
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParamTypeNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#hashCode()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        String name = "";
        setField(jsType, "com.google.javascript.rhino.jstype.EnumElementType", "name", name);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1353506160, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        jsType.setOwnerFunction(ownerFunction);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        int actual = arrowType.hashCode();
        
        assertEquals(-534953605, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:839)
            com.google.javascript.rhino.jstype.ArrowType.hashCode(ArrowType.java:202) */
        arrowType.hashCode();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hashCode()
    
    @Test(timeout = 1000L)
    public void testHashCode3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrowType.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.testForEquality
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTestForEquality_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.testForEquality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.visit
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.visit(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.getLeastSupertype
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetLeastSupertype_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.getLeastSupertype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): True}
 *  */
    @Test
    public void testIsSubtype_NotOtherInstanceOfArrowType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.isSubtype(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): False}
 *  */
    @Test
    public void testIsSubtype_OtherNotInstanceOfArrowType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_OtherNotInstanceOfArrowType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_ThisParamEqualsNullAndThatParamEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !this.returnType.isSubtype(that.returnType)
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thatParam = that.parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:115) */
        arrowType.isSubtype(arrowType1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean thisIsVarArgs = thisParam.isVarArgs();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        UnresolvedTypeExpression jsType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean thisIsVarArgs = thisParam.isVarArgs();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        UnresolvedTypeExpression jsType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean thisIsVarArgs = thisParam.isVarArgs();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        arrowType.isSubtype(arrowType1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testIsSubtype1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType1.setReferencedType(referencedType);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", jsType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        AllType referencedType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsSubtype5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType1.setReferencedType(jsType);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        jsType.setReferencedType(jsType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        jsType.setReferencedType(jsType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype9() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        BooleanType returnType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype10() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoResolvedType returnType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype11() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype12() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        VoidType referencedType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype13() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.TemplateType.isSubtype(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype14() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:833)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1020)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype15() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype16() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType3 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype17() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype18() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType4 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1016)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype19() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype20() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype21() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype22() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.TemplateType.isSubtype(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype23() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype24() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype25() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType1.setReferencedType(referencedType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype26() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype27() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        EnumElementType jsType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.EnumElementType.isSubtype(EnumElementType.java:184)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.EnumElementType.isSubtype(EnumElementType.java:181)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype28() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType2 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType1.setReferencedType(referencedType2);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype29() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.EnumElementType.isSubtype(EnumElementType.java:184)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.EnumElementType.isSubtype(EnumElementType.java:181)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype30() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType2 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype31() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType3 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1016)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype32() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters1);
        UnresolvedTypeExpression jsType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.TemplateType.isSubtype(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype33() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType3 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1016)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:935)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype34() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        FunctionType jsType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.TemplateType.isSubtype(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype35() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:223)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    
    @Test
    public void testIsSubtype36() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        FunctionType jsType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:974)
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:121) */
        arrowType.isSubtype(arrowType1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype37() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype38() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters1, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype39() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters1, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType actualReturnType = actual.returnType;
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType actualReturnType = actual.returnType;
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        JSType finalArrowTypeReturnType = arrowType.returnType;
        
        assertNull(finalArrowTypeReturnType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType arrowTypeReturnType = arrowType.returnType;
        JSType actualReturnType = actual.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node arrowTypeParameters = arrowType.parameters;
        Node actualParameters = actual.parameters;
        String actualParametersStr = ((String) getFieldValue(actualParameters, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualParametersStr);
        
        int arrowTypeParametersType = arrowTypeParameters.getType();
        int actualParametersType = actualParameters.getType();
        assertEquals(arrowTypeParametersType, actualParametersType);
        
        Node actualParametersNext = actualParameters.getNext();
        assertNull(actualParametersNext);
        
        Node arrowTypeParametersFirst = ((Node) getFieldValue(arrowTypeParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualParametersFirst = ((Node) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        Node actualParametersFirstLast = ((Node) getFieldValue(actualParametersFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParametersFirstLast);
        
        Object actualParametersFirstPropListHead = getFieldValue(actualParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParametersFirstPropListHead);
        
        int arrowTypeParametersFirstSourcePosition = arrowTypeParametersFirst.getSourcePosition();
        int actualParametersFirstSourcePosition = actualParametersFirst.getSourcePosition();
        assertEquals(arrowTypeParametersFirstSourcePosition, actualParametersFirstSourcePosition);
        
        JSType arrowTypeParametersFirstJsType = ((JSType) getFieldValue(arrowTypeParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        JSType actualParametersFirstJsType = ((JSType) getFieldValue(actualParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeParametersFirstJsType, actualParametersFirstJsType);
        
        Node actualParametersFirstParent = actualParametersFirst.getParent();
        assertNull(actualParametersFirstParent);
        
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        
        JSType actualReturnType = actual.returnType;
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        EnumElementType resolveResult = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        JSType initialArrowTypeReturnType = arrowType.returnType;
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node arrowTypeParameters = arrowType.parameters;
        Node actualParameters = actual.parameters;
        String actualParametersStr = ((String) getFieldValue(actualParameters, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualParametersStr);
        
        int arrowTypeParametersType = arrowTypeParameters.getType();
        int actualParametersType = actualParameters.getType();
        assertEquals(arrowTypeParametersType, actualParametersType);
        
        Node actualParametersNext = actualParameters.getNext();
        assertNull(actualParametersNext);
        
        Node actualParametersFirst = ((Node) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParametersFirst);
        
        Node actualParametersLast = ((Node) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParametersLast);
        
        Object actualParametersPropListHead = getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParametersPropListHead);
        
        int arrowTypeParametersSourcePosition = arrowTypeParameters.getSourcePosition();
        int actualParametersSourcePosition = actualParameters.getSourcePosition();
        assertEquals(arrowTypeParametersSourcePosition, actualParametersSourcePosition);
        
        JSType actualParametersJsType = ((JSType) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParametersJsType);
        
        Node actualParametersParent = actualParameters.getParent();
        assertNull(actualParametersParent);
        
        JSType arrowTypeReturnType = arrowType.returnType;
        JSType actualReturnType = actual.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        JSType finalArrowTypeReturnType = arrowType.returnType;
        
        assertFalse(initialArrowTypeReturnType == finalArrowTypeReturnType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType arrowTypeReturnType = arrowType.returnType;
        JSType actualReturnType = actual.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        JSType jSType = arrowType.returnType;
        boolean finalArrowTypeReturnTypeResolved = ((Boolean) getFieldValue(jSType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalArrowTypeReturnTypeResolved);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1083)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:251) */
        arrowType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        EnumElementType resolveResult = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.EnumElementType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.EnumElementType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1095)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1088)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:251) */
        arrowType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1083)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1120)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1095)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1088)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:251) */
        arrowType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        EnumElementType resolveResult = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:251) */
        arrowType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.getGreatestSubtype
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetGreatestSubtype_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.getGreatestSubtype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return thisParam == otherParam;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamNotEqualsOtherParam() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsOtherParam() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsNullAndOtherParamEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getJSType()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NullType jsType1 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_OtherParamTypeNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_OtherParamTypeEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        Node node = arrowType1.parameters;
        Node nodeParametersFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        JSType nodeParametersFirstParametersFirstJsType = ((JSType) getFieldValue(nodeParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        Object initialArrowType1ParametersFirstJsTypeKind = getFieldValue(nodeParametersFirstParametersFirstJsType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
        
        Node node1 = arrowType1.parameters;
        Node node1ParametersFirst = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        JSType node1ParametersFirstParametersFirstJsType = ((JSType) getFieldValue(node1ParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        Object finalArrowType1ParametersFirstJsTypeKind = getFieldValue(node1ParametersFirstParametersFirstJsType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialArrowType1ParametersFirstJsTypeKind == finalArrowType1ParametersFirstJsTypeKind);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoResolvedType ownerFunction = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        jsType.setOwnerFunction(ownerFunction);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} twice
 *  */
    @Test
    public void testHasEqualParameters_NotThisParamTypeIsEquivalentTo_7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumElementType typeOfThis = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(jsType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(jsType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamNotEqualsOtherParam_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getJSType()} twice
    /// execute conditions:
    ///     {@code (thisParamType != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} twice
    /// return from: {@code return thisParam == otherParam;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_OtherParamTypeEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamNotEqualsOtherParam_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsNullAndOtherParamEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsOtherParam_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType ownerFunction = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        jsType.setOwnerFunction(ownerFunction);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(jsType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:161) */
        arrowType.hasEqualParameters(null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node otherParam = that.parameters.getFirstChild();
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:162) */
        arrowType.hasEqualParameters(null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node otherParam = that.parameters.getFirstChild();
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:162) */
        arrowType.hasEqualParameters(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:826)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:169) */
        arrowType.hasEqualParameters(arrowType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!(object instanceof ArrowType)): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnFalse() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.isEquivalentTo(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(object instanceof ArrowType)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_ObjectNotInstanceOfArrowType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!(object instanceof ArrowType)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.JSType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        JSType jSType = arrowType.returnType;
        Object initialArrowTypeReturnTypeKind = getFieldValue(jSType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
        
        JSType jSType1 = arrowType.returnType;
        Object finalArrowTypeReturnTypeKind = getFieldValue(jSType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialArrowTypeReturnTypeKind == finalArrowTypeReturnTypeKind);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        EnumElementType jsType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_10() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        jsType1.setReferencedType(referencedType);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsEquivalentTo_NotReturnTypeIsEquivalentTo_7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        returnType.setOwnerFunction(ownerFunction);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_9() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        jsType1.setReferencedType(referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumElementType typeOfThis = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnTypeIsEquivalentTo_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        returnType1.setOwnerFunction(ownerFunction);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isEquivalentTo(arrowType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !returnType.isEquivalentTo(that.returnType)
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo(ArrowType.java:192) */
        arrowType.isEquivalentTo(arrowType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return hasEqualParameters(that);
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(returnType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:826)
            com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo(ArrowType.java:192) */
        arrowType.isEquivalentTo(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return hasEqualParameters(that);
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumElementType typeOfThis = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ErrorFunctionType jsType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:826)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:169)
            com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo(ArrowType.java:195) */
        arrowType.isEquivalentTo(arrowType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.toStringHelper
    
    ///region OTHER: ERROR SUITE for method toStringHelper(boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testToStringHelper1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.toStringHelper(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.getPossibleToBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#getPossibleToBooleanOutcomes()}
 * @utbot.returnsFrom {@code return BooleanLiteralSet.TRUE;}
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_ReturnBooleanLiteralSetTRUE() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        BooleanLiteralSet actual = arrowType.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.TRUE;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hasUnknownParamsOrReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnknownParamsOrReturn()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeEqualsNullOrReturnTypeIsUnknownType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ProxyObjectType jsType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeEqualsNullOrReturnTypeIsUnknownType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasUnknownParamsOrReturn()
    
    @Test
    public void testHasUnknownParamsOrReturn1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        IndexedType returnType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NullType referencedType3 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType1 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NullType referencedType4 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType5 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType7 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        NoResolvedType referencedType8 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType4 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ProxyObjectType referencedType5 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        VoidType referencedType11 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType6 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NullType referencedType12 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType1 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType9 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType13 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType14 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType15 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType16 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NullType referencedType17 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        referencedType16.setReferencedType(referencedType17);
        referencedType15.setReferencedType(referencedType16);
        referencedType14.setReferencedType(referencedType15);
        referencedType13.setReferencedType(referencedType14);
        referencedType12.setReferencedType(referencedType13);
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields916431135285500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields916431135285500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass916431135290600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916431135285500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916431135290600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields916431135798100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields916431135798100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass916431135799700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916431135798100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916431135799700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

