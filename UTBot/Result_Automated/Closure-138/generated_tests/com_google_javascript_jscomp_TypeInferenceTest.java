package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_TypeInferenceTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseCatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", scriptOrFnNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = scriptOrFnNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node name = n.getFirstChild();
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:465) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = ((Object) null);
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name.setJSType(type);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:467) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#redeclare(com.google.javascript.jscomp.FlowScope,java.lang.String,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: redeclare(scope, name.getString(), type);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[35] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclare(TypeInference.java:1192)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:468) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", scriptOrFnNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = scriptOrFnNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: redeclare(scope, name.getString(), type);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseCatch_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", functionNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = functionNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: redeclare(scope, name.getString(), type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseCatch_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", functionNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = functionNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.createEntryLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createEntryLattice()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#createEntryLattice()}
 * @utbot.returnsFrom {@code return functionScope;}
 *  */
    @Test
    public void testCreateEntryLattice_ReturnFunctionScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope functionScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "functionScope", functionScope);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.createEntryLattice());
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(functionScope, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.flowThrough
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (input == bottomScope): True}
 * @utbot.returnsFrom {@code return input;}
 *  */
    @Test
    public void testFlowThrough_InputEqualsBottomScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        FlowScope actual = typeInference.flowThrough(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (input == bottomScope): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope output = input.createChildFlowScope();
 *  */
    @Test
    public void testFlowThrough_ThrowNullPointerException() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope bottomScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "bottomScope", bottomScope);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:172) */
        typeInference.flowThrough(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", nodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = ((Object) null);
        traverseMethodArguments[1] = ((Object) null);
        try {
            traverseMethod.invoke(typeInference, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.FlowScope#getTypeOfThis()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.THIS}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(scope.getTypeOfThis());
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", nodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = node;
        traverseMethodArguments[1] = ((Object) null);
        try {
            traverseMethod.invoke(typeInference, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.branchedFlowThrough
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method branchedFlowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#branchedFlowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#getCfg()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<DiGraphEdge<Node, Branch>> branchEdges = getCfg().getOutEdges(source);
 *  */
    @Test
    public void testBranchedFlowThrough_ThrowNullPointerException() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.branchedFlowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.branchedFlowThrough(TypeInference.java:190) */
        typeInference.branchedFlowThrough(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseArrayLiteral
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseArrayLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverseChildren(n, scope);
 *  */
    @Test
    public void testTraverseArrayLiteral_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:923)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:656) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", nodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = ((Object) null);
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseArrayLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(ARRAY_TYPE));
 *  */
    @Test
    public void testTraverseArrayLiteral_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", nodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = node;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 *  */
    @Test
    public void testUpdateScopeForTypeChange_NodeGetType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(-255);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = node;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = noType;
        updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(left.getType())
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:492) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = noType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(varName);
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:495) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = noType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = left.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateScopeForTypeChange_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = node;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = noType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = left.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateScopeForTypeChange_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, functionNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = functionNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = noType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(resultType);
 *  */
    @Test(expected = NullPointerException.class)
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = ((Object) null);
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDefined
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:542) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:542) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = ((Object) null);
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:542) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:542) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", functionNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = functionNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:542) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 *  */
    @Test
    public void testGetBooleanOutcomePair_TypeInferenceGetBooleanOutcomes() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        
        BooleanLiteralSet initialBooleanOutcomePair1ToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        Object actual = getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes2 = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes2);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes2);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
        BooleanLiteralSet finalBooleanOutcomePair1ToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        
        assertFalse(initialBooleanOutcomePair1ToBooleanOutcomes == finalBooleanOutcomePair1ToBooleanOutcomes);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1094) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = ((Object) null);
        getBooleanOutcomePairMethodArguments[1] = ((Object) null);
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1097) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1097) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1097) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1094) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = ((Object) null);
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getAssignedOuterLocalVars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAssignedOuterLocalVars()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getAssignedOuterLocalVars()}
 * @utbot.returnsFrom {@code return assignedOuterLocalVars;}
 *  */
    @Test
    public void testGetAssignedOuterLocalVars_ReturnAssignedOuterLocalVars() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Multimap actual = typeInference.getAssignedOuterLocalVars();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1010) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.createChildFlowScope()
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = node;
        traverseShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseWithinShortCircuitingBinOp(left, scope.createChildFlowScope())
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = node;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseWithinShortCircuitingBinOp(left, scope.createChildFlowScope())
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = node;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.returnsFrom {@code return new BooleanOutcomePair(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, flowScope, flowScope);}
 *  */
    @Test
    public void testNewBooleanOutcomePair_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", jSTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = ((Object) null);
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        Object actual = newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", unknownTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = unknownType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testNewBooleanOutcomePair1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[0] = ((JSType) namedType);
        nativeTypes[1] = ((JSType) namedType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        JSTypeRegistry registry1 = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes1 = {null};
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes[2] = ((JSType) anonymousFunctionType);
        nativeTypes[3] = ((JSType) namedType);
        nativeTypes[4] = ((JSType) namedType);
        nativeTypes[5] = ((JSType) namedType);
        nativeTypes[6] = ((JSType) namedType);
        nativeTypes[7] = ((JSType) namedType);
        nativeTypes[8] = ((JSType) namedType);
        nativeTypes[9] = ((JSType) namedType);
        nativeTypes[10] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, linkedFlowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = linkedFlowScope;
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNewBooleanOutcomePair2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[2] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:156)
            com.google.javascript.rhino.jstype.NamedType.isSubtype(NamedType.java:79)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, linkedFlowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = linkedFlowScope;
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNewBooleanOutcomePair3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[0] = ((JSType) namedType);
        nativeTypes[1] = ((JSType) namedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry1 = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes1 = new com.google.javascript.rhino.jstype.JSType[15];
        nativeTypes1[0] = ((JSType) namedType);
        nativeTypes1[1] = ((JSType) namedType);
        nativeTypes1[2] = ((JSType) namedType);
        nativeTypes1[3] = ((JSType) namedType);
        nativeTypes1[4] = ((JSType) namedType);
        nativeTypes1[5] = ((JSType) namedType);
        nativeTypes1[6] = ((JSType) namedType);
        nativeTypes1[7] = ((JSType) namedType);
        nativeTypes1[8] = ((JSType) namedType);
        nativeTypes1[9] = ((JSType) namedType);
        nativeTypes1[10] = ((JSType) namedType);
        nativeTypes1[11] = ((JSType) namedType);
        nativeTypes1[12] = ((JSType) namedType);
        nativeTypes1[13] = ((JSType) namedType);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes1[14] = ((JSType) functionType1);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes1);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes[2] = ((JSType) functionType);
        nativeTypes[3] = ((JSType) namedType);
        nativeTypes[4] = ((JSType) namedType);
        nativeTypes[5] = ((JSType) namedType);
        nativeTypes[6] = ((JSType) namedType);
        nativeTypes[7] = ((JSType) namedType);
        nativeTypes[8] = ((JSType) namedType);
        nativeTypes[9] = ((JSType) namedType);
        nativeTypes[10] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNewBooleanOutcomePair4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[19];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[2] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(ProxyObjectType.java:156)
            com.google.javascript.rhino.jstype.NamedType.isSubtype(NamedType.java:79)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", unknownTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = unknownType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNewBooleanOutcomePair5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[2] = ((JSType) errorFunctionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:748)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1183) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", unknownTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = unknownType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclared(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:590) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", scriptOrFnNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = scriptOrFnNode;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:590) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = ((Object) null);
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:590) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = node;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:590) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = node;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:590) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", functionNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = functionNode;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclared(com.google.javascript.rhino.Node)
    
    @Test
    public void testEnsurePropertyDeclared1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = node;
        ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensurePropertyDeclared(com.google.javascript.rhino.Node)
    
    @Test
    public void testEnsurePropertyDeclared2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        LinkedHashSet alternates = new LinkedHashSet();
        setField(jsType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:157)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:218)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:590) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = node;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateTypeOfParametersOnClosure
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateTypeOfParametersOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParametersOnClosure(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node iParameter: fnType.getParameters())
 *  */
    @Test
    public void testUpdateTypeOfParametersOnClosure_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParametersOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParametersOnClosure(TypeInference.java:786) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParametersOnClosure", nodeType, functionTypeType);
        updateTypeOfParametersOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfParametersOnClosureMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersOnClosureMethod.invoke(typeInference, updateTypeOfParametersOnClosureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateTypeOfParametersOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfParametersOnClosure1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParametersOnClosure", stringNodeType, functionTypeType);
        updateTypeOfParametersOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersOnClosureMethodArguments[0] = stringNode;
        updateTypeOfParametersOnClosureMethodArguments[1] = functionType;
        updateTypeOfParametersOnClosureMethod.invoke(typeInference, updateTypeOfParametersOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParametersOnClosure2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParametersOnClosure", functionNodeType, functionTypeType);
        updateTypeOfParametersOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersOnClosureMethodArguments[0] = functionNode;
        updateTypeOfParametersOnClosureMethodArguments[1] = functionType;
        updateTypeOfParametersOnClosureMethod.invoke(typeInference, updateTypeOfParametersOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParametersOnClosure3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParametersOnClosure", nodeType, functionTypeType);
        updateTypeOfParametersOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfParametersOnClosureMethodArguments[1] = functionType;
        updateTypeOfParametersOnClosureMethod.invoke(typeInference, updateTypeOfParametersOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParametersOnClosure4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParametersOnClosure", nodeType, functionTypeType);
        updateTypeOfParametersOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersOnClosureMethodArguments[0] = node;
        updateTypeOfParametersOnClosureMethodArguments[1] = functionType;
        updateTypeOfParametersOnClosureMethod.invoke(typeInference, updateTypeOfParametersOnClosureMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseObjectLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getJSType() != null): True}
 *  */
    @Test
    public void testTraverseObjectLiteral_NGetJSTypeNotEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", scriptOrFnNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = scriptOrFnNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getJSType() != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createAnonymousObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testTraverseObjectLiteral_NGetJSTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        JSType initialFunctionNodeJsType = ((JSType) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "jsType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", functionNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = functionNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        JSTypeRegistry typeInferenceRegistry1 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes1 = ((JSType) get(typeInferenceRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry typeInferenceRegistry2 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes2 = ((JSType) get(typeInferenceRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry typeInferenceRegistry3 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes3 = ((JSType) get(typeInferenceRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry typeInferenceRegistry4 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes4 = ((JSType) get(typeInferenceRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry typeInferenceRegistry5 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes5 = ((JSType) get(typeInferenceRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry typeInferenceRegistry6 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes6 = ((JSType) get(typeInferenceRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry typeInferenceRegistry7 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes7 = ((JSType) get(typeInferenceRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry typeInferenceRegistry8 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes8 = ((JSType) get(typeInferenceRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry typeInferenceRegistry9 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes9 = ((JSType) get(typeInferenceRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry typeInferenceRegistry10 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes10 = ((JSType) get(typeInferenceRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry typeInferenceRegistry11 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes11 = ((JSType) get(typeInferenceRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry typeInferenceRegistry12 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes12 = ((JSType) get(typeInferenceRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry typeInferenceRegistry13 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes13 = ((JSType) get(typeInferenceRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry typeInferenceRegistry14 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes14 = ((JSType) get(typeInferenceRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry typeInferenceRegistry15 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes15 = ((JSType) get(typeInferenceRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry typeInferenceRegistry16 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes16 = ((JSType) get(typeInferenceRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry typeInferenceRegistry17 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes17 = ((JSType) get(typeInferenceRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry typeInferenceRegistry18 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes18 = ((JSType) get(typeInferenceRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry typeInferenceRegistry19 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes19 = ((JSType) get(typeInferenceRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry typeInferenceRegistry20 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes20 = ((JSType) get(typeInferenceRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry typeInferenceRegistry21 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes21 = ((JSType) get(typeInferenceRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry typeInferenceRegistry22 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes22 = ((JSType) get(typeInferenceRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry typeInferenceRegistry23 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes23 = ((JSType) get(typeInferenceRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry typeInferenceRegistry24 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes24 = ((JSType) get(typeInferenceRegistry24RegistryNativeTypes, 24));
        
        JSType finalFunctionNodeJsType = ((JSType) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "jsType"));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
        
        assertNull(finalTypeInferenceRegistryNativeTypes2);
        
        assertNull(finalTypeInferenceRegistryNativeTypes3);
        
        assertNull(finalTypeInferenceRegistryNativeTypes4);
        
        assertNull(finalTypeInferenceRegistryNativeTypes5);
        
        assertNull(finalTypeInferenceRegistryNativeTypes6);
        
        assertNull(finalTypeInferenceRegistryNativeTypes7);
        
        assertNull(finalTypeInferenceRegistryNativeTypes8);
        
        assertNull(finalTypeInferenceRegistryNativeTypes9);
        
        assertNull(finalTypeInferenceRegistryNativeTypes10);
        
        assertNull(finalTypeInferenceRegistryNativeTypes11);
        
        assertNull(finalTypeInferenceRegistryNativeTypes12);
        
        assertNull(finalTypeInferenceRegistryNativeTypes13);
        
        assertNull(finalTypeInferenceRegistryNativeTypes14);
        
        assertNull(finalTypeInferenceRegistryNativeTypes15);
        
        assertNull(finalTypeInferenceRegistryNativeTypes16);
        
        assertNull(finalTypeInferenceRegistryNativeTypes17);
        
        assertNull(finalTypeInferenceRegistryNativeTypes18);
        
        assertNull(finalTypeInferenceRegistryNativeTypes19);
        
        assertNull(finalTypeInferenceRegistryNativeTypes20);
        
        assertNull(finalTypeInferenceRegistryNativeTypes21);
        
        assertNull(finalTypeInferenceRegistryNativeTypes22);
        
        assertNull(finalTypeInferenceRegistryNativeTypes23);
        
        assertNull(finalTypeInferenceRegistryNativeTypes24);
        
        assertFalse(initialFunctionNodeJsType == finalFunctionNodeJsType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getJSType() != null
 *  */
    @Test
    public void testTraverseObjectLiteral_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:662) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = ((Object) null);
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getJSType() != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createAnonymousObjectType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = registry.createAnonymousObjectType();
 *  */
    @Test
    public void testTraverseObjectLiteral_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseObjectLiteral1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:90)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createObjectType(JSTypeRegistry.java:1055)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createAnonymousObjectType(JSTypeRegistry.java:1062)
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = node;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseObjectLiteral2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @784e262f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:90)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createObjectType(JSTypeRegistry.java:1055)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createAnonymousObjectType(JSTypeRegistry.java:1062)
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", numberNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = numberNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseObjectLiteral3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:673) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverseWithinShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = ((Object) null);
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(4);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(114);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(105);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(21);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(20);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(86);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(110);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(15);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(85);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(29);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(40);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(83);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(63);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(35);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(120);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(130);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(30);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(37);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1079) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(100);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1079) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(101);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1076) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(101);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1076) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1079) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp25() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:415)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:164)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1079) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp26() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(101);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:415)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:164)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1076) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseWithinShortCircuitingBinOp27() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = node;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfThisOnClosure(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeName()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testUpdateTypeOfThisOnClosure_FunctionTypeGetTemplateTypeName() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, functionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = functionType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfThisOnClosure(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeName() == null
 *  */
    @Test
    public void testUpdateTypeOfThisOnClosure_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure(TypeInference.java:815) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, functionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfThisOnClosure1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String templateTypeName = "";
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, functionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = functionType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfThisOnClosure2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, functionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = ((Object) null);
        updateTypeOfThisOnClosureMethodArguments[1] = functionType;
        updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateTypeOfThisOnClosure(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfThisOnClosure3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        String templateTypeName = "";
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.updateTypeOfThisOnClosure(TypeInference.java:822) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfThisOnClosureMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfThisOnClosure", nodeType, functionTypeType);
        updateTypeOfThisOnClosureMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfThisOnClosureMethodArguments = new java.lang.Object[2];
        updateTypeOfThisOnClosureMethodArguments[0] = node;
        updateTypeOfThisOnClosureMethodArguments[1] = functionType;
        try {
            updateTypeOfThisOnClosureMethod.invoke(typeInference, updateTypeOfThisOnClosureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (qName != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_QNameEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:602) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = ((Object) null);
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:602) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (qName != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(qName);
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:605) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qName = getprop.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testEnsurePropertyDeclaredHelper1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testEnsurePropertyDeclaredHelper2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1678)
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1678)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:603) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsurePropertyDeclaredHelper3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", scriptOrFnNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = scriptOrFnNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.createInitialEstimateLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInitialEstimateLattice()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#createInitialEstimateLattice()}
 * @utbot.returnsFrom {@code return bottomScope;}
 *  */
    @Test
    public void testCreateInitialEstimateLattice_ReturnBottomScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope bottomScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "bottomScope", bottomScope);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.createInitialEstimateLattice());
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(bottomScope, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.isAddedAsNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createUnionType(com.google.javascript.rhino.jstype.JSTypeNative[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return type.isSubtype(registry.createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE, BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE));
 *  */
    @Test
    public void testIsAddedAsNumber_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:791)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type.isSubtype(registry.createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE, BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE));
 *  */
    @Test
    public void testIsAddedAsNumber_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testIsAddedAsNumber1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[0] = ((JSType) namedType);
        nativeTypes[1] = ((JSType) namedType);
        nativeTypes[2] = ((JSType) namedType);
        nativeTypes[3] = ((JSType) namedType);
        nativeTypes[4] = ((JSType) namedType);
        nativeTypes[5] = ((JSType) namedType);
        nativeTypes[6] = ((JSType) namedType);
        nativeTypes[7] = ((JSType) namedType);
        nativeTypes[8] = ((JSType) namedType);
        nativeTypes[9] = ((JSType) namedType);
        nativeTypes[10] = ((JSType) namedType);
        nativeTypes[11] = ((JSType) namedType);
        nativeTypes[12] = ((JSType) namedType);
        nativeTypes[13] = ((JSType) namedType);
        nativeTypes[14] = ((JSType) namedType);
        nativeTypes[15] = ((JSType) namedType);
        nativeTypes[16] = ((JSType) namedType);
        nativeTypes[17] = ((JSType) namedType);
        nativeTypes[18] = ((JSType) namedType);
        nativeTypes[19] = ((JSType) namedType);
        nativeTypes[20] = ((JSType) namedType);
        nativeTypes[21] = ((JSType) namedType);
        nativeTypes[22] = ((JSType) namedType);
        nativeTypes[23] = ((JSType) namedType);
        nativeTypes[24] = ((JSType) namedType);
        nativeTypes[25] = ((JSType) namedType);
        nativeTypes[26] = ((JSType) namedType);
        nativeTypes[27] = ((JSType) namedType);
        nativeTypes[28] = ((JSType) namedType);
        nativeTypes[29] = ((JSType) namedType);
        nativeTypes[30] = ((JSType) namedType);
        nativeTypes[31] = ((JSType) namedType);
        nativeTypes[32] = ((JSType) namedType);
        nativeTypes[33] = ((JSType) namedType);
        nativeTypes[34] = ((JSType) namedType);
        nativeTypes[35] = ((JSType) namedType);
        nativeTypes[36] = ((JSType) namedType);
        nativeTypes[37] = ((JSType) namedType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[38] = ((JSType) unknownType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 41 out of bounds for length 39]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:791)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsAddedAsNumber2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        LinkedHashSet alternates = new LinkedHashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[38] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:88)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:791)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsAddedAsNumber3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[0] = ((JSType) namedType);
        nativeTypes[1] = ((JSType) namedType);
        nativeTypes[2] = ((JSType) namedType);
        nativeTypes[3] = ((JSType) namedType);
        nativeTypes[4] = ((JSType) namedType);
        nativeTypes[5] = ((JSType) namedType);
        nativeTypes[6] = ((JSType) namedType);
        nativeTypes[7] = ((JSType) namedType);
        nativeTypes[8] = ((JSType) namedType);
        nativeTypes[9] = ((JSType) namedType);
        nativeTypes[10] = ((JSType) namedType);
        nativeTypes[11] = ((JSType) namedType);
        nativeTypes[12] = ((JSType) namedType);
        nativeTypes[13] = ((JSType) namedType);
        nativeTypes[14] = ((JSType) namedType);
        nativeTypes[15] = ((JSType) namedType);
        nativeTypes[16] = ((JSType) namedType);
        nativeTypes[17] = ((JSType) namedType);
        nativeTypes[18] = ((JSType) namedType);
        nativeTypes[19] = ((JSType) namedType);
        nativeTypes[20] = ((JSType) namedType);
        nativeTypes[21] = ((JSType) namedType);
        nativeTypes[22] = ((JSType) namedType);
        nativeTypes[23] = ((JSType) namedType);
        nativeTypes[24] = ((JSType) namedType);
        nativeTypes[25] = ((JSType) namedType);
        nativeTypes[26] = ((JSType) namedType);
        nativeTypes[27] = ((JSType) namedType);
        nativeTypes[28] = ((JSType) namedType);
        nativeTypes[29] = ((JSType) namedType);
        nativeTypes[30] = ((JSType) namedType);
        nativeTypes[31] = ((JSType) namedType);
        nativeTypes[32] = ((JSType) namedType);
        nativeTypes[33] = ((JSType) namedType);
        nativeTypes[34] = ((JSType) namedType);
        nativeTypes[35] = ((JSType) namedType);
        nativeTypes[36] = ((JSType) namedType);
        nativeTypes[37] = ((JSType) namedType);
        Object indexedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        nativeTypes[38] = ((JSType) indexedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:96)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:107)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:791)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsAddedAsNumber4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[38] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:88)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:791)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAssign
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAssign(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAssign_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:473) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", nodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = ((Object) null);
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseAssign1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(25);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(4);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:478) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(43);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(32);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(101);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(98);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:478) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(35);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(21);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(83);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAssign23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(110);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:475) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", scriptOrFnNodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = scriptOrFnNode;
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseCall
    
    ///region OTHER: ERROR SUITE for method traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseCall1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:383)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:129)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, linkedFlowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = linkedFlowScope;
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(21);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(107);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(9);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(28);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(98);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(52);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(110);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(83);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(49);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(35);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:923)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:763) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = ((Object) null);
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseCall20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", stringNodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = stringNode;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseCall21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseCallMethod = typeInferenceClazz.getDeclaredMethod("traverseCall", nodeType, flowScopeType);
        traverseCallMethod.setAccessible(true);
        java.lang.Object[] traverseCallMethodArguments = new java.lang.Object[2];
        traverseCallMethodArguments[0] = node;
        traverseCallMethodArguments[1] = ((Object) null);
        try {
            traverseCallMethod.invoke(typeInference, traverseCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAdd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAdd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:690) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", nodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = ((Object) null);
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAdd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node right = left.getNext();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseAdd1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:383)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:129)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, linkedFlowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = linkedFlowScope;
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(25);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(44);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(32);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(21);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(49);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:695) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(35);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(98);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:695) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(28);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(110);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAdd22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(83);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:692) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseAdd23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", scriptOrFnNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = scriptOrFnNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseHook
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node condition = n.getFirstChild();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:729) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", nodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = ((Object) null);
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node trueNode = condition.getNext();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseHook1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(32);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(44);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(97);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(4);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:738) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(101);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(21);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(28);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:738) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseHook16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:734) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseHook17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", scriptOrFnNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = scriptOrFnNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String varName = n.getString();
 *  */
    @Test
    public void testTraverseName_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:622) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = ((Object) null);
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.FlowScope#getSlot(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(varName);
 *  */
    @Test
    public void testTraverseName_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:631) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = n.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseName_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", scriptOrFnNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = scriptOrFnNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String varName = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseName_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", scriptOrFnNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = scriptOrFnNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseName1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(101);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(27);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:383)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:129)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(12);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(35);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(21);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(98);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(32);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:628) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(65);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:628) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseName22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:491)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:149)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:631) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, linkedFlowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = linkedFlowScope;
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseGetProp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node objNode = n.getFirstChild();
 *  */
    @Test
    public void testTraverseGetProp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:943) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", nodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = ((Object) null);
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseGetProp1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:383)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:129)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, linkedFlowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = linkedFlowScope;
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(93);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(98);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(35);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(4);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(18);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(43);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(32);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(83);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetProp22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(110);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:945) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", scriptOrFnNodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = scriptOrFnNode;
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseGetElem
    
    ///region OTHER: ERROR SUITE for method traverseGetElem(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseGetElem1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(22);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(4);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(51);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(65);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(110);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseGetElem12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(35);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:932)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:416)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:930) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseGetElemMethod = typeInferenceClazz.getDeclaredMethod("traverseGetElem", nodeType, flowScopeType);
        traverseGetElemMethod.setAccessible(true);
        java.lang.Object[] traverseGetElemMethodArguments = new java.lang.Object[2];
        traverseGetElemMethodArguments[0] = node;
        traverseGetElemMethodArguments[1] = ((Object) null);
        try {
            traverseGetElemMethod.invoke(typeInference, traverseGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testTraverseChildren_ReturnScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node el = n.getFirstChild(); el != null; el = el.getNext())
 *  */
    @Test
    public void testTraverseChildren_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:923) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", nodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = ((Object) null);
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseChildren1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(48);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTraverseChildren2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTraverseChildren3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(49);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseChildren4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:383)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:129)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, linkedFlowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = linkedFlowScope;
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(93);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:766)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:311)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(98);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:730)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:303)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(101);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:293)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(27);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(14);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(32);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:395)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(65);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:383)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:298)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(85);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:389)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(110);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:427)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:924) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseChildren24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", scriptOrFnNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = scriptOrFnNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAnd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1010)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = ((Object) null);
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test
    public void testTraverseAnd1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:477)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:281)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(103);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:378)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:657)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(16);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:412)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(93);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:691)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(42);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:383)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:129)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:40)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:350)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(4);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1022)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(120);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:466)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:437)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:948)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:289)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:668)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:307)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:421)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:279)
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:895)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:315)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1082)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1022)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:919) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseAnd15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = node;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.dereferencePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_NGetTypeNotEqualsTokenNAME() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", scriptOrFnNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = scriptOrFnNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testDereferencePointer_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:958) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", functionNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = functionNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.NAME
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:957) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = ((Object) null);
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209)
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:958) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", scriptOrFnNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = scriptOrFnNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType narrowed = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:959) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", functionNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = functionNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#get(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#intersection(com.google.javascript.rhino.jstype.BooleanLiteralSet)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#union(com.google.javascript.rhino.jstype.BooleanLiteralSet)}
 * @utbot.returnsFrom {@code return right.union(left.intersection(BooleanLiteralSet.get(!condition)));}
 *  */
    @Test
    public void testGetBooleanOutcomes_RightUnion() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.BOTH;
        
        BooleanLiteralSet actual = TypeInference.getBooleanOutcomes(booleanLiteralSet, booleanLiteralSet, true);
        
        assertEquals(booleanLiteralSet, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_2() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.TRUE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_3() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.EMPTY;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_4() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.FALSE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115) */
        TypeInference.getBooleanOutcomes(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_1() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115) */
        TypeInference.getBooleanOutcomes(null, null, true);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypeInference}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
     */
    @Test
    public void testGetBooleanOutcomesThrowsNPE() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.FALSE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1115) */
        TypeInference.getBooleanOutcomes(null, booleanLiteralSet, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseOr
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseOr(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1016)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = node;
        traverseOrMethodArguments[1] = ((Object) null);
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1010)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = ((Object) null);
        traverseOrMethodArguments[1] = ((Object) null);
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, linkedFlowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = node;
        traverseOrMethodArguments[1] = linkedFlowScope;
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1074)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1015)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1005) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, linkedFlowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = node;
        traverseOrMethodArguments[1] = linkedFlowScope;
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseNew
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseNew(com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseNew(com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node constructor = n.getFirstChild();
 *  */
    @Test
    public void testTraverseNew_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:894) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method traverseNewMethod = typeInferenceClazz.getDeclaredMethod("traverseNew", nodeType, flowScopeType);
        traverseNewMethod.setAccessible(true);
        java.lang.Object[] traverseNewMethodArguments = new java.lang.Object[2];
        traverseNewMethodArguments[0] = ((Object) null);
        traverseNewMethodArguments[1] = ((Object) null);
        try {
            traverseNewMethod.invoke(typeInference, traverseNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getPropertyType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:971) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = ((Object) null);
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:972) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:972) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:972) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, stringNodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = stringNode;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPropertyType_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.redeclare
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method redeclare(com.google.javascript.jscomp.FlowScope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclare(com.google.javascript.jscomp.FlowScope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): False}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unflowableVarNames.contains(varName)
 *  */
    @Test
    public void testRedeclare_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclare] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclare(TypeInference.java:1192) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class stringType = Class.forName("java.lang.String");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareMethod = typeInferenceClazz.getDeclaredMethod("redeclare", flowScopeType, stringType, templateTypeType);
        redeclareMethod.setAccessible(true);
        java.lang.Object[] redeclareMethodArguments = new java.lang.Object[3];
        redeclareMethodArguments[0] = ((Object) null);
        redeclareMethodArguments[1] = ((Object) null);
        redeclareMethodArguments[2] = templateType;
        try {
            redeclareMethod.invoke(typeInference, redeclareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclare(com.google.javascript.jscomp.FlowScope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): False}
 * @utbot.executesCondition {@code (unflowableVarNames.contains(varName)): False}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.FlowScope#inferSlotType(java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.inferSlotType(varName, varType);
 *  */
    @Test
    public void testRedeclare_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedHashSet unflowableVarNames = new LinkedHashSet();
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "unflowableVarNames", unflowableVarNames);
        String string = "";
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclare] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclare(TypeInference.java:1195) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class stringType = Class.forName("java.lang.String");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareMethod = typeInferenceClazz.getDeclaredMethod("redeclare", flowScopeType, stringType, templateTypeType);
        redeclareMethod.setAccessible(true);
        java.lang.Object[] redeclareMethodArguments = new java.lang.Object[3];
        redeclareMethodArguments[0] = ((Object) null);
        redeclareMethodArguments[1] = string;
        redeclareMethodArguments[2] = templateType;
        try {
            redeclareMethod.invoke(typeInference, redeclareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclare(com.google.javascript.jscomp.FlowScope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testRedeclare_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclare] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.redeclare(TypeInference.java:1190) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.FlowScope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareMethod = typeInferenceClazz.getDeclaredMethod("redeclare", flowScopeType, stringType, jSTypeType);
        redeclareMethod.setAccessible(true);
        java.lang.Object[] redeclareMethodArguments = new java.lang.Object[3];
        redeclareMethodArguments[0] = ((Object) null);
        redeclareMethodArguments[1] = ((Object) null);
        redeclareMethodArguments[2] = ((Object) null);
        try {
            redeclareMethod.invoke(typeInference, redeclareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.returnsFrom {@code return getNativeType(UNKNOWN_TYPE);}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        JSTypeRegistry typeInferenceRegistry1 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes1 = ((JSType) get(typeInferenceRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry typeInferenceRegistry2 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes2 = ((JSType) get(typeInferenceRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry typeInferenceRegistry3 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes3 = ((JSType) get(typeInferenceRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry typeInferenceRegistry4 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes4 = ((JSType) get(typeInferenceRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry typeInferenceRegistry5 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes5 = ((JSType) get(typeInferenceRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry typeInferenceRegistry6 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes6 = ((JSType) get(typeInferenceRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry typeInferenceRegistry7 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes7 = ((JSType) get(typeInferenceRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry typeInferenceRegistry8 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes8 = ((JSType) get(typeInferenceRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry typeInferenceRegistry9 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes9 = ((JSType) get(typeInferenceRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry typeInferenceRegistry10 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes10 = ((JSType) get(typeInferenceRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry typeInferenceRegistry11 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes11 = ((JSType) get(typeInferenceRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry typeInferenceRegistry12 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes12 = ((JSType) get(typeInferenceRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry typeInferenceRegistry13 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes13 = ((JSType) get(typeInferenceRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry typeInferenceRegistry14 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes14 = ((JSType) get(typeInferenceRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry typeInferenceRegistry15 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes15 = ((JSType) get(typeInferenceRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry typeInferenceRegistry16 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes16 = ((JSType) get(typeInferenceRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry typeInferenceRegistry17 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes17 = ((JSType) get(typeInferenceRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry typeInferenceRegistry18 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes18 = ((JSType) get(typeInferenceRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry typeInferenceRegistry19 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes19 = ((JSType) get(typeInferenceRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry typeInferenceRegistry20 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes20 = ((JSType) get(typeInferenceRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry typeInferenceRegistry21 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes21 = ((JSType) get(typeInferenceRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry typeInferenceRegistry22 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes22 = ((JSType) get(typeInferenceRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry typeInferenceRegistry23 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes23 = ((JSType) get(typeInferenceRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry typeInferenceRegistry24 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes24 = ((JSType) get(typeInferenceRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry typeInferenceRegistry25 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes25 = ((JSType) get(typeInferenceRegistry25RegistryNativeTypes, 25));
        JSTypeRegistry typeInferenceRegistry26 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes26 = ((JSType) get(typeInferenceRegistry26RegistryNativeTypes, 26));
        JSTypeRegistry typeInferenceRegistry27 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes27 = ((JSType) get(typeInferenceRegistry27RegistryNativeTypes, 27));
        JSTypeRegistry typeInferenceRegistry28 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes28 = ((JSType) get(typeInferenceRegistry28RegistryNativeTypes, 28));
        JSTypeRegistry typeInferenceRegistry29 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes29 = ((JSType) get(typeInferenceRegistry29RegistryNativeTypes, 29));
        JSTypeRegistry typeInferenceRegistry30 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes30 = ((JSType) get(typeInferenceRegistry30RegistryNativeTypes, 30));
        JSTypeRegistry typeInferenceRegistry31 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry31RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes31 = ((JSType) get(typeInferenceRegistry31RegistryNativeTypes, 31));
        JSTypeRegistry typeInferenceRegistry32 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry32RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes32 = ((JSType) get(typeInferenceRegistry32RegistryNativeTypes, 32));
        JSTypeRegistry typeInferenceRegistry33 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry33RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes33 = ((JSType) get(typeInferenceRegistry33RegistryNativeTypes, 33));
        JSTypeRegistry typeInferenceRegistry34 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry34RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes34 = ((JSType) get(typeInferenceRegistry34RegistryNativeTypes, 34));
        JSTypeRegistry typeInferenceRegistry35 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry35RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes35 = ((JSType) get(typeInferenceRegistry35RegistryNativeTypes, 35));
        JSTypeRegistry typeInferenceRegistry36 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry36RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes36 = ((JSType) get(typeInferenceRegistry36RegistryNativeTypes, 36));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
        
        assertNull(finalTypeInferenceRegistryNativeTypes2);
        
        assertNull(finalTypeInferenceRegistryNativeTypes3);
        
        assertNull(finalTypeInferenceRegistryNativeTypes4);
        
        assertNull(finalTypeInferenceRegistryNativeTypes5);
        
        assertNull(finalTypeInferenceRegistryNativeTypes6);
        
        assertNull(finalTypeInferenceRegistryNativeTypes7);
        
        assertNull(finalTypeInferenceRegistryNativeTypes8);
        
        assertNull(finalTypeInferenceRegistryNativeTypes9);
        
        assertNull(finalTypeInferenceRegistryNativeTypes10);
        
        assertNull(finalTypeInferenceRegistryNativeTypes11);
        
        assertNull(finalTypeInferenceRegistryNativeTypes12);
        
        assertNull(finalTypeInferenceRegistryNativeTypes13);
        
        assertNull(finalTypeInferenceRegistryNativeTypes14);
        
        assertNull(finalTypeInferenceRegistryNativeTypes15);
        
        assertNull(finalTypeInferenceRegistryNativeTypes16);
        
        assertNull(finalTypeInferenceRegistryNativeTypes17);
        
        assertNull(finalTypeInferenceRegistryNativeTypes18);
        
        assertNull(finalTypeInferenceRegistryNativeTypes19);
        
        assertNull(finalTypeInferenceRegistryNativeTypes20);
        
        assertNull(finalTypeInferenceRegistryNativeTypes21);
        
        assertNull(finalTypeInferenceRegistryNativeTypes22);
        
        assertNull(finalTypeInferenceRegistryNativeTypes23);
        
        assertNull(finalTypeInferenceRegistryNativeTypes24);
        
        assertNull(finalTypeInferenceRegistryNativeTypes25);
        
        assertNull(finalTypeInferenceRegistryNativeTypes26);
        
        assertNull(finalTypeInferenceRegistryNativeTypes27);
        
        assertNull(finalTypeInferenceRegistryNativeTypes28);
        
        assertNull(finalTypeInferenceRegistryNativeTypes29);
        
        assertNull(finalTypeInferenceRegistryNativeTypes30);
        
        assertNull(finalTypeInferenceRegistryNativeTypes31);
        
        assertNull(finalTypeInferenceRegistryNativeTypes32);
        
        assertNull(finalTypeInferenceRegistryNativeTypes33);
        
        assertNull(finalTypeInferenceRegistryNativeTypes34);
        
        assertNull(finalTypeInferenceRegistryNativeTypes35);
        
        assertNull(finalTypeInferenceRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        NamedType actual = ((NamedType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        // com.google.javascript.rhino.jstype.NamedType has overridden equals method
        assertEquals(jsType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1203) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216)
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1209) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return registry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        JSTypeRegistry typeInferenceRegistry1 = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes1 = ((JSType) get(typeInferenceRegistry1RegistryNativeTypes, 1));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
        
        assertNull(finalTypeInferenceRegistryNativeTypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return registry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return registry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1216) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields910260583361400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields910260583361400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass910260583366800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910260583361400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910260583366800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields910260583673100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields910260583673100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass910260583674700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910260583673100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910260583674700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

