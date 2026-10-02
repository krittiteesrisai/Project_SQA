package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.JSDocInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_TypedScopeCreatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrototypePropertyOwner_NGetTypeNotEqualsTokenGETPROP() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrototypePropertyOwner_FirstChildGetTypeNotEqualsTokenGETPROP() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getLastChild().getString().equals("prototype")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrototypePropertyOwner_NotFirstChildGetLastChildGetStringEquals() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", nodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = node;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.GETPROP
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:283) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", nodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = ((Object) null);
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: firstChild.getType() == Token.GETPROP && firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException_1() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:285) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException_2() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:286) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException_3() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:286) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", functionNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = functionNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPrototypePropertyOwner_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", functionNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = functionNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetPrototypePropertyOwner_ThrowIllegalStateException() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", nodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = node;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testGetPrototypePropertyOwner() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(34, Integer.MIN_VALUE, -1);
        node.setType(2147221503);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", nodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = node;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)
 *  */
    @Test
    public void testDeclareNativeValueType_TypedScopeCreatorDeclareNativeType() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = " ";
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:237) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:241)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:237) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:237) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        String string = "";
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "@";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:752)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:229) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowClassCastException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[0] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:752)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:229) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:230) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:230) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:241)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:230) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:241)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:230) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:229) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = ((Object) null);
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testDeclareNativeFunctionType1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "\u0000";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(null, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:232) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeclareNativeFunctionType2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[4] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:232) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[5];
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[4] = ((JSType) functionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[18];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        nativeTypes[8] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType5() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[33];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[8] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType6() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(className, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createScope
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: newScope = new Scope(parent, root);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateScope_ThrowIllegalArgumentException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        typedScopeCreator.createScope(null, scope);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: newScope = new Scope(parent, root);
 *  */
    @Test
    public void testCreateScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:290)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:180) */
        typedScopeCreator.createScope(scriptOrFnNode, scope);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: newScope = new Scope(parent, root);
 *  */
    @Test
    public void testCreateScope_ThrowClassCastException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:290)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:180) */
        typedScopeCreator.createScope(functionNode, scope);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(expected = RuntimeException.class)
    public void testCreateScope1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "compiler", compiler);
        
        typedScopeCreator.createScope(null, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testCreateScope2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        typedScopeCreator.createScope(functionNode, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testCreateScope3() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope4() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope5() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope6() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:305)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:197)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope7() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:305)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:197)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope8() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope9() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope10() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:305)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:197)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    
    @Test
    public void testCreateScope11() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:305)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:197)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:155) */
        typedScopeCreator.createScope(functionNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 *  */
    @Test
    public void testDeclareNativeType_ScopeDeclare() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = " ";
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test
    public void testDeclareNativeType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:241) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = ((Object) null);
        declareNativeTypeMethodArguments[1] = ((Object) null);
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = ((Object) null);
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        String string = "";
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = " ";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createInitialScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInitialScope(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195) */
        typedScopeCreator.createInitialScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195) */
        typedScopeCreator.createInitialScope(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195) */
        typedScopeCreator.createInitialScope(node);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_3() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195) */
        typedScopeCreator.createInitialScope(node);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_4() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:195) */
        typedScopeCreator.createInitialScope(node);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields910960080438600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields910960080438600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass910960080446400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910960080438600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910960080446400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields910960080856100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields910960080856100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass910960080860300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910960080856100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910960080860300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

