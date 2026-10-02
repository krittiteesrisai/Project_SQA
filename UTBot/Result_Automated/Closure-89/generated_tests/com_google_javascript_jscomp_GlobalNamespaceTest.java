package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import com.google.javascript.rhino.Node;
import java.util.Map;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_GlobalNamespaceTest {
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGlobalScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalScope(com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return s.getParent() == null;}
 *  */
    @Test
    public void testIsGlobalScope_SGetParentNotEqualsNull() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalScopeMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalScope", scopeType);
        isGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] isGlobalScopeMethodArguments = new java.lang.Object[1];
        isGlobalScopeMethodArguments[0] = scope;
        boolean actual = ((Boolean) isGlobalScopeMethod.invoke(globalNamespace, isGlobalScopeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalScope(com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return s.getParent() == null;}
 *  */
    @Test
    public void testIsGlobalScope_SGetParentEqualsNull() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalScopeMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalScope", scopeType);
        isGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] isGlobalScopeMethodArguments = new java.lang.Object[1];
        isGlobalScopeMethodArguments[0] = scope;
        boolean actual = ((Boolean) isGlobalScopeMethod.invoke(globalNamespace, isGlobalScopeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isGlobalScope(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalScope(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return s.getParent() == null;
 *  */
    @Test
    public void testIsGlobalScope_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.isGlobalScope(GlobalNamespace.java:206) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalScopeMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalScope", scopeType);
        isGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] isGlobalScopeMethodArguments = new java.lang.Object[1];
        isGlobalScopeMethodArguments[0] = ((Object) null);
        try {
            isGlobalScopeMethod.invoke(globalNamespace, isGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getNameForest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNameForest()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.executesCondition {@code (!generated): False}
 * @utbot.returnsFrom {@code return globalNames;}
 *  */
    @Test
    public void testGetNameForest_Generated() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        
        List actual = globalNamespace.getNameForest();
        
        assertNull(actual);
        
        List finalGlobalNamespaceGlobalNames = ((List) getFieldValue(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "globalNames"));
        
        assertNull(finalGlobalNamespaceGlobalNames);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNameForest()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameForest_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:88) */
        globalNamespace.getNameForest();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameForest_ThrowNullPointerException_1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        externsRoot.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:151)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:88) */
        globalNamespace.getNameForest();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameForest_ThrowNullPointerException_2() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        externsRoot.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:151)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:88) */
        globalNamespace.getNameForest();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getNameIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNameIndex()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.executesCondition {@code (!generated): False}
 * @utbot.returnsFrom {@code return nameMap;}
 *  */
    @Test
    public void testGetNameIndex_Generated() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        
        Map actual = globalNamespace.getNameIndex();
        
        assertNull(actual);
        
        Map finalGlobalNamespaceNameMap = ((Map) getFieldValue(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "nameMap"));
        
        assertNull(finalGlobalNamespaceNameMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNameIndex()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameIndex_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:99) */
        globalNamespace.getNameIndex();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameIndex_ThrowNullPointerException_1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        externsRoot.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:151)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:99) */
        globalNamespace.getNameIndex();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameIndex_ThrowNullPointerException_2() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        externsRoot.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:151)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:99) */
        globalNamespace.getNameIndex();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getTopVarName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTopVarName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getTopVarName(java.lang.String)}
 * @utbot.executesCondition {@code (firstDotIndex == -1): True}
 * @utbot.returnsFrom {@code return firstDotIndex == -1 ? name : name.substring(0, firstDotIndex);}
 *  */
    @Test
    public void testGetTopVarName_FirstDotIndexEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = " ";
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Method getTopVarNameMethod = globalNamespaceClazz.getDeclaredMethod("getTopVarName", stringType);
        getTopVarNameMethod.setAccessible(true);
        java.lang.Object[] getTopVarNameMethodArguments = new java.lang.Object[1];
        getTopVarNameMethodArguments[0] = string;
        String actual = ((String) getTopVarNameMethod.invoke(globalNamespace, getTopVarNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getTopVarName(java.lang.String)}
 * @utbot.executesCondition {@code (firstDotIndex == -1): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return firstDotIndex == -1 ? name : name.substring(0, firstDotIndex);}
 *  */
    @Test
    public void testGetTopVarName_FirstDotIndexNotEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = ". ";
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Method getTopVarNameMethod = globalNamespaceClazz.getDeclaredMethod("getTopVarName", stringType);
        getTopVarNameMethod.setAccessible(true);
        java.lang.Object[] getTopVarNameMethodArguments = new java.lang.Object[1];
        getTopVarNameMethodArguments[0] = string;
        String actual = ((String) getTopVarNameMethod.invoke(globalNamespace, getTopVarNameMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTopVarName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getTopVarName(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int firstDotIndex = name.indexOf('.');
 *  */
    @Test
    public void testGetTopVarName_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getTopVarName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getTopVarName(GlobalNamespace.java:179) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Method getTopVarNameMethod = globalNamespaceClazz.getDeclaredMethod("getTopVarName", stringType);
        getTopVarNameMethod.setAccessible(true);
        java.lang.Object[] getTopVarNameMethodArguments = new java.lang.Object[1];
        getTopVarNameMethodArguments[0] = ((Object) null);
        try {
            getTopVarNameMethod.invoke(globalNamespace, getTopVarNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.scanNewNodes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scanNewNodes(com.google.javascript.jscomp.Scope, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(com.google.javascript.jscomp.Scope,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t.traverseAtScope(scope);
 *  */
    @Test
    public void testScanNewNodes_ThrowClassCastException() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(((Node) functionNode), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:614)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:325)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:113) */
        globalNamespace.scanNewNodes(scope, null);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(com.google.javascript.jscomp.Scope,java.util.Set)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t.traverseAtScope(scope);
 *  */
    @Test
    public void testScanNewNodes_ThrowClassCastException_1() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(((Node) functionNode), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:614)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:325)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:113) */
        globalNamespace.scanNewNodes(scope, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scanNewNodes(com.google.javascript.jscomp.Scope, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(com.google.javascript.jscomp.Scope,java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverseAtScope(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: t.traverseAtScope(scope);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanNewNodes_ThrowIllegalStateException() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode.setType(-255);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        globalNamespace.scanNewNodes(scope, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (v == null): True}
 * @utbot.executesCondition {@code (externsScope != null): False}
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_VEqualsNullAndNotVIsLocal() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (v == null): False}
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_VNotEqualsNullAndNotVIsLocal() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope1 = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope1, "com.google.javascript.jscomp.Scope", "parent", parent);
        var.scope = scope1;
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (v == null): False}
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_VEqualsNullAndNotVIsLocal_1() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope1 = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        var.scope = scope1;
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var v = s.getVar(name);
 *  */
    @Test
    public void testIsGlobalVarReference_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:192) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = ((Object) null);
        isGlobalVarReferenceMethodArguments[1] = ((Object) null);
        try {
            isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testIsGlobalVarReference1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Scope externsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(externsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsScope", externsScope);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars1);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsGlobalVarReference2() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(parent, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = ((Object) null);
        isGlobalVarReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testIsGlobalVarReference3() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(null, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:426)
            com.google.javascript.jscomp.Scope.getVar(Scope.java:430)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:192) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        try {
            isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsGlobalVarReference4() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(null, var);
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.isLocal(Scope.java:161)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:196) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        try {
            isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#getTopVarName(java.lang.String)
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)
 * @utbot.returnsFrom {@code return isGlobalVarReference(topVarName, s);}
 *  */
    @Test
    public void testIsGlobalNameReference_GlobalNamespaceIsGlobalVarReference() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isGlobalVarReference(topVarName, s);
 *  */
    @Test
    public void testIsGlobalNameReference_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = " ";
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:192)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:169) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = ((Object) null);
        try {
            isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String topVarName = getTopVarName(name);
 *  */
    @Test
    public void testIsGlobalNameReference_ThrowNullPointerException_1() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getTopVarName(GlobalNamespace.java:179)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:168) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = ((Object) null);
        isGlobalNameReferenceMethodArguments[1] = ((Object) null);
        try {
            isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isGlobalVarReference(topVarName, s);
 *  */
    @Test
    public void testIsGlobalNameReference_ThrowNullPointerException_2() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = ".";
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:192)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:169) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = ((Object) null);
        try {
            isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testIsGlobalNameReference1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Scope externsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(externsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsScope", externsScope);
        String string = "\u0000";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testIsGlobalNameReference2() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Scope externsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsScope", externsScope);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        vars.put(string, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:426)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:194)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:169) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        try {
            isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsGlobalNameReference3() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        vars.put(string, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:426)
            com.google.javascript.jscomp.Scope.getVar(Scope.java:430)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:192)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:169) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        try {
            isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsGlobalNameReference4() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string1 = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string1, var);
        char[] charArray = {};
        vars.put(null, charArray);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.isLocal(Scope.java:161)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:196)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:169) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        try {
            isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method processMethod = globalNamespaceClazz.getDeclaredMethod("process");
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[0];
        try {
            processMethod.invoke(globalNamespace, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method processMethod = globalNamespaceClazz.getDeclaredMethod("process");
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[0];
        try {
            processMethod.invoke(globalNamespace, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        FunctionNode root = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        root.setType(105);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method processMethod = globalNamespaceClazz.getDeclaredMethod("process");
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[0];
        try {
            processMethod.invoke(globalNamespace, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        FunctionNode root = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method processMethod = globalNamespaceClazz.getDeclaredMethod("process");
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[0];
        try {
            processMethod.invoke(globalNamespace, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:155) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method processMethod = globalNamespaceClazz.getDeclaredMethod("process");
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[0];
        try {
            processMethod.invoke(globalNamespace, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method process()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.GlobalNamespace}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
     */
    @Test
    public void testProcess() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 1);
        node.setType(1);
        GlobalNamespace globalNamespace = new GlobalNamespace(null, node);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method processMethod = globalNamespaceClazz.getDeclaredMethod("process");
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[0];
        processMethod.invoke(globalNamespace, processMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields900499952576700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields900499952576700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass900499952585000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900499952576700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900499952585000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields900499953161100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields900499953161100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass900499953164700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900499953161100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900499953164700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

