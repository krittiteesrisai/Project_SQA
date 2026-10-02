package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.Node;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.Scope.Var;
import java.util.Map;
import com.google.javascript.rhino.FunctionNode;
import java.util.List;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_GlobalNamespaceTest {
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
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:158) */
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
        root.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:158) */
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
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:158) */
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
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        root.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:158) */
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
    
    ///region FUZZER: ERROR SUITE for method process()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.GlobalNamespace}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
     */
    @Test
    public void testProcessThrowsNPE() throws Throwable  {
        Node node = new Node(1, Integer.MIN_VALUE, 1);
        node.setType(Integer.MAX_VALUE);
        Node node1 = new Node(-1, node, -1, 1024);
        node1.setType(Integer.MAX_VALUE);
        Node node2 = new Node(-1, Integer.MAX_VALUE, Integer.MIN_VALUE);
        node2.setType(Integer.MIN_VALUE);
        GlobalNamespace globalNamespace = new GlobalNamespace(null, node1, node2);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154) */
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return isGlobalVarReference(topVarName, s);}
 *  */
    @Test
    public void testIsGlobalNameReference_ReturnIsGlobalVarReference_1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Scope externsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(externsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsScope", externsScope);
        String string = "";
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
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return isGlobalVarReference(topVarName, s);}
 *  */
    @Test
    public void testIsGlobalNameReference_ReturnIsGlobalVarReference() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return isGlobalVarReference(topVarName, s);}
 *  */
    @Test
    public void testIsGlobalNameReference_ReturnIsGlobalVarReference_2() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        String string = " ";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(parent, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.Scope.Var#isLocal()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return isGlobalVarReference(topVarName, s);}
 *  */
    @Test
    public void testIsGlobalNameReference_ReturnIsGlobalVarReference_3() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope1 = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope1, "com.google.javascript.jscomp.Scope", "parent", scope1);
        var.scope = scope1;
        vars.put(string, var);
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
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return isGlobalVarReference(topVarName, s);}
 *  */
    @Test
    public void testIsGlobalNameReference_ReturnIsGlobalVarReference_4() throws Exception  {
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
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments));
        
        assertTrue(actual);
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
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:195)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:172) */
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
            com.google.javascript.jscomp.GlobalNamespace.getTopVarName(GlobalNamespace.java:182)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:171) */
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
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:195)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:172) */
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (v == null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (externsScope != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_ExternsScopeNotEqualsNull() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Scope externsScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(externsScope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsScope", externsScope);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
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
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (externsScope != null): False}
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_ExternsScopeEqualsNull() throws Exception  {
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
 * @utbot.executesCondition {@code (externsScope != null): False}
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_ExternsScopeEqualsNull_1() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        String string = "";
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
        isGlobalVarReferenceMethodArguments[0] = string;
        isGlobalVarReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (v == null): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.Scope.Var#isLocal()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
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
        setField(scope1, "com.google.javascript.jscomp.Scope", "parent", scope1);
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
 * @utbot.returnsFrom {@code return v != null && !v.isLocal();}
 *  */
    @Test
    public void testIsGlobalVarReference_VEqualsNullAndNotVIsLocal() throws Exception  {
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
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:195) */
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
    public void testGetNameIndex_ThrowNullPointerException_1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        externsRoot.setType(120);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:102) */
        globalNamespace.getNameIndex();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameIndex_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        externsRoot.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:102) */
        globalNamespace.getNameIndex();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameIndex_ThrowNullPointerException_3() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:158)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:102) */
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
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        externsRoot.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:102) */
        globalNamespace.getNameIndex();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getNameIndex()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.GlobalNamespace}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
     */
    @Test
    public void testGetNameIndexThrowsNPE() {
        Node node = new Node(Integer.MAX_VALUE, 1, -1);
        node.setType(-1);
        Node node1 = new Node(Integer.MAX_VALUE, node, Integer.MAX_VALUE, -2147482624);
        node1.setType(Integer.MAX_VALUE);
        Node node2 = new Node(-1, 0, Integer.MAX_VALUE);
        node2.setType(0);
        GlobalNamespace globalNamespace = new GlobalNamespace(null, node1, node2);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:102) */
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
        String string = ".";
        
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
            com.google.javascript.jscomp.GlobalNamespace.getTopVarName(GlobalNamespace.java:182) */
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
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        externsRoot.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:91) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:91) */
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
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:158)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:91) */
        globalNamespace.getNameForest();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNameForest()
    
    @Test(expected = StackOverflowError.class)
    public void testGetNameForest1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", externsRoot);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        globalNamespace.getNameForest();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNameForest2() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", externsRoot);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        globalNamespace.getNameForest();
    }
    
    @Test
    public void testGetNameForest3() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(120);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:91) */
        globalNamespace.getNameForest();
    }
    
    @Test
    public void testGetNameForest4() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:91) */
        globalNamespace.getNameForest();
    }
    
    @Test
    public void testGetNameForest5() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:154)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:91) */
        globalNamespace.getNameForest();
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:625)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:329)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:116) */
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Scope scope = new Scope(node, ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.NodeTraversal.getSourceName(NodeTraversal.java:625)
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:329)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:116) */
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
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        rootNode.setType(-255);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        globalNamespace.scanNewNodes(scope, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method scanNewNodes(com.google.javascript.jscomp.Scope, java.util.Set)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.GlobalNamespace}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(com.google.javascript.jscomp.Scope,java.util.Set)}
     */
    @Test
    public void testScanNewNodesThrowsNPE() {
        Node node = new Node(Integer.MAX_VALUE, 1, -1);
        node.setType(-1);
        Node node1 = new Node(Integer.MAX_VALUE, node, Integer.MAX_VALUE, Integer.MIN_VALUE);
        node1.setType(Integer.MAX_VALUE);
        Node node2 = new Node(-1, 0, Integer.MAX_VALUE);
        node2.setType(0);
        GlobalNamespace globalNamespace = new GlobalNamespace(null, node1, node2);
        HashSet hashSet = new HashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.traverseAtScope(NodeTraversal.java:325)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:116) */
        globalNamespace.scanNewNodes(null, hashSet);
    }
    ///endregion
    
    ///endregion
    
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
            com.google.javascript.jscomp.GlobalNamespace.isGlobalScope(GlobalNamespace.java:209) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields936447888270500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields936447888270500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass936447888277000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936447888270500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936447888277000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields936447888592200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936447888592200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936447888596300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936447888592200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936447888596300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

