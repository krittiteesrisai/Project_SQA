package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.InputId;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Map;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.Annotation;
import java.util.Deque;
import java.text.MessageFormat;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.JSDocInfo;
import java.text.Format;
import java.text.DecimalFormat;
import java.text.ChoiceFormat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_NodeTraversalTest {
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getInput
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInput()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getInput()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getInput(com.google.javascript.rhino.InputId)}
 * @utbot.returnsFrom {@code return compiler.getInput(inputId);}
 *  */
    @Test
    public void testGetInput_AbstractCompilerGetInput() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        
        CompilerInput actual = nodeTraversal.getInput();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInput()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getInput()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getInput(com.google.javascript.rhino.InputId)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compiler.getInput(inputId);
 *  */
    @Test
    public void testGetInput_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getInput(NodeTraversal.java:433) */
        nodeTraversal.getInput();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInput()
    
    @Test
    public void testGetInput1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        String id = "";
        setField(inputId, "com.google.javascript.rhino.InputId", "id", id);
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputsById.put(inputId, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        
        CompilerInput actual = nodeTraversal.getInput();
        
        JSModule actualModule = actual.getModule();
        assertNull(actualModule);
        
        InputId actualId = ((InputId) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "id"));
        assertNull(actualId);
        
        SourceAst actualAst = actual.getAst();
        assertNull(actualAst);
        
        Set actualProvides = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "provides"));
        assertNull(actualProvides);
        
        Set actualRequires = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "requires"));
        assertNull(actualRequires);
        
        boolean actualGeneratedDependencyInfoFromSource = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "generatedDependencyInfoFromSource"));
        assertFalse(actualGeneratedDependencyInfoFromSource);
        
        ErrorManager actualErrorManager = ((ErrorManager) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "errorManager"));
        assertNull(actualErrorManager);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "compiler"));
        assertNull(actualCompiler);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInput()
    
    @Test
    public void testGetInput2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        String id = "";
        setField(inputId, "com.google.javascript.rhino.InputId", "id", id);
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputsById.put(inputId, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        InputId inputId1 = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId1);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getInput] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.InputId.hashCode(InputId.java:61)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            com.google.javascript.jscomp.Compiler.getInput(Compiler.java:988)
            com.google.javascript.jscomp.NodeTraversal.getInput(NodeTraversal.java:433) */
        nodeTraversal.getInput();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScope()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.executesCondition {@code (scopes.isEmpty()): True}
 * @utbot.executesCondition {@code (scopeRoots.isEmpty()): True}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testGetScope_ScopeRootsIsEmpty() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Scope actual = nodeTraversal.getScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getScope()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scopes.isEmpty()
 *  */
    @Test
    public void testGetScope_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:596) */
        nodeTraversal.getScope();
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.executesCondition {@code (scopes.isEmpty()): True}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scopeRoots.isEmpty()
 *  */
    @Test
    public void testGetScope_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:597) */
        nodeTraversal.getScope();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getScope()
    
    @Test
    public void testGetScope1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Scope actual = nodeTraversal.getScope();
        
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertNull(actualVars);
        
        Scope actualParent = actual.getParent();
        assertNull(actualParent);
        
        int scopeDepth = scope.getDepth();
        int actualDepth = actual.getDepth();
        assertEquals(scopeDepth, actualDepth);
        
        Node actualRootNode = actual.getRootNode();
        assertNull(actualRootNode);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope.Var actualArguments = ((Scope.Var) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "arguments"));
        assertNull(actualArguments);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getScope()
    
    @Test
    public void testGetScope2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:603) */
        nodeTraversal.getScope();
    }
    
    @Test
    public void testGetScope3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:82)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:603) */
        nodeTraversal.getScope();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.pushScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pushScope(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(curNode != null);): True}
 * @utbot.executesCondition {@code (scopeCallback != null): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 *  */
    @Test
    public void testPushScope_ScopeCallbackEqualsNull() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", numberNodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = numberNode;
        pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pushScope(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(curNode != null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(curNode != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPushScope_ThrowIllegalStateException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", nodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pushScope(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scopeRoots.push(node);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:564) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", nodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scopeRoots.push(node);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:564) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", nodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgs.push(null);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:565) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", numberNodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = numberNode;
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgs.push(null);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException_3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ArrayDeque cfgs = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:565) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", numberNodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = numberNode;
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pushScope(com.google.javascript.rhino.Node)
    
    @Test
    public void testPushScope1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        Node curNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckUnreachableCode scopeCallback = ((CheckUnreachableCode) createInstance("com.google.javascript.jscomp.CheckUnreachableCode"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", numberNodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = numberNode;
        pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
    }
    
    @Test
    public void testPushScope2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        Node node = new Node(0);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", nodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = node;
        pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
    }
    
    @Test
    public void testPushScope3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckUnreachableCode scopeCallback = ((CheckUnreachableCode) createInstance("com.google.javascript.jscomp.CheckUnreachableCode"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", numberNodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = numberNode;
        pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pushScope(com.google.javascript.rhino.Node)
    
    @Test
    public void testPushScope4() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:170)
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:143)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:567) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", numberNodeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = numberNode;
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.pushScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pushScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (Preconditions.checkState(curNode != null);): True}
 * @utbot.executesCondition {@code (scopeCallback != null): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 *  */
    @Test
    public void testPushScope_ScopeCallbackEqualsNull1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = scope;
        pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pushScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (Preconditions.checkState(curNode != null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(curNode != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPushScope_ThrowIllegalStateException1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pushScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scopes.push(s);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:574) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scopes.push(s);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException_11() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:574) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgs.push(null);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException_21() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = scope;
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#pushScope(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link java.util.Deque#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgs.push(null);
 *  */
    @Test
    public void testPushScope_ThrowNullPointerException_31() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque cfgs = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = scope;
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pushScope(com.google.javascript.jscomp.Scope)
    
    @Test
    public void testPushScope5() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node curNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = scope;
        pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pushScope(com.google.javascript.jscomp.Scope)
    
    @Test
    public void testPushScope6() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckUnreachableCode scopeCallback = ((CheckUnreachableCode) createInstance("com.google.javascript.jscomp.CheckUnreachableCode"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:624)
            com.google.javascript.jscomp.NodeTraversal.getControlFlowGraph(NodeTraversal.java:615)
            com.google.javascript.jscomp.CheckUnreachableCode.enterScope(CheckUnreachableCode.java:48)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:577) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = scope;
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPushScope7() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node curNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.pushScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:625)
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:136)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:577) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method pushScopeMethod = nodeTraversalClazz.getDeclaredMethod("pushScope", scopeType);
        pushScopeMethod.setAccessible(true);
        java.lang.Object[] pushScopeMethodArguments = new java.lang.Object[1];
        pushScopeMethodArguments[0] = ((Object) null);
        try {
            pushScopeMethod.invoke(nodeTraversal, pushScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.popScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popScope()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#popScope()}
 * @utbot.executesCondition {@code (scopeCallback != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal.ScopedCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scopeRoots.isEmpty()
 *  */
    @Test
    public void testPopScope_ThrowNullPointerException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        CheckUnreachableCode scopeCallback = ((CheckUnreachableCode) createInstance("com.google.javascript.jscomp.CheckUnreachableCode"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:586) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#popScope()}
 * @utbot.executesCondition {@code (scopeCallback != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scopeRoots.isEmpty()
 *  */
    @Test
    public void testPopScope_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:586) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#popScope()}
 * @utbot.executesCondition {@code (scopeCallback != null): False}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scopes.pop();
 *  */
    @Test
    public void testPopScope_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:587) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#popScope()}
 * @utbot.executesCondition {@code (scopeCallback != null): False}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfgs.pop();
 *  */
    @Test
    public void testPopScope_ThrowNullPointerException_3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:591) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method popScope()
    
    @Test
    public void testPopScope1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:587) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:587) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            java.base/java.util.LinkedList.pop(LinkedList.java:805)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:587) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope4() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        scopeRoots.add(stringNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ArrayDeque cfgs = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:591) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope5() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ArrayDeque cfgs = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:591) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope6() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        LinkedList cfgs = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            java.base/java.util.LinkedList.pop(LinkedList.java:805)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:591) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope7() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        CheckUnreachableCode scopeCallback = ((CheckUnreachableCode) createInstance("com.google.javascript.jscomp.CheckUnreachableCode"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:587) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope8() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:625)
            com.google.javascript.jscomp.CheckAccessControls.exitScope(CheckAccessControls.java:152)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:584) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope9() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:591) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopScope10() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        CheckAccessControls scopeCallback = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCallback", scopeCallback);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.popScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.exitScope(CheckAccessControls.java:153)
            com.google.javascript.jscomp.NodeTraversal.popScope(NodeTraversal.java:584) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method popScopeMethod = nodeTraversalClazz.getDeclaredMethod("popScope");
        popScopeMethod.setAccessible(true);
        java.lang.Object[] popScopeMethodArguments = new java.lang.Object[0];
        try {
            popScopeMethod.invoke(nodeTraversal, popScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getCompiler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCompiler()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.returnsFrom {@code return (Compiler) compiler;}
 *  */
    @Test
    public void testGetCompiler_ReturnCompiler() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        Compiler actual = nodeTraversal.getCompiler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getModule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModule()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getModule()}
 * @utbot.returnsFrom {@code return input == null ? null : input.getModule();}
 *  */
    @Test
    public void testGetModule_ReturnInputNotEqualsNull() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        
        JSModule actual = nodeTraversal.getModule();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getModule()}
 * @utbot.returnsFrom {@code return input == null ? null : input.getModule();}
 *  */
    @Test
    public void testGetModule_ReturnInputNotEqualsNull_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        String id = "";
        setField(inputId, "com.google.javascript.rhino.InputId", "id", id);
        inputsById.put(inputId, null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        
        JSModule actual = nodeTraversal.getModule();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getModule()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerInput#getModule()}
 * @utbot.returnsFrom {@code return input == null ? null : input.getModule();}
 *  */
    @Test
    public void testGetModule_CompilerInputGetModule() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JSModule module = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        compilerInput.setModule(module);
        inputsById.put(null, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        
        JSModule actual = nodeTraversal.getModule();
        
        String actualName = actual.getName();
        assertNull(actualName);
        
        List actualInputs = actual.getInputs();
        assertNull(actualInputs);
        
        List actualDeps = ((List) getFieldValue(actual, "com.google.javascript.jscomp.JSModule", "deps"));
        assertNull(actualDeps);
        
        int moduleDepth = module.getDepth();
        int actualDepth = actual.getDepth();
        assertEquals(moduleDepth, actualDepth);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getModule()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.NodeTraversal}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getModule()}
     */
    @Test
    public void testGetModuleThrowsNPE() {
        NodeTraversal nodeTraversal = new NodeTraversal(null, null, null);
        ArrayDeque cfgs = new ArrayDeque();
        Object object = new Object();
        ControlFlowGraph controlFlowGraph = new ControlFlowGraph(object, true, false);
        cfgs.add(controlFlowGraph);
        Object object1 = new Object();
        ControlFlowGraph controlFlowGraph1 = new ControlFlowGraph(object1, true, true);
        cfgs.add(controlFlowGraph1);
        nodeTraversal.cfgs = cfgs;
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getInput(NodeTraversal.java:433)
            com.google.javascript.jscomp.NodeTraversal.getModule(NodeTraversal.java:440) */
        nodeTraversal.getModule();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getModule()
    
    @Test
    public void testGetModule1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        String id = "";
        setField(inputId, "com.google.javascript.rhino.InputId", "id", id);
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputsById.put(inputId, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        
        JSModule actual = nodeTraversal.getModule();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetModule2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        String id = "";
        setField(inputId, "com.google.javascript.rhino.InputId", "id", id);
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputsById.put(inputId, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        InputId inputId1 = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(inputId1, "com.google.javascript.rhino.InputId", "id", id);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId1);
        
        JSModule actual = nodeTraversal.getModule();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getModule()
    
    @Test
    public void testGetModule3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsById = new LinkedHashMap();
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputsById.put(null, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsById", inputsById);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getModule] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.InputId.hashCode(InputId.java:61)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            com.google.javascript.jscomp.Compiler.getInput(Compiler.java:988)
            com.google.javascript.jscomp.NodeTraversal.getInput(NodeTraversal.java:433)
            com.google.javascript.jscomp.NodeTraversal.getModule(NodeTraversal.java:440) */
        nodeTraversal.getModule();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getLineNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLineNumber()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getLineNumber()}
 * @utbot.iterates iterate the loop {@code while(cur != null)} once
 *  */
    @Test
    public void testGetLineNumber_LineGreaterOrEqualZero() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(curNode, "com.google.javascript.rhino.Node", "sourcePosition", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        
        int actual = nodeTraversal.getLineNumber();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getLineNumber()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetLineNumber_ReturnZero() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        int actual = nodeTraversal.getLineNumber();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getLineNumber()}
 * @utbot.iterates iterate the loop {@code while(cur != null)} once
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetLineNumber_LineLessThanZero() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(curNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        
        int actual = nodeTraversal.getLineNumber();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method throwUnexpectedException(java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#throwUnexpectedException(java.lang.Exception)}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = unexpectedException.getMessage();
 *  */
    @Test
    public void testThrowUnexpectedException_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:244) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class exceptionType = Class.forName("java.lang.Exception");
        Method throwUnexpectedExceptionMethod = nodeTraversalClazz.getDeclaredMethod("throwUnexpectedException", exceptionType);
        throwUnexpectedExceptionMethod.setAccessible(true);
        java.lang.Object[] throwUnexpectedExceptionMethodArguments = new java.lang.Object[1];
        throwUnexpectedExceptionMethodArguments[0] = ((Object) null);
        try {
            throwUnexpectedExceptionMethod.invoke(nodeTraversal, throwUnexpectedExceptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#throwUnexpectedException(java.lang.Exception)}
 * @utbot.executesCondition {@code (inputId != null): False}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#throwInternalError(java.lang.String,java.lang.Exception)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.throwInternalError(message, unexpectedException);
 *  */
    @Test
    public void testThrowUnexpectedException_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        String detailMessage = "";
        setField(cloneNotSupportedException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class cloneNotSupportedExceptionType = Class.forName("java.lang.Exception");
        Method throwUnexpectedExceptionMethod = nodeTraversalClazz.getDeclaredMethod("throwUnexpectedException", cloneNotSupportedExceptionType);
        throwUnexpectedExceptionMethod.setAccessible(true);
        java.lang.Object[] throwUnexpectedExceptionMethodArguments = new java.lang.Object[1];
        throwUnexpectedExceptionMethodArguments[0] = cloneNotSupportedException;
        try {
            throwUnexpectedExceptionMethod.invoke(nodeTraversal, throwUnexpectedExceptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method throwUnexpectedException(java.lang.Exception)
    
    @Test
    public void testThrowUnexpectedException1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        NullPointerException nullPointerException = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        String detailMessage = "";
        setField(nullPointerException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nullPointerExceptionType = Class.forName("java.lang.Exception");
        Method throwUnexpectedExceptionMethod = nodeTraversalClazz.getDeclaredMethod("throwUnexpectedException", nullPointerExceptionType);
        throwUnexpectedExceptionMethod.setAccessible(true);
        java.lang.Object[] throwUnexpectedExceptionMethodArguments = new java.lang.Object[1];
        throwUnexpectedExceptionMethodArguments[0] = nullPointerException;
        try {
            throwUnexpectedExceptionMethod.invoke(nodeTraversal, throwUnexpectedExceptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getControlFlowGraph
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getControlFlowGraph()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getControlFlowGraph()}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cfgs.peek() == null
 *  */
    @Test
    public void testGetControlFlowGraph_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getControlFlowGraph] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getControlFlowGraph(NodeTraversal.java:613) */
        nodeTraversal.getControlFlowGraph();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getControlFlowGraph()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.NodeTraversal}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getControlFlowGraph()}
     */
    @Test
    public void testGetControlFlowGraph() throws Exception  {
        NodeTraversal nodeTraversal = new NodeTraversal(null, null, null);
        ArrayDeque cfgs = new ArrayDeque();
        Object object = new Object();
        ControlFlowGraph controlFlowGraph = new ControlFlowGraph(object, true, false);
        cfgs.add(controlFlowGraph);
        Object object1 = new Object();
        ControlFlowGraph controlFlowGraph1 = new ControlFlowGraph(object1, true, true);
        cfgs.add(controlFlowGraph1);
        nodeTraversal.cfgs = cfgs;
        
        ControlFlowGraph actual = nodeTraversal.getControlFlowGraph();
        
        ControlFlowGraph expected = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        Object implicitReturn = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        ArrayList inEdgeList = new ArrayList();
        setField(implicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "inEdgeList", inEdgeList);
        ArrayList outEdgeList = new ArrayList();
        setField(implicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "outEdgeList", outEdgeList);
        setField(expected, "com.google.javascript.jscomp.ControlFlowGraph", "implicitReturn", implicitReturn);
        Object entry = createInstance("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode");
        ArrayList inEdgeList1 = new ArrayList();
        setField(entry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "inEdgeList", inEdgeList1);
        ArrayList outEdgeList1 = new ArrayList();
        setField(entry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "outEdgeList", outEdgeList1);
        Object value = createInstance("java.lang.Object");
        setField(entry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "value", value);
        setField(expected, "com.google.javascript.jscomp.ControlFlowGraph", "entry", entry);
        HashMap nodes = new HashMap();
        nodes.put(null, implicitReturn);
        nodes.put(value, entry);
        setField(expected, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        setField(expected, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "useNodeAnnotations", true);
        
        DiGraph.DiGraphNode expectedImplicitReturn = expected.getImplicitReturn();
        DiGraph.DiGraphNode actualImplicitReturn = actual.getImplicitReturn();
        Annotation actualImplicitReturnAnnotation = ((Annotation) getFieldValue(actualImplicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode", "annotation"));
        assertNull(actualImplicitReturnAnnotation);
        
        List expectedImplicitReturnInEdgeList = ((List) getFieldValue(expectedImplicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "inEdgeList"));
        List actualImplicitReturnInEdgeList = ((List) getFieldValue(actualImplicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "inEdgeList"));
        assertTrue(deepEquals(expectedImplicitReturnInEdgeList, actualImplicitReturnInEdgeList));
        
        List expectedImplicitReturnOutEdgeList = ((List) getFieldValue(expectedImplicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "outEdgeList"));
        List actualImplicitReturnOutEdgeList = ((List) getFieldValue(actualImplicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "outEdgeList"));
        assertTrue(deepEquals(expectedImplicitReturnOutEdgeList, actualImplicitReturnOutEdgeList));
        
        Object actualImplicitReturnValue = getFieldValue(actualImplicitReturn, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "value");
        assertNull(actualImplicitReturnValue);
        
        DiGraph.DiGraphNode expectedEntry = expected.getEntry();
        DiGraph.DiGraphNode actualEntry = actual.getEntry();
        assertTrue(deepEquals(expectedEntry, actualEntry));
        List expectedEntryInEdgeList = ((List) getFieldValue(expectedEntry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "inEdgeList"));
        List actualEntryInEdgeList = ((List) getFieldValue(actualEntry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "inEdgeList"));
        assertTrue(deepEquals(expectedEntryInEdgeList, actualEntryInEdgeList));
        
        List expectedEntryOutEdgeList = ((List) getFieldValue(expectedEntry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "outEdgeList"));
        List actualEntryOutEdgeList = ((List) getFieldValue(actualEntry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "outEdgeList"));
        assertTrue(deepEquals(expectedEntryOutEdgeList, actualEntryOutEdgeList));
        
        Object expectedEntryValue = getFieldValue(expectedEntry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "value");
        Object actualEntryValue = getFieldValue(actualEntry, "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode", "value");
        
        Map expectedNodes = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes"));
        Map actualNodes = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes"));
        assertTrue(deepEquals(expectedNodes, actualNodes));
        
        boolean actualUseNodeAnnotations = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "useNodeAnnotations"));
        assertTrue(actualUseNodeAnnotations);
        
        boolean actualUseEdgeAnnotations = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "useEdgeAnnotations"));
        assertFalse(actualUseEdgeAnnotations);
        
        Deque actualNodeAnnotationStack = ((Deque) getFieldValue(actual, "com.google.javascript.jscomp.graph.Graph", "nodeAnnotationStack"));
        assertNull(actualNodeAnnotationStack);
        
        Deque actualEdgeAnnotationStack = ((Deque) getFieldValue(actual, "com.google.javascript.jscomp.graph.Graph", "edgeAnnotationStack"));
        assertNull(actualEdgeAnnotationStack);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEnclosingFunction()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.executesCondition {@code (scopes.size() + scopeRoots.size() < 2): True}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEnclosingFunction_ScopesSizePlusScopeRootsSizeLessThan2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Node actual = nodeTraversal.getEnclosingFunction();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEnclosingFunction()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scopes.size() + scopeRoots.size() < 2
 *  */
    @Test
    public void testGetEnclosingFunction_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction(NodeTraversal.java:550) */
        nodeTraversal.getEnclosingFunction();
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scopes.size() + scopeRoots.size() < 2
 *  */
    @Test
    public void testGetEnclosingFunction_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction(NodeTraversal.java:550) */
        nodeTraversal.getEnclosingFunction();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.report
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method report(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReport_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = nodeTraversalClazz.getDeclaredMethod("report", numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[3];
        reportMethodArguments[0] = numberNode;
        reportMethodArguments[1] = diagnosticType;
        reportMethodArguments[2] = ((Object) null);
        try {
            reportMethod.invoke(nodeTraversal, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReport_ThrowIndexOutOfBoundsException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {-1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.IndexOutOfBoundsException: start 0, end -1, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = nodeTraversalClazz.getDeclaredMethod("report", numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[3];
        reportMethodArguments[0] = numberNode;
        reportMethodArguments[1] = diagnosticType;
        reportMethodArguments[2] = ((Object) null);
        try {
            reportMethod.invoke(nodeTraversal, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSError error = JSError.make(getSourceName(), n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = nodeTraversalClazz.getDeclaredMethod("report", numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[3];
        reportMethodArguments[0] = numberNode;
        reportMethodArguments[1] = diagnosticType;
        reportMethodArguments[2] = ((Object) null);
        try {
            reportMethod.invoke(nodeTraversal, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSError error = JSError.make(getSourceName(), n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        nodeTraversal.report(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSError error = JSError.make(getSourceName(), n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -256);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = nodeTraversalClazz.getDeclaredMethod("report", numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[3];
        reportMethodArguments[0] = numberNode;
        reportMethodArguments[1] = diagnosticType;
        reportMethodArguments[2] = ((Object) null);
        try {
            reportMethod.invoke(nodeTraversal, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSError error = JSError.make(getSourceName(), n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        nodeTraversal.report(null, diagnosticType, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method report(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.NodeTraversal}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#report(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
     */
    @Test
    public void testReportThrowsNPEWithNonEmptyObjectArray() {
        NodeTraversal nodeTraversal = new NodeTraversal(null, null, null);
        ArrayDeque cfgs = new ArrayDeque();
        Object object = new Object();
        ControlFlowGraph controlFlowGraph = new ControlFlowGraph(object, true, false);
        cfgs.add(controlFlowGraph);
        Object object1 = new Object();
        ControlFlowGraph controlFlowGraph1 = new ControlFlowGraph(object1, true, true);
        cfgs.add(controlFlowGraph1);
        nodeTraversal.cfgs = cfgs;
        Node node = new Node(0, 0, -1);
        java.lang.String[] stringArray = {"", "-3", "-3"};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:649) */
        nodeTraversal.report(node, null, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal$Callback)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.traverse(root);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455) */
        NodeTraversal.traverse(null, null, checkAccessControls);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_4() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = nodeTraversalClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(nodeTraversal, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_5() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = nodeTraversalClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(nodeTraversal, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.caughtException {@code Exception unexpectedException}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        nodeTraversal.traverse(null);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.caughtException {@code Exception unexpectedException}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = nodeTraversalClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(nodeTraversal, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.caughtException {@code Exception unexpectedException}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-254);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = nodeTraversalClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(nodeTraversal, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.caughtException {@code Exception unexpectedException}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = nodeTraversalClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(nodeTraversal, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method traverse(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.NodeTraversal}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testTraverseThrowsNPE() {
        NodeTraversal nodeTraversal = new NodeTraversal(null, null, null);
        ArrayDeque cfgs = new ArrayDeque();
        Object object = new Object();
        ControlFlowGraph controlFlowGraph = new ControlFlowGraph(object, false, false);
        cfgs.add(controlFlowGraph);
        Object object1 = new Object();
        ControlFlowGraph controlFlowGraph1 = new ControlFlowGraph(object1, true, true);
        cfgs.add(controlFlowGraph1);
        nodeTraversal.cfgs = cfgs;
        Node node = new Node(0, 0, -1);
        node.setType(Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280) */
        nodeTraversal.traverse(node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.formatNodeContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatNodeContext(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#formatNodeContext(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "  " + label + ": NULL";}
 *  */
    @Test
    public void testFormatNodeContext_NEqualsNull() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method formatNodeContextMethod = nodeTraversalClazz.getDeclaredMethod("formatNodeContext", stringType, nodeType);
        formatNodeContextMethod.setAccessible(true);
        java.lang.Object[] formatNodeContextMethodArguments = new java.lang.Object[2];
        formatNodeContextMethodArguments[0] = ((Object) null);
        formatNodeContextMethodArguments[1] = ((Object) null);
        String actual = ((String) formatNodeContextMethod.invoke(nodeTraversal, formatNodeContextMethodArguments));
        
        String expected = "  null: NULL";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.formatNodePosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatNodePosition(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#formatNodePosition(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): True}
 * @utbot.returnsFrom {@code return MISSING_SOURCE + "\n";}
 *  */
    @Test
    public void testFormatNodePosition_NEqualsNull() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method formatNodePositionMethod = nodeTraversalClazz.getDeclaredMethod("formatNodePosition", nodeType);
        formatNodePositionMethod.setAccessible(true);
        java.lang.Object[] formatNodePositionMethodArguments = new java.lang.Object[1];
        formatNodePositionMethodArguments[0] = ((Object) null);
        String actual = ((String) formatNodePositionMethod.invoke(nodeTraversal, formatNodePositionMethodArguments));
        
        String expected = "[source unknown]\n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatNodePosition(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#formatNodePosition(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String src = compiler.getSourceLine(sourceName, lineNumber);
 *  */
    @Test
    public void testFormatNodePosition_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.formatNodePosition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:322) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method formatNodePositionMethod = nodeTraversalClazz.getDeclaredMethod("formatNodePosition", nodeType);
        formatNodePositionMethod.setAccessible(true);
        java.lang.Object[] formatNodePositionMethodArguments = new java.lang.Object[1];
        formatNodePositionMethodArguments[0] = node;
        try {
            formatNodePositionMethod.invoke(nodeTraversal, formatNodePositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#formatNodePosition(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String src = compiler.getSourceLine(sourceName, lineNumber);
 *  */
    @Test
    public void testFormatNodePosition_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.formatNodePosition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:322) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method formatNodePositionMethod = nodeTraversalClazz.getDeclaredMethod("formatNodePosition", nodeType);
        formatNodePositionMethod.setAccessible(true);
        java.lang.Object[] formatNodePositionMethodArguments = new java.lang.Object[1];
        formatNodePositionMethodArguments[0] = node;
        try {
            formatNodePositionMethod.invoke(nodeTraversal, formatNodePositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#formatNodePosition(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getSourceLine(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String src = compiler.getSourceLine(sourceName, lineNumber);
 *  */
    @Test
    public void testFormatNodePosition_ThrowNullPointerException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", 1073741824);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.formatNodePosition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:2039)
            com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:2052)
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:322) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method formatNodePositionMethod = nodeTraversalClazz.getDeclaredMethod("formatNodePosition", numberNodeType);
        formatNodePositionMethod.setAccessible(true);
        java.lang.Object[] formatNodePositionMethodArguments = new java.lang.Object[1];
        formatNodePositionMethodArguments[0] = numberNode;
        try {
            formatNodePositionMethod.invoke(nodeTraversal, formatNodePositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getSourceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return name == null ? "" : name;}
 *  */
    @Test
    public void testGetSourceName_ReturnNameNotEqualsNull() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", stringNodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = stringNode;
        String actual = ((String) getSourceNameMethod.invoke(null, getSourceNameMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return name == null ? "" : name;}
 *  */
    @Test
    public void testGetSourceName_ReturnNameNotEqualsNull_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", numberNodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = numberNode;
        String actual = ((String) getSourceNameMethod.invoke(null, getSourceNameMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return name == null ? "" : name;}
 *  */
    @Test
    public void testGetSourceName_ReturnNameNotEqualsNull_2() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", stringNodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = stringNode;
        String actual = ((String) getSourceNameMethod.invoke(null, getSourceNameMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return name == null ? "" : name;}
 *  */
    @Test
    public void testGetSourceName_ReturnNameNotEqualsNull_3() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        String name = "";
        setField(objectValue, "com.google.javascript.rhino.jstype.SimpleSourceFile", "name", name);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", stringNodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = stringNode;
        String actual = ((String) getSourceNameMethod.invoke(null, getSourceNameMethodArguments));
        
        assertEquals(name, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSourceName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getSourceFileName()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String name = n.getSourceFileName();
 *  */
    @Test
    public void testGetSourceName_ThrowClassCastException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getSourceName] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1097)
            com.google.javascript.rhino.Node.getSourceFileName(Node.java:1091)
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:654) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", stringNodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = stringNode;
        try {
            getSourceNameMethod.invoke(null, getSourceNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = n.getSourceFileName();
 *  */
    @Test
    public void testGetSourceName_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getSourceName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:654) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", nodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = ((Object) null);
        try {
            getSourceNameMethod.invoke(null, getSourceNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSourceName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getSourceFileName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetSourceName_ThrowUnsupportedOperationException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getSourceNameMethod = nodeTraversalClazz.getDeclaredMethod("getSourceName", stringNodeType);
        getSourceNameMethod.setAccessible(true);
        java.lang.Object[] getSourceNameMethodArguments = new java.lang.Object[1];
        getSourceNameMethodArguments[0] = stringNode;
        try {
            getSourceNameMethod.invoke(null, getSourceNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getSourceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceName()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.returnsFrom {@code return sourceName;}
 *  */
    @Test
    public void testGetSourceName_ReturnSourceName() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        String actual = nodeTraversal.getSourceName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseWithScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseWithScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: traverseBranch(root, null);
 *  */
    @Test
    public void testTraverseWithScope_ThrowClassCastException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseWithScope] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.InputId ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.InputId is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getInputId(Node.java:1111)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:480)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:342) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseWithScopeMethod = nodeTraversalClazz.getDeclaredMethod("traverseWithScope", numberNodeType, scopeType);
        traverseWithScopeMethod.setAccessible(true);
        java.lang.Object[] traverseWithScopeMethodArguments = new java.lang.Object[2];
        traverseWithScopeMethodArguments[0] = numberNode;
        traverseWithScopeMethodArguments[1] = scope;
        try {
            traverseWithScopeMethod.invoke(nodeTraversal, traverseWithScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(s.isGlobal());
 *  */
    @Test
    public void testTraverseWithScope_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseWithScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:336) */
        nodeTraversal.traverseWithScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pushScope(s);
 *  */
    @Test
    public void testTraverseWithScope_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseWithScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:574)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:341) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseWithScopeMethod = nodeTraversalClazz.getDeclaredMethod("traverseWithScope", numberNodeType, scopeType);
        traverseWithScopeMethod.setAccessible(true);
        java.lang.Object[] traverseWithScopeMethodArguments = new java.lang.Object[2];
        traverseWithScopeMethodArguments[0] = numberNode;
        traverseWithScopeMethodArguments[1] = scope;
        try {
            traverseWithScopeMethod.invoke(nodeTraversal, traverseWithScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pushScope(s);
 *  */
    @Test
    public void testTraverseWithScope_ThrowNullPointerException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseWithScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:341) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseWithScopeMethod = nodeTraversalClazz.getDeclaredMethod("traverseWithScope", numberNodeType, scopeType);
        traverseWithScopeMethod.setAccessible(true);
        java.lang.Object[] traverseWithScopeMethodArguments = new java.lang.Object[2];
        traverseWithScopeMethodArguments[0] = numberNode;
        traverseWithScopeMethodArguments[1] = scope;
        try {
            traverseWithScopeMethod.invoke(nodeTraversal, traverseWithScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pushScope(s);
 *  */
    @Test
    public void testTraverseWithScope_ThrowNullPointerException_3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque cfgs = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseWithScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:341) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseWithScopeMethod = nodeTraversalClazz.getDeclaredMethod("traverseWithScope", stringNodeType, scopeType);
        traverseWithScopeMethod.setAccessible(true);
        java.lang.Object[] traverseWithScopeMethodArguments = new java.lang.Object[2];
        traverseWithScopeMethodArguments[0] = stringNode;
        traverseWithScopeMethodArguments[1] = scope;
        try {
            traverseWithScopeMethod.invoke(nodeTraversal, traverseWithScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseBranch(root, null);
 *  */
    @Test
    public void testTraverseWithScope_ThrowNullPointerException_4() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseWithScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:342) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseWithScopeMethod = nodeTraversalClazz.getDeclaredMethod("traverseWithScope", numberNodeType, scopeType);
        traverseWithScopeMethod.setAccessible(true);
        java.lang.Object[] traverseWithScopeMethodArguments = new java.lang.Object[2];
        traverseWithScopeMethodArguments[0] = numberNode;
        traverseWithScopeMethodArguments[1] = scope;
        try {
            traverseWithScopeMethod.invoke(nodeTraversal, traverseWithScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseWithScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(s.isGlobal());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseWithScope_ThrowIllegalStateException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        nodeTraversal.traverseWithScope(null, scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: pushScope(s);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseWithScope_ThrowIllegalStateException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        nodeTraversal.traverseWithScope(null, scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseWithScope_ThrowUnsupportedOperationException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList cfgs = new LinkedList();
        cfgs.add(null);
        cfgs.add(null);
        cfgs.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseWithScopeMethod = nodeTraversalClazz.getDeclaredMethod("traverseWithScope", numberNodeType, scopeType);
        traverseWithScopeMethod.setAccessible(true);
        java.lang.Object[] traverseWithScopeMethodArguments = new java.lang.Object[2];
        traverseWithScopeMethodArguments[0] = numberNode;
        traverseWithScopeMethodArguments[1] = scope;
        try {
            traverseWithScopeMethod.invoke(nodeTraversal, traverseWithScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseInnerNode
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseInnerNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseInnerNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseInnerNode_ThrowUnsupportedOperationException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseInnerNodeMethod = nodeTraversalClazz.getDeclaredMethod("traverseInnerNode", numberNodeType, numberNodeType, scopeType);
        traverseInnerNodeMethod.setAccessible(true);
        java.lang.Object[] traverseInnerNodeMethodArguments = new java.lang.Object[3];
        traverseInnerNodeMethodArguments[0] = numberNode;
        traverseInnerNodeMethodArguments[1] = stringNode;
        traverseInnerNodeMethodArguments[2] = ((Object) null);
        try {
            traverseInnerNodeMethod.invoke(nodeTraversal, traverseInnerNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseInnerNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(parent);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseInnerNode_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        nodeTraversal.traverseInnerNode(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseInnerNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseInnerNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseBranch(node, parent);
 *  */
    @Test
    public void testTraverseInnerNode_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseInnerNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:478)
            com.google.javascript.jscomp.NodeTraversal.traverseInnerNode(NodeTraversal.java:391) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseInnerNodeMethod = nodeTraversalClazz.getDeclaredMethod("traverseInnerNode", nodeType, nodeType, scopeType);
        traverseInnerNodeMethod.setAccessible(true);
        java.lang.Object[] traverseInnerNodeMethodArguments = new java.lang.Object[3];
        traverseInnerNodeMethodArguments[0] = ((Object) null);
        traverseInnerNodeMethodArguments[1] = stringNode;
        traverseInnerNodeMethodArguments[2] = ((Object) null);
        try {
            traverseInnerNodeMethod.invoke(nodeTraversal, traverseInnerNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseInnerNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseBranch(node, parent);
 *  */
    @Test
    public void testTraverseInnerNode_ThrowNullPointerException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseInnerNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485)
            com.google.javascript.jscomp.NodeTraversal.traverseInnerNode(NodeTraversal.java:391) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseInnerNodeMethod = nodeTraversalClazz.getDeclaredMethod("traverseInnerNode", numberNodeType, numberNodeType, scopeType);
        traverseInnerNodeMethod.setAccessible(true);
        java.lang.Object[] traverseInnerNodeMethodArguments = new java.lang.Object[3];
        traverseInnerNodeMethodArguments[0] = numberNode;
        traverseInnerNodeMethodArguments[1] = stringNode;
        traverseInnerNodeMethodArguments[2] = ((Object) null);
        try {
            traverseInnerNodeMethod.invoke(nodeTraversal, traverseInnerNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseRoots
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseRoots(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal$Callback, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.NodeTraversal.Callback,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.traverseRoots(roots);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseRoots_ThrowNullPointerException_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        NodeTraversal.traverseRoots(((AbstractCompiler) null), checkAccessControls, ((com.google.javascript.rhino.Node[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.jscomp.NodeTraversal.Callback,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.traverseRoots(roots);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseRoots_ThrowNullPointerException() {
        NodeTraversal.traverseRoots(((AbstractCompiler) null), ((NodeTraversal.Callback) null), ((com.google.javascript.rhino.Node[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseRoots
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseRoots(java.util.List)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(java.util.List)}
 * @utbot.executesCondition {@code (roots.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTraverseRoots_RootsIsEmpty() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayList arrayList = new ArrayList();
        
        nodeTraversal.traverseRoots(arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseRoots(java.util.List)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(java.util.List)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: roots.isEmpty()
 *  */
    @Test
    public void testTraverseRoots_ThrowNullPointerException1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseRoots] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:289) */
        nodeTraversal.traverseRoots(((List) null));
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(java.util.List)}
 * @utbot.executesCondition {@code (roots.isEmpty()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#throwUnexpectedException(java.lang.Exception)
 * @utbot.caughtException {@code Exception unexpectedException}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverseRoots_ThrowNullPointerException_11() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseRoots] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:309) */
        nodeTraversal.traverseRoots(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(java.util.List)}
 * @utbot.executesCondition {@code (roots.isEmpty()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeRoot != null);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#throwUnexpectedException(java.lang.Exception)
 * @utbot.caughtException {@code Exception unexpectedException}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwUnexpectedException(unexpectedException);
 *  */
    @Test
    public void testTraverseRoots_ThrowNullPointerException_2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayList arrayList = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        arrayList.add(stringNode);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseRoots] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:309) */
        nodeTraversal.traverseRoots(arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseRoots(java.util.List)
    
    @Test
    public void testTraverseRoots1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayList arrayList = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        arrayList.add(stringNode);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseRoots] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:309) */
        nodeTraversal.traverseRoots(arrayList);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method traverseRoots(java.util.List)
    
    @Test(timeout = 1000L)
    public void testTraverseRoots2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayList arrayList = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        arrayList.add(stringNode);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nodeTraversal.traverseRoots(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseRoots
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseRoots([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(com.google.javascript.rhino.Node[])}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseRoots(Lists.newArrayList(roots));
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseRoots_ThrowNullPointerException2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        nodeTraversal.traverseRoots(((com.google.javascript.rhino.Node[]) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseRoots([Lcom.google.javascript.rhino.Node;)
    
    @Test
    public void testTraverseRoots3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[40];
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseRoots] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:309)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:285) */
        nodeTraversal.traverseRoots(nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseRoots
    
    ///region FUZZER: ERROR SUITE for method traverseRoots(com.google.javascript.jscomp.AbstractCompiler, java.util.List, com.google.javascript.jscomp.NodeTraversal$Callback)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.NodeTraversal}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseRoots(com.google.javascript.jscomp.AbstractCompiler,java.util.List,com.google.javascript.jscomp.NodeTraversal.Callback)}
     */
    @Test
    public void testTraverseRootsThrowsNPE() {
        LinkedList linkedList = new LinkedList();
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[5];
        com.google.javascript.rhino.Node[] nodeArray1 = {};
        Node node = new Node(1, nodeArray1, 1, 1);
        node.setType(0);
        nodeArray[0] = node;
        Node node1 = new Node(Integer.MAX_VALUE, ((Node) null), ((Node) null));
        node1.setType(Integer.MIN_VALUE);
        nodeArray[1] = node1;
        Node node2 = new Node(Integer.MIN_VALUE, ((Node) null), ((Node) null), Integer.MAX_VALUE, Integer.MAX_VALUE);
        node2.setType(-1);
        nodeArray[2] = node2;
        Node node3 = new Node(-1, 0, Integer.MAX_VALUE);
        node3.setType(0);
        nodeArray[3] = node3;
        Node node4 = new Node(Integer.MIN_VALUE, ((Node) null));
        node4.setType(Integer.MIN_VALUE);
        nodeArray[4] = node4;
        Node node5 = new Node(Integer.MIN_VALUE, nodeArray);
        node5.setType(Integer.MAX_VALUE);
        linkedList.add(node5);
        Node node6 = new Node(0);
        node6.setType(-1);
        linkedList.add(node6);
        Node node7 = new Node(Integer.MIN_VALUE, 1, Integer.MAX_VALUE);
        node7.setType(Integer.MIN_VALUE);
        Node node8 = new Node(Integer.MAX_VALUE, node7, Integer.MIN_VALUE, 1);
        node8.setType(0);
        Node node9 = new Node(Integer.MAX_VALUE, node8, Integer.MAX_VALUE, Integer.MAX_VALUE);
        node9.setType(-1);
        linkedList.add(node9);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseRoots] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:309)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:464) */
        NodeTraversal.traverseRoots(((AbstractCompiler) null), linkedList, ((NodeTraversal.Callback) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseRoots(com.google.javascript.jscomp.AbstractCompiler, java.util.List, com.google.javascript.jscomp.NodeTraversal$Callback)
    
    @Test
    public void testTraverseRoots4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        NodeTraversal.traverseRoots(((AbstractCompiler) null), arrayList, checkAccessControls);
    }
    
    @Test
    public void testTraverseRoots5() {
        ArrayList arrayList = new ArrayList();
        
        NodeTraversal.traverseRoots(((AbstractCompiler) null), arrayList, ((NodeTraversal.Callback) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseAtScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAtScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (inputId == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: sourceName = getSourceName(n);
 *  */
    @Test
    public void testTraverseAtScope_ThrowClassCastException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1097)
            com.google.javascript.rhino.Node.getSourceFileName(Node.java:1091)
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:654)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:358) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = s.getRootNode();
 *  */
    @Test
    public void testTraverseAtScope_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:351) */
        nodeTraversal.traverseAtScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isFunction()
 *  */
    @Test
    public void testTraverseAtScope_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:352) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseWithScope(n, s);
 *  */
    @Test
    public void testTraverseAtScope_ThrowNullPointerException_2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        rootNode.setType(-255);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:574)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:341)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:369) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (inputId == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pushScope(s);
 *  */
    @Test
    public void testTraverseAtScope_ThrowNullPointerException_4() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:574)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:360) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (inputId == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pushScope(s);
 *  */
    @Test
    public void testTraverseAtScope_ThrowNullPointerException_5() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:574)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:360) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseWithScope(n, s);
 *  */
    @Test
    public void testTraverseAtScope_ThrowNullPointerException_3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node curNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        rootNode.setType(-255);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:341)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:369) */
        nodeTraversal.traverseAtScope(scope);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAtScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: traverseWithScope(n, s);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseAtScope_ThrowIllegalStateException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        rootNode.setType(-255);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        nodeTraversal.traverseAtScope(scope);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (inputId == null): False}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#getSourceName(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: sourceName = getSourceName(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseAtScope_ThrowUnsupportedOperationException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        nodeTraversal.traverseAtScope(scope);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAtScope(com.google.javascript.jscomp.Scope)
    
    @Test
    public void testTraverseAtScope1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:360) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    @Test
    public void testTraverseAtScope2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList cfgs = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:342)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:369) */
        nodeTraversal.traverseAtScope(scope);
    }
    
    @Test
    public void testTraverseAtScope3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque cfgs = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "cfgs", cfgs);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseAtScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:575)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:341)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:369) */
        nodeTraversal.traverseAtScope(scope);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method traverseAtScope(com.google.javascript.jscomp.Scope)
    
    @Test(timeout = 1000L)
    public void testTraverseAtScope4() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        InputId inputId = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "inputId", inputId);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nodeTraversal.traverseAtScope(scope);
    }
    
    @Test(timeout = 1000L)
    public void testTraverseAtScope5() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nodeTraversal.traverseAtScope(scope);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseFunction
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:511) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", nodeType, nodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = ((Object) null);
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isFunctionExpression): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isFunction()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseBranch(fnName, n);
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485)
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:521) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.isFunction());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isFunctionExpression): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: traverseBranch(fnName, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseFunction_ThrowUnsupportedOperationException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTraverseFunction1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.javascript.rhino.InputId (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.InputId is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getInputId(Node.java:1111)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:480)
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:521) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseFunction2() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:411)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:426)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485)
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:521) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseFunction3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:838)
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:688)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:504)
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:521) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseFunction4() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:596)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:430)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485)
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:521) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseFunction5() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.pushScope(NodeTraversal.java:564)
            com.google.javascript.jscomp.NodeTraversal.traverseFunction(NodeTraversal.java:525) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", numberNodeType, numberNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseFunction6() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", stringNodeType, stringNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = stringNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTraverseFunction7() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseFunctionMethod = nodeTraversalClazz.getDeclaredMethod("traverseFunction", stringNodeType, stringNodeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = stringNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(nodeTraversal, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getCurrentNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentNode()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getCurrentNode()}
 * @utbot.returnsFrom {@code return curNode;}
 *  */
    @Test
    public void testGetCurrentNode_ReturnCurNode() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        Node actual = nodeTraversal.getCurrentNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getScopeRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScopeRoot()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.executesCondition {@code (scopeRoots.isEmpty()): False}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.returnsFrom {@code return scopeRoots.peek();}
 *  */
    @Test
    public void testGetScopeRoot_NotScopeRootsIsEmpty() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Node actual = nodeTraversal.getScopeRoot();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.executesCondition {@code (scopeRoots.isEmpty()): True}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getRootNode()}
 * @utbot.returnsFrom {@code return scopes.peek().getRootNode();}
 *  */
    @Test
    public void testGetScopeRoot_ScopeRootsIsEmpty() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        Object actual = nodeTraversal.getScopeRoot();
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int rootNodeType = (((Node) rootNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(rootNodeType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int rootNodeSourcePosition = (((Node) rootNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(rootNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getScopeRoot()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scopeRoots.isEmpty()
 *  */
    @Test
    public void testGetScopeRoot_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScopeRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:624) */
        nodeTraversal.getScopeRoot();
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.executesCondition {@code (scopeRoots.isEmpty()): True}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return scopes.peek().getRootNode();
 *  */
    @Test
    public void testGetScopeRoot_ThrowNullPointerException_2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScopeRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:625) */
        nodeTraversal.getScopeRoot();
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.executesCondition {@code (scopeRoots.isEmpty()): True}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getRootNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return scopes.peek().getRootNode();
 *  */
    @Test
    public void testGetScopeRoot_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScopeRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:625) */
        nodeTraversal.getScopeRoot();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.traverseBranch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testTraverseBranch_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:478) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", nodeType, nodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = ((Object) null);
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal.Callback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !callback.shouldTraverse(this, n, parent)
 *  */
    @Test
    public void testTraverseBranch_ThrowNullPointerException_1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#traverseBranch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getInputId()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: inputId = n.getInputId();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseBranch_ThrowUnsupportedOperationException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTraverseBranch1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        Node initialNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        
        Node finalNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        assertFalse(initialNodeTraversalCurNode == finalNodeTraversalCurNode);
    }
    
    @Test
    public void testTraverseBranch2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Node initialNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        
        Node finalNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        assertFalse(initialNodeTraversalCurNode == finalNodeTraversalCurNode);
    }
    
    @Test
    public void testTraverseBranch3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        Node initialNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        
        NodeTraversal.Callback nodeTraversalCallback = ((NodeTraversal.Callback) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback"));
        TypeValidator nodeTraversalCallbackCallbackValidator = ((TypeValidator) getFieldValue(nodeTraversalCallback, "com.google.javascript.jscomp.TypeCheck", "validator"));
        boolean finalNodeTraversalCallbackValidatorShouldReport = ((Boolean) getFieldValue(nodeTraversalCallbackCallbackValidator, "com.google.javascript.jscomp.TypeValidator", "shouldReport"));
        Node finalNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        assertFalse(initialNodeTraversalCurNode == finalNodeTraversalCurNode);
        
        assertTrue(finalNodeTraversalCallbackValidatorShouldReport);
    }
    
    @Test
    public void testTraverseBranch4() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Node initialNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        
        NodeTraversal.Callback nodeTraversalCallback = ((NodeTraversal.Callback) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback"));
        TypeValidator nodeTraversalCallbackCallbackValidator = ((TypeValidator) getFieldValue(nodeTraversalCallback, "com.google.javascript.jscomp.TypeCheck", "validator"));
        boolean finalNodeTraversalCallbackValidatorShouldReport = ((Boolean) getFieldValue(nodeTraversalCallbackCallbackValidator, "com.google.javascript.jscomp.TypeValidator", "shouldReport"));
        Node finalNodeTraversalCurNode = ((Node) getFieldValue(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode"));
        
        assertFalse(initialNodeTraversalCurNode == finalNodeTraversalCurNode);
        
        assertTrue(finalNodeTraversalCallbackValidatorShouldReport);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTraverseBranch5() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.javascript.rhino.JSDocInfo (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1851)
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:403)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:426)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseBranch6() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object curNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "curNode", curNode);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:411)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:426)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", stringNodeType, stringNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = stringNode;
        traverseBranchMethodArguments[1] = stringNode1;
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseBranch7() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseBranch8() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:411)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:426)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseBranch9() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:838)
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:688)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:504) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseBranch10() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(callback, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.traverseBranch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:596)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:430)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:485) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseBranch11() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TypeCheck callback = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", numberNodeType, numberNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = numberNode;
        traverseBranchMethodArguments[1] = ((Object) null);
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTraverseBranch12() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseBranchMethod = nodeTraversalClazz.getDeclaredMethod("traverseBranch", stringNodeType, stringNodeType);
        traverseBranchMethod.setAccessible(true);
        java.lang.Object[] traverseBranchMethodArguments = new java.lang.Object[2];
        traverseBranchMethodArguments[0] = stringNode;
        traverseBranchMethodArguments[1] = node;
        try {
            traverseBranchMethod.invoke(nodeTraversal, traverseBranchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getInputId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInputId()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getInputId()}
 * @utbot.returnsFrom {@code return inputId;}
 *  */
    @Test
    public void testGetInputId_ReturnInputId() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        InputId actual = nodeTraversal.getInputId();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.hasScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasScope()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#hasScope()}
 * @utbot.returnsFrom {@code return !(scopes.isEmpty() && scopeRoots.isEmpty());}
 *  */
    @Test
    public void testHasScope_NotScopesIsEmptyAndScopeRootsIsEmpty() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        boolean actual = nodeTraversal.hasScope();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#hasScope()}
 * @utbot.returnsFrom {@code return !(scopes.isEmpty() && scopeRoots.isEmpty());}
 *  */
    @Test
    public void testHasScope_NotScopesIsEmptyAndScopeRootsIsEmpty_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        boolean actual = nodeTraversal.hasScope();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasScope()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#hasScope()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !(scopes.isEmpty() && scopeRoots.isEmpty());
 *  */
    @Test
    public void testHasScope_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.hasScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.hasScope(NodeTraversal.java:643) */
        nodeTraversal.hasScope();
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#hasScope()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.returnsFrom {@code return !(scopes.isEmpty() && scopeRoots.isEmpty());}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !(scopes.isEmpty() && scopeRoots.isEmpty());
 *  */
    @Test
    public void testHasScope_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.hasScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.hasScope(NodeTraversal.java:643) */
        nodeTraversal.hasScope();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.getScopeDepth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScopeDepth()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeDepth()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.returnsFrom {@code return scopes.size() + scopeRoots.size();}
 *  */
    @Test
    public void testGetScopeDepth_DequeSize() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        int actual = nodeTraversal.getScopeDepth();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getScopeDepth()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeDepth()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return scopes.size() + scopeRoots.size();
 *  */
    @Test
    public void testGetScopeDepth_ThrowNullPointerException() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScopeDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeDepth(NodeTraversal.java:639) */
        nodeTraversal.getScopeDepth();
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#getScopeDepth()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.invokes {@link java.util.Deque#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return scopes.size() + scopeRoots.size();
 *  */
    @Test
    public void testGetScopeDepth_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.getScopeDepth] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeDepth(NodeTraversal.java:639) */
        nodeTraversal.getScopeDepth();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.makeError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMakeError_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testMakeError_ThrowIndexOutOfBoundsException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {-1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IndexOutOfBoundsException: start 0, end -1, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException_1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException_3() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -256);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException_2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, diagnosticType, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    @Test
    public void testMakeError1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(format, "java.text.MessageFormat", "pattern", sourceName);
        setField(format, "java.text.MessageFormat", "maxOffset", Integer.MIN_VALUE);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        JSError actual = nodeTraversal.makeError(null, diagnosticType, stringArray);
        
        JSError expected = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        setField(expected, "com.google.javascript.jscomp.JSError", "type", diagnosticType);
        String description = "";
        setField(expected, "com.google.javascript.jscomp.JSError", "description", description);
        setField(expected, "com.google.javascript.jscomp.JSError", "sourceName", sourceName);
        setField(expected, "com.google.javascript.jscomp.JSError", "lineNumber", -1);
        setField(expected, "com.google.javascript.jscomp.JSError", "charno", -1);
        
        // com.google.javascript.jscomp.JSError has overridden equals method
        assertEquals(expected, actual);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    
    @Test
    public void testMakeError2() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        setField(format, "java.text.MessageFormat", "maxOffset", Integer.MIN_VALUE);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        JSError actual = ((JSError) makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments));
        
        JSError expected = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        setField(expected, "com.google.javascript.jscomp.JSError", "type", diagnosticType);
        String description = "";
        setField(expected, "com.google.javascript.jscomp.JSError", "description", description);
        setField(expected, "com.google.javascript.jscomp.JSError", "node", numberNode);
        
        // com.google.javascript.jscomp.JSError has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMakeError3() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        setField(format, "java.text.MessageFormat", "maxOffset", Integer.MIN_VALUE);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        JSError actual = ((JSError) makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments));
        
        JSError expected = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        setField(expected, "com.google.javascript.jscomp.JSError", "type", diagnosticType);
        String description = "";
        setField(expected, "com.google.javascript.jscomp.JSError", "description", description);
        setField(expected, "com.google.javascript.jscomp.JSError", "node", numberNode);
        setField(expected, "com.google.javascript.jscomp.JSError", "lineNumber", -1);
        setField(expected, "com.google.javascript.jscomp.JSError", "charno", -1);
        
        // com.google.javascript.jscomp.JSError has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    @Test
    public void testMakeError4() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {
            Integer.MIN_VALUE, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IndexOutOfBoundsException: start 0, end -2147483648, length 0]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError5() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            Integer.MIN_VALUE, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1279)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError6() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError7() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            5, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IndexOutOfBoundsException: start 0, end 5, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, diagnosticType, stringArray);
    }
    
    @Test
    public void testMakeError8() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 603, 603, 603, 603, 603, 603, 603,
            603
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            Integer.MIN_VALUE, 603, 603, 603, 603, 603, 603, 603,
            603
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1279)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError9() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = new java.text.Format[9];
        DecimalFormat decimalFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        formats[0] = ((Format) decimalFormat);
        format.setFormats(formats);
        int[] offsets = {
            1, 128, 128, 128, 128, 128, 128, 128,
            128
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, 128, 128, 128, 128, 128, 128, 128,
            128
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IllegalArgumentException: Cannot format given Object as a Number]
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:515)
            java.base/java.text.Format.format(Format.java:159)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1347)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError10() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = new java.text.Format[9];
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        formats[0] = ((Format) choiceFormat);
        format.setFormats(formats);
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IllegalArgumentException: Cannot format given Object as a Number]
            java.base/java.text.NumberFormat.format(NumberFormat.java:283)
            java.base/java.text.Format.format(Format.java:159)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1287)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError11() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            Integer.MIN_VALUE, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1279)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, diagnosticType, stringArray);
    }
    
    @Test
    public void testMakeError12() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = new java.text.Format[9];
        DecimalFormat decimalFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        formats[0] = ((Format) decimalFormat);
        format.setFormats(formats);
        int[] offsets = {
            1, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623,
            -2147482623
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623,
            -2147482623
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[9];
        stringArray[0] = sourceName;
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IllegalArgumentException: Cannot format given Object as a Number]
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:515)
            java.base/java.text.Format.format(Format.java:159)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1347)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, diagnosticType, stringArray);
    }
    
    @Test
    public void testMakeError13() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError14() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        java.lang.String[] stringArray = {null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError15() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(format, "java.text.MessageFormat", "argumentNumbers", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1360)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError16() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1360)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError17() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(format, "java.text.MessageFormat", "pattern", sourceName);
        int[] offsets = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, diagnosticType, stringArray);
    }
    
    @Test
    public void testMakeError18() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(format, "java.text.MessageFormat", "argumentNumbers", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1360)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        nodeTraversal.makeError(null, diagnosticType, stringArray);
    }
    
    @Test
    public void testMakeError19() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {
            0, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:682) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[3];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = diagnosticType;
        makeErrorMethodArguments[2] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.makeError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMakeError_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, level, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException1() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = ((Object) null);
        makeErrorMethodArguments[3] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, level, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException_21() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -256);
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = ((Object) null);
        makeErrorMethodArguments[3] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#makeError(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return JSError.make(getSourceName(), n, level, type, arguments);
 *  */
    @Test
    public void testMakeError_ThrowNullPointerException_11() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) null);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    @Test
    public void testMakeError20() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        CheckLevel checkLevel = CheckLevel.OFF;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        setField(format, "java.text.MessageFormat", "maxOffset", Integer.MIN_VALUE);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        JSError actual = ((JSError) makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments));
        
        JSError expected = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        setField(expected, "com.google.javascript.jscomp.JSError", "type", diagnosticType);
        String description = "";
        setField(expected, "com.google.javascript.jscomp.JSError", "description", description);
        setField(expected, "com.google.javascript.jscomp.JSError", "node", numberNode);
        setField(expected, "com.google.javascript.jscomp.JSError", "level", checkLevel);
        
        // com.google.javascript.jscomp.JSError has overridden equals method
        assertEquals(expected, actual);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    
    @Test
    public void testMakeError21() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.OFF;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        setField(format, "java.text.MessageFormat", "maxOffset", Integer.MIN_VALUE);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        JSError actual = ((JSError) makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments));
        
        JSError expected = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        setField(expected, "com.google.javascript.jscomp.JSError", "type", diagnosticType);
        String description = "";
        setField(expected, "com.google.javascript.jscomp.JSError", "description", description);
        setField(expected, "com.google.javascript.jscomp.JSError", "node", numberNode);
        setField(expected, "com.google.javascript.jscomp.JSError", "lineNumber", -1);
        setField(expected, "com.google.javascript.jscomp.JSError", "level", checkLevel);
        setField(expected, "com.google.javascript.jscomp.JSError", "charno", -1);
        
        // com.google.javascript.jscomp.JSError has overridden equals method
        assertEquals(expected, actual);
        
        String finalStringArray0 = stringArray[0];
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertNull(finalStringArray0);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    @Test
    public void testMakeError22() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.OFF;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {
            Integer.MIN_VALUE, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IndexOutOfBoundsException: start 0, end -2147483648, length 0]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError23() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.OFF;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {
            9, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            Integer.MIN_VALUE, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1279)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError24() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.WARNING;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError25() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.ERROR;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = {};
        format.setFormats(formats);
        int[] offsets = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1284)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError26() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.ERROR;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = new java.text.Format[9];
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        formats[0] = ((Format) choiceFormat);
        format.setFormats(formats);
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[17];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.IllegalArgumentException: Cannot format given Object as a Number]
            java.base/java.text.NumberFormat.format(NumberFormat.java:283)
            java.base/java.text.Format.format(Format.java:159)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1287)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError27() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        CheckLevel checkLevel = CheckLevel.ERROR;
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {
            1, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {
            0, 987, 987, 987, 987, 987, 987, 987,
            987
        };
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1360)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = checkLevel;
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMakeError28() throws Throwable  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.NodeTraversal.makeError] produces [java.lang.NullPointerException]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.make(JSError.java:127)
            com.google.javascript.jscomp.NodeTraversal.makeError(NodeTraversal.java:671) */
        Class nodeTraversalClazz = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class checkLevelType = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method makeErrorMethod = nodeTraversalClazz.getDeclaredMethod("makeError", numberNodeType, checkLevelType, diagnosticTypeType, stringArrayType);
        makeErrorMethod.setAccessible(true);
        java.lang.Object[] makeErrorMethodArguments = new java.lang.Object[4];
        makeErrorMethodArguments[0] = numberNode;
        makeErrorMethodArguments[1] = ((Object) null);
        makeErrorMethodArguments[2] = diagnosticType;
        makeErrorMethodArguments[3] = ((Object) stringArray);
        try {
            makeErrorMethod.invoke(nodeTraversal, makeErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.NodeTraversal.inGlobalScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inGlobalScope()
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.returnsFrom {@code return getScopeDepth() <= 1;}
 *  */
    @Test
    public void testInGlobalScope_GetScopeDepthLessOrEqual1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        boolean actual = nodeTraversal.inGlobalScope();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NodeTraversal}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.returnsFrom {@code return getScopeDepth() <= 1;}
 *  */
    @Test
    public void testInGlobalScope_GetScopeDepthGreaterThan1() throws Exception  {
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        boolean actual = nodeTraversal.inGlobalScope();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields888165505908200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields888165505908200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass888165505915400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields888165505908200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass888165505915400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields888165506442600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields888165506442600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass888165506444100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields888165506442600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass888165506444100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

