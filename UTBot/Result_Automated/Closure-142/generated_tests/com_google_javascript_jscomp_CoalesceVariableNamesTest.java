package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.ArrayDeque;
import java.util.LinkedList;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_CoalesceVariableNamesTest {
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.exitScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link java.util.Deque#pop()}
 *  */
    @Test
    public void testExitScope_NotTInGlobalScope() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        ArrayDeque colorings = new ArrayDeque();
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        coalesceVariableNames.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope()
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.exitScope(CoalesceVariableNames.java:124) */
        coalesceVariableNames.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: colorings.pop();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_1() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.exitScope(CoalesceVariableNames.java:127) */
        coalesceVariableNames.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.enterScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#isGlobal()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEnterScope_ScopeIsGlobal() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
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
        
        coalesceVariableNames.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnterScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
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
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        String sourceName = "";
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.enterScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 45 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:296)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:66)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:574)
            com.google.javascript.jscomp.CoalesceVariableNames.enterScope(CoalesceVariableNames.java:96) */
        coalesceVariableNames.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = t.getScope();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.enterScope(CoalesceVariableNames.java:96) */
        coalesceVariableNames.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scope.isGlobal()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.enterScope(CoalesceVariableNames.java:97) */
        coalesceVariableNames.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scope.isGlobal()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_2() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
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
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.enterScope(CoalesceVariableNames.java:97) */
        coalesceVariableNames.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Scope scope = t.getScope();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes1.put(node, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        coalesceVariableNames.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.checkRanges
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRanges(java.util.ArrayList, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCheckRanges_ThrowNullPointerException() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.checkRanges] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.checkRanges(CoalesceVariableNames.java:285) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = ((Object) null);
        try {
            checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCheckRanges_ThrowNullPointerException_1() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.checkRanges] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.checkRanges(CoalesceVariableNames.java:285) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = node;
        try {
            checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCheckRanges_ThrowNullPointerException_2() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.checkRanges] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.checkRanges(CoalesceVariableNames.java:285) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = node;
        try {
            checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCheckRanges_ThrowNullPointerException_3() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.checkRanges] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.checkRanges(CoalesceVariableNames.java:285) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = node;
        try {
            checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCheckRanges_ThrowNullPointerException_4() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.checkRanges] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.checkRanges(CoalesceVariableNames.java:285) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = node;
        try {
            checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCheckRanges_ThrowNullPointerException_5() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.checkRanges] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.checkRanges(CoalesceVariableNames.java:285) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = node;
        try {
            checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method checkRanges(java.util.ArrayList, com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#checkRanges(java.util.ArrayList,com.google.javascript.rhino.Node)}
     */
    @Test
    public void testCheckRanges() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoalesceVariableNames coalesceVariableNames = new CoalesceVariableNames(null, true);
        Node node = new Node(-1, 0, Integer.MAX_VALUE);
        node.setType(-2147475456);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkRangesMethod = coalesceVariableNamesClazz.getDeclaredMethod("checkRanges", arrayListType, nodeType);
        checkRangesMethod.setAccessible(true);
        java.lang.Object[] checkRangesMethodArguments = new java.lang.Object[2];
        checkRangesMethodArguments[0] = ((Object) null);
        checkRangesMethodArguments[1] = node;
        checkRangesMethod.invoke(coalesceVariableNames, checkRangesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method removeVarDeclaration(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", functionNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = functionNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_NodeRemoveChild() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(-256);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", scriptOrFnNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = scriptOrFnNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node finalScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertNull(finalScriptOrFnNodeParent);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_1() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(115);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", nodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = node;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#removeChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_NodeUtilRemoveChild() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(118);
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent1, "com.google.javascript.rhino.Node", "last", last);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", functionNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = functionNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node functionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        Node finalFunctionNodeParentParent = ((Node) getFieldValue(functionNodeParent, "com.google.javascript.rhino.Node", "parent"));
        
        assertNull(finalFunctionNodeParentParent);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_2() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 38);
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(115);
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next1, "com.google.javascript.rhino.Node", "first", parent);
        setField(next1, "com.google.javascript.rhino.Node", "last", parent);
        setField(parent, "com.google.javascript.rhino.Node", "next", next1);
        setField(parent, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(parent, "com.google.javascript.rhino.Node", "parent", next1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Node initialScriptOrFnNodeNext = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "next"));
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", scriptOrFnNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = scriptOrFnNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node finalScriptOrFnNodeNext = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialScriptOrFnNodeNext == finalScriptOrFnNodeNext);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_3() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        byte[] objectValue = {};
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 38);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(parent, "com.google.javascript.rhino.Node", "last", node);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", node);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent1, "com.google.javascript.rhino.Node", "last", last);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", nodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = node;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeParent == finalNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method removeVarDeclaration(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (NodeUtil.isForIn(parent)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getChildCount()} once
    /// execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False},
    ///     {@code (null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#hasChildren()} once,
    ///     {@link com.google.javascript.jscomp.NodeUtil#removeChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)} twice,
    ///     {@link com.google.javascript.jscomp.NodeUtil#isStatementBlock(com.google.javascript.rhino.Node)} twice,
    ///     {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_5() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(125);
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent1, "com.google.javascript.rhino.Node", "last", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", functionNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = functionNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node functionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        Node finalFunctionNodeParentParent = ((Node) getFieldValue(functionNodeParent, "com.google.javascript.rhino.Node", "parent"));
        
        assertNull(finalFunctionNodeParentParent);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_4() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(132);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent1, "com.google.javascript.rhino.Node", "last", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", functionNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = functionNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node functionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        Node finalFunctionNodeParentParent = ((Node) getFieldValue(functionNodeParent, "com.google.javascript.rhino.Node", "parent"));
        
        assertNull(finalFunctionNodeParentParent);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testRemoveVarDeclaration_6() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent1, "com.google.javascript.rhino.Node", "last", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", functionNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = functionNode;
        removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        
        Node functionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        Node finalFunctionNodeParentParent = ((Node) getFieldValue(functionNodeParent, "com.google.javascript.rhino.Node", "parent"));
        
        assertNull(finalFunctionNodeParentParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeVarDeclaration(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node var = name.getParent();
 *  */
    @Test
    public void testRemoveVarDeclaration_ThrowNullPointerException() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration(CoalesceVariableNames.java:359) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", nodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = ((Object) null);
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = var.getParent();
 *  */
    @Test
    public void testRemoveVarDeclaration_ThrowNullPointerException_1() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration(CoalesceVariableNames.java:360) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", scriptOrFnNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = scriptOrFnNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeVarDeclaration(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: var.removeChild(name);
 *  */
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration_ThrowRuntimeException() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-256);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", functionNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = functionNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: NodeUtil.removeChild(parent, var);
 *  */
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration_ThrowRuntimeException_2() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(111);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", scriptOrFnNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = scriptOrFnNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: NodeUtil.removeChild(parent, var);
 *  */
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration_ThrowRuntimeException_3() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(118);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent1, "com.google.javascript.rhino.Node", "last", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", nodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = node;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#removeVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: var.removeChild(name);
 *  */
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration_ThrowRuntimeException_1() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", scriptOrFnNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = scriptOrFnNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeVarDeclaration(com.google.javascript.rhino.Node)
    
    @Test
    public void testRemoveVarDeclaration1() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", stringNode);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(115);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:685)
            com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration(CoalesceVariableNames.java:377) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", stringNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = stringNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeVarDeclaration(com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration2() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", stringNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = stringNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration3() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", stringNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = stringNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration4() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", stringNode);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", stringNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = stringNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemoveVarDeclaration5() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(first1, "com.google.javascript.rhino.Node", "next", next2);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", stringNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = stringNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method removeVarDeclaration(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testRemoveVarDeclaration6() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", stringNode);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeVarDeclarationMethod = coalesceVariableNamesClazz.getDeclaredMethod("removeVarDeclaration", stringNodeType);
        removeVarDeclarationMethod.setAccessible(true);
        java.lang.Object[] removeVarDeclarationMethodArguments = new java.lang.Object[1];
        removeVarDeclarationMethodArguments[0] = stringNode;
        try {
            removeVarDeclarationMethod.invoke(coalesceVariableNames, removeVarDeclarationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeVariableNamesInterferenceGraph(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ControlFlowGraph, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#computeVariableNamesInterferenceGraph(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.ControlFlowGraph,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = t.getScope();
 *  */
    @Test
    public void testComputeVariableNamesInterferenceGraph_ThrowNullPointerException_1() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph(CoalesceVariableNames.java:199) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class controlFlowGraphType = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        Class setType = Class.forName("java.util.Set");
        Method computeVariableNamesInterferenceGraphMethod = coalesceVariableNamesClazz.getDeclaredMethod("computeVariableNamesInterferenceGraph", nodeTraversalType, controlFlowGraphType, setType);
        computeVariableNamesInterferenceGraphMethod.setAccessible(true);
        java.lang.Object[] computeVariableNamesInterferenceGraphMethodArguments = new java.lang.Object[3];
        computeVariableNamesInterferenceGraphMethodArguments[0] = ((Object) null);
        computeVariableNamesInterferenceGraphMethodArguments[1] = ((Object) null);
        computeVariableNamesInterferenceGraphMethodArguments[2] = ((Object) null);
        try {
            computeVariableNamesInterferenceGraphMethod.invoke(coalesceVariableNames, computeVariableNamesInterferenceGraphMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#computeVariableNamesInterferenceGraph(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.ControlFlowGraph,java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<Var> i = scope.getVars(); i.hasNext(); )
 *  */
    @Test
    public void testComputeVariableNamesInterferenceGraph_ThrowNullPointerException() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph(CoalesceVariableNames.java:202) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class controlFlowGraphType = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        Class setType = Class.forName("java.util.Set");
        Method computeVariableNamesInterferenceGraphMethod = coalesceVariableNamesClazz.getDeclaredMethod("computeVariableNamesInterferenceGraph", nodeTraversalType, controlFlowGraphType, setType);
        computeVariableNamesInterferenceGraphMethod.setAccessible(true);
        java.lang.Object[] computeVariableNamesInterferenceGraphMethodArguments = new java.lang.Object[3];
        computeVariableNamesInterferenceGraphMethodArguments[0] = nodeTraversal;
        computeVariableNamesInterferenceGraphMethodArguments[1] = ((Object) null);
        computeVariableNamesInterferenceGraphMethodArguments[2] = ((Object) null);
        try {
            computeVariableNamesInterferenceGraphMethod.invoke(coalesceVariableNames, computeVariableNamesInterferenceGraphMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (colorings.isEmpty()): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NotColoringsIsEmpty() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        LinkedList colorings = new LinkedList();
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        
        coalesceVariableNames.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (colorings.isEmpty()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isFunction(parent)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunction(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NodeUtilIsFunction() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        LinkedList colorings = new LinkedList();
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(105);
        
        coalesceVariableNames.visit(null, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (colorings.isEmpty()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(n)): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NodeUtilIsName() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        LinkedList colorings = new LinkedList();
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        coalesceVariableNames.visit(null, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: colorings.isEmpty() || !NodeUtil.isName(n) || NodeUtil.isFunction(parent)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.visit(CoalesceVariableNames.java:132) */
        coalesceVariableNames.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (colorings.isEmpty()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isFunction(parent)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        LinkedList colorings = new LinkedList();
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.visit(CoalesceVariableNames.java:137) */
        coalesceVariableNames.visit(null, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (colorings.isEmpty()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isFunction(parent)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Throwable  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        LinkedList colorings = new LinkedList();
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CoalesceVariableNames.visit(CoalesceVariableNames.java:137) */
        Class coalesceVariableNamesClazz = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = coalesceVariableNamesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(coalesceVariableNames, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (colorings.isEmpty()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isFunction(parent)): False}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunction(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Var var = t.getScope().getVar(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        LinkedList colorings = new LinkedList();
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        colorings.add(null);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.CoalesceVariableNames", "colorings", colorings);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = new Node(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        coalesceVariableNames.visit(nodeTraversal, node, functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CoalesceVariableNames.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CoalesceVariableNames}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CoalesceVariableNames#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, root, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        CoalesceVariableNames coalesceVariableNames = ((CoalesceVariableNames) createInstance("com.google.javascript.jscomp.CoalesceVariableNames"));
        
        /* This test fails because method [com.google.javascript.jscomp.CoalesceVariableNames.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.CoalesceVariableNames.process(CoalesceVariableNames.java:87) */
        coalesceVariableNames.process(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields938061564874200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields938061564874200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass938061564882200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields938061564874200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass938061564882200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields938061565430200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields938061565430200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass938061565434900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields938061565430200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass938061565434900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

